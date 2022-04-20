package com.prueba.ejemplo.Dto;

import lombok.*;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class UsuarioResponse {

    private int idUsuario;

    private String nombre;

    private int edad;

    private Date ingreso;

    private int cargo;

}
