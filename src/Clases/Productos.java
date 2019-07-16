
package Clases;

import BaseDeDatos.Operaciones;

public class Productos {

public FechayHora fh = new FechayHora();
public Proveedor prov = new Proveedor();


private String descripcion;
private float precioCompra;
private float precioVenta;
private int cantidad;
private String fechadeAlta;
private String fechadeBaja;
private int estado;

private Operaciones op = new Operaciones();

public int getCantidad() {
 return cantidad;
}

public void setCantidad(int cantidad) {
 this.cantidad = cantidad;
}


public String getDescripcion() {
 return descripcion;
}

public void setDescripcion(String descripcion) {
 this.descripcion = descripcion;
}

public int getEstado() {
 return estado;
}

public void setEstado(int estado) {
 this.estado = estado;
}

public String getFechadeAlta() {
 return fechadeAlta;
}

public void setFechadeAlta(String fechadeAlta) {
 this.fechadeAlta = fechadeAlta;
}

public String getFechadeBaja() {
 return fechadeBaja;
}

public void setFechadeBaja(String fechadeBaja) {
 this.fechadeBaja = fechadeBaja;
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

 public void buscarProducto() {
  op.buscarProducto(descripcion.toString());
 }
//
//public void cargarCategoria(int tipo) {
// op.cargarCategoriaProductos(tipo);
//}

public void eliminarProducto() {
 op.eliminarProducto(descripcion, fechadeBaja,estado);
}

public void busquedaDeProductos() {
 op.busquedaDeProductos(descripcion);
}

public void listadoProductos() {
 op.listadeProductos();
}

public void actualizarProducto() {
 op.actualizarProducto(descripcion,precioVenta,cantidad);
}

public void busquedaProductos() {
 op.busquedaProductosVenta(descripcion);
}

public void cargarProductos() {
 op.cargarProductos();
}

public void nuevoProducto(){
 op.nuevoProducto(descripcion,cantidad,precioVenta,precioCompra,fechadeAlta,estado);
}

}
