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
public class Empleado {
    private String dni = "Default";
    private String nombre = "Default";
    private int departamento = 0;
    private int salario = 0;
    private int vacacionesRest = 0;
    
    public Empleado(){
        
    }
    
    public Empleado(String dni, String nombre){
        setDni(dni);
        setNombre(nombre);
        setDepartamento(0);
        setSalario(670);
        setVacacionesRest(30);
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the departamento
     */
    public int getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the salario
     */
    public int getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }

    /**
     * @return the vacacionesRest
     */
    public int getVacacionesRest() {
        return vacacionesRest;
    }

    /**
     * @param vacacionesRest the vacacionesRest to set
     */
    public void setVacacionesRest(int vacacionesRest) {
        this.vacacionesRest = vacacionesRest;
    }
    
    public int cogeVacaciones(int vacacionesRest){
        if(vacacionesRest > getVacacionesRest()){
            System.out.println("ERROR: El usuario no tienes vacaciones suficientes para asignarle el valor otorgado.");
        }else{
            setVacacionesRest(getVacacionesRest() - vacacionesRest);
            System.out.println("Vacaciones nuevas asignadas.");
        }
        return 0;
    }
    
    public int modificarSalario(int salario){
        if(salario < 670){
            System.err.println("No puedes poner un salario menor a 670€. El salario minimo ha sido establecido.");
            return 670;
        }else{
            setSalario(salario);
            return salario;
        }
    }
}
