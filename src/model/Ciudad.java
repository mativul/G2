/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author matias
 */
public class Ciudad {

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    public String getId_paiss() {
        return id_paiss;
    }

    public void setId_paiss(String id_paiss) {
        this.id_paiss = id_paiss;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "id_ciudad=" + id_ciudad + ", descripcion=" + descripcion + ", id_pais=" + id_pais + ", id_paiss=" + id_paiss + '}';
    }

    public Ciudad(int id_ciudad, String descripcion) {
        this.id_ciudad = id_ciudad;
        this.descripcion = descripcion;
    }
    int id_ciudad;
    String descripcion;
    int id_pais;
    String id_paiss;

    public Ciudad(int id_ciudad, String descripcion, int id_pais) {
        this.id_ciudad = id_ciudad;
        this.descripcion = descripcion;
        this.id_pais = id_pais;
    }
}
