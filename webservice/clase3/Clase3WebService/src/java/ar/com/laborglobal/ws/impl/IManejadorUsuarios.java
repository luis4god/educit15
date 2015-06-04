/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.laborglobal.ws.impl;

import ar.com.laborglobal.ws.negocio.Usuario;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author educacionit
 */
@WebService
public interface IManejadorUsuarios {
    
    @WebMethod(operationName = "Saludar")
    @WebResult(name="Resultado")
    public String decirHola(@WebParam(name="nombre") String nombre);
    
    @Oneway
    public void iniciarProceso(@WebParam(name="proceso") String proceso);
    
    @WebResult(name="Usuario")
    public Usuario buscarUsuario(@WebParam(name="id") int id);
    
    @WebResult(name="Usuario")
    public Usuario insertUsuario(@WebParam(name="usuario") Usuario usuario);
    
}
