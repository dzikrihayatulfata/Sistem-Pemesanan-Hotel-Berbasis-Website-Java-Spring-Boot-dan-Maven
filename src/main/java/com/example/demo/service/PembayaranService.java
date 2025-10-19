package com.example.demo.service;

import com.example.demo.entity.Pembayaran;
import com.example.demo.repository.PembayaranRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PembayaranService {
    @Autowired
    private final PembayaranRepository pembayaranRepository;

    public PembayaranService(PembayaranRepository pembayaranRepository){
        this.pembayaranRepository=pembayaranRepository;
    }
    public List<Pembayaran>getAllPembayarans(){
        return pembayaranRepository.findAll();
    }
    public Pembayaran addPembayaran(Pembayaran pembayaran){
        return pembayaranRepository.save(pembayaran);
    }
    public Pembayaran savePembayaran(Pembayaran pembayaran){
        return pembayaranRepository.save(pembayaran);
    }

}
