
package com.example.demo.repository;

import com.example.demo.entity.Kamar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KamarRepository extends JpaRepository<Kamar,Integer> {
    
}
