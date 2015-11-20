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
public class MiVivienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vivienda casa = new Vivienda();
        //set -> 3 inq, puertas true, ventanas true, alarma false, 70m, B, 1º, bloque 7, 5 habis, calf G
        //cambiar -> puertas a abierta, intentar temp a 30 grados, extraer valor temp, calf A, 2 habitantes mas
            casa.inquilinos = 3;
            casa.puertas = true;
            casa.ventanas = true;
            casa.alarma = false;
            casa.asignar("metros", "70");
            casa.asignar("piso", "8");
            casa.asignar("bloque", "7");
            
        Vivienda casa2 = new Vivienda();
        //5, puertas true, ventanas true, alarma false, 90m, B, 1º, bloque 7, 4 habis, calf B
        //cambiar -> 2 habitantes menos que la uno, cambia la calificacion al mismo valor de la 1 y la temperatura de la vivienda 3
        
        Vivienda casa3 = new Vivienda();
        //1 inq, puertas false, ventanas false, alarma true, 70m, A, 1º, Bloque 7, 5 habis, calf G, desocupada
        //cambiar -> vivienda true, ventanas true, alarma false, habitantes 0, estado = derribo, temp = 18
        
        
    }
    
}
