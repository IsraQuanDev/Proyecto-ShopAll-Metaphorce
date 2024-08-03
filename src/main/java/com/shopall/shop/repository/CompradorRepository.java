package com.shopall.shop.repository;

import com.shopall.shop.entities.Compradores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompradorRepository extends JpaRepository<Compradores, Long> {
    // Additional query methods can be defined here
}
