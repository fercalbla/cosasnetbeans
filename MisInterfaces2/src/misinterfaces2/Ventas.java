/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misinterfaces2;

/**
 *
 * @author fer
 */
public class Ventas implements Facturacion{
    private String categoria;
    private String[] articulos;

    @Override
    public int lineaFactura(int linea, String concepto, int precioU, int cantidad) {
        return 1;
    }

    @Override
    public int valorFactura(int... lineas) {
        return 1;
    }
    
    public void articuloVentas(String articulo){
        
    }
    
    public void mostrarArticulos(){
        
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
     * @return the articulos
     */
    public String[] getArticulos() {
        return articulos;
    }

    /**
     * @param articulos the articulos to set
     */
    public void setArticulos(String[] articulos) {
        this.articulos = articulos;
    }
}
