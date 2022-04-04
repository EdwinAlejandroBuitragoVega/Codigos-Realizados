/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaaviones;

/**
 *
 * @author Edwin Alejandro Buitrago Vega
 */
public class Pasajero {
    private final String nombre;
    private final String id;

    public Pasajero(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + "|" + id ;
    }
    
}
