package com.nics.loja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nics.loja.entities.Itempedido;
import com.nics.loja.repositories.ItempedidoRepository;


@Service
public class ItempedidoService {
	
	@Autowired
	private ItempedidoRepository itempedidoRepository;
	
	public Itempedido saveItempedido( Itempedido itempedido) {
		return itempedidoRepository.save(itempedido);
	}
	
	public List<Itempedido> getAllItempedido(){
		return itempedidoRepository.findAll();
	}
	
	public Itempedido getItempedidoById (Long id) {
		return itempedidoRepository.findById(id).orElse(null);
	}
	
	public void deleteItempedido(Long id) {
		itempedidoRepository.deleteById(id);
	}


}
