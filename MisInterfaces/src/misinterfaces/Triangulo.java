/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misinterfaces;

/**
 *
 * @author fer
 */
public class Triangulo implements Operaciones{

    @Override
    public void rotar() {
        System.out.println("Implementacion del metodo rotar()");
    }

    @Override
    public int serializar() {
        int miInt = Operaciones.miNumero;
        return miInt;
    }
    
}
