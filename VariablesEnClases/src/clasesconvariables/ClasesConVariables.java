/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesconvariables;

/**
 *
 * @author fer
 */
public class ClasesConVariables {
    public static void main(String[] args){
        ClaseConVariables unDato1 = new ClaseConVariables();
        unDato1.variableDeObjeto = "variableDeObjeto cambia de valor aqui para este objeto.";
        System.out.println("variableDeObjeto: " + unDato1.variableDeObjeto);
        System.out.println("valor inicial de variableDeClase: " + ClaseConVariables.variableDeClase);
        
    }
}
