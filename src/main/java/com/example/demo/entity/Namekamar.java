package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "namekamar")
public class Namekamar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "namakamar", nullable = false)
    private String namakamar;

    @OneToMany(mappedBy = "namakamarr",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<booking> bookings;

    public Namekamar(){};
    public Namekamar(String namakamar){
        this.namakamar=namakamar;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setNamakamar(String namakamar) {
        this.namakamar = namakamar;
    }
    public String getNamakamar() {
        return namakamar;
    }
    public void setBookings(List<booking> bookings) {
        this.bookings = bookings;
    }
    public List<booking> getBookings() {
        return bookings;
    }
}
