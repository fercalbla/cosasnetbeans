/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mismoviles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        //Creamos el lector de teclado
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        //Creamos los objetos y les asignamos los parametros
        Movil mobile1 = new Movil("Samsung", "S5", "Android", 5.0, "Exynos", 4, 5.1);
        Movil mobile2 = new Movil("Nokia", "Luma 735", "Windows Phone", 8.1, "Snapdragon 400", 1, 4.7);
        
        //Parametros a lo bruto
        /*mobile1.setBrand("Samsung");
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
        mobile2.setScreen(4.7);*/
        
        //Cosas a hacer
        Boolean progFuncionando = true;
        do{
            System.out.println("¿Qué móvil quieres manejar? -> 1 o 2 \nSi quieres dejar de usar el programa escribe salir.");
            String option = entrada.readLine();
            option = option.toLowerCase();
                switch(option){
                    case "1":
                        System.out.println("¿Que quieres hacer? -> Encender, Apagar, Reiniciar, Actualizar, Info.");
                        String option2 = entrada.readLine();
                        option2 = option2.toLowerCase();
                        switch(option2){
                            case "encender":
                                mobile1.init("normal");
                                continue;
                            case "apagar":
                                mobile1.shutdown();
                                continue;
                            case "reiniciar":
                                System.out.println("¿De que manera quieres reiniciar?");
                                String optionReboot = entrada.readLine();
                                if(optionReboot.equals("kernel")){
                                    mobile1.reboot("kernel");
                                }else{
                                    mobile1.reboot("normal");  
                                }
                                continue;
                            case "actualizar":
                                System.out.println("¿A que version quieres actualizar? -> X.X");
                                double optionUpdate = Double.parseDouble(entrada.readLine());
                                mobile1.update(mobile1.getSys(), optionUpdate);
                                continue;
                            case "info":
                                mobile1.deviceInfo();
                                continue;
                            case "salir":
                                break;
                            default:
                                System.err.println("Accion invalida.");
                                continue;
                        }
                        break;
                    case "2":
                        System.out.println("¿Que quieres hacer? -> Encender, Apagar, Reiniciar, Actualizar, Info.");
                        String option3 = entrada.readLine();
                        option3 = option3.toLowerCase();
                        switch(option3){
                            case "encender":
                                mobile2.init("normal");
                                continue;
                            case "apagar":
                                mobile2.shutdown();
                                continue;
                            case "reiniciar":
                                System.out.println("¿De que manera quieres reiniciar?");
                                String optionReboot = entrada.readLine();
                                if(optionReboot.equals("kernel")){
                                    mobile2.reboot("kernel");
                                }else{
                                    mobile2.reboot("normal");  
                                }
                                continue;
                            case "actualizar":
                                System.out.println("¿A que version quieres actualizar? -> X.X");
                                double optionUpdate = Double.parseDouble(entrada.readLine());
                                mobile2.update(mobile1.getSys(), optionUpdate);
                                continue;
                            case "info":
                                mobile2.deviceInfo();
                                continue;
                            case "salir":
                                break;
                            default:
                                System.err.println("Accion invalida.");
                                continue;
                        }
                        break;
                    case "salir":
                        System.out.println("Adios.");
                        progFuncionando = false;
                        break;
                    default:
                        System.err.println("Accion invalida.");
            }
        }while(progFuncionando == true);
        
                
    }
    
}
