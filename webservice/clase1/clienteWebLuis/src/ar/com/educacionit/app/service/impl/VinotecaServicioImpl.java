package ar.com.educacionit.app.service.impl;

import javax.jws.WebService;

import ar.com.educacionit.app.service.ServicioVinotecaPortType;
@WebService(
endpointInterface = "ar.com.educacionit.app.service.ServicioVinotecaPortType",
        portName = "ServicioVinotecaPort",
        serviceName = "VinotecaWS",
        targetNamespace = "http://service.app.educacionit.com.ar/",
        wsdlLocation = "WEB-INF/wsdl/servicio.wsdl")
public class VinotecaServicioImpl implements ServicioVinotecaPortType{

	@Override
	public String obtenerBodega(String nombreDelVino) {
		return "MUCHAS BODEGAS";
	}
	

}
