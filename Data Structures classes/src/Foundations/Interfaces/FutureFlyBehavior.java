/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Foundations.Interfaces;

/**
 *
 * @author EdwinB
 */
public class FutureFlyBehavior implements FlyBehavior, DefaultTeleport {

    @Override
    public void fly() {
        System.out.println("I can fly... and also...");
    }
    
}
