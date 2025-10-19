package com.example.demo.service;

import com.example.demo.entity.admin;
import com.example.demo.repository.LoginadminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginadminService {

    @Autowired
    private LoginadminRepository loginadminRepository;

    public boolean login(String email, String password) {
        admin user = loginadminRepository.findByEmail(email);
        return user != null && user.getPassword().equals(password);
    }
}
