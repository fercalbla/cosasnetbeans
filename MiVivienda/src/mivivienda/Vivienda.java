/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mivivienda;

/**
 *
 * @author fer
 */
public class Vivienda {
    int metros = 50;
    char letra = 'A';
    int piso = 1;
    int bloque = 1;
    char calificacion = 'G';
    boolean alarma = false;
    int habitaciones = 3;
    boolean ventanas = true;
    boolean puertas = true;
    int inquilinos = 0;
    int temperatura = 21;
    String situacion = "Desocupada";
    
    
    public void misMetros(int metros){
        if(metros >= 50){
            this.metros = metros;
        }else{
            System.out.println("\033[31mERROR: Argumento invalido. Ha de ser mayor o igual 50. | Resultado: " + (metros));
        }
    }
    
    public void miLetra(char letra){
        this.letra = letra;
    }
    
    public void miPiso(int piso){
        this.piso = piso;
    }
    
    public void miBloque(int bloque){
        this.bloque = bloque;
    }
    
    public void miCalificacion(char calificacion){
        switch(calificacion){
            case 'A':
                this.calificacion = calificacion;
                break;
            case 'B':
                this.calificacion = calificacion;
                break;
            case 'C':
                this.calificacion = calificacion;
                break;
            case 'D':
                this.calificacion = calificacion;
                break;
            case 'E':
                this.calificacion = calificacion;
                break;
            case 'F':
                this.calificacion = calificacion;
                break;
            default:
                this.calificacion = 'G';
                break;
            
        }
    }
    
    public void miAlarma(boolean alarma){
        this.alarma = alarma;
    }
    
    public void misHabitaciones(int habitaciones){
        if(habitaciones < 3){
            System.out.println("\033[31mERROR: Argumento invalido. Ha de ser mayor o igual a 3. | Resultado: " + (habitaciones) +"\n\033[31mSe ha asignado el valor por defecto.");
        }else{
            this.habitaciones = habitaciones;
        }
    }
    
    public void misVentanas(boolean ventanas){
        this.ventanas = ventanas;
    }
    
    public void misPuertas(boolean puertas){
        this.puertas = puertas;
    }
    
    public void misInquilinos(int inquilinos){
        if(inquilinos < 0){
            System.out.println("\033[31mERROR: Parametro invalido. Ha de ser mayor o igual a 0. | Resultado: " + (inquilinos) +"\n\033[31mSe ha asignado el valor por defecto.");
        }else{
            this.inquilinos = inquilinos;
            situacion = "Ocupada";
        }
    }
    
    public void miTemperatura(int temperatura){
        if(temperatura < 18 || temperatura > 26){
            System.out.println("\033[31mERROR: Parametro invalido. Ha de ser mayor o igual a 18 O menor o igual a 26. | Resultado: " + (temperatura) +"\n\033[31mSe ha asignado el valor por defecto.");
        }else{
            this.temperatura = temperatura;
        }
    }
    
    public void miSituacion(String situacion){
        situacion = situacion.toLowerCase();
        switch(situacion){
            case "ocupada":
                if(inquilinos >= 0){
                    System.out.println("\033[31mERROR: No se puede asignar esta situacion no si hay al menos un inquilino.");
                }else{
                    this.situacion = "Ocupada";
                }
                break;
            case "desocupada":
                if(inquilinos > 0){
                    System.out.println("\033[31mERROR: No se puede asignar esta situacion si hay un inquilino.");
                }else{
                    this.situacion = "Desocupada";
                }
                break;
            case "alquiler":
                if(inquilinos > 0){
                    System.out.println("\033[31mERROR: No se puede asignar esta situacion si hay un inquilino.");
                }else{
                    this.situacion = "Alquiler";
                }
                break;
            case "venta":
                if(inquilinos > 0){
                    System.out.println("\033[31mERROR: No se puede asignar esta situacion si hay un inquilino.");
                }else{
                    this.situacion = "Venta";
                }
                break;
            case "demolicion":
                if(inquilinos > 0){
                    System.out.println("\033[31mERROR: No se puede asignar esta situacion si hay un inquilino.");
                }else{
                    this.situacion = "Demolicion";
                }
                break;
            default:
                System.out.println("\033[31mERROR: Has introducido un parametro invalido, elige entre: ocupada, desocupada, alquiler, venta o demolicion.");
        }
    }
    
    public void showInfo(boolean isChanged){
        if(isChanged == true){
            System.out.println("La informacion de la vivienda ha sido cambiada. Estos son los nuevos parametros:");
        }else{
            System.out.println("La vivienda contiene los parametros por defecto, estos son:");
        }
        System.out.println("Metros de la vivienda: " + metros);
        System.out.println("Letra de la vivienda: " + letra);
        System.out.println("Piso de la vivienda: " + piso);
        System.out.println("Bloque de la vivienda: " + bloque);
        System.out.println("Calificacion de la vivienda: " + calificacion);
        System.out.println("Habitaciones en la vivienda: " + habitaciones);
        System.out.println("Inquilinos en la vivienda: " + inquilinos);
        System.out.println("Situacion de la vivienda: " + situacion);
        System.out.println("Temperatura de la vivienda: " + temperatura + "ºC");
        
        String alarmOn = (alarma == true) ? "Sí, está activada.":"No, no está activada";
        System.out.println("¿La alarma esta activada? " + alarmOn);
        String ventanasOpen = (ventanas == true) ? "Sí, las ventanas están abiertas.":"No, las ventanas están cerradas";
        System.out.println("¿Están las ventanas abiertas? " + ventanasOpen);
        String puertasOpen = (puertas == true) ? "Sí, las puertas están abiertas.":"No, las puertas están cerradas";
        System.out.println("¿Están las puertas abiertas? " + puertasOpen);
    }
    
    /*public String getInfo(String value){
        String toReturn = "";
        value = value.toLowerCase();
        switch(value){
            case "metros":
                toReturn = metros.toString();
            
        }
    }*/
}
