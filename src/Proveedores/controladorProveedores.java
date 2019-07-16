/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proveedores;

import BaseDeDatos.Conexion;
import Empleados.listadoEmpleados;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Martin
 */
public class controladorProveedores {
    
    public static void listarProveedores(){
     
    DefaultTableModel modelo = new DefaultTableModel();
        listadoDeProveedores.listadoProveedores.setModel(modelo);


        try {
            Conexion con = new Conexion();
            con.conectarBaseDeDatos();
            PreparedStatement pstm = (PreparedStatement) con.getConnection().prepareStatement
                    ("SELECT idProveedor,RazonSocial,Telefono,Email,fechadeAlta,direccion,provincia FROM proveedor WHERE Estado = 1 AND CONCAT"
                    + "(RazonSocial,' ',idProveedor,'',provincia) LIKE  '%"
                    + (listadoDeProveedores.txtRazonSocial.getText()) + "%'");
            
               
            
            

            ResultSet res = (ResultSet) pstm.executeQuery();
            ResultSetMetaData rsmd = (ResultSetMetaData) res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            for (int i = 1; i <= cantidadColumnas; i++) {
                modelo.addColumn(rsmd.getColumnLabel(i));
            }//cierre del for de las columnas
            String[] fila = new String[10];
            while (res.next()) {
                fila[0] = res.getString("idProveedor");
                fila[1] = res.getString("RazonSocial");
                fila[2] = res.getString("Telefono");
                fila[3] = res.getString("Email");             
                fila[4] = res.getString("fechadeAlta");             
                fila[5] = res.getString("direccion");
                fila[6] = res.getString("provincia");
               

                modelo.addRow(fila);
            }
            
            if (modelo.getRowCount() != 0) {
            } else {
                JOptionPane.showMessageDialog(null, "el proveedor no existe");
               listadoDeProveedores.txtRazonSocial.setText("");
            }
            res.close();



        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }}
}

