package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.entity.karyawan;
import com.example.demo.repository.KaryawanRepository;

@Service
public class KaryawanService {
    @Autowired
    private KaryawanRepository karyawanRepository;
    public List<karyawan> getAllKary(){
        return karyawanRepository.findAll();
    }
    public karyawan getKaryaById(int id){
        return karyawanRepository.findById(id).orElse(null);
    }
    public karyawan addKar(karyawan kar){
        return karyawanRepository.save(kar);
    }

    public karyawan updateKar(int id,karyawan kar){
        kar.setId(id);
        return karyawanRepository.save(kar);
    }
    public void deleteKar(int id){
        karyawanRepository.deleteById(id);
    }
}
