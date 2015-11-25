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
public class Movil {
    private String brand = "Default";
    private String model = "Default";
    private String sys = "Android";
    private double version = 1.0;
    private String cpu = "Default";
    private int ram = 1;
    private double screen = 4.0;
    private String status = "off";
    
    //Getters & Setters
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public String getModel(){
        return model;
    }
    
    public void setSys(String sys){
        this.sys = sys;
    }
    
    public String getSys(){
        return sys;
    }
    
    public void setVersion(double version){
        this.version = version;
    }
    
    public double getVersion(){
        return version;
    }
    
    public void setCpu(String cpu){
        this.cpu = cpu;
    }
    
    public String getCpu(){
        return cpu;
    }
    
    public void setRam(int ram){
        this.ram = ram;
    }
    
    public int getRam(){
        return ram;
    }
    
    public void setScreen(double screen){
        this.screen = screen;
    }
    
    public double getScreen(){
        return screen;
    }

    //Funciones para el movil
    public void init(String mode){
        if(status.equals("off")){
            status = "on";
            switch(mode){
                case "reboot":
                System.out.println("Sistema reiniciado con exito.");
                System.out.println("Bienvenido.");
                
                break;
                default:
                System.out.println("Bienvenido.");
            }
        }else{
            System.out.println("El sistema ya está en funcionamiento.");
        }
    }
    
    public void shutdown(){
        if(status.equals("on")){
            status = "off";
            System.out.println("Cerrando sesion...");
            System.out.println("Apagando...");
            System.out.println("");
        }
    }
    
    public void reboot(String mode){
        mode = mode.toLowerCase();
        if(status.equals("on")){
            switch(mode){
                case "kernel":
                    System.out.println("Reiniciando al kernel...");
                    System.out.println("Kernel mode");
                    System.out.println("Info: " + brand + " " + model + " | " + sys + " " + version);
                    status = "kernel";
                    break;
                default:
                    System.out.println("Reiniciando...");
                    shutdown();
                    init("reboot");
            }
            
        }else{
            System.out.println("No puedes reiniciar un aparato apagado.");
        }
    }
    
    /*public void restore(){
        if(isOn == true){
            
        }
    }*/
    
    public void update(String sys, double version){
        if(status.equals("on")){
            if (checkSys(sys, version)) {
                System.out.println("Actualizando sistema...");
                reboot("kernel");
                System.out.println("cp -rf /tmp/updates/" + version + "/system");
                setVersion(version);
                reboot("reboot");
            }else{
                System.out.println("El sistema ya está actualizado a la ultima versión.");
            }
            
        }else{
            System.out.println("No se puede actualizar un sistema apagado.");
        }
    }
    
    private boolean checkSys(String sys, double version){
        boolean pass = false;
        
        if (getVersion() < version && getSys().equals(sys)) {
            pass = true;
        }
        return pass;
    }
    
    public void deviceInfo(){
        if(status.equals("on")){
            System.out.println("Información del dispositivo:");
            System.out.println("Marca: " + brand);
            System.out.println("Modelo: " + model);
            System.out.println("CPU: " + cpu);
            System.out.println("RAM: " + ram);
            System.out.println("Tamaño de pantalla: " + screen + " pulgadas");
        
            System.out.println("\nInformación del sistema:");
            System.out.println("S.O.: " + sys);
            System.out.println("Version: " + version);
        }else{
            System.out.println("El sistema está apagado.");
        }
        
    }
}
