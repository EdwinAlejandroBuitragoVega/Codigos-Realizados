/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Foundations.recursividad;

/**
 *
 * @author EdwinB
 */
public class Interes {
   private static double interes(double m, double i, int n) {
        if (n == 0) {
            return m;
        }
        return (i + 1) * interes(m, i, n - 1);
    }

    public static void main(String[] args) {
        System.out.println("valor a pagar" + interes(1000000, 0.05, 12));
    }    
}
