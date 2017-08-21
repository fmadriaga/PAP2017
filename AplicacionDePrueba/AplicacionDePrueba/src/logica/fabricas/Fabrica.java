/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.fabricas;

import logica.controlador.ControladorUsuario;
import logica.interfaces.IControladorUsuario;

/**
 *
 * @author emi
 */
public class Fabrica {
    
    public IControladorUsuario getControladorUsuario(){
        return new ControladorUsuario();
    }
    
}
