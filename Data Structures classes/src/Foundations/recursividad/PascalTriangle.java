/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Foundations.recursividad;
import java.util.Scanner;
/**
 *
 * @author EdwinB
 */
public class PascalTriangle {
    static Scanner tx =new Scanner(System.in);
    private static long C(int n, int k) {
        if (k > n) {
            return 1;
        }
        if (k == 0 || n == k) {
            return 1;
        }
        return C(n - 1, k - 1) + C(n - 1, k);
    }

    public static void main(String[] args) {
        long plusAux = 0;
        int fila=tx.nextInt();
        
        for (int i = 0; i < fila ; i++) {
            for (int j = 0; j <= fila   ; j++) {
                plusAux += C(i, j);
            }
        }System.out.println(plusAux);
    }
}
