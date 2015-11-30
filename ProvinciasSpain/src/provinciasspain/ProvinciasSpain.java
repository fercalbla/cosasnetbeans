/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provinciasspain;

/**
 *
 * @author fer
 */
public class ProvinciasSpain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] states = {"izq", "der", "arr"};
        
        findPos(states, "Sevilla");
        
    }

    static int findPos(String[] states, String city) {
        int statePos = 0;
        boolean found = false;
        for (int i = 0; i < states.length; i++) {
            states[i] = states[i].toLowerCase();
            if (states[i].equals(city)) {
                statePos = i;
                found = true;
            } else if(i == states.length && found == true){
                System.err.println("Provincia no encontrada");
            }
        }
        return statePos;

    }
}