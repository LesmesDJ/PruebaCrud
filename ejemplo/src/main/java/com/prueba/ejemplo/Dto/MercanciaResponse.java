package com.prueba.ejemplo.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MercanciaResponse {

    private int idMercancia;
    private String descripcion;
    private Date ingreso;
    private Date modificacion;
    private int producto;
    private int usuIngreso;
    private int usuModificacion;
    private int cantidad;
}
