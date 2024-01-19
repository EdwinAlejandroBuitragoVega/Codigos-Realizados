/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bigO;

/**
 *
 * @author EdwinB
 */
public class PrintPairs {
    
    //O(n^2), donde n es la cantidad de elementos que tiene array
    public static void printPairs(Object[] array){
        for(Object x: array){
            for (Object y: array) {
                System.out.println("("+x+","+y+")");
            }
        }
    }
    
    public static void main(String[] args) {
        Integer[] nums = new Integer[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 5;
        printPairs(nums);
    }
    
}
