/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Calculadora {

    static Scanner xc = new Scanner(System.in);

    public static void Congruencia(int a, int b, int n) {
        if ((b - a) % n == 0) {
            JOptionPane.showMessageDialog(null, "congruentes\n " + a + "≡" + b + " mod " + n);
        } else {
            JOptionPane.showMessageDialog(null, "no congruentes");
        }
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de a"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de b"));
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de n"));

        Congruencia(a, b, n);

    }

}
