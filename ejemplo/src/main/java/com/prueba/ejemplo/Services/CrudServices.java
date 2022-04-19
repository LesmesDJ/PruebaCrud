package com.prueba.ejemplo.Services;

import com.prueba.ejemplo.Models.Cargo;
import com.prueba.ejemplo.Models.Mercancia;
import com.prueba.ejemplo.Models.Usuario;
import com.prueba.ejemplo.Repository.CargoRepository;
import com.prueba.ejemplo.Repository.MercanciaRepository;
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

    public List<Cargo> lstCargo (){
        return cargoRepository.findAll();
    }


    public  List<Mercancia> lstMercancia(){
        return mercanciaRepository.findAll();
    }

    public List<Usuario> lstUsuario () {
        return usuarioRepository.findAll();
    }

    public void saveCargo (Cargo cargo) { cargoRepository.save(cargo);}

}
