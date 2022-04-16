package com.prueba.ejemplo.Repository;

import com.prueba.ejemplo.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
