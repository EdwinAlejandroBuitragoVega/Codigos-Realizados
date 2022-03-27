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
public class Carga extends Aviones {

    private final double pesoMax;
    private double pesoAct = 0;
    private final ArrayList<Paquete> paquetes = new ArrayList<>();

    public Carga(double pesoMax, int velocidad, String matricula) {
        super(velocidad, matricula);
        this.pesoMax = pesoMax;
    }

    public void addPaquete(Paquete paquete) {
         System.out.println("Agregando " + paquete.getNombre()+"...");
        if (pesoAct + paquete.getPeso() <= pesoMax) {
            paquetes.add(paquete);
            pesoAct += paquete.getPeso();
        } else {
            System.out.println("El paquete " + paquete.getNombre() + " no puede ser agregado. Carga máxima superada");
        }
    }

    @Override
    public void Visualisar() {
        System.out.println("Avión de carga matrícula: " + this.getMatricula() + ", capacidad: " + this.pesoMax + "Kg velocidad:" + this.getVelocidad()+" Km/h, contiene:");
        paquetes.forEach((auxPaq) -> {
            System.out.println(auxPaq.toString());
        });
    }

}
