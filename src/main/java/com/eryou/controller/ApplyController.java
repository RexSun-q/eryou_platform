package com.eryou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class ApplyController {

    @GetMapping("/apply")
    public String apply() {
        return "apply/apply";
    }

    @PostMapping("/apply")
    public String apply(@RequestParam("agree") boolean agree,
                        @RequestParam("id") String id,
                        Model model, HttpSession session) {
        System.out.println(id);
        System.out.println(agree);
        if (agree) {
            System.out.println("同意");
            return "studentManage/help";
        } else {
            model.addAttribute("error", "请同意使用规则");
            return "apply/apply";
        }
    }
}
