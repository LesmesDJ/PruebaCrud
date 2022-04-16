package com.prueba.ejemplo.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Entity
@Table(name = "usuario", schema = "public")
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private int idUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuIngreso")
    private List<Mercancia> usuIngreso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuModificacion")
    private List<Mercancia> usuModificacion;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "edad")
    private int edad;
    @Column(name = "ingreso")
    private Date ingreso;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cargo", referencedColumnName = "idCargo")
    private Cargo cargo;
}
