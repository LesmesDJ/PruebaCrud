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
    @Column(name = "idMercancia")
    private int idMercancia;

    @Column(name = "descipcion")
    private String descipcion;

    @Column(name = "ingreso")
    private Date ingreso;

    @Column(name = "modificacion")
    private Date modificacion;

    @ManyToOne
    @JoinColumn(name = "usuIngreso")
    private Usuario usuIngreso;

    @ManyToOne
    @JoinColumn(name = "usuModificacion")
    private Usuario usuModificacion;

    @Column(name = "cantidad")
    private String cantidad;

    @JoinTable(
            name = "REL_MERCANCIA_PRODUCTO",
            joinColumns = @JoinColumn(name = "fk_mercancia", nullable = false),
            inverseJoinColumns = @JoinColumn(name="fk_producto", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Producto> producto;

}
