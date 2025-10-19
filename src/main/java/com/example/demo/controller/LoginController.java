package com.example.demo.controller;

import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.registrasi;


@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @GetMapping("/login")
    public String showLoginPage() {
        return "login.html";
    }
    @GetMapping("/menu")
    public String showMenuPage() {
        return "index.html";
    }
    @PostMapping("/menu")
    public String login(@RequestParam("email") String email,
                        @RequestParam("password") String password,
                        Model model) {

        registrasi userRegistrasi = new registrasi();
        if (loginService.login(email, password)) {
            return "index.html";
        }
        model.addAttribute("error", userRegistrasi.informasierror());
        return "login.html"; 
    }
}