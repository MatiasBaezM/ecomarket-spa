package com.ecomarket_spa.ecomarket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Producto {
    @Id@GeneratedValue
    private long id;

    private String nombre;
    private int valor;
    
}
