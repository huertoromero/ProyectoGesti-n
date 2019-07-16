package BaseDeDatos;

import Insumos.buscarInsumo;
import Insumos.listadoDeInsumos;
import Servicios.listadoDeServicios;
import Servicios.nuevoServicio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class InsumosOperaciones {
    
    Conexion con = new Conexion();
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
    
    public void listadeInsumos() {
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT ins.idInsumo, ins.nombre, ins.cantidad, ins.unidad_cantidad_uso FROM insumo ins");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                listadoDeInsumos.m.addRow(fila);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }
    }
    
    public void nuevoInsumo(String nombre, int cantidad, int cantidadUso) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("INSERT into insumo(nombre, cantidad, unidad_cantidad_uso) values(?,?,?)");
            pstm.setString(1, nombre);
            pstm.setInt(2, cantidad);
            pstm.setInt(3, cantidadUso);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Registro Completo", "FELICIDADES", JOptionPane.INFORMATION_MESSAGE);
            con.desconectarBaseDeDatos();
            nuevoServicio.nuevo();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se registro el servicio" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actualizarInsumo(int codigo, String nombre, int cantidad, int cantidadUsos) {
        try {
            con.conectarBaseDeDatos();
            System.out.println(nombre);
            PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE insumo set nombre = ?, cantidad= ?, unidad_cantidad_uso=? WHERE idInsumo =" + codigo); // puede haber error, en el ?
            pstm.setString(1, nombre);
            pstm.setFloat(2, cantidad);
            pstm.setFloat(3, cantidadUsos);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Insumo Actualizado", "Gracias", JOptionPane.INFORMATION_MESSAGE);
            con.desconectarBaseDeDatos();
//   con.desconectarBaseDeDatos();
            listadoDeInsumos.m.setRowCount(0);
            listadeInsumos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void eliminarInsumo(String nombre) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("DELETE FROM insumo WHERE nombre = '" + nombre + "'");
//   pstm.setString(1,nombre);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Insumo Eliminado", "Gracias", JOptionPane.INFORMATION_MESSAGE);
            listadoDeInsumos.m.removeRow(listadoDeInsumos.listaInsumos.getSelectedRow());
            con.desconectarBaseDeDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void busquedaDeInsumos(String nombre) {
        listadoDeInsumos.m.setRowCount(0);
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT ins.idInsumo,ins.nombre,ins.cantidad, ins.unidad_cantidad_uso FROM "
                    + "insumo ins WHERE nombre LIKE '%" + nombre + "%'");// + "AND prod.estado = 1");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            if (res.next() == true) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                listadoDeServicios.m.addRow(fila);
            } else {
                JOptionPane.showMessageDialog(null, "Insumo no encontrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                this.listadeInsumos();
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void cargarInsumo() {
        con.conectarBaseDeDatos();
 try{
  PreparedStatement pstm = con.getConnection().prepareStatement("SELECT nombre FROM insumo");
  ResultSet res = pstm.executeQuery();
  ResultSetMetaData rsmd = res.getMetaData();
  int cantidadColumnas = rsmd.getColumnCount();
  while(res.next()){
  Object[]fila = new Object[cantidadColumnas];
  for(int i=0; i < cantidadColumnas; i++){
  fila[i]= res.getObject(i+1);
  }
      buscarInsumo.tabla.addRow(fila);
  }
  con.desconectarBaseDeDatos();
  }
 catch(Exception ex){
  JOptionPane.showMessageDialog(null,ex,"ERROR",JOptionPane.ERROR_MESSAGE);
  System.out.print(ex);
 }
    }

}
