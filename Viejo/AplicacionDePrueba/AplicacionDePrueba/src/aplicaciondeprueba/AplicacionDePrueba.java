/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciondeprueba;

import logica.Modelo.Usuario;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Properties;
import logica.fabricas.Fabrica;
import logica.interfaces.IControladorUsuario;


/**
 *
 * @author emi
 */
public class AplicacionDePrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo!!");
        
        
        //Probando clase usuario!
        Usuario u = new Usuario("Max", "Demian", 20, true);
        
        //probando metodo to string
        System.out.println("Usuario:" + u);
        
        Properties prop = new Properties();
        
        InputStream input = null;

	try {

		input = new FileInputStream("src/recursos/conf.properties");

		// load a properties file
		prop.load(input);

		// get the property value and print it out
		System.out.println(prop.getProperty("nombre-app"));
                System.out.println("Cant de alumnos era:"+prop.getProperty("cantAlumnos"));

	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
        
        Fabrica fab = new Fabrica();
        IControladorUsuario controladorUsuario = fab.getControladorUsuario();
        controladorUsuario.crearUsuario("Alicia", "Espejo", 7);
        controladorUsuario.crearUsuario("Rascalnicov", "Ibramovich", 22);
        controladorUsuario.crearUsuario("Isabel", "Valpro", 60);
        
        List<Usuario> usuarios = controladorUsuario.getUsuarios();
        int i=0;
        for (Usuario usuario : usuarios) {
            System.out.println("Nro " + i++ + ")" + usuario.toString());
        }
        
        
    }
    
}
