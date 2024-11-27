package com.nics.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nics.loja.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}