
package Clases;

import BaseDeDatos.Operaciones;

public class LineaDeCompra {
 public Productos pro = new Productos();
 public Operaciones op = new Operaciones();

 private float precioCompra;
 private float precioVenta;
 private float subTotal;
 private int cantidad;
 private int numeroCompra;
 private String fechaAlta;

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }



public int getNumeroCompra() {
 return numeroCompra;
}

public void setNumeroCompra(int numeroCompra) {
 this.numeroCompra = numeroCompra;
}

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

public float getPrecioVenta() {
 return precioVenta;
}

public void setPrecioVenta(float precioVenta) {
this.precioVenta = precioVenta;
}

public float getSubTotal() {
return subTotal;
}

public void setSubTotal(float subTotal) {
this.subTotal = subTotal;
}

public void nuevaLineaCompra(int proveedor) {
 op.nuevaLineaCompra(proveedor,pro.getDescripcion(),precioCompra, precioVenta,cantidad, subTotal,fechaAlta); // HASTA QUE TERMINE DE HACER LO DE PRODUCTOS
}

public void nlineaCompra(int proveedor){
    
}

public float calcularPrecioVenta(float precio) {
 setPrecioCompra(precio);
 float ganancia = 150* getPrecioCompra() /100;
 setPrecioVenta(ganancia + getPrecioCompra());
 return getPrecioVenta();
}

public void mostrarLinea() {
 op.mostrarLineaCompra(numeroCompra);
}

}
