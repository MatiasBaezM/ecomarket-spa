package com.ecomarket_spa.ecomarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomarket_spa.ecomarket.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}

