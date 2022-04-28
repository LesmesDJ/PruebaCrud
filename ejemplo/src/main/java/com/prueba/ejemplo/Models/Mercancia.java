package com.prueba.ejemplo.Models;

import javax.persistence.*;

import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "mercancia", schema = "public")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Mercancia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mercancia", nullable = false, unique = true)
    private int idMercancia;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "ingreso")
    private Date ingreso;

    @Column(name = "modificacion")
    private Date modificacion;

    @Column(name = "producto")
    private  String producto;

    @ManyToOne
    @JoinColumn(name = "usu_ingreso", insertable = false, updatable = false)
    private Usuario usuIngreso;

    @ManyToOne
    @JoinColumn(name = "usu_modificacion", insertable = false, updatable = false)
    private Usuario usuModificacion;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "usu_ingreso")
    private int usu_ingreso;

    @Column(name = "usu_modificacion")
    private int usu_modificacion;

    public Mercancia(String descripcion, Date ingreso, Date modificacion, String producto, int usu_ingreso, int usu_modificacion, int cantidad){
        this.descripcion = descripcion;
        this.ingreso = ingreso;
        this.modificacion = modificacion;
        this.producto = producto;
        this.usu_ingreso = usu_ingreso;
        this.usu_modificacion = usu_modificacion;
        this.cantidad = cantidad;
    }

}
