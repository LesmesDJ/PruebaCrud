package com.prueba.ejemplo.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CargoResponse {
    private int id;
    private String descripcion;
    private int usuario;
}
