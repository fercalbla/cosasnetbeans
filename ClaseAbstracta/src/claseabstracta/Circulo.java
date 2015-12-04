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
public class Circulo extends Figura {
    private int radio;
    
    public Circulo(String color, int radio){
        super(color);
        setRadio(radio);
    }

    /**
     * @return the radio
     */
    public int getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(radio, 2);
    }
}
