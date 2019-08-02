package com.intercor.customer.Dto;

public class CustomerDto {
	private String names;
	private String apellidos;
	private String fechaNacimiento;
	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		return "CustomerDto [names=" + names + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento
				+ "]";
	}
	
	

}
