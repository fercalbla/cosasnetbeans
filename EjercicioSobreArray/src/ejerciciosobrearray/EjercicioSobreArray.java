/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosobrearray;

import java.util.Arrays;

/**
 *
 * @author fer
 */
public class EjercicioSobreArray {
//Crear un programa al que le pasemos 5 valores numéricos enteros como argumentos en la ejecución del programa, y que nos devuelva:
//
//    El mayor
//    El menor
//    La suma de todos
//    La media

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] valores = {3, 11, 1, 23, 231};

        System.out.println("El mayor es: " + mayor(valores));
        System.out.println("El menor es: " + menor(valores));
        System.out.println("La suma es: " + suma(valores));
        System.out.println("La media es: " + media(valores));
    }

    static int mayor(int[] valores) {
        /*Arrays.sort(valores);
        int value = valores[(valores.length - 1)];*/
        int j = valores[0];
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > j) {
                j = valores[i]; 
            }
        }return j;
    }

    static int menor(int[] valores) {
        /*Arrays.sort(valores);
        int value = valores[0];*/
        //int value = 0;
        int j = valores[0];
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < j) {
                j = valores[i]; 
            }
        }return j;
        //value = valores[0];
    }

    static int suma(int[] valores) {
        int value = 0;
        for (int i = 0; i < valores.length; i++) {
            value += valores[i];
        }
        return value;
    }

    static double media(int[] valores) {
        return (suma(valores) / valores.length);
    }

}
