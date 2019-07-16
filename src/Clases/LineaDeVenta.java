
package Clases;

import BaseDeDatos.Operaciones;

public class LineaDeVenta {
// public Productos pro = new Productos();
// Operaciones op = new Operaciones();
 public Productos pro = new Productos();
 Operaciones op = new Operaciones();

 private float precio;
 private int cantidad;
 private float subTotal;
 private int numeroVenta;

public int getNumeroVenta() {
 return numeroVenta;
}

public void setNumeroVenta(int numeroVenta) {
 this.numeroVenta = numeroVenta;
}

 public int getCantidad() {
 return cantidad;
}

public void setCantidad(int cantidad) {
 this.cantidad = cantidad;
}

public float getPrecio() {
 return precio;
}

public void setPrecio(float precio) {
 this.precio = precio;
}

public float getSubTotal() {
 return subTotal;
}

public void setSubTotal(float subTotal) {
 this.subTotal = subTotal;
}

public void nuevaLineaDeVenta(int Dni){
 op.nuevaLineaVenta(Dni,pro.getDescripcion(),precio,cantidad,subTotal);
}

public void mostrarLinea() {
 op.mostrarLinea(numeroVenta);
}

}
