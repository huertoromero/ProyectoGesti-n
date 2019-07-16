package Clases;

import BaseDeDatos.Operaciones;
import detalleVenta.detalleVenta;
public class Ventas {

 public Empleados emp = new Empleados();
 public Clientes cli = new Clientes();
 public Operaciones op = new Operaciones();
// public LineaDeVenta lv = new LineaDeVenta();
 public detalleVenta dv = new detalleVenta();
 public FechayHora fh = new FechayHora();
 public Productos pro = new Productos();

 private String fecha;
 private String hora;
 private float total;
 private float montoAbonado;
 private float vuelto;
 //private int numeroVenta;

public float getMontoAbonado() {
 return montoAbonado;
}

public void setMontoAbonado(float montoAbonado) {
 this.montoAbonado = montoAbonado;
}

public float getVuelto() {
 return vuelto;
}

public void setVuelto(float vuelto) {
 this.vuelto = vuelto;
}

public String getFecha() {
 return fecha;
}

public void setFecha(String fecha) {
 this.fecha = fecha;
}

public String getHora() {
 return hora;
}

public void setHora(String hora) {
 this.hora = hora;
}

public float getTotal() {
 return total;
}

public void setTotal(float total) {
 this.total = total;
}

public void buscar(){
 op.BuscarCliente(cli.getDni());
}

public void nuevaVenta(){
 op.nuevaVenta(emp.getDni(),fecha,hora,cli.getDni(),total,montoAbonado,vuelto);
}

public void reporteCompleto(String fechadel, String fechaAl) {
 op.reporteCompleto(fechadel, fechaAl);
}

public void reportePorCliente(int dni, String fechadel, String fechaAl) {
 op.reportePorCliente(dni, fechadel, fechaAl);
}

public void reporteCompletoVenta() {
 op.reporteCompletoVentas();
}

public void reporteTotalCliente() {
 op.reporteCompletoCliente(emp.getDni());
}

public int obtenerUltimaVenta(int dni) {
 int numero = op.obtenerUltimaVenta(dni);
 return numero;
}

}