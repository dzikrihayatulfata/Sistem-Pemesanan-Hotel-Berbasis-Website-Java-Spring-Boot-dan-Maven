package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "pembayaran")
public class Pembayaran {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "idtransaksi")
    private int idtransaksi;

    @ManyToOne
    @JoinColumn(name = "id_metodepembayaran",nullable=false)
    private Metodepembayaran metodepembayarann;

    public Pembayaran(){}
    public Pembayaran(int id,int idtransaksi){
        this.id=id;
        this.idtransaksi=idtransaksi;
    }
    public Metodepembayaran getMetodepembayarann() {
        return metodepembayarann;
    }
    public void setMetodepembayarann(Metodepembayaran metodepembayarann) {
        this.metodepembayarann = metodepembayarann;
    }
    public void setId(int id) {
        this.id = id;
    }public int getId() {
        return id;
    }
    public void setIdtransaksi(int idtransaksi) {
        this.idtransaksi = idtransaksi;
    }
    public int getIdtransaksi() {
        return idtransaksi;
    }
 
    
}
