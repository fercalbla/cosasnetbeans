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
public class Triangulo extends Figura{
    private int altura;
    private int base;
    
    public Triangulo(String color, int altura, int base){
        super(color);
        setAltura(altura);
        setBase(base);
    }

    @Override
    public double area(){
        return ((base * altura)/2);
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

}
