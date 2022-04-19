package com.prueba.ejemplo.Services;

import com.prueba.ejemplo.Models.Cargo;
<<<<<<< HEAD
import com.prueba.ejemplo.Models.Mercancia;
import com.prueba.ejemplo.Models.Usuario;
import com.prueba.ejemplo.Repository.CargoRepository;
import com.prueba.ejemplo.Repository.MercanciaRepository;
=======
import com.prueba.ejemplo.Models.Producto;
import com.prueba.ejemplo.Models.Usuario;
import com.prueba.ejemplo.Repository.CargoRepository;
import com.prueba.ejemplo.Repository.ProductoRepository;
>>>>>>> 2b9f6784a8fdfc00b95783ccaeb6544630c8a14b
import com.prueba.ejemplo.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudServices {

    @Autowired
    CargoRepository cargoRepository;
    MercanciaRepository mercanciaRepository;
    UsuarioRepository usuarioRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    ProductoRepository productoRepository;

    public List<Cargo> lstCargo (){
        return cargoRepository.findAll();
    }

<<<<<<< HEAD
    public List<Usuario> lstUsuario(){
        return usuarioRepository.findAll();
    }

    public  List<Mercancia> lstMercancia(){
        return mercanciaRepository.findAll();
    }
=======
    public List<Usuario> lstUsuario () {
        return usuarioRepository.findAll();
    }

    public List<Producto> lstProducto () { return productoRepository.findAll(); }

>>>>>>> 2b9f6784a8fdfc00b95783ccaeb6544630c8a14b
}
