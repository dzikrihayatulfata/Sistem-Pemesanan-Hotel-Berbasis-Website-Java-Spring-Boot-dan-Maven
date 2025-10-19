package com.example.demo.repository;

import com.example.demo.entity.Metodepembayaran;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodepembayaranRepository extends JpaRepository<Metodepembayaran,Integer> {
    
}
