/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaaviones;

/**
 *
 * @author USER
 */
public class Paquete {
    private final String nombre;
    private final double peso;

    

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public Paquete(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", peso: " + peso + " kg";
    }
}

