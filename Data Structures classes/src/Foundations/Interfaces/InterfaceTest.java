/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Foundations.Interfaces;
import java.util.*;
/**
 *
 * @author EdwinB
 */
public class InterfaceTest {
    
    public static void main(String args[]) {
        Duck gomito = new Duck("Pato de Goma", new NoFly());
        Duck silvestre = new Duck("Pato silvestre", new LongFly());
        Duck parque = new Duck("Pato de parque", new ShortFly());
        
        ArrayList<Duck> paticos = new ArrayList<>();
        paticos.add(gomito);
        paticos.add(silvestre);
        paticos.add(parque);
        for (Duck p: paticos) {
            System.out.print(p.getName() + " - ");
            p.fly();
        }
        //se pueden intercambiar los algoritmos
        System.out.println("Ahora silvestre no vuela... pero el de goma si");
        silvestre.setFlybehavior(new NoFly());
        gomito.setFlybehavior(new LongFly());
        for (Duck p: paticos) {
            System.out.print(p.getName() + "-");
            p.fly();
        }
    }
}
