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

import com.nics.loja.entities.Usuario;
import com.nics.loja.services.UsuarioService;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {
	

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping
	public Usuario createUsuario(@RequestBody Usuario usuario) {
		return usuarioService.saveUsuario(usuario);
	}
	
	@PutMapping
	public Usuario editUsuario(@RequestBody Usuario usuario) {
		return usuarioService.saveUsuario(usuario);
	}

	@GetMapping
	public List<Usuario> getAllUsuario() {
		return usuarioService.getAllUsuario();
	}

	@GetMapping("/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		return usuarioService.getUsuarioById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteUsuario(@PathVariable Long id) {
		usuarioService.deleteUsuario(id);
	}
}