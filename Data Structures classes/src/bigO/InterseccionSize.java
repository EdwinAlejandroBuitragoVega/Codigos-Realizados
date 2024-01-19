/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bigO;

/**
 *
 * @author EdwinB
 */
public class InterseccionSize {
    
    //O(n*m) donde n es es numero de elementos de A,
    // y m es el numero de elementos de B
    static int intersectionSize(Object[] A, Object[] B) {
        int count = 0;
        for (Object a : A) {
            for (Object b : B) {
                if(a.equals(b)){
                    count++;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Integer[] A = {1, 2, 3, 4, 5, 7};
        Integer[] B = { 12, 3, 15};
        System.out.println(intersectionSize(A, B));
    }

}
