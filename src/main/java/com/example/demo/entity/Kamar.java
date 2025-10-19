package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "kamar")
public class Kamar{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    
    @Column(name = "kamar")
    private int kamar;

    @OneToMany(mappedBy = "kamarr",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<booking> bookings;

    public Kamar(){}
    public Kamar(int kamar){
        this.kamar=kamar;
    }
    public List<booking> getBookings() {
        return bookings;
    }
    public void setBookings(List<booking> bookings) {
        this.bookings = bookings;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    
    public void setKamar(int kamar) {
        this.kamar = kamar;
    }
    public int getKamar() {
        return kamar;
    }
    
}