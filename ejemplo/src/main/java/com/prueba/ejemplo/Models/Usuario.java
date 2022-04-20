package com.prueba.ejemplo.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuario", schema = "public")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false, unique = true)
    private int idUsuario;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuIngreso",
            fetch = FetchType.LAZY)
    private List<Mercancia> usuIngreso;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuModificacion",
            fetch = FetchType.LAZY)
    private List<Mercancia> usuModificacion;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "edad")
    private int edad;

    @Column(name = "ingreso")
    private Date ingreso;

    //@JsonIgnore
    //@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    //@JoinColumn(name = "cargo")
    @Column(name = "cargo")
    private int cargo;

    public Usuario(String nombre, int cargo, int edad, Date ingreso) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.edad = edad;
        this.ingreso = ingreso;
    }
}
