package com.nics.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nics.loja.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}