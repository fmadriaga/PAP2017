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
public class Playlist {
    private String nombre;
    private String imagen;

    public Playlist() {
    }

    public Playlist(String nombre, String imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Playlist{" + "nombre=" + nombre + ", imagen=" + imagen + '}';
    }
    
    
}
