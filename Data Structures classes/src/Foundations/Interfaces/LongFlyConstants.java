/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Foundations.Interfaces;

/**
 *
 * @author EdwinB
 */
public class LongFlyConstants implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Flying long distances, exactly" + Constantes.maxHeight +"m!");   
    }
    
}
