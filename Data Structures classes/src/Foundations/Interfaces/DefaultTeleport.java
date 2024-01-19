/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Foundations.Interfaces;

/**
 *
 * @author EdwinB
 */
public interface DefaultTeleport {
    default void teleport(String place){
        System.out.println("I can teleport to " + place);    
    }
}
