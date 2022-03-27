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
import java.util.*;
public class Inventario {

    private final ArrayList<Aviones> aviones = new ArrayList<>();
    
    public Inventario() {
    }
    
    public void addAvion(Aviones avion) {
        aviones.add(avion);
    }
    
    public void listaAviones() {
        aviones.forEach((avion) -> {
            avion.Visualisar();
        });
    }
}
