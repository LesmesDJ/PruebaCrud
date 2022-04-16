package com.prueba.ejemplo.Models;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cargo", schema = "public")

@Getter
@Setter

public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCargo")
    private int idCargo;

    @OneToOne(mappedBy = "cargo")
    private Usuario usuario;

    @Column(name = "descripcion")
    private String descripcion;

}
