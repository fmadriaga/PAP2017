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
public class Album {
    private String nombre;
    private Integer anio;
    private String imagen;

    public Album() {
    }

    public Album(String nombre, Integer anio, String imagen) {
        this.nombre = nombre;
        this.anio = anio;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Album{" + "nombre=" + nombre + ", anio=" + anio + ", imagen=" + imagen + '}';
    }
    
    
    
}
