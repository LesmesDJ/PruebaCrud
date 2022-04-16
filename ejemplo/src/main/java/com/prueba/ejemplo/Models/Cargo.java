package com.prueba.ejemplo.Models;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cargo", schema = "public")

@Getter
@Setter

public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cargo", nullable = false, unique = true)
    private int id_cargo;

    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "cargo")
    private List<Usuario> usuario;*/

    @Column(name = "descripcion")
    private String descripcion;

}
