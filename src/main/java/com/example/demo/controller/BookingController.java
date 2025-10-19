package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.service.BookingService;
import com.example.demo.entity.booking;
import com.example.demo.entity.Kamar;
import com.example.demo.service.KamarService;
import com.example.demo.service.NamekamarService;

import org.hibernate.annotations.processing.Suppress;
import org.springframework.ui.Model;
import java.util.List;

@Controller
public class BookingController {
    @Autowired
    private BookingService bookingservice;

    @Autowired
    private KamarService kamarService;

    @Autowired
    private NamekamarService namekamarService;

    @GetMapping("/booking")
    public String shoowBookingPage(Model model){
        model.addAttribute("bookInfo",  new booking());
        model.addAttribute("kamars", kamarService.getAllKamars());
        model.addAttribute("namaKamars", namekamarService.getAllNamekamars());
        return "booking";
    }

    @GetMapping("/Rajaampat")
    public String shoowBookingRajaempat(Model model){
        model.addAttribute("bookInfo",  new booking());
        model.addAttribute("kamars", kamarService.getAllKamars());
        model.addAttribute("namaKamars", namekamarService.getAllNamekamars());
        return "Rajaampat";
    }

    @GetMapping("/Meraukeharmony")
    public String shoowBookingMeraukeharmony(Model model){
        model.addAttribute("bookInfo",  new booking());
        model.addAttribute("kamars", kamarService.getAllKamars());
        model.addAttribute("namaKamars", namekamarService.getAllNamekamars());
        return "Meraukeharmony";
    }

    @GetMapping("/Telukcendrawasih")
    public String shoowBookingTelukcendrawasih(Model model){
        model.addAttribute("bookInfo",  new booking());
        model.addAttribute("kamars", kamarService.getAllKamars());
        model.addAttribute("namaKamars", namekamarService.getAllNamekamars());
        return "Telukcendrawasih";
    }

    @GetMapping("/Royalsuite")
    public String shoowBookingRoyalsuite(Model model){
        model.addAttribute("bookInfo",  new booking());
        model.addAttribute("kamars", kamarService.getAllKamars());
        model.addAttribute("namaKamars", namekamarService.getAllNamekamars());
        return "Royalsuite";
    }

    @GetMapping("/Rosewoodroom")
    public String shoowBookingRosewoodroom(Model model){
        model.addAttribute("bookInfo",  new booking());
        model.addAttribute("kamars", kamarService.getAllKamars());
        model.addAttribute("namaKamars", namekamarService.getAllNamekamars());
        return "Rosewoodroom";
    }

    @PostMapping("/x")
    public String showPaymentPage(Model model,@ModelAttribute("bookInfo")booking bookInfo){
        bookingservice.saveBooking(bookInfo);
        return "redirect:/bayarhotel";
    }

}
