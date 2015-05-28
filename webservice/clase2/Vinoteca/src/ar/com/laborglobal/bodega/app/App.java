package ar.com.laborglobal.bodega.app;

import javax.xml.ws.Endpoint;

import ar.com.laborglobal.bodega.servicio.impl.VinotecaImpl;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://127.0.0.1:9001/ws/Vinoteca", new VinotecaImpl());
	}

}
