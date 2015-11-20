/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damecambio;

/**
 *
 * @author fer
 */
public class DameCambio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables necesarias para el funcionamiento del programa
        int dinero = Integer.parseInt(args[0]);
        int[] cambio = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] cantidadUsado = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        //Dinero inicial
        System.out.println("Dinero a cambiar: " + dinero);
        
        //Logica para obtener el cambio
        while(dinero != 0){
            if(dinero >= 500){
                dinero = dinero - cambio[0];
                cantidadUsado[0]++;
            }else if(dinero >= 200){
                dinero = dinero - cambio[1];
                cantidadUsado[1]++;
            }else if(dinero >= 100){
                dinero = dinero - cambio[2];
                cantidadUsado[2]++;
            }else if(dinero >= 50){
                dinero = dinero - cambio[3];
                cantidadUsado[3]++;
            }else if(dinero >= 20){
                dinero = dinero - cambio[4];
                cantidadUsado[4]++;
            }else if(dinero >= 10){
                dinero = dinero - cambio[5];
                cantidadUsado[5]++;
            }else if(dinero >= 5){
                dinero = dinero - cambio[6];
                cantidadUsado[6]++;
            }
            else if(dinero >= 2){
                dinero = dinero - cambio[7];
                cantidadUsado[7]++;
            }
            else if(dinero >= 1){
                dinero = dinero - cambio[8];
                cantidadUsado[8]++;
            }
        }
        
        //Resultados de la logica
        System.out.println("Cantidad de billetes de 500: " + cantidadUsado[0]);
        System.out.println("Cantidad de billetes de 200: " + cantidadUsado[1]);
        System.out.println("Cantidad de billetes de 100: " + cantidadUsado[2]);
        System.out.println("Cantidad de billetes de 50: " + cantidadUsado[3]);
        System.out.println("Cantidad de billetes de 20: " + cantidadUsado[4]);
        System.out.println("Cantidad de billetes de 10: " + cantidadUsado[5]);
        System.out.println("Cantidad de billetes de 5: " + cantidadUsado[6]);
        System.out.println("Cantidad de monedas de 2: " + cantidadUsado[7]);
        System.out.println("Cantidad de monedas de 1: " + cantidadUsado[8]);
        
    }
    
}
