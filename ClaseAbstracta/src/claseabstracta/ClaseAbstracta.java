/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseabstracta;

/**
 *
 * @author fer
 */
public class ClaseAbstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo tring = new Triangulo("verde", 10, 20);
        System.out.println(tring.area());
        
        Circulo circ = new Circulo("amarillo", 20);
        System.out.println(circ.area());
    }
    
}
