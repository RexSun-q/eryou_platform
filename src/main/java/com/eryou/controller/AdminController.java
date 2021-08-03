package com.eryou.controller;

import com.eryou.entity.Admin;
import com.eryou.mapper.AdminMapper;
import com.eryou.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class AdminController {
    @Autowired
    AdminMapper adminMapper;
    @Autowired
    StudentMapper studentMapper;

    @GetMapping("/admin/login")
    public String login(Model model) {
        model.addAttribute("projectName", "安顺市第二幼儿园新生报名平台");
        return "login";
    }

    /**
     *
     * @param email
     * @param password
     * @param model
     * @param httpSession
     * @return
     */
    @PostMapping("/admin/login")
    public String loginPost(@RequestParam("em") String email,
                            @RequestParam("pwd") String password,
                            Model model, HttpSession httpSession) {
        Admin ad = new Admin();
        ad.setEmail(email);
        ad.setPassword(password);
        Admin res = adminMapper.findByEmail(ad);
        if (res != null) {
            httpSession.setAttribute("admin", res.getName());
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

    @GetMapping("/admin/dashboard")
    public String dashBoard(Model model) {
        model.addAttribute("studentNum", studentMapper.countAll());
        model.addAttribute("boysNum", studentMapper.countMale());
        model.addAttribute("girlsNum", studentMapper.countFemale());
        return "dashboard";
    }

}
