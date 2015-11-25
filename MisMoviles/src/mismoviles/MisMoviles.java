/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mismoviles;

/**
 *
 * @author fer
 */
public class MisMoviles {

    //INS1 = Samsung, S5, Android, 5.0, Exynos, 4GB, 5.1"
    //INS1 func = reiniciar, 
    //INS2 = Nokia, 735, Windows Phone, 8.1, Snapdragon 400, 1GB, 4.7"
    //INS2 UDP = 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Movil mobile1 = new Movil();
        Movil mobile2 = new Movil();
        
        mobile1.setBrand("Samsung");
        mobile1.setModel("S5");
        mobile1.setSys("Android");
        mobile1.setVersion(5.0);
        mobile1.setCpu("Exynos");
        mobile1.setRam(4);
        mobile1.setScreen(5.1);
        
        mobile2.setBrand("Nokia");
        mobile2.setModel("Lumia 735");
        mobile2.setSys("Windows Phone");
        mobile2.setVersion(8.1);
        mobile2.setCpu("Snapdragon 400");
        mobile2.setRam(1);
        mobile2.setScreen(4.7);
        
        //Cosas a hacer
        mobile1.init("normal");
        mobile1.reboot("normal");
        
        mobile1.deviceInfo();
                
    }
    
}
