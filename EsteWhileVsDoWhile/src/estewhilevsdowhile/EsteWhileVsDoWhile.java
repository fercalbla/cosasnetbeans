/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estewhilevsdowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author fer
 */
public class EsteWhileVsDoWhile {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("¿Que usamos? while o dowhile");
        String valor = entrada.readLine();
        if(valor.equals("while")){
            System.out.println("Has seleccionado while.");
            
            String iteraWhile = entrada.readLine();
            int contador = 0;
            while(iteraWhile.equals("s")){
                contador ++;
                System.out.println("Iteracion completada. Veces iteradas: " + contador);
                System.out.println("¿Iteramos? (s | n)");
                System.out.println("¿Quieres seguir iterando? (s | n)");
                iteraWhile = entrada.readLine();
            }
        }else if (valor.equals("dowhile")) {
            System.out.println("Has seleccionado dowhile.");
            String iteraDoWhile;
            int contador = 0;
            do{
                contador ++;
                System.out.println("Iteracion completada. Veces iteradas: " + contador);
                
                System.out.println("¿Quieres seguir iterando? (s | n)");
                iteraDoWhile = entrada.readLine();
            }while(iteraDoWhile.equals("s"));
        }
    }
    
}
