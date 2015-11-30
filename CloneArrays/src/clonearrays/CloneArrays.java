/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clonearrays;

/**
 *
 * @author fer
 */
public class CloneArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] damnSon = {1, 2, 3, 4};
        
        for (int elemento : damnSon) {
            System.out.println(elemento + "\t");

        }
        
        System.out.println("\n Clonado:");
        int[] damnSonCopy = damnSon.clone();

        for (int elemento : damnSonCopy) {
            System.out.println(elemento + "\t");

        }

    }

}
