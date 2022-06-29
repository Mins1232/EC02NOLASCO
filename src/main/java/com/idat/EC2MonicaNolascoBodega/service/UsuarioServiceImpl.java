package com.idat.EC2MonicaNolascoBodega.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC2MonicaNolascoBodega.dto.UsuarioDTORequest;
import com.idat.EC2MonicaNolascoBodega.dto.UsuarioDTOResponse;

import com.idat.EC2MonicaNolascoBodega.model.Usuario;
import com.idat.EC2MonicaNolascoBodega.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	@Override
	public void guardarUsuario(UsuarioDTORequest usuario) {
		Usuario u = new Usuario();
		u.setUsuario(usuario.getUsuario());
		u.setContrasena(usuario.getContrasena());
		repository.save(u);

	}

	@Override
	public void actualizarUsuario(UsuarioDTORequest usuario) {
		Usuario u = new Usuario();
		u.setIdUsuario(usuario.getIdUsuario());
		u.setUsuario(usuario.getUsuario());
		u.setContrasena(usuario.getContrasena());
		repository.saveAndFlush(u);

	}

	@Override
	public void eliminarUsuario(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public List<UsuarioDTOResponse> listarUsuario() {
		return null;
	}

	@Override
	public UsuarioDTOResponse obtenerUsuarioId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
