package com.prueba.ejemplo.Dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@Getter
@Setter
public class CargoResponse {

    private String descripcion;

    public CargoResponse(String descripcion) {
        this.descripcion = descripcion;
    }
}
