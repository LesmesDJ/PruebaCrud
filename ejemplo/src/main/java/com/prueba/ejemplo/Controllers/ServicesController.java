package com.prueba.ejemplo.Controllers;

import com.prueba.ejemplo.Models.Cargo;
<<<<<<< HEAD
import com.prueba.ejemplo.Models.Mercancia;
=======
import com.prueba.ejemplo.Models.Producto;
>>>>>>> 2b9f6784a8fdfc00b95783ccaeb6544630c8a14b
import com.prueba.ejemplo.Models.Usuario;
import com.prueba.ejemplo.Services.CrudServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class ServicesController {

    @Autowired
    private CrudServices crudServices;

    @GetMapping(value = "/cargo", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<?> listCargo () {
        List<Cargo> lstCargo = crudServices.lstCargo();
        return new ResponseEntity<List<Cargo>>(lstCargo, HttpStatus.OK);
    }
    @GetMapping(value = "/usuario", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<?> listUsuario () {
        List<Usuario> lstUsuario = crudServices.lstUsuario();
        return new ResponseEntity<List<Usuario>>(lstUsuario, HttpStatus.OK);
    }

    @GetMapping(value = "/mercancia", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<?> listMercancia () {
        List<Mercancia> lstMercancia = crudServices.lstMercancia();
        return new ResponseEntity<List<Mercancia>>(lstMercancia, HttpStatus.OK);
    }

    @GetMapping(value = "/usuario", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<?> listUsuario (){
        List<Usuario> lstUsuario = crudServices.lstUsuario();
        return  new ResponseEntity<List<Usuario>>(lstUsuario, HttpStatus.OK);
    }

    @GetMapping(value = "/producto", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<?> listProducto (){
        List<Producto> lstProducto = crudServices.lstProducto();
        return new ResponseEntity<List<Producto>>(lstProducto, HttpStatus.OK);
    }
}
