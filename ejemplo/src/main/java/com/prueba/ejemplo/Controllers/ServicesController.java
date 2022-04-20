package com.prueba.ejemplo.Controllers;

import com.prueba.ejemplo.Dto.CargoResponse;
import com.prueba.ejemplo.Dto.Mensaje;
import com.prueba.ejemplo.Dto.UsuarioResponse;
import com.prueba.ejemplo.Models.Cargo;
import com.prueba.ejemplo.Models.Mercancia;
import com.prueba.ejemplo.Models.Usuario;
import com.prueba.ejemplo.Services.CrudServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class ServicesController {

    @Autowired
    private CrudServices crudServices;

    @GetMapping(value = "/cargo", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> listCargo () {
        List<Cargo> lstCargo = crudServices.lstCargo();
        return new ResponseEntity<List<Cargo>>(lstCargo, HttpStatus.OK);
    }

    @GetMapping(value = "/mercancia", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> listMercancia () {
        List<Mercancia> lstMercancia = crudServices.lstMercancia();
        return new ResponseEntity<List<Mercancia>>(lstMercancia, HttpStatus.OK);
    }

    @GetMapping(value = "/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> listUsuario (){
        List<Usuario> lstUsuario = crudServices.lstUsuario();
        return new ResponseEntity<List<Usuario>>(lstUsuario, HttpStatus.OK);
    }

    @PostMapping(value = "/crear")
    public ResponseEntity<?> createCargo (@RequestBody CargoResponse cargoResponse ){
        if(cargoResponse.getDescripcion()==null)
            return new ResponseEntity(new Mensaje("Debe diligenciar el cargo"), HttpStatus.BAD_REQUEST);
        Cargo cargo = new Cargo(cargoResponse.getDescripcion());
        crudServices.saveCargo(cargo);
            return new ResponseEntity(new Mensaje("Cargo registrado"), HttpStatus.OK);
    }

    @PostMapping(value = "/crearUsuario")
    public ResponseEntity<?> crearUsuario (@RequestBody UsuarioResponse usuarioResponse){
        if(usuarioResponse.getNombre()==null)
            return new ResponseEntity<>(new Mensaje("Debe diligenciar el nombre"), HttpStatus.BAD_REQUEST);
        Usuario usuario = new Usuario(usuarioResponse.getNombre(), usuarioResponse.getCargo(), usuarioResponse.getEdad(), usuarioResponse.getIngreso());
            return new ResponseEntity(new Mensaje("Usuario registrado"), HttpStatus.OK);
    }
}
