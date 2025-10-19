package com.example.demo.controller;

import com.example.demo.entity.Metodepembayaran;
import com.example.demo.entity.Namekamar;
import com.example.demo.service.Metodepembayaranservice;
import com.example.demo.service.NamekamarService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/metodepembayaran")
public class MetodepembayaranController {
    private final Metodepembayaranservice metodepembayaranService;

    public MetodepembayaranController(Metodepembayaranservice metodepembayaranService){
        this.metodepembayaranService=metodepembayaranService;
    }

    @GetMapping
    public String getAllMetodepembayaran(Model model) {
        model.addAttribute("metodePembayarans",metodepembayaranService.getAllMetodepembayarans());
        return "metodepembayaran/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("metodePembayaran", new Metodepembayaran());
        return "metodepembayaran/form";
    }

    @PostMapping("/save")
    public String saveeMetodepembayarann(@ModelAttribute("metodePembayaran") Metodepembayaran metodepembayaran) {
       metodepembayaranService.saveMetodepembayaran(metodepembayaran);
       return "redirect:/metodepembayaran";
 
    }

    
    
}
