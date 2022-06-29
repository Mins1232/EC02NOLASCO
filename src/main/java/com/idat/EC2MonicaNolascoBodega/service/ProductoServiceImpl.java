package com.idat.EC2MonicaNolascoBodega.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC2MonicaNolascoBodega.dto.ProductoDTORequest;
import com.idat.EC2MonicaNolascoBodega.dto.ProductoDTOResponse;
import com.idat.EC2MonicaNolascoBodega.model.Productos;
import com.idat.EC2MonicaNolascoBodega.repository.ProductosRepository;



@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductosRepository repository;
	@Override
	public void guardarProductos(ProductoDTORequest producto) {
		Productos p = new Productos();
		p.setProducto(producto.getNombreProducto());
		p.setDescripcion(producto.getDescripcionProducto());
		p.setPrecio(producto.getPrecioProducto());
		p.setStock(producto.getStockProducto());
		repository.save(p);

	}

	@Override
	public void actualizarProducto(ProductoDTORequest producto) {
		Productos p = new Productos();
		p.setIdProducto(producto.getId());
		p.setProducto(producto.getNombreProducto());
		p.setDescripcion(producto.getDescripcionProducto());
		p.setPrecio(producto.getPrecioProducto());
		p.setStock(producto.getStockProducto());
		
		repository.saveAndFlush(p);

	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<ProductoDTOResponse> listarProductos() {
		List<ProductoDTOResponse>listar =new ArrayList<>();
		ProductoDTOResponse dto =null;
		List<Productos> p = repository.findAll();
		
		for (Productos productos : p) {
			dto = new ProductoDTOResponse();
			
			dto.setDescripcionProducto(productos.getDescripcion());
			dto.setNombreProducto(productos.getProducto());
			dto.setPrecioProducto(productos.getPrecio());
			dto.setStockProducto(productos.getStock());
			dto.setId(productos.getIdProducto());
			
			listar.add(dto);
		}
	
		return listar;
	}

	@Override
	public ProductoDTOResponse obtenerProductoId(Integer id) {
		
		Productos productos= repository.findById(id).orElse(null);
		ProductoDTOResponse dto = new ProductoDTOResponse();
		dto.setDescripcionProducto(productos.getDescripcion());
		dto.setNombreProducto(productos.getProducto());
		dto.setPrecioProducto(productos.getPrecio());
		dto.setStockProducto(productos.getStock());
		dto.setId(productos.getIdProducto());
		
		return dto;
	}

}
