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
public class Expocicion {



    public Expocicion() {
    }

    public int getId_expocicion() {
        return id_expocicion;
    }

    public void setId_expocicion(int id_expocicion) {
        this.id_expocicion = id_expocicion;
    }

    public int getId_visita() {
        return id_visita;
    }

    public void setId_visita(int id_visita) {
        this.id_visita = id_visita;
    }

    public String getVisita() {
        return visita;
    }

    public void setVisita(String visita) {
        this.visita = visita;
    }

    public String getObra() {
        return obra;
    }

    public void setObra(String obra) {
        this.obra = obra;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Expocicion(int id_expocicion, String visita, String fechaInicio, String fechaFin, String horario) {
        this.id_expocicion = id_expocicion;
        this.visita = visita;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horario = horario;
    }

    public Expocicion(int id_visita, String visita, String fechaInicio, String fechaFin, String nombre, String horario) {
        this.id_visita = id_visita;
        this.visita = visita;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombre = nombre;
        this.horario = horario;
    }


    
    int id_expocicion;
    int id_visita;
    String visita;
    String obra;
    String empleado;
    float monto;
    String fechaInicio;
    String fechaFin;
    String nombre;
    String horario;
 
}
