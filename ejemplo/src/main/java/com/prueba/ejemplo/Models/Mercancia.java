package com.prueba.ejemplo.Models;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Entity
@Table(name = "mercancia")
@Getter
@Setter

public class Mercancia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMercancia")
    private int idMercancia;

    @Column(name = "descipcion")
    private String descipcion;

    @Column(name = "ingreso")
    private Date ingreso;

    @Column(name = "modificacion")
    private Date modificacion;

    @ManyToOne
    @JoinColumn(name = "producto")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "usuIngreso")
    private Usuario usuIngreso;

    @ManyToOne
    @JoinColumn(name = "usuModificacion")
    private Usuario usuModificacion;

    @Column(name = "cantidad")
    private String cantidad;

}
