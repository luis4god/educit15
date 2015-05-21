package ar.com.laborglabal.mywebservice;

import java.util.Date;

import javax.jws.WebService;

import ar.com.laborglobal.entidad.Persona;

@WebService
public class WebServiceLuis {
	public Persona[] holaMundo(String nombre){
		Persona[] personas = new Persona[5];
		for(int i=0 ; i < 5; i++){
			personas[i] = new Persona();
			personas[i].setNombre(nombre + " "+i);
			personas[i].setEdad(i*7);
			personas[i].setNacimiento(new Date());
		}
		return personas;
	}

}
