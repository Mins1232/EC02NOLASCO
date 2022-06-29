package com.idat.EC2MonicaNolascoBodega.service;

import java.util.List;

import com.idat.EC2MonicaNolascoBodega.dto.ProductoDTORequest;
import com.idat.EC2MonicaNolascoBodega.dto.ProductoDTOResponse;



public interface ProductoService {
	void guardarProductos(ProductoDTORequest producto);
	void actualizarProducto(ProductoDTORequest producto);
	void eliminarProducto(Integer id);
	List<ProductoDTOResponse>listarProductos();
	ProductoDTOResponse obtenerProductoId(Integer id);
}
