package com.example.demo.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "metodepembayaran")
public class Metodepembayaran {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "metodebayar", nullable = false)
    private String metodebayar;

    @OneToMany(mappedBy = "metodepembayarann",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pembayaran> pembayarans;

    public Metodepembayaran(){}
    public Metodepembayaran(String metodebayar){
        this.metodebayar=metodebayar;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setMetodebayar(String metodebayar) {
        this.metodebayar = metodebayar;
    }
    public String getMetodebayar() {
        return metodebayar;
    }
    public void setPembayarans(List<Pembayaran> pembayarans) {
        this.pembayarans = pembayarans;
    }
    public List<Pembayaran> getPembayarans() {
        return pembayarans;
    }
}
