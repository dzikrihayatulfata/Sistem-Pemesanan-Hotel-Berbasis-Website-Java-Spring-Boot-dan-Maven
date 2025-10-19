package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.hibernate.annotations.processing.Suppress;
import org.springframework.ui.Model;
import java.util.List;
import com.example.demo.service.RegistrasiService;
import com.example.demo.entity.registrasi;

@Controller
public class RegistrasiController {
    @Autowired
    private RegistrasiService registrasiservice;
    @GetMapping("/register")
    public String registrasipage(Model model) {
        @SuppressWarnings("unused")
        List<registrasi> regiList;
        model.addAttribute("regiList", registrasiservice.getAllregi());
        model.addAttribute("regiInfo", new registrasi());
        return "register.html";
    }
    @PostMapping(value ="/register/submit/",params={"daftar"})
    public String registrasiAdd(Model model,@ModelAttribute("regiInfo")registrasi regiInfo ) {
        @SuppressWarnings("unused")
        registrasi reg = registrasiservice.addRegi(regiInfo);
        @SuppressWarnings("unused")
        List<registrasi>regList;
        model.addAttribute("regiList", registrasiservice.getAllregi());
        return "login.html";
    }

    @GetMapping("/register/{no}")
    public String registrasiGetRec(Model model,@PathVariable("no")int no){
        @SuppressWarnings("unused")
        List<registrasi>regList;
        @SuppressWarnings("unused")
        registrasi regRec;
        model.addAttribute("regList", registrasiservice.getAllregi());
        model.addAttribute("regRec", registrasiservice.getRegiById(no));
        return "register.html";
    }
    
    
    

}
