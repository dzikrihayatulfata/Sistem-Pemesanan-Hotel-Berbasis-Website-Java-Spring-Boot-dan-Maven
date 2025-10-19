package com.example.demo.entity;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no")
    private int no;
    @Column(name = "nama")
    private String nama;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    public abstract String informasierror();
    public person(){}
    public person(int no,String nama,String email,String password){
        this.no=no;
        this.nama=nama;
        this.email=email;
        this.password=password;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public int getNo() {
        return no;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

}