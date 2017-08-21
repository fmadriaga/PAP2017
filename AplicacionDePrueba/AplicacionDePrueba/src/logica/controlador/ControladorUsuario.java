/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.controlador;

import java.util.List;
import logica.Modelo.Usuario;
import logica.interfaces.IControladorUsuario;
import logica.manejadores.ColeccionUsuarios;

/**
 *
 * @author emi
 */
public class ControladorUsuario implements IControladorUsuario{

  

    @Override
    public void eliminarUsuario(Usuario u) {
        ColeccionUsuarios.getInstance().quitarUsuario(u);
    }

    @Override
    public boolean existeUsuario(Usuario u) {
        return ColeccionUsuarios.getInstance().estaUsuario(u);
    }

    @Override
    public List<Usuario> getUsuarios() {
        return ColeccionUsuarios.getInstance().getUsuarios();
    }

      @Override
    public Usuario crearUsuario(String nombre, String apellido, int Edad) {
        Usuario u = new Usuario(nombre, apellido, Edad, true);
        ColeccionUsuarios.getInstance().agregarUsuario(u);
        return u;
    }
    
    
    
}
