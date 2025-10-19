package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.entity.registrasi;
import com.example.demo.repository.RegistrasiRepository;

@Service
public class RegistrasiService {
    @Autowired
    private RegistrasiRepository registrasirepository;
    public List <registrasi> getAllregi(){
        return registrasirepository.findAll();
    }
    public registrasi getRegiById(int no){
        return registrasirepository.findById(no).orElse(null);
    }

    public registrasi addRegi(registrasi reg){
        return registrasirepository.save(reg);
    }
    public registrasi updateRegi(int no,registrasi reg){
        reg.setNo(no);
        return registrasirepository.save(reg);
    }
    public void deleteReg(int no){
        registrasirepository.deleteById(no);
    }
}
