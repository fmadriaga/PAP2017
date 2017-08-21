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
public class Usuario {
    private String nickname;
    private String nombre;
    private String apellido;
    private String mail;
    private Date fechaNac;

    public Usuario() {
    }

    public Usuario(String nickname, String nombre, String apellido, String mail, Date fechaNac) {
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.fechaNac = fechaNac;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nickname=" + nickname + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", fechaNac=" + fechaNac + '}';
    }
    
    
}
