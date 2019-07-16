package Clientes;

import BaseDeDatos.Conexion;
import Ventas.nuevaVenta;
import com.mysql.jdbc.EscapeTokenizer;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class controladorCliente {

    public static void clicTabla() {

        int fila = buscarClientes.jTableBuscarCliente.getSelectedRow();
        nuevaVenta.txtDni.setText(buscarClientes.jTableBuscarCliente.getValueAt(fila, 0).toString());
        nuevaVenta.lblApellido.setText(buscarClientes.jTableBuscarCliente.getValueAt(fila, 1).toString());
        nuevaVenta.txtNombre.setText(buscarClientes.jTableBuscarCliente.getValueAt(fila, 2).toString());

     // impresiones de pantalla para ver si anda. anda bien
        System.out.println("dni : " + nuevaVenta.txtDni.getText());
        System.out.println("nombre : " + nuevaVenta.txtNombre.getText());
        System.out.println("apellido : " + nuevaVenta.lblApellido.getText());

//     nuevaVenta.btnAceptar.setEnabled(true);
//     nuevaVenta.btnCambiar.setEnabled(true);
//     salir();
    }

    public static void buscarCliente() {

        DefaultTableModel modelo = new DefaultTableModel();
        buscarClientes.jTableBuscarCliente.setModel(modelo);

        try {
            Conexion con = new Conexion();
            con.conectarBaseDeDatos();
            PreparedStatement pstm = (PreparedStatement) con.getConnection().prepareStatement("SELECT dniCliente,Apellido,Nombre FROM clientes WHERE Estado = 1 AND CONCAT "
                    + "(dniCliente,' ',Apellido,' ',Nombre) LIKE '%"
                    + (buscarClientes.txtBuscarCliente.getText()) + "%'");

            //   OR descripcion ='"+   comentario= me daba error abzurdho
            ResultSet res = (ResultSet) pstm.executeQuery();
            ResultSetMetaData rsmd = (ResultSetMetaData) res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            for (int i = 1; i <= cantidadColumnas; i++) {
                modelo.addColumn(rsmd.getColumnLabel(i));
            }//cierre del for de las columnas
            String[] fila = new String[10];
            while (res.next()) {
                fila[0] = res.getString("dniCliente");
                fila[1] = res.getString("Apellido");
                fila[2] = res.getString("Nombre");

                modelo.addRow(fila);
            }

            if (modelo.getRowCount() != 0) {
            } else {
                JOptionPane.showMessageDialog(null, "el cliente no existe");
                buscarClientes.txtBuscarCliente.setText("");
            }
            res.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public static void buscarCliente2() {

        DefaultTableModel modelo = new DefaultTableModel();
        listadoDeClientes.listadoClientes.setModel(modelo);

        try {
            Conexion con = new Conexion();
            con.conectarBaseDeDatos();
            PreparedStatement pstm = (PreparedStatement) con.getConnection().prepareStatement("SELECT dniCliente,Apellido,Nombre,Telefono,Email,Direccion FROM clientes WHERE Estado = 1 AND CONCAT"
                    + "(dniCliente,' ',Apellido,' ',Nombre) LIKE  '%"
                    + (listadoDeClientes.txtBuscarCliente.getText()) + "%'");

            ResultSet res = (ResultSet) pstm.executeQuery();
            ResultSetMetaData rsmd = (ResultSetMetaData) res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            for (int i = 1; i <= cantidadColumnas; i++) {
                modelo.addColumn(rsmd.getColumnLabel(i));
            }//cierre del for de las columnas
            String[] fila = new String[10];
            while (res.next()) {
                fila[0] = res.getString("dniCliente");
                fila[1] = res.getString("Apellido");
                fila[2] = res.getString("Nombre");
                fila[3] = res.getString("telefono");
                fila[4] = res.getString("Email");
                fila[5] = res.getString("Direccion");

                modelo.addRow(fila);
            }
            if (modelo.getRowCount() != 0) {
            } else {
                JOptionPane.showMessageDialog(null, "el cliente no existe");
                buscarClientes.txtBuscarCliente.setText("");
            }
            res.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
//    public static void salir() {
//       Clientes.buscarCliente c = new Clientes.buscarCliente();
//       Ventas.nuevaVenta nv = new Ventas.nuevaVenta(null, true);   
//      nv.setVisible(true);
//       c.setVisible(false);
//       
//         
//    }

}
