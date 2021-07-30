package com.eryou.controller;

import com.eryou.entity.Admin;
import com.eryou.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping
public class AdminController {
    @Autowired
    AdminMapper adminMapper;

    @GetMapping("/admin/login")
    public String login(Model model) {
        model.addAttribute("projectName", "安顺市第二幼儿园新生报名平台");
        return "login";
    }

    /**
     * 登录
     *
     * @param ad
     * @param model
     * @param httpSession
     * @return
     */
    @PostMapping("/admin/login")
    public String loginPost(Admin ad, Model model, HttpSession httpSession) {
        System.out.println(ad);
        Admin admin = adminMapper.findByEmail(ad);
        if (admin != null) {
            httpSession.setAttribute("admin", admin.getName());
            return "redirect:dashboard";
        } else {
            model.addAttribute("error", "用户名或密码错误，请重新登录！");
            return "login";
        }
    }

    @GetMapping("/admin/register")
    public String register(Model model) {
        model.addAttribute("projectName", "安顺市第二幼儿园新生报名平台");
        return "register";
    }

}
