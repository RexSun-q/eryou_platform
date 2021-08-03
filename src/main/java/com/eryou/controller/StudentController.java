package com.eryou.controller;

import com.eryou.entity.Student;
import com.eryou.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class StudentController {
    @Autowired
    StudentMapper studentMapper;

    @GetMapping("studentManage")
    public String student(Model model, HttpSession session) {
        List<Student> list = studentMapper.list();
        model.addAttribute("list", list);
        return "studentManage/studentManage";
    }



}
