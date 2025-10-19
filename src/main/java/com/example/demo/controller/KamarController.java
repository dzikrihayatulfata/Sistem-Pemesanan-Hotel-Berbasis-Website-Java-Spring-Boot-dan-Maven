package com.example.demo.controller;

import com.example.demo.entity.Kamar;
import com.example.demo.service.KamarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("/kamar")
public class KamarController {
    private final KamarService kamarService;

    public KamarController(KamarService kamarService){
        this.kamarService = kamarService;
    }
    
    @GetMapping
    public String getAllKamar(Model model) {
        model.addAttribute("kamars", kamarService.getAllKamars());
        return "kamar/list";
    }
    
    
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("kamar", new Kamar());
        return "kamar/form";
    }
    
    @PostMapping("/save")
    public String saveKamar(@ModelAttribute("kamar") Kamar kamar) {
        kamarService.saveKamar(kamar);
        return "redirect:/kamar";
    }
}
