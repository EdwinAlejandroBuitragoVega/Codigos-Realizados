/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bigO;

/**
 *
 * @author EdwinB
 */
public class ContiansExample {


    //O(n) => donde n, es el número de elementos de array. 
    public static boolean contains(Object[] array, Object x) {
        for(Object element: array){
            if(element.equals(x)){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        String[] palabras = new String[4];
        palabras[0] = "Buenas";
        palabras[1] = "Noches";
        palabras[2] = "Gr";
        palabras[3] = "51";
        System.out.println(contains(palabras, "Chau"));
        
        /**/
        Integer[] numeros = new Integer[5];
        for (int i = 0; i < 5; i++) {
            numeros[i] = i;
        }
        System.out.println(contains(numeros, 0));
    }
    
}
