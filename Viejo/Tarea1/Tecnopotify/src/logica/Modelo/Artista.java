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
public class Artista extends Usuario{
    private String biografia;
    private String sitioWeb;

    public Artista() {
    }

    public Artista(String biografia, String sitioWeb, String nickname, String nombre, String apellido, String mail, Date fechaNac) {
        super(nickname, nombre, apellido, mail, fechaNac);
        this.biografia = biografia;
        this.sitioWeb = sitioWeb;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    @Override
    public String toString() {
        return "Artista{" + super.toString() + "biografia=" + biografia + ", sitioWeb=" + sitioWeb + '}';
        
    }
    
    
}
