/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymetodos;

import java.util.Arrays;

/**
 *
 * @author fer
 */
public class ArrayMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] miArray = {"uno", "dos", "tres", "cuatro", "cinco"};
        
        System.out.println(miArray);
        System.out.println(Arrays.toString(miArray));
        //binarySearch devuelve los resultados del elemento buscado dentro del array
        System.out.println(Arrays.binarySearch(miArray, "tres"));
        System.out.println(Arrays.binarySearch(miArray, "siete"));
        System.out.println(Arrays.toString(miArray));
        
        //----------------------------------------------------------------
        String[] otroArray = Arrays.copyOf(miArray, miArray.length);
        
        System.out.println(Arrays.toString(otroArray));
        
        //----------------------------------------------------------------
        String[] parteArray = Arrays.copyOfRange(otroArray, 3, 7);
        
        System.out.println(Arrays.toString(parteArray));
        
        //Verificamos si es del mismo rango y si tiene el mismo contenidop
        System.out.println(Arrays.equals(miArray, otroArray));
        
        //
        Arrays.fill(parteArray, 2, 4, "nueve");
        System.out.println(Arrays.toString(parteArray));
    }
    
}
