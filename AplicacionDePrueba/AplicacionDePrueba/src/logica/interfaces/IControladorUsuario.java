/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.interfaces;

import java.util.List;
import logica.Modelo.Usuario;

/**
 *
 * @author emi
 */
public interface IControladorUsuario {
    
    Usuario crearUsuario(String nombre, String apellido, int Edad);
    void eliminarUsuario(Usuario u);
    boolean existeUsuario(Usuario u);
    List<Usuario> getUsuarios();
    
}
