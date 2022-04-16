package com.prueba.ejemplo.Repository;

import com.prueba.ejemplo.Models.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
}
