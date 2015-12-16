/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposgenericos;

import java.util.ArrayList;

/**
 *
 * @author fer
 */
public class TiposGenericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> n = new ArrayList <Integer>();
        
        MiWrapper<Integer> m = new MiWrapper<Integer>();
        MiWrapper<String> s = new MiWrapper<String>();
        
        m.setDato(7);
        System.out.println("Dato tipo Integer, sin necesidad de casteo: " + m.getDato());
        
        s.setDato("Hola");
        System.out.println("Ahora con string: " + s.getDato());
        
        n.add(54);
        n.add(123);
        System.out.println("En el caso del ArrayList: " + n.toString());
    }
    
}
