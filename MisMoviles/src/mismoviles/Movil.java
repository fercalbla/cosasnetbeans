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
    //Variables para el movil
    private String brand = "Default";
    private String model = "Default";
    private String sys = "Android";
    private double version = 1.0;
    private String cpu = "Default";
    private int ram = 1;
    private double screen = 4.0;
    private String status = "off";
    
    //Constructor vacio
    public Movil(){
        System.out.println("Variables por defecto asignadas.");
    }
    
    //Constructor con todas las variables
    public Movil(String brand, String model, String sys, double version, String cpu, int ram, double screen){
        setBrand(brand);
        setModel(model);
        setSys(sys);
        setVersion(version);
        setCpu(cpu);
        setRam(ram);
        setScreen(screen);
    }
    
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
        if(version > 1.0){
            this.version = version;
        }else{
            System.err.println("El valor introducido en el campo \"screen\" no es valido. Se ha asignado el valor por defecto."); 
        }
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
        if(ram > 0){
           this.ram = ram; 
        }else{
            System.err.println("El valor introducido en el campo \"ram\" no es valido. Se ha asignado el valor por defecto."); 
        } 
    }
    
    public int getRam(){
        return ram;
    }
    
    public void setScreen(double screen){
        if(screen > 1.0){
            this.screen = screen;
        }else{
            System.err.println("El valor introducido en el campo \"screen\" no es valido. Se ha asignado el valor por defecto."); 
        }
    }
    
    public double getScreen(){
        return screen;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public String getStatus(){
        return status;
    }

    //Metodos para manejar el movil
    //Funcion para encender el movil: Deteccion de estado, tiene varios modos para funcionar asignados por el parametro que
    //le demos a la funcion.
    public void init(String mode){
        if(getStatus().equals("off")){
            switch(mode){
                case "reboot": 
                System.out.println("Sistema reiniciado con exito.");
                System.out.println("Bienvenido.");
                setStatus("on");
                break;
                case "kernel":
                System.out.println("Kernel mode");
                System.out.println("Info: " + brand + " " + model + " | " + sys + " " + version);
                setStatus("kernel");
                break;
                default:
                System.out.println("Bienvenido.");
                setStatus("on");
            }
        }else{
            System.err.println("El sistema ya está en funcionamiento.");
        }
    }
    
    //Metodo para el apagado: Deteccion de estado. Simplemente apaga el sistema usando un setter de estado y lanzando algunos souts
    public void shutdown(){
        if(getStatus().equals("on") || getStatus().equals("kernel")){
            setStatus("off");
            System.out.println("Apagando...");
            System.out.println("");
        }else{
            System.err.println("No puedes apagar un equipo que ni está encendido.");
        }
    }
    
    //Metodo para el reinicio: Deteccion de estado. Reinicia el movil dando orden al encendido de si debe ser en modo reinicio 
    //o modo kernel a traves del parametro.
    public void reboot(String mode){
        mode = mode.toLowerCase();
        if(getStatus().equals("on") || getStatus().equals("kernel")){
            switch(mode){
                case "kernel":
                    System.out.println("Reiniciando al kernel...");
                    shutdown();
                    init("kernel");
                    break;
                default:
                    System.out.println("Reiniciando...");
                    shutdown();
                    init("reboot");
            }
            
        }else{
            System.err.println("No puedes reiniciar un dispositivo apagado.");
        }
    }
    
    //Metodo para actualizar: Deteccion de estado para saber si puede actualizar o no. Reinicia el sistema una vez termindos.
    //Tiene algunos souts de decoracion.
    public void update(String sys, double version){
        if(status.equals("kernel")){
            if (checkSys(sys, version)) {
                System.out.println("Actualizando sistema...");
                System.out.println("cp -rf /tmp/updates/" + version + "/system");
                setVersion(version);
                reboot("reboot");
            }else{
                System.err.println("Error al actualizar.");
                System.err.println("El sistema ya está actualizado a la ultima versión.");
                reboot("reboot");
            }
            
        }else{
            System.err.println("El dispositivo no se encuentra en modo kernel.");
        }
    }
    
    
    //Metodo para chequear versiones y SO: Se usa para permitir al sistema actualizarse o no. Compara el sistema operativo con el del
    //del dispositivo y comprueba si la version a actualizar es superior.
    private boolean checkSys(String sys, double version){
        if (getVersion() < version && getSys().equals(sys)) {
            return true;
        }else{
            return false;
        }
    }
    
    //Metodo para obtener toda la informacion del sistema: Si el dispositivo esta apagado no funciona.
    public void deviceInfo(){
        if(status.equals("on")){
            System.out.println("Información del dispositivo:");
            System.out.println("Marca: " + brand);
            System.out.println("Modelo: " + model);
            System.out.println("CPU: " + cpu);
            System.out.println("RAM: " + ram + "GB");
            System.out.println("Tamaño de pantalla: " + screen + " pulgadas");
        
            System.out.println("\nInformación del sistema:");
            System.out.println("S.O.: " + sys);
            System.out.println("Version: " + version);
        }else{
            System.err.println("El dispositivo está apagado.");
        }
        
    }
}
