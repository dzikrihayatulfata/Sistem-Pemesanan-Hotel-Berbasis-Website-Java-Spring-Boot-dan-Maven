package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.entity.booking;
import com.example.demo.repository.BookingRepository;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingrepository;
    public List<booking> getAllbook(){
        return bookingrepository.findAll();
    }
    public booking getBookById(int no){
        return bookingrepository.findById(no).orElse(null);
    }
    public booking addBooking(booking boo){
        return bookingrepository.save(boo);
    }
    public booking saveBooking(booking boo){
        return bookingrepository.save(boo);
    }
}

