package com.nics.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nics.loja.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}