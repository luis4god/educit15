package com.chuidiang.pruebas.spring;


/** 
 * Bean con los atributos correspondientes a los campos de la tabla de base
 * de datos.
 * @author chuidiang
 */
public class Persona {
	int id;
	String nombre;
	String fechaNacimiento;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	/** Para poder escribir el bean en pantalla de forma rápida */
	public String toString()
	{
		return ""+id+" "+nombre+" "+fechaNacimiento;
	}
}