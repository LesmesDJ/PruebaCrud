package com.prueba.ejemplo.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "producto", schema = "public")
@Getter
@Setter
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProducto")
    private int idProducto;
    @Column(name = "descripcion")
    private String descripcion;
    @ManyToMany(mappedBy = "producto")
    private List<Mercancia> mercancia;
}
