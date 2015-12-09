/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misarrayslist;
//Hay que importar la libreria para poder usar las ArrayList
import java.util.ArrayList;

/**
 *
 * @author fer
 */
public class MisArraysList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList miArray = new ArrayList();
        
        miArray.add(7);
        miArray.add("hola");
        miArray.add(3.7);
        
        System.out.println(miArray);
        int miVar = (Integer) miArray.get(0);
        miVar -= 3;
        System.out.println(miVar);
        
        System.out.println(miArray.get(2));
        
        miArray.add(2, "aqui estaba 3.7");
        System.out.println(miArray.get(2));
        
        System.out.println(miArray);
        miArray.remove(2);
        System.out.println(miArray.get(2));
        System.out.println(miArray);
        
        System.out.println(miArray.indexOf(7));
        System.out.println(miArray.size());
        miArray.set(1, "adios");
        System.out.println(miArray);
    }
    
}
