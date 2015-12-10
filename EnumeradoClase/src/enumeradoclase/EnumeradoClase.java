/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeradoclase;

/**
 *
 * @author fer
 */
public class EnumeradoClase {
    
    enum Clase{
        JOSE("José Villar Cueli", 666666666, "mail1@example.com"),
        JUAN("Juan Berenguer Armario", 666666666, "mail2@example.com"),
        PEPELU("Jose Luis Dominguez Vayad", 666666666, "mail3@example.com"),
        ISABEL("Isabel Cabezas Redondo", 666666666, "mail4@example.com"),
        MANU("Manuel Domiciano Bermudo Galván", 666666666, "mail5@example.com"),
        PABLO("Pablo González Romero", 666666666, "mail6@example.com"),
        FER("Fernando Francisco Calvo Blanco", 666666666, "mail7@example.com");
        
        private String name;
        private int telf;
        private String mail;
        
        private Clase(String name, int telf, String mail){
            this.name = name;
            this.telf = telf;
            this.mail = mail;
        }
        
        public String getName(){
            return this.name;
        }
        
        public int getTelf(){
            return this.telf;
        }
        
        public String getMail(){
            return this.mail;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("ID\tenum\tNombre y apellidos:\tTelefono:\tMail:");
        for (Clase dato : Clase.values()) { 
            System.out.print("\t" + dato.ordinal());
            System.out.print("\t" + dato);
            System.out.print("\t" + dato.name);
            System.out.print("\t" + dato.telf);
            //if(dato.mail.equals("mail7@example.com")){
                System.out.print("\t" + dato.mail);  
            //}
            System.out.print("\n");
        }
        
        System.out.println("\n");
        Clase mio = Clase.FER;
        System.out.println("Correo electronico de " + mio.getName() + ": " + mio.getMail());
    }
    
}
