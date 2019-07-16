/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

import BaseDeDatos.Conexion;
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
public class controladorEmpleados {
    
    
    public static void listarEmpleado(){
    
    
    DefaultTableModel modelo = new DefaultTableModel();
        listadoEmpleados.listadoEmpleados.setModel(modelo);


        try {
            Conexion con = new Conexion();
            con.conectarBaseDeDatos();
            PreparedStatement pstm = (PreparedStatement) con.getConnection().prepareStatement
                    ("SELECT dniEmpleado,nombre,apellido,Telefono,Mail,direccion FROM empleados WHERE Estado = 1 AND CONCAT"
                    + "(dniEmpleado,' ',apellido,' ',nombre) LIKE  '%"
                    + (listadoEmpleados.txtBuscar.getText()) + "%'");
            
               
            
            

            ResultSet res = (ResultSet) pstm.executeQuery();
            ResultSetMetaData rsmd = (ResultSetMetaData) res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            for (int i = 1; i <= cantidadColumnas; i++) {
                modelo.addColumn(rsmd.getColumnLabel(i));
            }//cierre del for de las columnas
            String[] fila = new String[10];
            while (res.next()) {
                fila[0] = res.getString("dniEmpleado");
                fila[1] = res.getString("nombre");
                fila[2] = res.getString("apellido");
                fila[3] = res.getString("telefono");             
                fila[4] = res.getString("Mail");
                fila[5] = res.getString("direccion");

                modelo.addRow(fila);
            }
            
            if (modelo.getRowCount() != 0) {
            } else {
                JOptionPane.showMessageDialog(null, "el cliente no existe");
               listadoEmpleados.txtBuscar.setText("");
            }
            res.close();



        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    
    
    }
    
}
