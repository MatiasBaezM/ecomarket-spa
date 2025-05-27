package com.ecomarket_spa.ecomarket.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecomarket_spa.ecomarket.model.Venta;
import com.ecomarket_spa.ecomarket.repository.VentaRepository;

@Service

public class VentaService {

    private final VentaRepository ventaRepository;
    public VentaService(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }
    public List<Venta> getAllVentas() {
        return ventaRepository.findAll();
    }
    public Venta getVentaById(Long id) {
        return ventaRepository.findById(id).orElse(null);
    }
    public Venta createVenta(Venta venta) {
        return ventaRepository.save(venta);
    }
    
    public void deleteVenta(Long id) {
        ventaRepository.deleteById(id);
    }
    

}
