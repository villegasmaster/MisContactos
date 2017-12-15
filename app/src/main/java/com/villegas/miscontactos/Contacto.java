package com.villegas.miscontactos;

/**
 * Created by Villegas on 07/12/2017.
 */

public class Contacto {

    private String nombre;

    private String telefono;

    private String email;

    private int foto;


    public Contacto(int foto, String nombre, String telefono, String email) {
        this.foto = foto;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;

    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
