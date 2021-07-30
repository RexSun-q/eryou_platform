package com.eryou.controller;

import com.eryou.entity.StudentIdentifier;
import com.eryou.mapper.StudentIdentifierMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestStudentIdentifier {
    @Autowired
    private StudentIdentifierMapper studentIdentifierMapper;

    @RequestMapping(value = "/selectAll")
    public String queryAll() {
        List<StudentIdentifier> list = studentIdentifierMapper.queryAll();
        for (StudentIdentifier si : list) {
            System.out.println(si);
        }
        return "ok";
    }

    @RequestMapping(value = "/selectOne")
    public String queryById() {
        StudentIdentifier si = studentIdentifierMapper.queryById(100);
        System.out.println(si);
        return "ok";
    }
}
