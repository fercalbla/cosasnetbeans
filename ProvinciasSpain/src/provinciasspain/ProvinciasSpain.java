/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provinciasspain;

import java.util.Arrays;

/**
 *
 * @author fer
 */
public class ProvinciasSpain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] states = {"Badajoz", "Caceres", "Ciudad Real", "Zaragoza", "Cuenca", "Huesca", "Leon", "Toledo", "Albacete", "Teruel", "Sevilla", "Burgos", "Cordoba", "Jaen", "Granada", "Salamanca", "Guadalajara", "Lerida", "Murcia", "Valencia", "Asturias", "Zamora", "Navarra", "Soria", "Huelva", "Lugo", "Almeria", "Valladolid", "Palencia", "Avila", "Madrid", "La Coruña", "Barcelona", "Cadiz", "Malaga", "Orense", "Segovia", "Castellon", "Tarragona", "Gerona", "Alicante", "Cantabria", "La Rioja", "Islas Baleares", "Pontevedra", "Las Palmas", "Santa Cruz de Tenerife", "Alava", "Vizcaya", "Guipuzcua", "Ceuta", "Melilla"};
        
       // findPos(states, "Sevilla");
        //System.out.println(findPos(states, "Sevilla"));
        //System.out.println(findPos(states, "Malaga"));
        
        for (int i = 0; i < states.length; i++) {
            if (i > findPos(states, "Sevilla") && i < findPos(states, "Cadiz")) {
                System.out.println(states[i]);
            }
        }
    }

    static int findPos(String[] states, String city) {
        boolean found = false;
        int site = 0;
        for (int i = 0; i < states.length; i++) {
            states[i] = states[i].toLowerCase();
            city = city.toLowerCase();
            if (states[i].equals(city)) {
                site = i;
                found = true;
            } else if((i + 1) == states.length && found == false){
                System.err.println("Provincia no encontrada");
            }
        }
        return site;
    }
}