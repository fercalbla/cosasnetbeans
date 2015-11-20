/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mivivienda;

/**
 *
 * @author fer
 */
public class Vivienda {
    private int metros = 50;
    private char letra = 'A';
    private int piso = 1;
    private int bloque = 1;
    String calificacion = "G";
    boolean alarma = false;
    private int habitaciones = 3;
    boolean ventanas = true;
    boolean puertas = true;
    int inquilinos = 0;
    int temperatura = 21;
    String situacion = "Desocupada";
    
    
    
    public void asignar(String valor,String nuevoValor){
        valor = valor.toLowerCase();
        if(valor == "metros"){
            metros = Integer.parseInt(nuevoValor);
        }else if(valor == "letras"){
            letra = nuevoValor.charAt(0);
        }else if (valor == "piso") {
            piso = Integer.parseInt(nuevoValor);
        }else if (valor == "bloque") {
            bloque = Integer.parseInt(nuevoValor);
        }else if (valor == "habitaciones") {
            habitaciones = Integer.parseInt(nuevoValor);
        }else{
            System.out.println("El valor dado es erroneo.");
        }    
    }
}
