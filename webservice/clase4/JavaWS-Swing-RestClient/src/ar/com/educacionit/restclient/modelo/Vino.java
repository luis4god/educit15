/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.restclient.modelo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rdurante
 */
@XmlRootElement
public class Vino {

    private Long id;
    private String nombre;
    private String descripcion;
    private Integer anio;

    public Vino() {
    }

    public Vino(String nombre, String descripcion, Integer anio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.anio = anio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Vino{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", anio=" + anio + '}';
    }

}
