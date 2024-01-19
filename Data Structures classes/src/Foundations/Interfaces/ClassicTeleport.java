/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Foundations.Interfaces;

/**
 *
 * @author EdwinB
 */
public class ClassicTeleport implements DefaultTeleport {
    public static void main(String[] args) {
        ClassicTeleport c = new ClassicTeleport();
        c.teleport("jupyter");
    }
}
