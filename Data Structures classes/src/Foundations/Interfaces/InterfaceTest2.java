/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Foundations.Interfaces;

import java.util.ArrayList;

/**
 *
 * @author EdwinB
 */
public class InterfaceTest2 {
    
    public static void main(String args[]) {
        Duck gomito = new Duck("Pato de Goma", new NoFly());
        Duck silvestre = new Duck("Pato silvestre", new LongFly());
        Duck parque = new Duck("Pato de parque", new ShortFly());
        Duck future = new Duck("Pato avanzado", new FutureFlyBehavior());
        
        ArrayList<Duck> paticos = new ArrayList<>();
        paticos.add(gomito);
        paticos.add(silvestre);
        paticos.add(parque);
        paticos.add(future);
        for (Duck p: paticos) {
            System.out.print(p.getName() + " - ");
            p.fly();
        }
                
        System.out.println("El patico del futuro....");
        ((DefaultTeleport)future.getFlybehavior()).teleport("mars!");
    }
}
