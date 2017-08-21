/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.Modelo;

/**
 *
 * @author fmadriaga
 */
public class Tema {
    private String nombre;
    private Float duracion;
    private Integer orden;

    public Tema() {
    }
    
    public Tema(String nombre, Float duracion, Integer orden) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.orden = orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getDuracion() {
        return duracion;
    }

    public void setDuracion(Float duracion) {
        this.duracion = duracion;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return "Tema{" + "nombre=" + nombre + ", duracion=" + duracion + ", orden=" + orden + '}';
    }
    
    
}
