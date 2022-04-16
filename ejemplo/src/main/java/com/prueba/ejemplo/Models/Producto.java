package com.prueba.ejemplo.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "producto", schema = "public")
@Getter
@Setter
public class Producto {
    private int idProducto;
    private String descripcion;
}
