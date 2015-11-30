/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraycopia;

/**
 *
 * @author fer
 */
public class ArrayCopia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] myArray = {678, 0, 39, 125, 100, 478, 6, 540, 78, 20};
        for (int elemento : myArray) {
            System.out.println(elemento + "\t");
        }

        System.out.println("\n");

        int[] algunArray = new int[7];
        System.arraycopy(myArray, 5, algunArray, 3, 4);

        for (int elemento : algunArray) {
            System.out.println(elemento + "\t");
        }
        System.out.println("\n");
    }

}
