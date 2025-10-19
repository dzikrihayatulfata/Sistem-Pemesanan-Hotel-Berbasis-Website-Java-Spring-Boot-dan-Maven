package com.example.demo.controller;

import com.example.demo.entity.Namekamar;
import com.example.demo.service.NamekamarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@Controller
@RequestMapping("/namakamar")
public class NamekamarController {
    private final NamekamarService namekamarService;
    
    public NamekamarController(NamekamarService namekamarService){
        this.namekamarService=namekamarService;
    }

    @GetMapping
    public String getAllNamekamar(Model model) {
        model.addAttribute("nameKamars", namekamarService.getAllNamekamars());
        return "namakamar/list";
    }
    

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("namaKamar", new Namekamar());
        return "namakamar/form";
    }
    
    @PostMapping("/save")
    public String saveeNamekamarr(@ModelAttribute("namaKamar") Namekamar namakamar) {
       namekamarService.saveNamekamar(namakamar);
       return "redirect:/namakamar";
 
    }
}
