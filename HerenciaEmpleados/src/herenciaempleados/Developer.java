/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaempleados;

/**
 *
 * @author fer
 */
public class Developer extends Empleado{
    //super();
    
    private String categoria = "Default";
    private String[] tecnologias = new String[10];
    private String evento;
    private String fechaEvento;
    private boolean enEvento = false;
    
    public Developer(String dni, String nombre, String categoria){
        super(dni, nombre);
        setCategoria(categoria);
    }
    
    public Developer(String dni, String nombre, String categoria, String evento, String fechaEvento){
        super(dni, nombre);
        setCategoria(categoria);
        setEvento(evento);
        setFechaEvento(fechaEvento);
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the tecnologias
     */
    public String[] getTecnologias() {
        return tecnologias;
    }

    /**
     * @param tecnologias the tecnologias to set
     */
    public void setTecnologias(String[] tecnologias) {
        this.tecnologias = tecnologias;
    }

    /**
     * @return the evento
     */
    public String getEvento() {
        return evento;
    }

    /**
     * @param evento the evento to set
     */
    public void setEvento(String evento) {
        this.evento = evento;
    }

    /**
     * @return the fechaEvento
     */
    public String getFechaEvento() {
        return fechaEvento;
    }

    /**
     * @param fechaEvento the fechaEvento to set
     */
    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    /**
     * @return the enEvento
     */
    public boolean isEnEvento() {
        return enEvento;
    }

    /**
     * @param enEvento the enEvento to set
     */
    public void setEnEvento(boolean enEvento) {
        this.enEvento = enEvento;
    }
    
    public void participarEvento(String evento, String fechaEvento){
        if(isEnEvento()){
            System.err.println("ERROR: No se puede participar en ningun evento.");
        }else{
            setEvento(evento);
            setFechaEvento(fechaEvento);
            setEnEvento(true);
        }
    }
    
    public void aprenderTec(String tecnologia){
        /*if(checkIfExist(tecnologia)){
            System.err.println("ERROR: No puedes aprender una tecnologia que ya sabes.");
        }else{*/
            for (int i = 0; i < tecnologias.length; i++) {
                if (tecnologias[i] == null && !(tecnologia.equals(tecnologias[i]))) {
                    tecnologias[i] = tecnologia;
                    System.out.println("Tecnologia " + tecnologia + " añadida con exito.");
                    break;
                }else/* if((i + 1) == tecnologias.length)*/{
                    System.err.println("ERROR: No habia espacio para aprender tecnologias o ya conocias la tecnologia.");
                    break;
                }
            }
       // }
        
    }
    
    /*private boolean checkIfExist(String tecnologia){
        boolean isValid = false;
        for (int i = 0; i < tecnologias.length; i++) {
            if (tecnologias[i] == null || !tecnologias[i].equals(tecnologia)) {
                isValid = false;
            }else{
                System.err.println("ERROR: Tecnologia repetida.");
                isValid = true;
                break;
            }
        }
        return isValid;
    }*/
    
    
}
