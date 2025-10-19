package com.example.demo.service;

import com.example.demo.entity.Metodepembayaran;
import com.example.demo.repository.MetodepembayaranRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class Metodepembayaranservice {
    @Autowired
    private MetodepembayaranRepository metodepembayaranRepository;
    public Metodepembayaranservice(MetodepembayaranRepository metodepembayaranRepository){
        this.metodepembayaranRepository=metodepembayaranRepository;
    }
    public List<Metodepembayaran>getAllMetodepembayarans(){
        return metodepembayaranRepository.findAll();
    }
    public Metodepembayaran saveMetodepembayaran(Metodepembayaran metodepembayaran){
        return metodepembayaranRepository.save(metodepembayaran);
    }
    
}
