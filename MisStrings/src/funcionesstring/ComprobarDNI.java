/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesstring;

/**
 *
 * @author fer
 */
public class ComprobarDNI {
    public static boolean checkDni(String dni){
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int operar = Integer.parseInt(dni.substring(0, (dni.length() - 1)));
        int operacion = letras.charAt(operar%23);
        boolean isValid = false;
        if(dni.charAt(8) == operacion){
            isValid = true;
        }
        return isValid;
    }
}
