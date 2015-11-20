/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estefor;

/**
 *
 * @author fer
 */
public class EsteFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long n0 = 1; 
        for (int i = n; i >= 1; i--) {
            n0 *= i;
        }
        System.out.println("La factorial de " + n + " es: " + n0);
    }
    
}
