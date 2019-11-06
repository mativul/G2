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
public class Empleado {

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getId_cargEmpleado() {
        return id_cargEmpleado;
    }

    public void setId_cargEmpleado(int id_cargEmpleado) {
        this.id_cargEmpleado = id_cargEmpleado;
    }

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, int id_ciudad, int dni, int telefono, int id_cargEmpleado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id_ciudad = id_ciudad;
        this.dni = dni;
        this.telefono = telefono;
        this.id_cargEmpleado = id_cargEmpleado;
    }

    public Empleado(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    int id;
    String nombre;
    String apellido;
    int id_ciudad;
    int dni;
    int telefono;
    int id_cargEmpleado;
}
