package com.nics.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nics.loja.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}