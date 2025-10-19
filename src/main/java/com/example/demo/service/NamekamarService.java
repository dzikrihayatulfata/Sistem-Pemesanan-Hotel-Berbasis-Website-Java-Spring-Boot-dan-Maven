package com.example.demo.service;

import com.example.demo.entity.Namekamar;
import com.example.demo.repository.NamekamarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NamekamarService {
    @Autowired
    private final NamekamarRepository namekamarRepository;

    public NamekamarService(NamekamarRepository namekamarRepository){
        this.namekamarRepository=namekamarRepository;
    }
    
    public List<Namekamar> getAllNamekamars(){
        return namekamarRepository.findAll();
    }
    public Namekamar saveNamekamar(Namekamar namekamar){
        return namekamarRepository.save(namekamar);
    }
}
