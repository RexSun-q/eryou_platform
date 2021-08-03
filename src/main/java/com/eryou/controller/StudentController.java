package com.eryou.controller;

import com.eryou.entity.Parent;
import com.eryou.entity.Student;
import com.eryou.mapper.ParentMapper;
import com.eryou.mapper.StudentMapper;
import com.eryou.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class StudentController {
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    ParentMapper parentMapper;

    @GetMapping("/studentManage")
    public String student(Model model, HttpSession session) {
        List<Student> list = studentMapper.list();
        model.addAttribute("list", list);
        return "studentManage/studentManage";
    }

    @RequestMapping("/studentManage/details/{uid}")
    public String detail(@PathVariable(name = "uid") Integer uid, Model model) {
        Student student = studentMapper.queryById(uid);
        List<Parent> parents = parentMapper.queryByStudentId(student.getStudentId());

        model.addAttribute("st", student);
        model.addAttribute("parents", parents);
        return "studentManage/studentDetails";
    }

    @GetMapping("/studentManage/help")
    public String help() { return "studentManage/help"; }

}
