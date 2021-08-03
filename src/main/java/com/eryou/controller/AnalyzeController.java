package com.eryou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AnalyzeController {

    @GetMapping("analyze")
    public String analyze() {
        return "analyze/analyze";
    }
}
