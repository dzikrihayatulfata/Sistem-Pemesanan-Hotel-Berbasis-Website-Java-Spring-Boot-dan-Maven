package com.example.demo.service;

import com.example.demo.entity.Kamar;
import com.example.demo.repository.KamarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class KamarService {
    @Autowired
    private final KamarRepository kamarRepository;

    public KamarService(KamarRepository kamarRepository){
        this.kamarRepository=kamarRepository;
    }
    public List<Kamar> getAllKamars(){
        return kamarRepository.findAll();
    }
    public Kamar saveKamar(Kamar kamar){
        return kamarRepository.save(kamar);
    }
    
}
