package ar.com.laborglobal.app;

import javax.xml.ws.Endpoint;

import ar.com.laborglabal.mywebservice.WebServiceLuis;

public class ServicioInicial {

	public static void main(String[] args) {
		System.out.println("Iniciando webService");
		Endpoint.publish("http://127.0.0.1:9001/ws/MyServicio", new WebServiceLuis());
		System.out.println("webService");
	}

}
