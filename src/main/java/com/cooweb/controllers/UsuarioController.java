package com.cooweb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooweb.dao.UsuarioDao;
import com.cooweb.models.Usuario;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	/*
	@RequestMapping(value="mensaje")
	public String mensaje() {
		return "Hola";
	}
	*/
	/*
	@RequestMapping(value="persona")
	public List<String> listarPersonas() {
		return List.of("Diego","Juan","Jose");
	}
	*/
	/*
	@RequestMapping(value="usuario")
	public Usuario listarUsuarios() {
		
		Usuario usuario=new Usuario();
		usuario.setNombre("Juan");
		usuario.setApellido("Echenique");
		usuario.setEmail("juangeortiz@gmail.com");
		usuario.setTelefono("2616902482");
		
		return usuario;
	}
	*/
	/*
	@RequestMapping(value="usuario/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		
		Usuario usuario=new Usuario();
		usuario.setId(id);
		usuario.setNombre("Juan");
		usuario.setApellido("Echenique");
		usuario.setEmail("juangeortiz@gmail.com");
		usuario.setTelefono("2616902482");
		
		return usuario;
	}
	*/
	
	@RequestMapping(value="usuario/lista_user")
	public List<Usuario> listar_variosUsuarios() {
		
		List<Usuario> usuarios=new ArrayList<>();
		
		Usuario usuario1=new Usuario();
		usuario1.setId(3L);
		usuario1.setNombre("Juan");
		usuario1.setApellido("Echenique");
		usuario1.setEmail("juangeortiz@gmail.com");
		usuario1.setTelefono("2616902482");
		
		Usuario usuario2=new Usuario();
		usuario2.setId(4L);
		usuario2.setNombre("Tiago");
		usuario2.setApellido("Lanza");
		usuario2.setEmail("tiagolanza@gmail.com");
		usuario2.setTelefono("2616352828");
		
		Usuario usuario3=new Usuario();
		usuario3.setId(5L);
		usuario3.setNombre("Juance");
		usuario3.setApellido("Escudero");
		usuario3.setEmail("juanceescudero@gmail.com");
		usuario3.setTelefono("2613252342");
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		return usuarios;
	}
	
	@RequestMapping(value="api/usuarios")
	public List<Usuario> getUsuario(){
		
		List<Usuario> user=usuarioDao.obtenerUsuarios();
		
		return user;
	}
}