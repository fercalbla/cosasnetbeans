/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misvariables2;

/**
 *
 * @author fer
 */
public class MisVariables2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sumador(11, 23, 45));
        System.out.println(sumador(3, 4));
        System.out.println(sumador(1, 3, 54, 23, 55, 23, 1, 34, 2));
    }
    
    public static int sumador(int... varios){
        int s = 0;
        for(int miVar: varios) {
            s += miVar;
        }
        return s;
    }
    
}
