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
public class Vehiculo{
    int ruedas = 4;
    String color = "blue";
    private int velocidad = 0;
    private int maxVel = 220;
    private int minVel = 0;
    boolean arrancado = false;

    public void arrancar(){
        arrancado = true;
        System.out.println("Vehiculo arrancado.");
    }
    public void parar(){
        arrancado = false;
        velocidad = 0;
        System.out.println("Vehiculo parado.");
    }
    public int acelerar(int miVelocidad){
        velocidad = velocidad + miVelocidad;
        if(velocidad > maxVel){
            velocidad = maxVel;
        }
        return velocidad;
    }
    public int decelerar(int miVelocidad){
        velocidad = velocidad - miVelocidad;
        if (velocidad < minVel) {
            velocidad = 0;
        }
        return velocidad;
    }
    public void status(){
        if(arrancado == true){
            System.out.println("El vehículo está actualmente arrancado.");
        }else{
            System.out.println("El vehículo está actualmente parado.");
        }
        System.out.println("El vehículo lleva una velocidad de: " + velocidad + "km/h");
    }
}
