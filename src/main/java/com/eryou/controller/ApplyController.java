package com.eryou.controller;

import com.alibaba.druid.support.json.JSONParser;
import com.eryou.entity.Parent;
import com.eryou.entity.Student;
import com.eryou.entity.StudentIdentifier;
import com.eryou.mapper.*;
import com.eryou.util.DateUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Map;
import java.util.Random;

@Controller
public class ApplyController {
    @Autowired
    StudentIdentifierMapper studentIdentifierMapper;
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    ParentIdentifierMapper parentIdentifierMapper;
    @Autowired
    ParentMapper parentMapper;
    @Autowired
    ResultMapper resultMapper;

    @GetMapping("/apply")
    public String apply() {
        return "apply/apply";
    }

    @PostMapping("/apply")
    public String apply(@RequestParam(value = "studentName") String studentName,
                        @RequestParam(value = "studentIdentifier") String studentIdentifier,
                        @RequestParam(value = "studentGender") String studentGender,
                        @RequestParam(value = "studentBirth") String studentBirth,
                        @RequestParam(value = "fatherName") String fatherName,
                        @RequestParam(value = "fatherIdentifier") String fatherIdentifier,
                        @RequestParam(value = "motherName") String motherName,
                        @RequestParam(value = "motherIdentifier") String motherIdentifier,
                        @RequestParam(value = "agree", defaultValue = "false") boolean agree,
                        Model model, HttpSession session) {

        if (agree) {
            // TODO: filter过滤条件

            // TODO: 特殊人群

            // 查询是否存在
            StudentIdentifier identifier;
            identifier = studentIdentifierMapper.queryByCardId(studentIdentifier);
            if (identifier != null) {
                model.addAttribute("error", "该生信息已登记，请等待最终录取结果");
                return "apply/apply";
            }

            // 通过studentIdentifier获得studentId
            studentIdentifierMapper.create(studentIdentifier);
            identifier = studentIdentifierMapper.queryByCardId(studentIdentifier);

            // 通过studentId创建 student
            Student student = new Student();
            student.setStudentId(identifier.getStudentId());
            student.setStudentName(studentName);
            student.setStudentGender(studentGender);
            student.setBirth(DateUtil.inDate(studentBirth));
            studentMapper.add(student);

            // 通过studentId创建 parent1
            parentIdentifierMapper.create(fatherIdentifier);
            Integer fatherId = parentIdentifierMapper.queryByCardId(fatherIdentifier);
            Parent father = new Parent();
            father.setParentId(fatherId);
            father.setParentGender("男");
            father.setParentName(fatherName);
            father.setChildId(identifier.getStudentId());
            father.setCategoryId(0);
            parentMapper.add(father);

            // 通过studentId创建 parent2
            parentIdentifierMapper.create(motherIdentifier);
            Integer motherId = parentIdentifierMapper.queryByCardId(motherIdentifier);
            Parent mother = new Parent();
            mother.setParentId(motherId);
            mother.setParentGender("女");
            mother.setParentName(motherName);
            mother.setChildId(identifier.getStudentId());
            mother.setCategoryId(0);
            model.addAttribute("error", "登记成功，请等待最终录取结果");
            return "apply/apply";
        } else {
            model.addAttribute("error", "请同意使用规则");
            return "apply/apply";
        }
    }

    @ResponseBody
    @PostMapping("/addInfo")
    public Integer addInfo(@RequestBody String data) {
        int[] status = {0, 1};
        JSONParser jsonParser = new JSONParser(data);
        Map<String, Object> map = jsonParser.parseMap();
        String studentCardId = (String) map.get("studentCardId");
        Integer result = resultMapper.getResult(studentCardId);
        if (result == null) {
            Random random = new Random();
            return status[random.nextInt(1)];
        }

        // 检查学生
        StudentIdentifier identifier;
        identifier = studentIdentifierMapper.queryByCardId(studentCardId);
        if (identifier != null) {
            return 2;
        }

        // 创建学生
        studentIdentifierMapper.create(studentCardId);
        identifier = studentIdentifierMapper.queryByCardId(studentCardId);

        Student student = new Student();
        student.setStudentId(identifier.getStudentId());
        student.setStudentName((String) map.get("studentName"));
        student.setStudentGender((String) map.get("studentIndex"));
        student.setBirth(DateUtil.inDate((String) map.get("birthday")));
        studentMapper.add(student);

        // 创建家长
        String parentCardId = (String) map.get("parentCardId");
        parentIdentifierMapper.create(parentCardId);
        Integer fatherId = parentIdentifierMapper.queryByCardId(parentCardId);
        Parent father = new Parent();
        father.setParentId(fatherId);
        father.setParentGender(((String)map.get("parentIndex")).equals("父亲") ? "男" : "女");
        father.setParentName((String) map.get("parentName"));
        father.setChildId(identifier.getStudentId());
        father.setCategoryId(0);
        parentMapper.add(father);

        return 3;
    }
}
