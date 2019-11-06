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
public class Restauracion {

    private int id;
public Restauracion() {
        
    }
    public Restauracion(
           int id ,String restauracionObra, String restauracion, String nombreObra, String nombre, String apellido) {
        this.id =id;
        this.restauracionObra = restauracionObra;
        this.restauracion = restauracion;
        this.nombreObra = nombreObra;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRestauracionObra() {
        return restauracionObra;
    }

    public void setRestauracionObra(String restauracionObra) {
        this.restauracionObra = restauracionObra;
    }

    public String getRestauracion() {
        return restauracion;
    }

    public void setRestauracion(String restauracion) {
        this.restauracion = restauracion;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
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
    
   String restauracionObra ; 
    String   restauracion;
    String nombreObra   ; 
    String nombre ; 
    String apellido;
    
    
    
}
