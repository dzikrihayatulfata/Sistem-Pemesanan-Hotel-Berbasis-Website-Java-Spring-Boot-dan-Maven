package com.example.demo.repository;

import com.example.demo.entity.admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface LoginadminRepository extends JpaRepository<admin, Integer> {
    admin findByEmail(String email);
    List<admin> findAll();
}