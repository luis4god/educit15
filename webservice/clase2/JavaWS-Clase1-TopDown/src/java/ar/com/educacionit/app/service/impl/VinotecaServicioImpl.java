/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.app.service.impl;

import ar.com.educacionit.app.service.ServicioVinotecaPortType;
import javax.jws.WebService;

/**
 *
 * @author rdurante
 */

@WebService(
endpointInterface = "ar.com.educacionit.app.service.ServicioVinotecaPortType",
        portName = "ServicioVinotecaPort",
        serviceName = "VinotecaWS",
        targetNamespace = "http://service.app.educacionit.com.ar/",
        wsdlLocation = "WEB-INF/wsdl/servicio.wsdl")
public class VinotecaServicioImpl implements ServicioVinotecaPortType{

    @Override
    public String obtenerBodega(String nombreDelVino) {
        return "Hola Mundo!!";
    }
    
}
