package com.idat.EC2MonicaNolascoBodega.service;

import java.util.List;


import com.idat.EC2MonicaNolascoBodega.dto.UsuarioDTORequest;
import com.idat.EC2MonicaNolascoBodega.dto.UsuarioDTOResponse;

public interface UsuarioService {
	void guardarUsuario(UsuarioDTORequest usuario);
	void actualizarUsuario(UsuarioDTORequest usuario);
	void eliminarUsuario(Integer id);
	List<UsuarioDTOResponse>listarUsuario();
	UsuarioDTOResponse obtenerUsuarioId(Integer id);
}
