/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.ArrayList;

/**
 *
 * @author fer
 */
public class LanzadorDeExcepciones {
    public void LanzadorDeExcepciones(){
        
    }
    
    public void outOfBounds(){
        int[] numericos = {1, 2, 3, 4, 5, 6, 7};
        try{
            for (int i = 0; i <= numericos.length; i++) {
                System.out.println(numericos[i]);
            }
        }
        
        catch(ArrayIndexOutOfBoundsException excepcion){
            System.out.println("ERROR GENERADO: " + excepcion);
            
            /*for (int i = 0; i <= numericos.length - 1; i++) {
                System.out.println(numericos[i]);
            }*/
        }
        
        finally{
            System.out.println("Terminado.");
        }
    }
    
    public void classCast(){
        try{
            ArrayList lst = new ArrayList();
            lst.add("25");
            Integer num = (Integer) lst.get(0); 
        }
        catch(ClassCastException excepcion){
            System.out.println("ERROR GENERADO: " + excepcion);
            /*ArrayList lst = new ArrayList();
            lst.add("25");
            String num2 = (String) lst.get(0);
            Integer num = (Integer) Integer.parseInt(num2); 
            System.out.println(num);*/
        }
        
        finally{
            System.out.println("Terminado.");
        }
    }
    
    /*public void illegalArgument(){
        try{
            String var = "Numero";
            Ejemplo miEjemplo = new Ejemplo("Hola", var);
        }
        
        catch(IllegalArgumentException excepcion){
            Ejemplo mi2Ejemplo = new Ejemplo("Hola", 1);
        }
    }*/
    
    static String cadena;
    String[] miarray;
    public void nullPointer(){
        try{
            for (int i=0; i < miarray.length; i++){
                cadena += miarray[i];
            }
            System.out.println("Long. total: " + cadena.length());
        }
        
        catch(NullPointerException excepcion){
            System.out.println("ERROR GENERADO: " + excepcion);
        }
    }
    
    public void numberFormat(){
        try{
            String cadena="53g";
            
            int k = Integer.parseInt(cadena);
        }
        
        catch(NumberFormatException excepcion){
            System.out.println("ERROR GENERADO: " + excepcion);
            
           /* String cadena="53";
            
            int k = Integer.parseInt(cadena);
            
            System.out.println(k);*/
        }
    }
}
