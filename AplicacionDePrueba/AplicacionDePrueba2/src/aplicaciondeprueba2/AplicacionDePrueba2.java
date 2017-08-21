/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciondeprueba2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emi
 */
public class AplicacionDePrueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            // TODO code application logic here
            
            BufferedReader br = null;
            FileReader fr = null; // con control + espacio se importan las librerías
            
            fr = new FileReader("archivoPrueba");
            br = new BufferedReader(fr);
            
            String sCurrentLine;
            
            int i = 0;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(i++ + ")" + sCurrentLine);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AplicacionDePrueba2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
