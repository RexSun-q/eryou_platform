package com.eryou.controller;

import com.alibaba.druid.support.json.JSONParser;
import com.eryou.entity.Result;
import com.eryou.entity.Student;
import com.eryou.mapper.ResultMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class ResultController {
    @Autowired
    ResultMapper resultMapper;

    @ResponseBody
    @PostMapping(value = "/getResult")
    public Integer getResult(@RequestBody String json) {
        JSONParser jsonParser = new JSONParser(json);
        Map<String, Object> map = jsonParser.parseMap();
        String identifier = (String) map.get("studentId");
        System.out.println(identifier);
        Integer id = resultMapper.getResult(identifier);
        System.out.println(id);
        return id;
    }

}
