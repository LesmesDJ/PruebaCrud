package com.prueba.ejemplo.Dto;

import lombok.*;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MercanciaResponse {

    private int idMercancia;
    private String descripcion;
    private Date ingreso;
    private Date modificacion;
    private String producto;
    private int usuIngreso;
    private int usuModificacion;
    private int cantidad;
}
