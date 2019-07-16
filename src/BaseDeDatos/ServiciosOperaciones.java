package BaseDeDatos;

import Servicios.buscarServicio;
import Servicios.nuevoServicio;
import Servicios.listadoDeServicios;
import Ventas.nuevaVenta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ServiciosOperaciones {

    Conexion con = new Conexion();
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();

    public void busquedaDeServicios(String nombre) {
        listadoDeServicios.m.setRowCount(0);
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT ser.nombre,ser.precio FROM "
                    + "servicios ser WHERE nombre LIKE '%" + nombre + "%'");// + "AND prod.estado = 1");
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
                JOptionPane.showMessageDialog(null, "Servicios no encontrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                this.listadeServicios();
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void listadeServicios() {
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT ser.idServicio, ser.nombre, ser.precio FROM servicios ser ");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                listadoDeServicios.m.addRow(fila);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }
    }

    public void nuevoServicio(String nombre, float precio) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("INSERT into servicios(nombre,precio) values(?,?)");
            pstm.setString(1, nombre);
            pstm.setFloat(2, precio);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Registro Completo", "FELICIDADES", JOptionPane.INFORMATION_MESSAGE);
            con.desconectarBaseDeDatos();
            nuevoServicio.nuevo();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se registro el servicio" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarServicio(String nombre) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("DELETE FROM servicios WHERE nombre = '" + nombre + "'");
//   pstm.setString(1,nombre);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Servicio Eliminado", "Gracias", JOptionPane.INFORMATION_MESSAGE);
            listadoDeServicios.m.removeRow(listadoDeServicios.listaServicios.getSelectedRow());
            con.desconectarBaseDeDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void actualizarServicio(int codigo, String nombre, float precio) {
        try {
            con.conectarBaseDeDatos();
            System.out.println(nombre);
            PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE servicios set nombre = ?, precio= ? WHERE idServicio =" + codigo); // puede haber error, en el ?
            pstm.setString(1, nombre);
            pstm.setFloat(2, precio);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Servicio Actualizado", "Gracias", JOptionPane.INFORMATION_MESSAGE);
            con.desconectarBaseDeDatos();
//   con.desconectarBaseDeDatos();
            listadoDeServicios.m.setRowCount(0);
            listadeServicios();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void cargarServicios() {
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT idServicio, nombre,precio FROM servicios");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                buscarServicio.tabla.addRow(fila);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }
    }

//    public void buscarInsumosdelServicio() {
//         con.conectarBaseDeDatos();
// try{
//     String nombreServicio = nuevaVenta.txtServicio.getText();
//  PreparedStatement pstm = con.getConnection().prepareStatement("SELECT * FROM servicios WHERE nombre="+nombreServicio);
//  ResultSet res = pstm.executeQuery();
//  int idServicio = res.getInt("idServicio");
//  
//  PreparedStatement pstm1 = con.getConnection().prepareStatement("SELECT insumo_id FROM insumo_servicio WHERE servicio_id="+idServicio);
//  ResultSet res1 = pstm1.executeQuery();
//  int idInsumo = res.getInt("idInsumo");
//  
//  PreparedStatement pstm2 = con.getConnection().prepareStatement("SELECT * FROM insumo WHERE idInsumo="+idInsumo);
//  ResultSet res2 = pstm1.executeQuery();
//  
//  String nombreInsumo = res.getString("nombre");
//  
//  
//  ResultSetMetaData rsmd = res2.getMetaData();
//  int cantidadColumnas = rsmd.getColumnCount();
//  while(res.next()){
//  Object[]fila = new Object[cantidadColumnas];
//  for(int i=0; i < cantidadColumnas; i++){
//  fila[i]= res.getObject(i+1);
//  }
//   buscarServicio.tabla.addRow(fila);
//  }
//  con.desconectarBaseDeDatos();
//  }
// catch(Exception ex){
//  JOptionPane.showMessageDialog(null,ex,"ERROR",JOptionPane.ERROR_MESSAGE);
//  System.out.print(ex);
// }
//    }
    public void nuevoServicioInsumo(String nombreS, String nombreI) {
        try {
            con.conectarBaseDeDatos();
            System.out.println("1 " + nombreS + nombreI);

            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT idServicio FROM servicios WHERE nombre='" + nombreS + "'");
            PreparedStatement pstm1 = con.getConnection().prepareStatement("SELECT idInsumo FROM insumo WHERE nombre='" + nombreI + "'");
//            pstm.setString(1, nombre);
//            pstm.setFloat(2, precio);
            ResultSet res = pstm.executeQuery();
            ResultSet res1 = pstm1.executeQuery();
            System.out.println("2 " + nombreS + nombreI);
            if (res.next() && res1.next()) {
                System.out.println("2.1 " + res.getInt("idServicio"));
                int idServicio = res.getInt("idServicio");
                int idInsumo = res1.getInt("idInsumo");
                PreparedStatement pstm2 = con.getConnection().prepareStatement("INSERT into insumo_servicio(cantidad_uso, servicio_id, insumo_id) values(1,?,?)");
                pstm2.setInt(1, idServicio);
                pstm2.setInt(2, idInsumo);
                pstm2.executeUpdate();
                pstm.execute();
                pstm.close();
            }
//            System.out.println("3 " +idServicio);

//            pstm.setString(1, nombre);
//            pstm.setFloat(2, precio);
            JOptionPane.showMessageDialog(null, "Registro Completo", "FELICIDADES", JOptionPane.INFORMATION_MESSAGE);
            con.desconectarBaseDeDatos();
            nuevoServicio.nuevo();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se registro el servicio" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

        public void cargarInsumos_Servicio(int idServicio){
        con.conectarBaseDeDatos();
      try{
          System.out.println("dentro del try. 1");
            PreparedStatement pstm;
            pstm = con.getConnection().prepareStatement("SELECT ins.nombre FROM insumo ins INNER JOIN insumo_servicio iss ON ins.idInsumo=iss.insumo_id WHERE iss.servicio_id=" +idServicio);
            ResultSet res;
            res = pstm.executeQuery();
            if(res.next()){
                System.out.println("dentro del if si el res no es vacio.. 2");
                String nombreInsumo = res.getString("nombre");
                nuevaVenta.txtInsumo.setText(nombreInsumo);
                System.out.println("Dentro del if. mostrando nombre del insumo "+nombreInsumo);
            }
        }
        catch(SQLException e){
        
        }
            con.desconectarBaseDeDatos();
       
    

}
}
