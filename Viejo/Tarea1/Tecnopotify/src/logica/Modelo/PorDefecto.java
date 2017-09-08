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
public class PorDefecto extends Playlist{

    public PorDefecto() {
    }

    public PorDefecto(String nombre, String imagen) {
        super(nombre, imagen);
    }

    @Override
    public String toString() {
        return "PorDefecto{" + super.toString() + '}';
    }
    
    
}
