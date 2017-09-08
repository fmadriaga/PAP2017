/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.Modelo;

/**
 *
 * @author emi
 */
public class Usuario {

    //constructor por defecto
    public Usuario() {
    }
    //ALT+Insert

    public Usuario(String nombre, String apellido, int edad, boolean tieneSuenios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tieneSuenios = tieneSuenios;
    }
    
    
    private String nombre;
    private String apellido;
    private int edad;
    private boolean tieneSuenios;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isTieneSuenios() {
        return tieneSuenios;
    }

    public void setTieneSuenios(boolean tieneSuenios) {
        this.tieneSuenios = tieneSuenios;
    }

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", tieneSuenios?" + tieneSuenios + '}';
    }

    
    
    
    
    
   
    
    
    
}
