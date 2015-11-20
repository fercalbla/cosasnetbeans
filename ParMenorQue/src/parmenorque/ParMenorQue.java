/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parmenorque;

/**
 *
 * @author fer
 */
public class ParMenorQue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroMax = Integer.parseInt(args[0]);
        int numeroGenerado = 1;
        
        while((numeroGenerado%2 != 0) || (numeroGenerado > numeroMax)){
            numeroGenerado = (int) (100000 * Math.random());
            System.out.println("DEBUG WHILE NUMBER: " + numeroGenerado);
            
        }
        
        System.out.println("\n El par numero generado es " + numeroGenerado);
    }
    
}
