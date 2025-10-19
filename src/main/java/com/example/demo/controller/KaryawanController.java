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
import com.example.demo.service.KaryawanService;
import com.example.demo.entity.karyawan;

@Controller
public class KaryawanController {
    @Autowired
    private KaryawanService karyawanService;
    @GetMapping("/home")
    public String karyawanpage(Model model){
        @SuppressWarnings("unused")
        List<karyawan> karList;
        model.addAttribute("karList", karyawanService.getAllKary());
        model.addAttribute("karInfo", new karyawan());
        return "home.html";
    }
    @PostMapping(value = "/home/submit/",params={"add"})
    public String karyawanAdd(Model model,@ModelAttribute("karInfo")karyawan karInfo) {
        @SuppressWarnings("unused")
        karyawan kar = karyawanService.addKar(karInfo);
        @SuppressWarnings("unused")
        List<karyawan>karList;
        model.addAttribute("karList", karyawanService.getAllKary());
        return "redirect:/home";
    }
    @PostMapping(value = "/department/submit/{id}",params={"edit"})
    public String karyawanEdit(Model model,@ModelAttribute("karInfo") karyawan karInfo, @PathVariable("id") int id){
        @SuppressWarnings("unused")
        karyawan kar = karyawanService.updateKar(id, karInfo);
        @SuppressWarnings("unused")
        List<karyawan> karRec;
        model.addAttribute("karList", karyawanService.getAllKary());
        return "redirect:/home";
    }
    @PostMapping(value="/home/submit/{id}",params={"delete"})
    public String karyawanDelete(Model model,@ModelAttribute("depInfo")karyawan karInfo,@PathVariable("id") int id){
        karyawanService.deleteKar(id);
        @SuppressWarnings("unused")
        List<karyawan> karRec;
        model.addAttribute("depList", karyawanService.getAllKary());
        return "redirect:/home";
    }

    @GetMapping("/home/{id}")
    public String karyawanGetRec(Model model,@PathVariable("id") int id ) {
        @SuppressWarnings("unused")
        List<karyawan>karList;
        @SuppressWarnings("unused")
        karyawan karRec;
        model.addAttribute("depList", karyawanService.getAllKary());
        model.addAttribute("karRec", karyawanService.getKaryaById(id));
        return "home.html";
    }
    
}
