/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.laborglobal.ws;

import ar.com.laborglobal.ws.impl.IManejadorUsuarios;
import ar.com.laborglobal.ws.negocio.Usuario;
import javax.jws.WebService;

/**
 *
 * @author educacionit
 */
@WebService(endpointInterface = "ar.com.laborglobal.ws.impl.IManejadorUsuarios")
public class ManejadorUsuarioImpl implements IManejadorUsuarios{
    
    /**
     *
     * @param nombre
     * @return
     */
    @Override
    public String decirHola(String nombre){
        return "Hola " + nombre;
    }
   
    public String decirChau (String nombre){
        return "Chau " + nombre;
    }

    @Override
    public void iniciarProceso(String proceso) {
        System.out.println("Proceso "+proceso + " iniciado");
    }

    @Override
    public Usuario buscarUsuario(int id) {
        Usuario u = new Usuario(0,"Luis","Rodriguez",37);
        return u;
    }

    @Override
    public Usuario insertUsuario(Usuario usuario) {
        System.out.println(usuario);
       return usuario;
    }
    
}
