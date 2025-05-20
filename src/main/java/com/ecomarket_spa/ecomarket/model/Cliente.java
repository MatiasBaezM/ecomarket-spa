package com.ecomarket_spa.ecomarket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Data
@Entity

public class Cliente {
    @Id@GeneratedValue
    private long id;

    private int rut;
    private String nombres;
    private String apellidos;



    @ManyToOne
    private TipoUsuario tipoUsuario;
}
