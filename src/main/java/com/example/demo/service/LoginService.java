package com.example.demo.service;

import com.example.demo.entity.registrasi;
import com.example.demo.repository.RegistrasiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private RegistrasiRepository registrasirepository;
    public boolean login(String Email,String Password){
        registrasi user = registrasirepository.findByEmail(Email);
        if(user != null && user.getPassword().equals(Password)){
            return true;
        }
        return false;
    }
}
