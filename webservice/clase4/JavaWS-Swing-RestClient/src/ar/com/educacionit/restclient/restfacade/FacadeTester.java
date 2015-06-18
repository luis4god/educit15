/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.restclient.restfacade;

import ar.com.educacionit.restclient.modelo.Vino;

/**
 *
 * @author rdurante
 */
public class FacadeTester {

    public static void main(String[] args) {

        
        VinoRestClientFacade c = new VinoRestClientFacade();
        c.setResourcePath("1");
        Vino v = c.obtenerVinoById_JSON(Vino.class);
        System.out.println(v.getNombre());
        c.close();
        
        
        VinoRestClientFacade c2 = new VinoRestClientFacade();
        Vino vino2 = new Vino("Las Lilas", "Las Lilas", 1988);
        c2.agregarVino(vino2);
        c2.close();
        
        
        
        VinoRestClientFacade c3 = new VinoRestClientFacade();
        c3.setResourcePath("4");
        Vino vino3 = new Vino("Von Neuman", "Von Neuman", 1932);
        vino3.setId(4L);
        c3.actualizarVino(vino3);
        c3.close();
        
        
        
        VinoRestClientFacade c1 = new VinoRestClientFacade();
        Vino[] vs = c1.obtenerVinos_JSON(Vino[].class);
        for (Vino v1 : vs) {
            System.out.println(v1);
        }
        c1.close();
               
        
        
        
        
    }

}
