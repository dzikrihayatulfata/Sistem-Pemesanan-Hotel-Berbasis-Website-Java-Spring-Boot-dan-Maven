package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import com.example.demo.entity.Pembayaran;
import com.example.demo.service.Metodepembayaranservice;
import com.example.demo.service.PembayaranService;

@Controller
public class PembayaranCotroller {

    @Autowired
    private PembayaranService pembayaranService;

    @Autowired
    private Metodepembayaranservice metodepembayaranservice;

    @GetMapping("/bayarhotel")
    public String shoowPembayaranPage(Model model){
        model.addAttribute("pembayaranInfo", new Pembayaran());
        model.addAttribute("metodePembayarans", metodepembayaranservice.getAllMetodepembayarans());
        return "pembayaran";
    }

    @PostMapping("/bayar")
    public String showsavePembayaranPage(Model model,@ModelAttribute("pembayaranInfo")Pembayaran pembayaranInfo){
        pembayaranService.savePembayaran(pembayaranInfo);
        return "verikasi";
    }
    
    @GetMapping("/antrian")
    public String showAntrianpage(Model model) {
    List<Pembayaran> pembayaranList = pembayaranService.getAllPembayarans();
    // Periksa jika list tidak kosong, ambil elemen terakhir
    Pembayaran lastPembayaran = null;
    if (!pembayaranList.isEmpty()) {
        lastPembayaran = pembayaranList.get(pembayaranList.size() - 1);
    }
    // Tambahkan elemen terakhir ke model
    model.addAttribute("lastPembayaran", lastPembayaran);
    return "antrian";
    }

}
