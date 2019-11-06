/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuario
 */
public class Artista {

    public int getId_artista() {
        return id_artista;
    }

    public void setId_artista(int id_artista) {
        this.id_artista = id_artista;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Artista() {
    }

    public Artista(int id_artista, String nombre, String apellido, String ciudad) {
        this.id_artista = id_artista;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
    }

    public Artista(int id_artista, String nombre) {
        this.id_artista = id_artista;
        this.nombre = nombre;
    }

    public Artista(String nombre, String apellido, int ciudadd) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudadd = ciudadd;
    }

    public Artista(int id_artista, String nombre, String apellido, int ciudadd) {
        this.id_artista = id_artista;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudadd = ciudadd;
    }

    int id_artista;
    String nombre;
    String apellido;
    int ciudadd;
    String ciudad;

    public int getCiudadd() {
        return ciudadd;
    }

    public void setCiudadd(int ciudadd) {
        this.ciudadd = ciudadd;
    }

}
