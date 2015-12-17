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
        //String option = entrada.readLine();
        boolean ready = false;
        do {
            System.out.println("Elige un numero para lanzar una excepcion: \n1. ArrayIndexOutOfBoundsException\n2. ClassCastException\n3. IllegalArgumentException\n4. NullPointerException\n5. NumberFormatException\nsalir. Para salir del programa.");
            String option = entrada.readLine();
            switch (option) {
                case "1":
                    excep.outOfBounds();
                    continue;
                case "2":
                    excep.classCast();
                    continue;
                case "3":
                    //excep.illegalArgument();
                    System.out.println("Esta opcion no está disponible.");
                    continue;
                case "4":
                    excep.nullPointer();
                    continue;
                case "5":
                    excep.numberFormat();
                    continue;
                case "salir":
                    System.out.println("Adios.");
                    ready = true;
                    continue;
                default:
                    System.out.println("Opcion incorrecta, vuelve a intentarlo.");
                    continue;
            }
        } while (ready == false);

    }

}