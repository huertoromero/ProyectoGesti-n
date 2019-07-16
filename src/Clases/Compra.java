
package Clases;

import BaseDeDatos.Operaciones;
import Compras.nuevaCompra;
import Insumos.Insumos;
import detalleCompra.detalleCompra;
import javax.swing.JOptionPane;

public class Compra {
 public Operaciones op = new Operaciones();
 public Empleados emp = new Empleados();
 public FechayHora fh = new FechayHora();
 public Proveedor prov = new Proveedor();
// public LineaDeCompra lc = new LineaDeCompra();
 public detalleCompra dc = new detalleCompra();
 public Insumos ins = new Insumos();
  
 private String fecha;
 private String hora;
 private float total;
 private float vuelto;


//public Empleados getEmp() {
// return emp;
//}
//
//public void setEmp(Empleados emp) {
// this.emp = emp;
//}



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



public void nuevaCompra() {
 op.nuevaCompra(prov.getIdProveedor(),fecha,hora,total,vuelto);
}

public void reporteCompleto(String fechadel, String fechaAl) {
 op.reporteCompletoCompras(fechadel, fechaAl);
}

public void reporteCompraProveedor(String fechadel, String fechaAl) {
 op.reporteCompletoComprasProveedor(prov.getIdProveedor(),fechadel, fechaAl);
}


public void calcularTotal(int fila) {
 float total = 0;
 for(int i =0; i < fila; i++){
  total = total + Float.parseFloat(nuevaCompra.m.getValueAt(i,2).toString());
 }
 setTotal(total);
 if(getTotal()>=0){
 nuevaCompra.btnAgregar.setEnabled(true);
    nuevaCompra.btnCancelar.setEnabled(true);
 }
 if(getTotal()==0){
  nuevaCompra.txtTotal.setText("");
//  nuevaCompra.txtVuelto.setText("");
//  nuevaCompra.txtMonto.setText("");
  nuevaCompra.btnAgregar.setEnabled(false);
  nuevaCompra.btnCancelar.setEnabled(false);
 }
 else{
  nuevaCompra.txtTotal.setText(String.valueOf(getTotal()));
//  nuevaCompra.txtMonto.setText("");
//  nuevaCompra.txtVuelto.setText("");
 }
}

// public void calcularVuelto() {
//  float vuelto = getMontoAbonado() - getTotal();
//  setVuelto(vuelto);
//   if(getVuelto() >=0){
////    nuevaCompra.txtVuelto.setText(String.valueOf(getVuelto()));
//    nuevaCompra.btnAgregar.setEnabled(true);
//    nuevaCompra.btnCancelar.setEnabled(true);
//   }
//   else{
//    JOptionPane.showMessageDialog(null,"Cantidad Insuficiente", "Error", JOptionPane.ERROR_MESSAGE);
//   }
// }

public void reporteCompras() {
 op.reporteCompras();
}

public void reporteProveedor() {
 op.reporteProveedor(prov.getIdProveedor());
}




}
