

package Clases;

import Conceptos.Conceptos;
import BaseDeDatos.Operaciones;

public class DetalleLiquidacion {

public Conceptos con = new Conceptos();
public Operaciones op = new Operaciones();

private float monto;
private float subTotal;
private float descuentos;

public float getMonto() {
 return monto;
}

public void setMonto(float monto) {
 this.monto = monto;
}

public float getDescuentos() {
 return descuentos;
}

public void setDescuentos(float descuentos) {
 this.descuentos = descuentos;
}

public float getSubTotal() {
 return subTotal;
}

public void setSubTotal(float subTotal) {
 this.subTotal = subTotal;
}

public void nuevoDetalle(int dni) {
 op.nuevoDetalle(dni,con.getDescripcion(),monto,descuentos,subTotal);
}

public void mostrarDetalle(int dni,int numero) {
 op.mostrarDetalleLiquidacion(dni,numero);
}

}
