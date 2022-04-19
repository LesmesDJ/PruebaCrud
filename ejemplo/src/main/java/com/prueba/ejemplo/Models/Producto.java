package com.prueba.ejemplo.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(name = "id_producto", nullable = false, unique = true)
    private int idProducto;

    @Column(name = "descripcion")
    private String descripcion;

    @JsonIgnore
    @ManyToMany(mappedBy = "producto")
    private List<Mercancia> mercancia;
}
