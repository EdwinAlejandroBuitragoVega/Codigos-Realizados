/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package optimal.dna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Optimal_DNA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deque DNAcode = new LinkedList();
        ArrayList<Deque> listaLexico = new ArrayList<>();
        Scanner tx = new Scanner(System.in);
        int n = Integer.parseInt(tx.nextLine());
       
        String[] cadenaDNA = new String[n] ;
        String[] auxCambio;
        for (int i = 0; i < n; i++) {
         
            cadenaDNA[i] = tx.nextLine();
          /*for (int j = 1; j < cadenaDNA[i].length(); j++) {
                auxCambio = cadenaDNA[i].split("");
                System.out.println(Arrays.toString(auxCambio));
                DNAcode.addFirst(auxCambio[(cadenaDNA[i].length() / 2) + 1]);
                DNAcode.addLast(auxCambio[cadenaDNA[i].length() / 2]);

                if (j < cadenaDNA[i].length() / 2) {
                    DNAcode.add(auxCambio[(cadenaDNA[i].length() / 2) + (1 + j)]);
                }
                if (j >= cadenaDNA[i].length() / 2) {
                    DNAcode.add(auxCambio[(j + 1) - cadenaDNA[i].length() / 2]);
                }
            }
            listaLexico.set(i, DNAcode);*/
        }
         
        System.out.println(listaLexico.toString());
    }

}
