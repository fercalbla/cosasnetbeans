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
public interface Facturacion {
    public final int IVA = 21;
    
    public abstract int lineaFactura(int linea, String concepto, int precioU, int cantidad);
    public abstract int valorFactura(int... lineas);
}
