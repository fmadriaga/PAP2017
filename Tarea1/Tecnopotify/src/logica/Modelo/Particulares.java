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
public class Particulares extends Playlist{
    private Boolean privada;

    public Particulares() {
    }

    public Particulares(Boolean privada, String nombre, String imagen) {
        super(nombre, imagen);
        this.privada = privada;
    }

    public Boolean getPrivada() {
        return privada;
    }

    public void setPrivada(Boolean privada) {
        this.privada = privada;
    }

    @Override
    public String toString() {
        return "Particulares{" + super.toString() + "privada=" + privada + '}';
    }

    
    
    
}
