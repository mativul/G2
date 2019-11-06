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
public class Obra {

    public int getId_obra() {
        return id_obra;
    }

    public void setId_obra(int id_obra) {
        this.id_obra = id_obra;
    }

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getValuacion() {
        return valuacion;
    }

    public void setValuacion(float valuacion) {
        this.valuacion = valuacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public Obra() {
    }

    public Obra(int id_obra, int id_artista, String nombre, String genero, float valuacion, String descripcion, int alto, int ancho, String ingreso) {
        this.id_obra = id_obra;
        this.id_artista = id_artista;
        this.nombre = nombre;
        this.genero = genero;
        this.valuacion = valuacion;
        this.descripcion = descripcion;
        this.alto = alto;
        this.ancho = ancho;
        this.ingreso = ingreso;
    }

    public Obra( int id_artista, String nombre, String genero, float valuacion, String descripcion, int alto, int ancho, String ingreso) {
        
        this.id_artista = id_artista;
        this.nombre = nombre;
        this.genero = genero;
        this.valuacion = valuacion;
        this.descripcion = descripcion;
        this.alto = alto;
        this.ancho = ancho;
        this.ingreso = ingreso;
    }
    public Obra(int id_obra,String nombreartista, String nombre, String genero, float valuacion, String descripcion, int alto, int ancho, String ingreso) {
        this.id_obra = id_obra;
        this.nombreartista = nombreartista;
        this.nombre = nombre;
        this.genero = genero;
        this.valuacion = valuacion;
        this.descripcion = descripcion;
        this.alto = alto;
        this.ancho = ancho;
        this.ingreso = ingreso;
    }
    
    int id_obra;
    int id_artista;
    String nombre;
    String nombreartista;

    public String getNombreartista() {
        return nombreartista;
    }

    public void setNombreartista(String nombreartista) {
        this.nombreartista = nombreartista;
    }
    String genero;
    float valuacion;
    String descripcion;
    int alto;
    int ancho;
    String ingreso;
   
    
    
    
}
