/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.educacionit.app.services;

import javax.jws.WebService;

/**
 *
 * @author educacionit
 */
@WebService
public class ManegadorUsuariosImpl implements ManegadorUsuarios{

    @Override
    public String decirHola(String name) {
       return "Hola "+ name;
    }
    
}
