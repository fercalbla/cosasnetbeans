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
        Vivienda casa2 = new Vivienda();
        Vivienda casa3 = new Vivienda();
        //set -> 3 inq, puertas true, ventanas true, alarma false, 70m, B, 1º, bloque 7, 5 habis, calf G
        //cambiar -> puertas a abierta, intentar temp a 30 grados, extraer valor temp, calf A, 2 habitantes mas
            System.out.println("Vivienda 1");
            //ASIGNAR VALORES POR DEFECTO
            casa.misInquilinos(3);
            casa.misPuertas(true);
            casa.misVentanas(true);
            casa.miAlarma(false);
            casa.misMetros(90);
            casa.miLetra('C');
            casa.miPiso(1);
            casa.miBloque(7);
            casa.misHabitaciones(5);
            casa.miCalificacion('G');
            casa.showInfo(false);
            
            System.out.println("\n");
            //CAMBIANDO VALORES
            casa.misPuertas(false);
            casa.miTemperatura(30);
            casa.miCalificacion('A');
            casa.misInquilinos(5);
            casa.showInfo(true);
            
            System.out.println("\n\n");
            
        
        //5, puertas true, ventanas true, alarma false, 90m, B, 1º, bloque 7, 4 habis, calf B
        //cambiar -> 2 habitantes menos que la uno, cambia la calificacion al mismo valor de la 1 y la temperatura de la vivienda 3
            System.out.println("\nVivienda 2");
            //ASIGNAR VALORES POR DEFECTO
            casa2.misInquilinos(5);
            casa2.misPuertas(true);
            casa2.misVentanas(true);
            casa2.miAlarma(false);
            casa2.misMetros(90);
            casa2.miLetra('B');
            casa2.miPiso(1);
            casa2.miBloque(7);
            casa2.misHabitaciones(4);
            casa2.miCalificacion('B');
            casa2.showInfo(false);
            
            System.out.println("\n");
            //CAMBIANDO VALORES
            casa2.miTemperatura(casa3.temperatura);
            casa2.miCalificacion(casa.calificacion);
            casa2.misInquilinos(casa.inquilinos - 2);
            casa2.showInfo(true);
        
        
        //1 inq, puertas false, ventanas false, alarma true, 70m, A, 1º, Bloque 7, 5 habis, calf G, desocupada
        //cambiar -> vivienda true, ventanas true, alarma false, habitantes 0, estado = derribo, temp = 18
            System.out.println("\nVivienda 3");
            //VARIABLES POR DEFECTO
            casa3.misInquilinos(1);
            casa3.misPuertas(false);
            casa3.misVentanas(false);
            casa3.miAlarma(true);
            casa3.misMetros(70);
            casa3.miLetra('A');
            casa3.miPiso(1);
            casa3.miBloque(7);
            casa3.misHabitaciones(5);
            casa3.miCalificacion('G');
            casa3.miSituacion("Desocupada");
            casa3.showInfo(false);
            
            System.out.println("\n");
            //VARIABLES CAMBIADAS
            casa3.misPuertas(true);
            casa3.misVentanas(true);
            casa3.miAlarma(false);
            casa3.misInquilinos(0);
            casa3.miSituacion("Demolicion");
            casa3.miTemperatura(18);
            casa3.showInfo(true);
        
    }
    
}
