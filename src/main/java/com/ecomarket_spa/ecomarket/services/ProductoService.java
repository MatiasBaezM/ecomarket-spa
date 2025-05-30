package com.ecomarket_spa.ecomarket.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecomarket_spa.ecomarket.model.Producto;
import com.ecomarket_spa.ecomarket.repository.ProductoRepository;

@Service
public class ProductoService {

private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    public Producto getProductoById(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    public Producto createProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto updateProducto(Long id, Producto producto) {
        if (productoRepository.existsById(id)) {
            producto.setId(id);
            return productoRepository.save(producto);
        }
        return null;
    }
    public void deleteProducto(Long id) {
        productoRepository.deleteById(id);
    }

}
