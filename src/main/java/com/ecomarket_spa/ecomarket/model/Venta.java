package com.ecomarket_spa.ecomarket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Table(name = "ventas")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private long usuarioId;
	private String producto;
	private int cantidad;
	private double total;

    
}
