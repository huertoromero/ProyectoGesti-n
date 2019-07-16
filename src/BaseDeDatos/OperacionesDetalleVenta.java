/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDatos;

import Ventas.mostrarLineaVenta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class OperacionesDetalleVenta {
Conexion con = new Conexion();
    public void nuevaLineaVenta(int idServicio, float subtotal, int nroVenta) {
  con.conectarBaseDeDatos();
  try{ 
  PreparedStatement pstm3 = con.getConnection().prepareStatement("INSERT into detalle_venta(subTotal,venta_id,servicio_id) values(?,?,?)");
   pstm3.setFloat(1,subtotal);
   pstm3.setInt(2, nroVenta);
   pstm3.setInt(3,idServicio);
   pstm3.execute();
   pstm3.close();
   /* CONTROL DE STOCK
   PreparedStatement pstm5 = con.getConnection().prepareStatement("UPDATE productos set cantidad = ? WHERE descripcion LIKE '" + descripcion +"'");
   
   pstm5.setInt(1,stock);
   pstm5.execute();
   pstm5.close(); */
   con.desconectarBaseDeDatos();
  }
  catch (Exception ex){
   JOptionPane.showMessageDialog(null,"No se registro la linea/detalle de venta" + ex ,"ERROR",JOptionPane.ERROR_MESSAGE);
   System.out.print(ex);
  }
    }

    public void mostrarLinea(int nroVenta) {
        mostrarLineaVenta.m.setRowCount(0);
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT ser.nombre,dv.subTotal FROM detalle_venta dv INNER JOIN servicios ser ON ser.idServicio=dv.servicio_id AND dv.venta_id ='" + nroVenta+"'");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                mostrarLineaVenta.m.addRow(fila);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }

    }
    }
    

