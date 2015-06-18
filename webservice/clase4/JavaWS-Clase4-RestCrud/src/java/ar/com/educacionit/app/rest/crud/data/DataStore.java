/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.app.rest.crud.data;

import java.util.Map;
import ar.com.educacionit.app.rest.crud.model.Vino;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author rdurante
 */
public class DataStore {

    private static Map<Long, Vino> datos = new HashMap<Long, Vino>();
    private static long ultimoID = 1;

    static {
        agregarVino( new Vino("Luigi Posca", "A", 1976));
        agregarVino( new Vino("Toro Viejo", "B", 1978));
        agregarVino( new Vino("Termidor", "C", 1982));
        agregarVino( new Vino("Uvita", "D", 1966));
    }

    public static Vino agregarVino(Vino vino) {
        vino.setId(ultimoID++);
        datos.put(vino.getId(), vino);
        return vino;
    }

    public static List<Vino> obtenerVinos() {
        return new ArrayList<>(datos.values());
    }

    public static Vino obtenerVino(Long id) {
        return datos.get(id);
    }

    public static List<Vino> obtenerVinosPorNombre(String nombre) {
        List<Vino> vinos = new ArrayList<>();
        for (Map.Entry<Long, Vino> entry : datos.entrySet()) {
            Vino currentClient = entry.getValue();
            String clientName = currentClient.getNombre();
            if (clientName != null && clientName.contains(nombre)) {
                vinos.add(currentClient);
            }
        }
        return vinos;
    }

    public static Vino actualizarVino(Vino vino) {
        datos.put(vino.getId(), vino);
        return vino;
    }

    public static void removerVino(Long id) {
        datos.remove(id);
    }
}
