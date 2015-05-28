/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientwebservice;

import ar.com.educacionit.app.service.ServicioVinotecaPortType;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.webservicex.gi.GeoIP;
import net.webservicex.gi.GeoIPService;
import net.webservicex.gw.GlobalWeather;
import net.webservicex.gw.GlobalWeatherSoap;
import sun.net.util.IPAddressUtil;

/**
 *
 * @author educacionit
 */
public class ClientWebService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
           
            
          
            
           
            
          
            
            URL url = new URL("http://clarin.com");
            
            GeoIPService service = new GeoIPService();
            GeoIP geoip = service.getGeoIPServiceSoap().getGeoIP("200.42.136.212");
            
            
            System.out.println("Pais="+geoip.getCountryName());
            System.out.println("PaisCode="+geoip.getCountryCode());
            System.out.println("Detalles="+geoip.getReturnCodeDetails());
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            
            GlobalWeather gw = new GlobalWeather();
            
            GlobalWeatherSoap globalWeatherSoap = gw.getGlobalWeatherSoap();
            
            String citiesByCountry = globalWeatherSoap.getCitiesByCountry("Argentina");
           
             System.out.println("citiesByCountry="+citiesByCountry);
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClientWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
