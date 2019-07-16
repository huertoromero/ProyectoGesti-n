/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDatos;

import Compras.mostrarLineaCompra;
import Compras.nuevaCompra;
import Ventas.reporteVentas;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @Creado por.. Gachi
 */
public class ComprasOperaciones {
    Conexion con = new Conexion();
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
    
    public void cargarinsumos() {
        
    }

    public void listarInsumosenCompra() {
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = (PreparedStatement) con.getConnection().prepareStatement("SELECT ins.nombre FROM insumo ins");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = (ResultSetMetaData) res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                modeloCombo.addElement(fila[i]);
                }
    nuevaCompra.comboInsumos.setModel(modeloCombo);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }
    }
    public void nuevaLineaCompra(int proveedor,String insumo,int cantidad, float subTotal) {
  con.conectarBaseDeDatos();
  int idCompra = 0;
  int idInsumo=0;
  try{
   PreparedStatement pstm = (PreparedStatement) con.getConnection().prepareStatement("SELECT max(idCompra) FROM compra WHERE idProveedor ='" + proveedor+ "'");
   ResultSet res = pstm.executeQuery();
   if(res.next()==true){
    idCompra = res.getInt("max(idCompra)");
    res.close();

    PreparedStatement pstm2 = (PreparedStatement) con.getConnection().prepareStatement("SELECT idInsumo,cantidad FROM insumo WHERE nombre LIKE '" + insumo + "'" );
    ResultSet res2 = pstm2.executeQuery();
    if(res2.next()==true){
     idInsumo = res2.getInt("idInsumo");
     res2.close();

     PreparedStatement pstm3 = (PreparedStatement) con.getConnection().prepareStatement("INSERT into detalle_compra(insumo_id,compra_id,cantidad,subTotal) values(?,?,?,?)");
     pstm3.setInt(1,idInsumo);
     pstm3.setInt(2, idCompra);
     pstm3.setInt(3,cantidad);
     pstm3.setFloat(4,subTotal);
     pstm3.execute();
     pstm3.close();
     //FALTA EL UPDATE DE INSUMOS
     con.desconectarBaseDeDatos();
     }
     else{
        con.desconectarBaseDeDatos();
       }
      }
     }
  catch (Exception ex){
   JOptionPane.showMessageDialog(null,"No se registro la Compra " + ex ,"ERROR",JOptionPane.ERROR_MESSAGE);
   System.out.print(ex);
  }
 }
    public void mostrarLineaCompra(int numeroCompra) {
 mostrarLineaCompra.m.setRowCount(0);
 con.conectarBaseDeDatos();
 try{
  PreparedStatement pstm = (PreparedStatement) con.getConnection().prepareStatement("SELECT ins.nombre,dc.cantidad,dc.subTotal FROM insumo ins, detalle_compra dc WHERE dc.compra_id ='" + numeroCompra +"' AND dc.insumo_id = ins.idInsumo");
  ResultSet res = pstm.executeQuery();
  ResultSetMetaData rsmd = (ResultSetMetaData) res.getMetaData();
  int cantidadColumnas = rsmd.getColumnCount();
  while(res.next()){
  Object[]fila = new Object[cantidadColumnas];
  for(int i=0; i < cantidadColumnas; i++){
   fila[i]= res.getObject(i+1);
  }
   mostrarLineaCompra.m.addRow(fila);
  }
  con.desconectarBaseDeDatos();
  }
  catch(Exception ex){
   System.out.print(ex);
  }
}

 public void reporteCompletoCliente(int dni) {
 reporteVentas.m.setRowCount(0);
 con.conectarBaseDeDatos();
 try{
  PreparedStatement pstm = (PreparedStatement) con.getConnection().prepareStatement("SELECT idVenta,dniCliente,Fecha,Hora,Total FROM ventas WHERE dniCliente = '" + dni +"'");
  ResultSet res = pstm.executeQuery();
  ResultSetMetaData rsmd = (ResultSetMetaData) res.getMetaData();
  int cantidadColumnas = rsmd.getColumnCount();
  while(res.next()){
  Object[]fila = new Object[cantidadColumnas];
  for(int i=0; i < cantidadColumnas; i++){
   fila[i]= res.getObject(i+1);
  }
   reporteVentas.m.addRow(fila);
  }
  if(reporteVentas.m.getRowCount()==0){
   JOptionPane.showMessageDialog(null,"El cliente no posee ventas registradas","ERROR",JOptionPane.ERROR_MESSAGE);
   reporteVentas.btnMostrar.setEnabled(true);
  }
  con.desconectarBaseDeDatos();
  }
  catch(Exception ex){
   System.out.print(ex);
  }
 }
}
