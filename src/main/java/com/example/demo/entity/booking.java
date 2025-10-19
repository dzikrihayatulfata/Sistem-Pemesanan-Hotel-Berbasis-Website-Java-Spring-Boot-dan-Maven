package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "booking")
public class booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no")
    private int no;
    @Column(name = "nama")
    private String nama;
    @Column(name = "email")
    private String email;
    @Column(name = "handphone")
    private int handphone;
    @Column(name = "checkin")
    private String checkin;
    @Column(name = "checkout")
    private String checkout;
    @Column(name = "orang")
    private String orang;

    
    @ManyToOne
    @JoinColumn(name = "id_kamar",nullable=false)
    private Kamar kamarr;

    @ManyToOne
    @JoinColumn(name = "id_namakamar",nullable=false)
    private Namekamar namakamarr;


    public booking(){}
    public booking(int no,String nama,String email,int handphone,String checkin,String checkout,String orang){
        this.no=no;
        this.nama=nama;
        this.email=email;
        this.handphone=handphone;
        this.checkin=checkin;
        this.checkout=checkout;
        this.orang=orang;
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getHandphone() {
        return handphone;
    }
    public void setHandphone(int handphone) {
        this.handphone = handphone;
    }
    public String getCheckin() {
        return checkin;
    }
    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }
    public String getCheckout() {
        return checkout;
    }
    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }
    public String getOrang() {
        return orang;
    }
    public void setOrang(String orang) {
        this.orang = orang;
    }
   public Kamar getKamarr() {
       return kamarr;
   }
   public void setKamarr(Kamar kamarr) {
       this.kamarr = kamarr;
   }
   public void setNamakamarr(Namekamar namakamarr) {
       this.namakamarr = namakamarr;
   }
   public Namekamar getNamakamarr() {
       return namakamarr;
   }
   
}

