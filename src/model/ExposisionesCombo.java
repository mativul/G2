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
public class ExposisionesCombo {
    
    public ExposisionesCombo()
            {}
    
    
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    String Nombre ;

    public ExposisionesCombo(int id, String Nombre) {
        this.id = id;
        this.Nombre = Nombre;
    }
    
}
