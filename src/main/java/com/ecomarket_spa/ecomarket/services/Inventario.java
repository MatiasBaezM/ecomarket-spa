package com.ecomarket_spa.ecomarket.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomarket_spa.ecomarket.model.Producto;
import com.ecomarket_spa.ecomarket.repository.ProductoRepository;

@Service    
public class Inventario {
    public ProductoRepository ProductoRepository ;
    @Autowired
    public Inventario(ProductoRepository ProductoRepository){
        this.ProductoRepository = ProductoRepository;

    }

    public List ObtenerTodos(){
        return ProductoRepository.findAll();
    }

    public Optional obtenerPorId(int id){
        return ProductoRepository.findAll();
    }
    public Producto guardar(Producto producto){

    }
    
}
