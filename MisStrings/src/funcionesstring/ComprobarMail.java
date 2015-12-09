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
public class ComprobarMail {
    public static boolean checkMail(String mail){
        boolean isValid = false;
        if(mail.endsWith("@gmail.com") || mail.endsWith("@yahoo.com") || mail.endsWith("@hotmail.com") || mail.endsWith("@hotmail.es")){
            isValid = true;
        }
        return isValid;
    }
}
