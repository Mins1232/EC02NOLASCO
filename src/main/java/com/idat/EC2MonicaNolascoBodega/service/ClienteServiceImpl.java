package com.idat.EC2MonicaNolascoBodega.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC2MonicaNolascoBodega.dto.ClienteDTORequest;
import com.idat.EC2MonicaNolascoBodega.dto.ClienteDTOResponse;
import com.idat.EC2MonicaNolascoBodega.model.Cliente;
import com.idat.EC2MonicaNolascoBodega.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repository;
	@Override
	public void guardarClientes(ClienteDTORequest cliente) {
		Cliente c = new Cliente();
		c.setNombre(cliente.getNombreCliente());
		c.setDireccion(cliente.getDireccionCliente());
		c.setDni(cliente.getDniCliente());
		repository.save(c);
		
	}

	@Override
	public void actualizarClientes(ClienteDTORequest cliente) {
		Cliente c = new Cliente();
		c.setIdCliente(cliente.getId());
		c.setNombre(cliente.getNombreCliente());
		c.setDireccion(cliente.getDireccionCliente());
		c.setDni(cliente.getDniCliente());
		
		repository.saveAndFlush(c);
		
	}

	@Override
	public void eliminarClientes(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<ClienteDTOResponse> listarClientes() {
		List<ClienteDTOResponse> listar=new ArrayList<>();
		ClienteDTOResponse dto=null;
		List<Cliente> c=repository.findAll();
		
		for(Cliente cliente : c) {
			dto = new ClienteDTOResponse();
			dto.setNombreCliente(cliente.getNombre());
			dto.setDireccionCliente(cliente.getDireccion());
			dto.setDniCliente(cliente.getDni());
			dto.setId(cliente.getIdCliente());
			
			listar.add(dto);
		}
		return listar;
	}

	@Override
	public ClienteDTOResponse obtenerClienteId(Integer id) {
		Cliente cliente=repository.findById(id).orElse(null);
		ClienteDTOResponse dto= new ClienteDTOResponse();
		dto = new ClienteDTOResponse();
		dto.setNombreCliente(cliente.getNombre());
		dto.setDireccionCliente(cliente.getDireccion());
		dto.setDniCliente(cliente.getDni());
		dto.setId(cliente.getIdCliente());
		return dto;
	}

	

}
