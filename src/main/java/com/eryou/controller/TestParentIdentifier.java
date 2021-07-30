package com.eryou.controller;

import com.eryou.entity.ParentIdentifier;
import com.eryou.mapper.ParentIdentifierMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestParentIdentifier {
    @Autowired
    ParentIdentifierMapper mapper;

    @RequestMapping("/addpi")
    public String add() {
        ParentIdentifier pi = new ParentIdentifier();
        pi.setParentId(50000);
        pi.setCardId("500501199807030099");
        mapper.add(pi);
        return "finish";
    }
}
