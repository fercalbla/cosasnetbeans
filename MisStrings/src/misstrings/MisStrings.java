/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
* 1. Crear una clase a la cual le vamos a pasar un DNI y nos debe retornar si la letra corresponde a ese DNI.
* 2. Crear una clase que compruebe un formato de correo electronico.
* 3. Crear una clase que independientemente de la forma de entrada de datos lo convierta todo en mayusculas.
* 4. 
*/
package misstrings;

import funcionesstring.*;

/**
 *
 * @author fer
 */
public class MisStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ternaria = ComprobarDNI.checkDni("77820575Y") ? "Es correcto":"Es incorrecto";
        System.out.println(ternaria);
        
        String ternaria2 = ComprobarMail.checkMail("fercalbla@gmail.com") ? "Es correcto":"Es incorrecto";
        System.out.println(ternaria2);
        
        
    }
    
}
