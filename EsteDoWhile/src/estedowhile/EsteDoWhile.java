/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estedowhile;

/**
 *
 * @author fer
 */
public class EsteDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 845464;
        int numeroOrig = numero;
        int digitos = 0;
            do{
                numero /= 10;
                
                digitos++;
            }while(numero > 0);
            System.out.println("El número " + numeroOrig + " tiene " + digitos + " digitos.");
    }
    
}
