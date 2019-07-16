/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detalleVenta;

import BaseDeDatos.OperacionesDetalleVenta;
import Servicios.Servicios;

/**
 *
 * @author Administrador
 */
public class detalleVenta {
    public Servicios ser = new Servicios();
 OperacionesDetalleVenta op = new OperacionesDetalleVenta();
 
 private int idServicio, 
         nroVenta;

    public Servicios getSer() {
        return ser;
    }

    public void setSer(Servicios ser) {
        this.ser = ser;
    }

    public OperacionesDetalleVenta getOp() {
        return op;
    }

    public void setOp(OperacionesDetalleVenta op) {
        this.op = op;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getNroVenta() {
        return nroVenta;
    }

    public void setNroVenta(int nroVenta) {
        this.nroVenta = nroVenta;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public detalleVenta() {
    }
 private float subtotal;
//public void mostrarLinea() {
// op.mostrarLinea(numeroVenta);
//}

    public void nuevaLineaDeVenta(int ultima, int idServi, float subTotal) {
       op.nuevaLineaVenta(idServi,subTotal,ultima);
// op.nuevaLineaVenta(Dni,pro.getDescripcion(),precio,cantidad,subTotal);
    }

    public void mostrarLinea() {
         op.mostrarLinea(nroVenta);
    }
}
