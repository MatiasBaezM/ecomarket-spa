package com.ecomarket_spa.ecomarket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private int rut;
    private String nombre;
    private String apellido;
    private String edad;
}
