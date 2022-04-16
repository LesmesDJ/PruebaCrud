package com.prueba.ejemplo.Services;

import com.prueba.ejemplo.Models.Cargo;
import com.prueba.ejemplo.Repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudServices {

    @Autowired
    CargoRepository cargoRepository;

    public List<Cargo> lstCargo (){
        System.out.println("Entra Crudd");
        return cargoRepository.findAll();
    }

}
