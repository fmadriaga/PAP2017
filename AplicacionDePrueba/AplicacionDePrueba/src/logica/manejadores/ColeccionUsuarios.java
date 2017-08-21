/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.manejadores;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import logica.Modelo.Usuario;

/**
 *
 * @author emi
 */
public class ColeccionUsuarios {
    
    private HashMap<String, Usuario> usuarios;

    
    private ColeccionUsuarios() {
        usuarios = new HashMap<String, Usuario>();
    }
    
    public static ColeccionUsuarios getInstance() {
        return ColeccionUsuariosHolder.INSTANCE;
    }
    
    private static class ColeccionUsuariosHolder {

        private static final ColeccionUsuarios INSTANCE = new ColeccionUsuarios();
    }
    
    public void agregarUsuario(Usuario u){
        Usuario us;
        us = usuarios.put(u.getNombre(), u);
    }
    
    public void quitarUsuario(Usuario u){
        usuarios.remove(u.getNombre());
    }
    
    public boolean estaUsuario(Usuario u){
        return usuarios.containsKey(u.getNombre());
    }
    
    public List<Usuario> getUsuarios(){
        List<Usuario> lista;
        lista = new LinkedList<>();
        lista.addAll(usuarios.values());
        return lista;
    }
    
    
}
