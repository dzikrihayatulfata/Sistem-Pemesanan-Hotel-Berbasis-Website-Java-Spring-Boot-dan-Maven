package com.example.demo.controller;

import com.example.demo.entity.Pembayaran;
import com.example.demo.entity.booking;
import com.example.demo.entity.registrasi;
import com.example.demo.service.LoginadminService;
import com.example.demo.service.PembayaranService;
import com.example.demo.service.RegistrasiService;
import com.example.demo.service.BookingService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginadminController {
    @Autowired
    private LoginadminService loginadminService;
    @Autowired
    private RegistrasiService registrasiservice;
    @Autowired
    private BookingService bookingService;
    @Autowired
    private PembayaranService pembayaranService;

    @GetMapping("/admin")
    public String showLoginadmin() {
        return "admin";
    }
    
    @PostMapping("/recapitulasi")
    public String loginAmin(@RequestParam("email") String email,
                        @RequestParam("password") String password,
                        Model model) {
        if (loginadminService.login(email, password)) {
            List<registrasi> regList = registrasiservice.getAllregi();
            List<booking> booList = bookingService.getAllbook();
            List<Pembayaran> pemList = pembayaranService.getAllPembayarans();
            model.addAttribute("pemList",pemList);
            model.addAttribute("regList", regList);
            model.addAttribute("booList", booList);
            return "recapitulasi";
        }
        model.addAttribute("error", "Password atau Email Admin anda belum benar.");
        return "/admin"; 
    }
}
