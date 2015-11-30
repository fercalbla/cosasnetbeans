/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydeclaracion;

/**
 *
 * @author fer
 */
public class ArrayDeclaracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Comenzamos la construccion declarando el tipo de Array.
        int[] nombreArray;

        //Le asignamos el tamaño al Array int[x], x siendo el tamaño
        nombreArray = new int[10];
        //La forma normal de construir arrays es: int[] nombreArray = new int[10];

        //Asiganamos valores a cada espacio
        nombreArray[0] = 100;
        nombreArray[1] = 200;
        nombreArray[2] = 300;
        nombreArray[3] = 400;
        nombreArray[4] = 500;
        nombreArray[5] = 600;
        nombreArray[6] = 700;
        nombreArray[7] = 800;
        nombreArray[8] = 900;
        nombreArray[9] = 1000;

        //Utilicemos un bucle for para iterar los numeros de arriba.
        //Usamos nombreArray.length para obtener su tamaño.
        for (int i = 0; i < nombreArray.length; i++) {
            System.out.println("El numero es del espacio " + (i + 1) + " es " + nombreArray[i]);
        }

        //No nos podemos pasar de 10 espacios ya que los hemos asignado arriba.
        //Si descomentaramos la linea de abajo daria un error ArrayIndexOutOfBoundsException
        //nombreArray[10] = 1100;
        
        //Tambien es posible construir un array dandole los elementos directamente, todo en una linea.
        String[] provinciasAnd = {"Almería", "Cádiz", "Córdoba", "Jaen", "Huelva", "Malaga", "Sevilla"};
        System.out.println("Provincias de Andalucia por orden alfabetico (Bucle For):");
        for (int i = 0; i < provinciasAnd.length; i++) {
            //System.out.println((i + 1) + ". "+ provinciasAnd[i]);
            System.out.print((i + 1) + ". " + provinciasAnd[i] + " ");
        }

        //Utilizamos un bucle for each para acortar
        System.out.println("\nProvincias de Andalucia por orden alfabetico (Bucle For Each):");
        for (String elemento : provinciasAnd) {
            System.out.println(elemento);
        }

        //Pasamos a crear un buscador para el Array
        System.out.println("\nBuscador de valores en Arrays");
        int[] myArray = {678, 0, 39, 125, 100, 478, 6, 540, 78, 28};
        int valorBuscado = 10;
        boolean found = false;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == valorBuscado) {
                System.out.println("El valor " + valorBuscado + " existe y se encuentra en la posición " + i);
                found = true;
            } else if ((i + 1) == myArray.length && found == false) {
                System.out.println("El valor " + valorBuscado + " no ha sido encontrado.");
            }
        }
    }

}
