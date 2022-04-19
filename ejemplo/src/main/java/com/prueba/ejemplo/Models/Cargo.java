package com.prueba.ejemplo.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
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

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cargo")
    private List<Usuario> usuario;

    @Column(name = "descripcion")
    private String descripcion;

}
