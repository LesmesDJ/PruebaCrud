package com.prueba.ejemplo.Models;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "mercancia")
@Getter
@Setter

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

    @ManyToOne
    @JoinColumn(name = "usu_ingreso")
    private Usuario usuIngreso;

    @ManyToOne
    @JoinColumn(name = "usu_modificacion")
    private Usuario usuModificacion;

    @Column(name = "cantidad")
    private int cantidad;

}
