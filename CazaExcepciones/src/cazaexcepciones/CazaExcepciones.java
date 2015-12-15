/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cazaexcepciones;

import excepciones.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author fer
 */
public class CazaExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        LanzadorDeExcepciones excep = new LanzadorDeExcepciones();
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Elige un numero para lanzar una excepcion: 1. ArrayIndexOutOfBoundsException, 2. ClassCastException, 3. IllegalArgumentException, 4. NullPointerException, 5. NumberFormatException");
        String option = entrada.readLine();
        switch(option){
            case "1":
                excep.outOfBounds();
                break;
            case "2":
                excep.classCast();
                break;
            case "3":
                excep.illegalArgument();
                break;
            case "4":
                excep.nullPointer();
                break;
            case "5":
                
                break;
            default:
                System.out.println("Opcion incorrecta, vuelve a intentarlo.");
        }
    }
    
}
