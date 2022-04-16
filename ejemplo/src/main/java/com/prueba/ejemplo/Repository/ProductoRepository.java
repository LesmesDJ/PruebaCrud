package com.prueba.ejemplo.Repository;

import com.prueba.ejemplo.Models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
