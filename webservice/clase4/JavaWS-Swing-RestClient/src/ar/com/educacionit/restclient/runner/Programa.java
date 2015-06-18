
package ar.com.educacionit.restclient.runner;

import ar.com.educacionit.restclient.presentacion.VentanaMaestra;


/**
 *
 * @author rdurante
 */
public class Programa {
    
    /**
     * Creates a new instance of TestIntegrador05
     */
    public Programa() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Construye y visualiza la ventana
        VentanaMaestra v = new VentanaMaestra();
        
        // Establece el tamanio
        v.setSize(1024,650);
        
        // Establece que no se pueda modificar el tama�o de la ventana
        v.setResizable(false);
        
        // Establece la ventana como visible
        v.setVisible(true);
        
    }
    
}
