/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.app.service.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author rdurante
 */
public class MyListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("**************************");
        System.out.println("Iniciando Servidor");
        System.out.println("**************************");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("**************************");
        System.out.println("Destruyendo Servidor");
        System.out.println("**************************");
    }
    
}
