package com.idat.EC2MonicaNolascoBodega.dto;

public class ClienteDTORequest {
	private Integer id; 
	private String nombreCliente; 
	private String direccionCliente; 
	private String dniCliente;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getDireccionCliente() {
		return direccionCliente;
	}
	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}
	public String getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	public Integer getIdCliente() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
