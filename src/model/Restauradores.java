/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ezepc
 */
public class Restauradores {
    
   int  id_restauracion;
   String nombre;
   String apellido;    

    public int getId_restauracion() {
        return id_restauracion;
    }

    public void setId_restauracion(int id_restauracion) {
        this.id_restauracion = id_restauracion;
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

    public Restauradores(int id_restauracion, String nombre, String apellido) {
        this.id_restauracion = id_restauracion;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Restauradores() {
    }
}
