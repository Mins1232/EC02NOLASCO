package com.idat.EC2MonicaNolascoBodega.service;

import java.util.List;

import com.idat.EC2MonicaNolascoBodega.dto.ClienteDTORequest;
import com.idat.EC2MonicaNolascoBodega.dto.ClienteDTOResponse;



public interface ClienteService  {
	void guardarClientes(ClienteDTORequest cliente);
	void actualizarClientes(ClienteDTORequest cliente);
	void eliminarClientes(Integer id);
	List<ClienteDTOResponse>listarClientes();
	ClienteDTOResponse obtenerClienteId(Integer id);
}
