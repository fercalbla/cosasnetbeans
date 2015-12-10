/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeradodeclaracion;

/**
 *
 * @author fer
 */
public class EnumeradoDeclaracion {

    public enum miEnum{
        SEVILLA,
        HUELVA,
        CADIZ,
        CORDOBA,
        GRANADA,
        ALMERIA,
        JAEN,
        MALAGA;     
    }
    
    enum esteEnum{
        
        SEVILLA(41, "www.sevilla.org"),
        HUELVA(21, "www.huelva.es"),
        CADIZ(11, "www.cadiz.es"),
        CORDOBA(14, "www.cordoba.es"),
        GRANADA(18, "www.granada.org"),
        ALMERIA(04, "www.aytoalmeria.es"),
        JAEN(23, "www.aytojaen.es"),
        MALAGA(29, "www.malaga.eu");
    
    
        private int cP;
        private String web;
    
        private esteEnum(int cP, String web){
            this.cP = cP;
            this.web = web;
        }
        
        public int getcP(){
            return this.cP;
        }
        
        public String getWeb(){
            return this.web;
        }
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        miEnum miProvincia = miEnum.SEVILLA;
        
        if (miProvincia == miEnum.SEVILLA) {
            System.out.println("Zevilla miarma");
        }
        System.out.println("\n");
        
        for (miEnum dato: miEnum.values()) {
            System.out.println(dato);
        }
        System.out.println("\n");
        
        System.out.println(miProvincia.name());
        System.out.println(miProvincia.ordinal());
        System.out.println(miProvincia.toString());
        System.out.println("\n");
        
        esteEnum miProv = esteEnum.SEVILLA;
        
        System.out.println("Provincia: " + miProv);
        System.out.println("Codigo postal: " + miProv.getcP());
        System.out.println("Web: " + miProv.getWeb());
        
        for (esteEnum dato : esteEnum.values()) {
            System.out.print("\t" + dato.ordinal());
            System.out.print("\t" + dato);
            System.out.print("\t" + dato.cP);
            System.out.print("\t" + dato.web);
            System.out.print("\n");
        }
    }
    
}