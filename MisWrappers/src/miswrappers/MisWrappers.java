/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miswrappers;

/**
 *
 * @author fer
 */
public class MisWrappers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aqui encapsulamos el String y en vez de parsealo hacia double creamos un objeto 'Double'
        String miString = "4.56";

        /*Si al String le asignaramos un valor que no fuera valido obtendriamos un error de EJECUCION.
        miString = "Hola pepe";*/
        //Se pone la 'D' en mayúsculas dado que estamos creando un objeto, no estamos definiendo el primitivo.
        Double miDouble = new Double(miString);
        System.out.println("Double como objeto: " + miDouble);

        //En este caso mostramos el double en modo primitivo, lo desenvolvemos. Esto se hace para poder operar por ejemplo.
        //El metodo doubleValue se usa para desenvolver el objeto.
        double esteDouble = miDouble.doubleValue();
        System.out.println("Double como primitivo: " + esteDouble);

        //Parseamos la variable miString como un double
        double otroDouble = Double.parseDouble(miString);
        System.out.println("Cadena miString como Double: " + otroDouble);
        
        //AUTOBOXING Y AUTOUNBOXING
        
        System.out.println("\n AUTOBOXING Y AUTOUNBOXING");
        
        Integer[] numASumar = {2, 14, 25, 11, 5};
        muestraNumeros(numASumar);
    }
    
    public static void muestraNumeros(Integer[] nums){
        int suma = 0;
        for (Integer n : nums ) {
            suma += n; //El unboxing al ser 'suma' una variable primitiva se hace automaticamente el unboxing.
            System.out.println("El numero vale: " + n);
        }
        System.out.println("La suma total vale: " + suma);
    }

}