/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mivehiculo;

/**
 *
 * @author fer
 */
public class MiVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo veh1 = new Vehiculo();
        String marcaCoche = "Jaguar";
        veh1.color = "amarillo";
        System.out.println("Hola tengo un " + marcaCoche);
        System.out.println("Color del coche: " + veh1.color);
        System.out.println("Ruedas del coche: " + veh1.ruedas);
        System.out.println("\nArranquemos el coche:");
        veh1.arrancar();
        System.out.println("Obtengamos el estado actual.");
        veh1.status();
        System.out.println("\nAceleremos 50km/h.");
        veh1.acelerar(50);
        System.out.println("Obtengamos el estado actual.");
        veh1.status();
        System.out.println("\nAhora reduzcamos la velocidad 30km/h");
        veh1.decelerar(30);
        System.out.println("Obtengamos el estado actual.");
        veh1.status();
        System.out.println("\nParemos el coche.");
        veh1.parar();
        System.out.println("Obtengamos el estado actual.");
        veh1.status();
    }

}