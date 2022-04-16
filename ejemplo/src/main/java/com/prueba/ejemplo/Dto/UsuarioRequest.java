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


public class UsuarioRequest {

    private int idUsuario;

    private String nombre;

    private String edad;

    private Date ingreso;

    private int cargo;

}
