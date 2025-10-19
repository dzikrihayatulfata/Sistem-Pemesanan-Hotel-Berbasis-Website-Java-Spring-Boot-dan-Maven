package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "karyawan")
public class karyawan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nik")
    private int nik;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "password")
    private String password;
    @Column(name = "id_department")
    private int id_department;

    public karyawan(){}
    public karyawan(int nik,String firstname,String lastname,int id_department){
        this.firstname=firstname;
        this.lastname=lastname;
        this.password=password;
        this.id_department=id_department;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getNik() {
        return nik;
    }
    public void setNik(int nik) {
        this.nik = nik;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getId_department() {
        return id_department;
    }
    public void setId_department(int id_department) {
        this.id_department = id_department;
    }
}
