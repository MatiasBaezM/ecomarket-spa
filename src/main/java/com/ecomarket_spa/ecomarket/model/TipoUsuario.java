package com.ecomarket_spa.ecomarket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
@Data
@Entity
public class TipoUsuario {
@Id
    @GeneratedValue
    private long id;
    
    private String nombre;

    @OneToMany(mappedBy = "tipoUsuario")
    private List<Cliente> cliente ;
}
