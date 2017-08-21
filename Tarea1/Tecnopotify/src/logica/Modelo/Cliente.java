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
public class Cliente extends Usuario{

    public Cliente() {
    }

    public Cliente(String nickname, String nombre, String apellido, String mail, Date fechaNac) {
        super(nickname, nombre, apellido, mail, fechaNac);
    }

    @Override
    public String toString() {
        return "Cliente{" + super.toString() + '}';
    }
    
    
}
