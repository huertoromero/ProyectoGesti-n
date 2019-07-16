/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package detalleCompra;

import BaseDeDatos.ComprasOperaciones;
import Insumos.Insumos;

/**
 *
 * @Creado por.. Gachi
 */
public class detalleCompra {
    public Insumos is = new Insumos();
    ComprasOperaciones opC = new ComprasOperaciones();
    private int numeroCompra, cantidad;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
    private float precioCompra, subtotal;
    

    public int getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(int numeroCompra) {
        this.numeroCompra = numeroCompra;
    }
    
    
    public void mostrarLinea() {
    opC.mostrarLineaCompra(numeroCompra);
}

    public void nuevaLineaCompra(int idProveedor) {
        opC.nuevaLineaCompra(idProveedor, is.getNombre().toString(), cantidad, subtotal);
    }
}
