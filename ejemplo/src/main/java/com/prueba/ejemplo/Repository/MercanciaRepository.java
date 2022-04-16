package com.prueba.ejemplo.Repository;

import com.prueba.ejemplo.Models.Mercancia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MercanciaRepository extends JpaRepository<Mercancia, Long> {
}
