package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registrasi")
public class registrasi extends person{
    @Override
    public String informasierror() {
        return "Password atau Email login anda belum benar.";
    }
    public registrasi() {}
    public registrasi(String nama,String email,String password){
    }
    
}
