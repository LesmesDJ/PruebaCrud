package com.prueba.ejemplo.Services;

import com.prueba.ejemplo.Models.Cargo;
import com.prueba.ejemplo.Models.Producto;
import com.prueba.ejemplo.Models.Usuario;
import com.prueba.ejemplo.Repository.CargoRepository;
import com.prueba.ejemplo.Repository.ProductoRepository;
import com.prueba.ejemplo.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudServices {

    @Autowired
    CargoRepository cargoRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    ProductoRepository productoRepository;

    public List<Cargo> lstCargo (){
        return cargoRepository.findAll();
    }

    public List<Usuario> lstUsuario () {
        return usuarioRepository.findAll();
    }

    public List<Producto> lstProducto () { return productoRepository.findAll(); }

}
