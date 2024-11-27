package com.nics.loja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nics.loja.entities.Pedido;
import com.nics.loja.repositories.PedidoRepository;


@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public Pedido savePedido( Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	public List<Pedido> getAllPedido(){
		return pedidoRepository.findAll();
	}
	
	public Pedido getPedidoById (Long id) {
		return pedidoRepository.findById(id).orElse(null);
	}
	
	public void deletePedido(Long id) {
		pedidoRepository.deleteById(id);
	}


}
