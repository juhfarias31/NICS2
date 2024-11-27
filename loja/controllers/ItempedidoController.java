package com.nics.loja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nics.loja.entities.Itempedido;
import com.nics.loja.services.ItempedidoService;

@RestController
@RequestMapping("/Itempedido")
public class ItempedidoController {


	@Autowired
	private ItempedidoService itempedidoService;

	@PostMapping
	public Itempedido createItempedido(@RequestBody Itempedido itempedido) {
		return itempedidoService.saveItempedido(itempedido);
	}
	
	@PutMapping
	public Itempedido editItempedido(@RequestBody Itempedido itempedido) {
		return itempedidoService.saveItempedido(itempedido);
	}

	@GetMapping
	public List<Itempedido> getAllItempedido() {
		return itempedidoService.getAllItempedido();
	}

	@GetMapping("/{id}")
	public Itempedido getItempedido(@PathVariable Long id) {
		return itempedidoService.getItempedidoById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteItempedido(@PathVariable Long id) {
		itempedidoService.deleteItempedido(id);
	}
}