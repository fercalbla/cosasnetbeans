/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estewhile;

/**
 *
 * @author fer
 */
public class EsteWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int result = num1;
        int contador = 1;

        while (result % num2 != 0) {
            contador += 1;
            System.out.println("Result: " + result + "\t | El resto de la division es: " + result % num2);
            result += num1;
        }

        int operacion = result % num2;
        System.out.println("Result: " + result + "\t | El resto de la division es: " + operacion + "\nContador: " + contador);
    }

}
