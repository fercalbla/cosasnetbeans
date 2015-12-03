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
public class ClaseConVariables {
    
    //esta variables contendrá un unico valor para todos los objetos crados con la clase
    String variableDeObjeto = "Esta variables de puede modificar";
    
    //con este nuevo modificador, static, creamos una variable que no se puede modificar desde el objeto.
    static String variableDeClase = "Esta variable posee el mismo valor para todos los objetos de la clase";
}
