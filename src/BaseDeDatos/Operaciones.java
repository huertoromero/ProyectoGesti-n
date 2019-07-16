package BaseDeDatos;

import Clases.Liquidacion;
import Liquidacion.actualizarConceptos;
import Conceptos.listadosConceptos;
import Empleados.actualizarEmpleado;
import Productos.buscarProducto;
import Clientes.listadoDeClientes;
import Productos.listadoDeProductos;
import Proveedores.listadoDeProveedores;
import Empleados.listadoEmpleados;
import Compras.mostrarLineaCompra;
import Ventas.mostrarLineaVenta;
import Compras.nuevaCompra;
import Liquidacion.nuevaLiquidacion;
import Ventas.nuevaVenta;
import Clientes.nuevoCliente;
import Empleados.nuevoEmpleados;
import Proveedores.nuevoProveedor;
import finalgestion.cambiarContraseña;
import Empleados.listadoGrupoFamiliar;
import Empleados.historialEmpleados;
import Compras.reporteCompras;
import Liquidacion.reporteLiquidacion;
import Ventas.reporteVentas;
import finalgestion.ventanaPrincipal;
import Liquidacion.detalleLiquidacionn;
import Servicios.nuevoServicio;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Operaciones {

    Conexion con = new Conexion();
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();

    public Boolean nuevoEmpleado(int dni, int categoria, String nombre, String apellido, String fechaNac, long cuil, String fechaIngreso, long telefono, String Email, String direccion, int estado) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm3 = con.getConnection().prepareStatement("SELECT dniEmpleado FROM empleados WHERE dniEmpleado = '" + dni + "'");
            ResultSet res = pstm3.executeQuery();
            if (res.next() == true) {
                JOptionPane.showMessageDialog(null, "El Empleado Se encuentra Registrado", "Error", JOptionPane.ERROR_MESSAGE);
                res.close();
                return false;
            } else {
                con.conectarBaseDeDatos();
                PreparedStatement pstm = con.getConnection().prepareStatement("INSERT into empleados(dniEmpleado,idCategoria,nombre,apellido,fechaNacimiento,cuil,fechadeingreso,telefono,Mail,direccion,estado) values(?,?,?,?,?,?,?,?,?,?,?)");
                pstm.setInt(1, dni);
                pstm.setInt(2, categoria);
                pstm.setString(3, nombre);
                pstm.setString(4, apellido);
                pstm.setString(5, fechaNac);
                pstm.setLong(6, cuil);
                pstm.setString(7, fechaIngreso);
                pstm.setLong(8, telefono);
                pstm.setString(9, Email);
                pstm.setString(10, direccion);
                pstm.setInt(11, estado);
                pstm.execute();
                pstm.close();
//  PreparedStatement pstm2 = con.getConnection().prepareStatement("INSERT into direccion(idLocalidad,dniEmpleado,Calle,Numero,piso,departamento) values(?,?,?,?,?,?)");
//  pstm2.setInt(1,idLocalidad);
//  pstm2.setInt(2,dni);
//  pstm2.setString(3,calle);
//  pstm2.setInt(4,numero);
//  pstm2.setInt(5,piso);
//  pstm2.setString(6,departamento);
//  pstm2.execute();
//  pstm2.close();
                con.desconectarBaseDeDatos();
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "EMPLEADO NO REGISTRADO" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public void BuscarEmpleados(int dni) {
        listadoEmpleados.m.setColumnCount(0);
        listadoEmpleados.m.setRowCount(0);
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT emp.dniEmpleado,emp.Nombre,emp.Apellido,emp.cuil,emp.fechadeingreso,emp.telefono,emp.Mail,emp.direccion,cat.Puesto FROM empleados emp, categoria cat WHERE emp.dniEmpleado = '" + dni + "'" + "AND emp.idCategoria = cat.idCategoria AND emp.estado =1"); // puede haber error
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            for (int i = 1; i <= cantidadColumnas; i++) {
                listadoEmpleados.m.addColumn(rsmd.getColumnLabel(i));
            }
            if (res.next() == true) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                listadoEmpleados.m.addRow(fila);
            } else {
                JOptionPane.showMessageDialog(null, "Empleado no encontrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                listadoEmpleados.m.setColumnCount(0);
                listadoEmpleados.m.setRowCount(0);
                listadoEmpleados();
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void verificarDni(boolean resultado, int dni) {
        try {
//  resultado =false;
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT cli.dniCliente FROM clientes cli WHERE cli.dniCliente = '" + dni + "'"); // puede haber error
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            for (int i = 1; i <= cantidadColumnas; i++) {
                listadoEmpleados.m.addColumn(rsmd.getColumnLabel(i));
            }
            if (res.next() == true) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                listadoEmpleados.m.addRow(fila);
                resultado = true;
                JOptionPane.showMessageDialog(null, "El DNI YA SE ENCUENTRA EN USO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
//  else{
////   JOptionPane.showMessageDialog(null,"Empleado no encontrado" ,"ERROR",JOptionPane.ERROR_MESSAGE);
//   listadoEmpleados.m.setColumnCount(0);
//   listadoEmpleados.m.setRowCount(0);
//   listadoEmpleados();
//  }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void verificarDniE(boolean resultado, int dni) {
        try {
//  resultado =false;
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT emp.dniEmpleado FROM empleados emp WHERE emp.dniEmpleado = '" + dni + "'"); // puede haber error
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            for (int i = 1; i <= cantidadColumnas; i++) {
                listadoEmpleados.m.addColumn(rsmd.getColumnLabel(i));
            }
            if (res.next() == true) {

                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                listadoEmpleados.m.addRow(fila);
                resultado = true;
                JOptionPane.showMessageDialog(null, "El DNI YA SE ENCUENTRA EN USO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
//  else{
////   JOptionPane.showMessageDialog(null,"Empleado no encontrado" ,"ERROR",JOptionPane.ERROR_MESSAGE);
//   listadoEmpleados.m.setColumnCount(0);
//   listadoEmpleados.m.setRowCount(0);
//   listadoEmpleados();
//  }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void verificarDniF(boolean resultado, int dni) {
        try {
//  resultado =false;
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT gf.dni FROM grupofamiliar gf WHERE gf.dni = '" + dni + "'"); // puede haber error
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            for (int i = 1; i <= cantidadColumnas; i++) {
                listadoEmpleados.m.addColumn(rsmd.getColumnLabel(i));
            }
            if (res.next() == true) {

                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                listadoEmpleados.m.addRow(fila);
                resultado = true;
                JOptionPane.showMessageDialog(null, "El DNI YA SE ENCUENTRA EN USO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
//  else{
////   JOptionPane.showMessageDialog(null,"Empleado no encontrado" ,"ERROR",JOptionPane.ERROR_MESSAGE);
//   listadoEmpleados.m.setColumnCount(0);
//   listadoEmpleados.m.setRowCount(0);
//   listadoEmpleados();
//  }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }

    }

//public void cargarLocalidades(int tipo) {
// try {
// con.conectarBaseDeDatos();
// PreparedStatement pstm = con.getConnection().prepareStatement("SELECT Localidad  FROM localidad");
// ResultSet res = pstm.executeQuery();
// while (res.next()) {
//  modeloCombo.addElement(res.getObject("Localidad"));
// }
// if(tipo==1){
//  nuevoEmpleados.comboLocalidad.setModel(modeloCombo);
// }
// if(tipo==2){
//  nuevoCliente.comboLocalidad.setModel(modeloCombo);
// }
// if(tipo==3){
//  nuevoProveedor.comboLocalidad.setModel(modeloCombo);
// }
// if(tipo==4){
//  actualizarEmpleado.comboLocalidad.setModel(modeloCombo);
// }
// if(tipo==5){
//  actualizarProveedor.comboLocalidad.setModel(modeloCombo);
// }
// res.close();
// con.desconectarBaseDeDatos();
// }
//catch (SQLException ex) {
// System.out.print(ex);
//}
//}
    public boolean NuevoUsuario(int dni, String Usuario, String Contraseña, int menuCliente, int menuEmpleados, int menuProveedor, int menuSalario, int menuServicio, int menuVenta, int menuCompra, int menuInsumo) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("INSERT into Usuario(dniEmpleado,Usuario,contrasenia,MenuCliente,MenuEmpleados,MenuProveedores,MenuSalarios,MenuServicio,MenuCompra,MenuVenta, MenuInsumo) values(?,?,?,?,?,?,?,?,?,?,?)");
            pstm.setInt(1, dni);
            pstm.setString(2, Usuario);
            pstm.setString(3, Contraseña);
            pstm.setInt(4, menuCliente);
            pstm.setInt(5, menuEmpleados);
            pstm.setInt(6, menuProveedor);
            pstm.setInt(7, menuSalario);
            pstm.setInt(8, menuServicio);
            pstm.setInt(9, menuCompra);
            pstm.setInt(10, menuVenta);
            pstm.setInt(11, menuInsumo);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Empleado Registrado", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            listadoEmpleados();
            con.desconectarBaseDeDatos();
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Empleado No Registrado: " + ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public void listadoEmpleados() { // puede haber error
        con.conectarBaseDeDatos();
        listadoEmpleados.m.setRowCount(0);
        listadoEmpleados.m.setColumnCount(0);
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT emp.dniEmpleado,emp.Nombre,emp.Apellido,emp.telefono,emp.Mail,emp.direccion, cat.Puesto FROM empleados emp, categoria cat WHERE  emp.idCategoria=cat.idCategoria AND emp.estado =1"); // puede haber error // emp.dniEmpleado = cat.dniempleado  AND emp.idCategoria = cat.idCategoria AND
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            for (int i = 1; i <= cantidadColumnas; i++) {
                listadoEmpleados.m.addColumn(rsmd.getColumnLabel(i));
            }
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                listadoEmpleados.m.addRow(fila);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void eliminarEmpleado(int dni, String fechaDeBaja, int estado) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE empleados set Estado = ?,fechaDeBaja = ?  WHERE dniEmpleado = '" + dni + "'");
            pstm.setInt(1, estado);
            pstm.setString(2, fechaDeBaja);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Empleado Eliminado", "Gracias", JOptionPane.INFORMATION_MESSAGE);
            listadoEmpleados.m.removeRow(listadoEmpleados.listadoEmpleados.getSelectedRow());
            con.desconectarBaseDeDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el Empleado " + e.getMessage());
        }
    }

    public void cargarCategoriaEmpleados(int numero) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT Puesto,SalarioBasico FROM categoria");
            ResultSet res = pstm.executeQuery();
            System.out.println("holaaaaaa");

            while (res.next()) {
                modeloCombo.addElement(res.getObject("Puesto"));
            }
            res.close();
            if (numero == 1) {
                nuevoEmpleados.comboCategoria.setModel(modeloCombo);    // dependendiendo de que ventana se llame a la funcion, el nro del parametro cambia.
            }
            if (numero == 2) {
                actualizarEmpleado.comboCategoria.setModel(modeloCombo);
            }
            if (numero == 3) {
                nuevaLiquidacion.comboCategoria.setModel(modeloCombo);
            }
            if (numero == 4) {
                listadosConceptos.comboCategoria.setModel(modeloCombo);
            } else {
            }
            con.desconectarBaseDeDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en Cargar Categorias" + e.getMessage());
        }
    }

    public int logeo(String usuario, String contraseña) {
        int encontrado = 0;
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT us.*,emp.Nombre,emp.Apellido, emp.DniEmpleado, cat.Puesto FROM usuario us, empleados emp,categoria cat WHERE "
                    + "us.Usuario = '" + usuario + "'" + "AND us.contrasenia = '" + contraseña + "' "
                    + "AND us.dniEmpleado = emp.dniEmpleado AND emp.idCategoria = cat.idCategoria AND emp.Estado = '1'");
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                JOptionPane.showMessageDialog(null, "BIENVENIDO!", "", JOptionPane.INFORMATION_MESSAGE);
                ventanaPrincipal.lblEmpleado.setText(res.getString("Nombre").toUpperCase() + " " + res.getString("Apellido").toUpperCase());
                ventanaPrincipal.lblDniEmpleado.setText(String.valueOf(res.getInt("emp.DniEmpleado")));
                ventanaPrincipal.lblUsuario.setText(String.valueOf(res.getString("cat.Puesto")));
                ventanaPrincipal.menuIniciarSesion.setEnabled(false);
                ventanaPrincipal.menuCerrarSesion.setEnabled(true);
                ventanaPrincipal.menuCambiarUsuario.setEnabled(true);
                ventanaPrincipal.lblEmp.setVisible(true);
                ventanaPrincipal.lblEmpleado.setVisible(true);
                ventanaPrincipal.lblUsuario.setVisible(true);
                ventanaPrincipal.lblEmp1.setVisible(true);

                if (res.getInt("us.MenuCliente") == 1) {
                    ventanaPrincipal.menuClientes.setVisible(true);
                }
                if (res.getInt("us.MenuServicio") == 1) {
                    ventanaPrincipal.menuServicios.setVisible(true);
                }
                if (res.getInt("us.MenuEmpleados") == 1) {
                    ventanaPrincipal.menuEmpleados.setVisible(true);
                }
                if (res.getInt("us.MenuProveedores") == 1) {
                    ventanaPrincipal.menuProveedores.setVisible(true);
                }
                if (res.getInt("us.MenuSalarios") == 1) {
                    ventanaPrincipal.menuSalarios.setVisible(true);
                }
                if (res.getInt("us.MenuInsumo") == 1) {
                    ventanaPrincipal.menuInsumo.setVisible(true);
                }
                if (res.getInt("us.MenuCompra") == 1) {
                    ventanaPrincipal.menuCompras.setVisible(true);
                }
                if (res.getInt("us.MenuVenta") == 1) {
                    ventanaPrincipal.menuVentas.setVisible(true);
                }
                encontrado = 1;
            } else {
                encontrado = 0;
                JOptionPane.// <editor-fold defaultstate="collapsed" desc="comment">
                        showMessageDialog// </editor-fold>
                        (null, "USUARIO O CONTRASEÑA INCORRECTA", "Error", JOptionPane.ERROR_MESSAGE);
            }
            con.desconectarBaseDeDatos();
            res.close();
        } catch (SQLException ex) {
            System.out.print(ex);
        }
        return encontrado;
    }

    public void actualizarUsuario(String Usuario, String Contraseña, String NuevoUsuario, String NuevaContraseña, int dni) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT us.*,emp.Nombre,emp.Apellido, emp.DniEmpleado FROM usuario us, empleados emp WHERE"
                    + " us.Usuario = '" + Usuario + "'" + "AND us.contrasenia = '" + Contraseña + "' "
                    + "AND us.dniEmpleado = emp.dniEmpleado");
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                PreparedStatement pstm2 = con.getConnection().prepareStatement("UPDATE usuario set usuario= ?,contrasenia = ? WHERE dniEmpleado = '" + dni + "'");
                pstm2.setString(1, NuevoUsuario);
                pstm2.setString(2, NuevaContraseña);
                pstm2.execute();
                pstm2.close();
                JOptionPane.showMessageDialog(null, "Datos de Autentificacion Actualizados", "ACTUALIZADO", JOptionPane.INFORMATION_MESSAGE);
                cambiarContraseña.nuevo();
                con.desconectarBaseDeDatos();
            } else {
                JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTA", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error:" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actualizarEmpleados(int dni, String nombre, String apellido, long telefono, String Email, String direccion, int categoria) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE empleados set Nombre = ?,Apellido = ?,telefono = ?,Mail = ?,direccion = ? ,idCategoria= ? WHERE dniEmpleado = '" + dni + "'");
            pstm.setString(1, nombre);
            pstm.setString(2, apellido);
            pstm.setLong(3, telefono);
            pstm.setString(4, Email);
            pstm.setString(5, direccion);
            pstm.setInt(6, categoria);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Empleado Actualizado ", "ACTUALIZADO", JOptionPane.INFORMATION_MESSAGE);
            con.desconectarBaseDeDatos();
            listadoEmpleados.m.setColumnCount(0);
            listadoEmpleados.m.setRowCount(0);
            listadoEmpleados(); // puede haber error
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }
    }

    public void nuevoCliente(int dni, String apellido, String nombre, long telefono, String mail, String fecha, int estado, String direccion) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm3 = con.getConnection().prepareStatement("SELECT Estado FROM clientes WHERE dniCliente = '" + dni + "'");
            ResultSet res = pstm3.executeQuery();
            if (res.next() == true) {
                if (res.getInt("Estado") == 0) {
                    int estados = 1;
                    PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE clientes set estado = ? WHERE dniCliente = '" + dni + "'");
                    pstm.setInt(1, estados);
                    pstm.execute();
                    pstm.close();
                    JOptionPane.showMessageDialog(null, "El Cliente a sido dado de Alta", "Alta", JOptionPane.INFORMATION_MESSAGE);
                    listadoDeClientes.m.setRowCount(0);
                    listadodeClientes();
                    nuevoCliente.nuevo();
                } else {
                    JOptionPane.showMessageDialog(null, "El Numero de Dni se encuentra en uso por otro cliente", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                PreparedStatement pstm = con.getConnection().prepareStatement("INSERT into clientes(dniCliente,Apellido,Nombre,Telefono,EMail,FechaDeAlta,Estado,direccion) values(?,?,?,?,?,?,?,?)");
                pstm.setInt(1, dni);
                pstm.setString(2, apellido);
                pstm.setString(3, nombre);
                pstm.setLong(4, telefono);
                pstm.setString(5, mail);
                pstm.setString(6, fecha);
                pstm.setInt(7, estado);
                pstm.setString(8, direccion);
                pstm.execute();
                pstm.close();
//   PreparedStatement pstm2 = con.getConnection().prepareStatement("INSERT into direccion(idLocalidad,dniCliente,Calle,Numero,piso,departamento) values(?,?,?,?,?,?)");
//   pstm2.setInt(1,descripcion);
//   pstm2.setInt(2,dni);
//   pstm2.setString(3,calle);
//   pstm2.setInt(4,numero);
//   pstm2.setInt(5,piso);
//   pstm2.setString(6,departamento);
//   pstm2.execute();
//   pstm2.close();
                JOptionPane.showMessageDialog(null, "Registro Completo", "FELICIDADES", JOptionPane.INFORMATION_MESSAGE);
                con.desconectarBaseDeDatos();
                nuevoCliente.nuevo();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se registro el cliente" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void listadodeClientes() {
        con.conectarBaseDeDatos();
        Object[] registro = new String[6];
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement
    ("SELECT cli.dniCliente,cli.Apellido,cli.Nombre,cli.Telefono,cli.Email,cli.direccion FROM clientes cli WHERE  cli.estado = 1");
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                registro[0] = res.getObject("cli.dniCliente").toString();
                registro[1] = res.getObject("cli.Apellido").toString();
                registro[2] = res.getObject("cli.Nombre").toString();
                registro[3] = res.getObject("cli.Telefono").toString();
                registro[4] = res.getObject("cli.Email").toString();
                registro[5] = res.getObject("direccion").toString();
                listadoDeClientes.m.addRow(registro);
            }
            res.close();
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }
    }

    public void buscarClientes(int dni) {
        listadoDeClientes.m.setColumnCount(0);
        listadoDeClientes.m.setRowCount(0);
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT cli.dniCliente,cli.Nombre,cli.Apellido,cli.Telefono,cli.Email,cli.direccion FROM clientes cli WHERE cli.dniCliente = '" + dni + "'");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            for (int i = 1; i <= cantidadColumnas; i++) {
                listadoDeClientes.m.addColumn(rsmd.getColumnLabel(i));
            }
            if (res.next() == true) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                listadoDeClientes.m.addRow(fila);
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                listadoDeClientes.m.setColumnCount(0);
                listadoDeClientes.m.setRowCount(0);
                listadodeClientes();
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void eliminarCliente(int dni, String fechaDeBaja) {
        try {
            con.conectarBaseDeDatos();
            int estado = 0;
            PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE clientes set Estado = ?,fechaDeBaja = ?  WHERE dniCliente = '" + dni + "'");
            pstm.setInt(1, estado);
            pstm.setString(2, fechaDeBaja);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cliente Eliminado", "Gracias", JOptionPane.INFORMATION_MESSAGE);
            listadoDeClientes.m.removeRow(listadoDeClientes.listadoClientes.getSelectedRow());
            con.desconectarBaseDeDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void actualizarClientes(int dni, String nombre, String apellido, long telefono, String mail, String direccion) {
        try {
            con.conectarBaseDeDatos();
//  PreparedStatement pstm3 = con.getConnection().prepareStatement("SELECT * FROM localidad WHERE Localidad = '" + localidad + "'");
//  ResultSet res = pstm3.executeQuery();
//  if(res.next()==true){
//  int idLocalidad = res.getInt("idLocalidad");
            PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE clientes set Nombre = ?,Apellido = ? ,Telefono = ?,Email = ?, direccion=? WHERE dniCliente = ? ");
            pstm.setString(1, nombre);
            pstm.setString(2, apellido);
            pstm.setLong(3, telefono);
            pstm.setString(4, mail);
            pstm.setString(5, direccion);
            pstm.setInt(6, dni);
            pstm.execute();
            pstm.close();
//  PreparedStatement pstm2 = con.getConnection().prepareStatement("UPDATE direccion set idLocalidad = ?,Calle = ?,Numero = ?, piso = ?,departamento = ? WHERE dniCliente = ? ");
//  pstm2.setInt(1,idLocalidad);
//  pstm2.setString(2,calle);
//  pstm2.setInt(3,numero);
//  pstm2.setInt(4,piso);
//  pstm2.setString(5, departamento);
//  pstm2.setInt(6,dni);
//  pstm2.execute();
//  pstm2.close();
            JOptionPane.showMessageDialog(null, "Cliente Actualizado ", "ACTUALIZADO", JOptionPane.INFORMATION_MESSAGE);
            con.desconectarBaseDeDatos();
            listadoDeClientes.m.setRowCount(0);
            listadodeClientes();
//  }
//  else{
//   JOptionPane.showMessageDialog( null, "Localidad No Encontrada","Error", JOptionPane.ERROR_MESSAGE);
//  }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void BuscarCliente(int dni) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT cli.dniCliente,cli.Nombre,cli.Apellido FROM clientes cli WHERE cli.dniCliente = '" + dni + "' AND cli.Estado = 1");
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                nuevaVenta.txtNombre.setText(res.getString("Nombre") + " " + res.getString("Apellido"));
                nuevaVenta.txtServicio.setEditable(true);
                nuevaVenta.txtServicio.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Cliente No Encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    private void controlStock(String Stock, String descripcion) {
        int encontrado = 0;
        if (nuevaVenta.lineaVenta.getRowCount() == 0) {
            encontrado = 1;
        } else {
            for (int i = 0; i < nuevaVenta.m.getRowCount(); i++) {
                String producto = String.valueOf(nuevaVenta.m.getValueAt(i, 0).toString());
                if (producto.equals(descripcion.toString())) {
                    String Cantidad = String.valueOf(Integer.parseInt(Stock) - Integer.parseInt(nuevaVenta.m.getValueAt(i, 2).toString()));
                    System.out.print(Cantidad);
                    encontrado = 1;
                }
            }
        }
        if (encontrado == 0) {
        }
    }

    public void nuevaVenta(int dniEmpleado, String fecha, String hora, int dni, float total, float monto, float vuelto) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("INSERT into ventas(dniEmpleado,dniCliente,Fecha,Hora,Total,Monto,vuelto) values(?,?,?,?,?,?,?)");
            actualizarDisponibilidad();
            pstm.setInt(1, dniEmpleado);
            pstm.setInt(2, dni);
            pstm.setString(3, fecha);
            pstm.setString(4, hora);
            pstm.setFloat(5, total);
            pstm.setFloat(6, monto);
            pstm.setFloat(7, vuelto);
            JOptionPane.showMessageDialog(null, "Venta Registrada ", "ACTUALIZADO", JOptionPane.INFORMATION_MESSAGE);
            pstm.execute();
            pstm.close();
            con.desconectarBaseDeDatos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se registro la Venta" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void nuevaLineaVenta(int dni, String descripcion, float precio, int cantidad, float subTotal) {
        con.conectarBaseDeDatos();
        int idVenta = 0;
        int idProducto = 0;
        int stock = 0;
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("Select max(idVentas) FROM ventas WHERE dniCliente =" + dni);
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                idVenta = res.getInt("max(idVentas)");
            }
            res.close();
            PreparedStatement pstm2 = con.getConnection().prepareStatement("Select IdProducto FROM productos WHERE descripcion LIKE '" + descripcion + "'");
            ResultSet res2 = pstm2.executeQuery();
            if (res2.next() == true) {
                idProducto = res2.getInt("IdProducto");
            }
            res2.close();
            PreparedStatement pstm3 = con.getConnection().prepareStatement("INSERT into lineadeventa(IdProducto,IdVentas,Precio,Cantidad,subTotal) values(?,?,?,?,?)");
            pstm3.setInt(1, idProducto);
            pstm3.setInt(2, idVenta);
            pstm3.setFloat(3, precio);
            pstm3.setInt(4, cantidad);
            pstm3.setFloat(5, subTotal);
            pstm3.execute();
            pstm3.close();
            PreparedStatement pstm4 = con.getConnection().prepareStatement("Select cantidad FROM productos WHERE descripcion LIKE '" + descripcion + "'");
            ResultSet res3 = pstm4.executeQuery();
            if (res3.next() == true) {
                stock = res3.getInt("cantidad") - cantidad;
            }
            res2.close();
            PreparedStatement pstm5 = con.getConnection().prepareStatement("UPDATE productos set cantidad = ? WHERE descripcion LIKE '" + descripcion + "'");
            pstm5.setInt(1, stock);
            pstm5.execute();
            pstm5.close();
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se registro la venta" + ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }
    }

    public void reporteCompleto(String fechadel, String fechaAl) {
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT idVenta,dniCliente,Fecha,Hora,Total FROM ventas WHERE Fecha BETWEEN '" + fechadel + "' AND '" + fechaAl + "'");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                reporteVentas.m.addRow(fila);
            }
            if (reporteVentas.m.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No hay ventas registradas en esas fechas", "ERROR", JOptionPane.ERROR_MESSAGE);
                reporteVentas.btnMostrar.setEnabled(true);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void reporteCompletoVentas() {
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT idVenta,dniCliente,Fecha,Hora,Total FROM ventas");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                reporteVentas.m.addRow(fila);
            }
            if (reporteVentas.m.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No hay ventas registradas en esas fechas", "ERROR", JOptionPane.ERROR_MESSAGE);
                reporteVentas.btnMostrar.setEnabled(true);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void reportePorCliente(int dni, String fechaDel, String fechaAl) {
        reporteVentas.m.setRowCount(0);
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT idVenta,dniCliente,Fecha,Hora,Total FROM ventas WHERE dniCliente = '" + dni + "'  AND Fecha BETWEEN '" + fechaDel + "' AND '" + fechaAl + "'");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                reporteVentas.m.addRow(fila);
            }
            if (reporteVentas.m.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No hay ventas registradas en esas fechas", "ERROR", JOptionPane.ERROR_MESSAGE);
                reporteVentas.btnMostrar.setEnabled(true);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void nuevoProveedor(String razonSocial, long telefono, String email, String fechaAlta, int estado, String direccion, String provincia) { // NO ANDA BIEN
//int idProveedor=0;
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm1 = con.getConnection().prepareStatement("SELECT Estado FROM proveedor WHERE RazonSocial LIKE '" + razonSocial + "'");
            ResultSet res1 = pstm1.executeQuery();
            if (res1.next() == true) {
                if (res1.getInt("Estado") == 0) {
                    int estados = 1;
                    PreparedStatement pstm2 = con.getConnection().prepareStatement("UPDATE proveedor set Estado = ? WHERE RazonSocial LIKE '" + razonSocial + "'");
                    pstm2.setInt(1, estados);
                    pstm2.execute();
                    pstm2.close();
                    JOptionPane.showMessageDialog(null, "El Proveedor a sido dado de Alta", "Alta", JOptionPane.INFORMATION_MESSAGE);
                    listaDeProveedores();
                    nuevoProveedor.nuevo();
                    res1.close();
                } else {
                    JOptionPane.showMessageDialog(null, "El Proveedor ya se encuentra registrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                    res1.close();
                }
            } else {
                PreparedStatement pstm3 = con.getConnection().prepareStatement("INSERT into proveedor(RazonSocial,Telefono,EMail,fechadeAlta,Estado,direccion,provincia) values(?,?,?,?,?,?,?)");
                pstm3.setString(1, razonSocial);
                pstm3.setLong(2, telefono);
                pstm3.setString(3, email);
                pstm3.setString(4, fechaAlta);
                pstm3.setInt(5, estado);
                pstm3.setString(6, direccion);
                pstm3.setString(7, provincia);
                pstm3.execute();
                pstm3.close();
//   PreparedStatement pstm4 = con.getConnection().prepareStatement("Select max(idProveedor) FROM proveedor WHERE RazonSocial LIKE '" + razonSocial + "'");
//   ResultSet res2 = pstm4.executeQuery();
//   if(res2.next()==true){
//    System.out.print(res2.getInt("max(idProveedor)"));
//    idProveedor = res2.getInt("max(idProveedor)");
//    res2.close();
//   }
//   PreparedStatement pstm5 = con.getConnection().prepareStatement("INSERT into direccion(idLocalidad,idProveedor,Calle,Numero,piso,departamento) values(?,?,?,?,?,?)");
//   pstm5.setInt(1,descripcion);
//   pstm5.setInt(2,idProveedor);
//   pstm5.setString(3,calle);
//   pstm5.setInt(4,numero);
//   pstm5.setInt(5,piso);
//   pstm5.setString(6,departamento);
//   pstm5.execute();
//   pstm5.close();
                JOptionPane.showMessageDialog(null, "Registro Completo", "FELICIDADES", JOptionPane.INFORMATION_MESSAGE);
                con.desconectarBaseDeDatos();
                nuevoProveedor.nuevo();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se registro el Proveedor" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(e);
        }
    }

    public void BuscarProveedores(String razonSocial) {
        listadoDeProveedores.m.setColumnCount(0);
        listadoDeProveedores.m.setRowCount(0);
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT pro.RazonSocial,pro.Telefono,pro.EMail,pro.fechadeAlta,pro.direccion,pro.provincia FROM proveedor pro WHERE pro.RazonSocial LIKE '" + razonSocial + "'");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            for (int i = 1; i <= cantidadColumnas; i++) {
                listadoDeProveedores.m.addColumn(rsmd.getColumnLabel(i));
            }
            if (res.next() == true) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                listadoDeProveedores.m.addRow(fila);
            } else {
                JOptionPane.showMessageDialog(null, "Proveedor no encontrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                listadoDeProveedores.m.setColumnCount(0);
                listadoDeProveedores.m.setRowCount(0);
                listaDeProveedores();
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void listaDeProveedores() {
        listadoDeProveedores.m.setColumnCount(0);
        listadoDeProveedores.m.setRowCount(0);
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT pro.RazonSocial,pro.Telefono,pro.EMail,pro.fechadeAlta,pro.direccion,pro.provincia FROM proveedor pro WHERE  pro.Estado = 1");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            for (int i = 1; i <= cantidadColumnas; i++) {
                listadoDeProveedores.m.addColumn(rsmd.getColumnLabel(i));
            }
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                listadoDeProveedores.m.addRow(fila);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }
    }

    public void eliminarProveedor(String razonSocial, int estado, String fechaBaja) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE proveedor set Estado = ?,fechaDeBaja = ?  WHERE RazonSocial = '" + razonSocial + "'");
            pstm.setInt(1, estado);
            pstm.setString(2, fechaBaja);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cliente Eliminado", "Gracias", JOptionPane.INFORMATION_MESSAGE);
            listadoDeProveedores.m.removeRow(listadoDeProveedores.listadoProveedores.getSelectedRow());
            con.desconectarBaseDeDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void actualizarProveedor(String razonSocial, long telefono, String email, String direccion, String provincia) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm4 = con.getConnection().prepareStatement("SELECT idProveedor FROM proveedor WHERE RazonSocial = '" + razonSocial + "'");
            ResultSet res = pstm4.executeQuery();
            if (res.next() == true) {
                int idProveedor = res.getInt("idProveedor");
                PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE proveedor set RazonSocial = ?,Telefono = ?,Email = ?,direccion=?,provincia=? WHERE idProveedor = ?"); // puede haber error en dni where?
                pstm.setString(1, razonSocial);
                pstm.setLong(2, telefono);
                pstm.setString(3, email);
                pstm.setString(4, direccion);
                pstm.setString(5, provincia);
                pstm.setInt(6, idProveedor);   // puede haber error aca..
                pstm.execute();
                pstm.close();
//  PreparedStatement pstm2 = con.getConnection().prepareStatement("UPDATE direccion set idLocalidad = ?,Calle = ?,Numero = ?, piso = ?,departamento = ? WHERE idProveedor = ?");
//  pstm2.setInt(1,localidad);
//  pstm2.setString(2,calle);
//  pstm2.setInt(3,numero);
//  pstm2.setInt(4,piso);
//  pstm2.setString(5, departamento);
//  pstm2.setInt(6,idProveedor);
//  pstm2.execute();
//  pstm2.close();
                JOptionPane.showMessageDialog(null, "Proveedor Actualizado ", "ACTUALIZADO", JOptionPane.INFORMATION_MESSAGE);
                con.desconectarBaseDeDatos();
                listadoDeProveedores.m.setColumnCount(0);
                listadoDeProveedores.m.setRowCount(0);
                listaDeProveedores();
            } else {
                JOptionPane.showMessageDialog(null, "No se Pudo Actualizar al Proveedor", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void cargarProveedores(int tipo) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT RazonSocial  FROM proveedor WHERE Estado =1");
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                modeloCombo.addElement(res.getObject("RazonSocial"));
            }
            res.close();
            if (tipo == 1) {
                nuevaCompra.comboProveedor.setModel(modeloCombo);
            }
            if (tipo == 2) {
//  actualizarProducto.comboProveedor.setModel(modeloCombo); // hasta que vea la parte de proveedores
            }
            if (tipo == 3) {
                reporteCompras.comboProveedor.setModel(modeloCombo);
            }
            con.desconectarBaseDeDatos();
        } catch (SQLException ex) {
            System.out.print(ex);
        }
    }

    public void nuevaCompra(int idProveedor, String fecha, String hora, float total, float vuelto) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("INSERT into compra(idProveedor,Fecha,Hora,Total) values(?,?,?,?)");
            pstm.setInt(1, idProveedor);
            pstm.setString(2, fecha);
            pstm.setString(3, hora);
            pstm.setFloat(4, total);
            JOptionPane.showMessageDialog(null, "Compra Registrada ", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            pstm.execute();
            pstm.close();
            con.desconectarBaseDeDatos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se registro la Compra" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void nuevaLineaCompra(int proveedor, String producto, float precioCompra, float precioVenta, int cantidad, float subTotal, String fecha) {
        con.conectarBaseDeDatos();
        int idCompra = 0;
        int idProducto = 0;
        int estado = 1;
        int stock = 0;
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT max(idCompra) FROM compra WHERE idProveedor ='" + proveedor + "'");
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                idCompra = res.getInt("max(idCompra)");
                res.close();

                PreparedStatement pstm2 = con.getConnection().prepareStatement("SELECT idProducto,cantidad FROM productos WHERE descripcion LIKE '" + producto + "'");
                ResultSet res2 = pstm2.executeQuery();
                if (res2.next() == true) {
                    idProducto = res2.getInt("idProducto");
                    stock = res2.getInt("cantidad") + cantidad;
                    res2.close();

                    PreparedStatement pstm3 = con.getConnection().prepareStatement("INSERT into lineadeCompra(IdProducto,IdCompra,Precio,Cantidad,subTotal) values(?,?,?,?,?)");
                    pstm3.setInt(1, idProducto);
                    pstm3.setInt(2, idCompra);
                    pstm3.setFloat(3, precioCompra);
                    pstm3.setInt(4, cantidad);
                    pstm3.setFloat(5, subTotal);
                    pstm3.execute();
                    pstm3.close();

                    PreparedStatement pstm5 = con.getConnection().prepareStatement("UPDATE productos set cantidad = ?,estado =?,PrecioVenta = ? WHERE descripcion LIKE '" + producto + "'");
                    pstm5.setInt(1, stock);
                    pstm5.setInt(2, estado);
                    pstm5.setFloat(3, precioVenta);
                    pstm5.execute();
                    pstm5.close();
                    con.desconectarBaseDeDatos();
                } else {

                    PreparedStatement pstm6 = con.getConnection().prepareStatement("INSERT into productos(descripcion,cantidad,precioVenta,estado,preciocompra,fechaAlta) values(?,?,?,?,?,?)");

                    pstm6.setString(1, producto);
                    pstm6.setInt(2, cantidad);
                    pstm6.setFloat(3, precioVenta);
                    pstm6.setInt(4, estado);
                    pstm6.setFloat(5, precioCompra);
                    pstm6.setString(6, fecha);
                    pstm6.execute();
                    pstm6.close();

                    PreparedStatement pstm8 = con.getConnection().prepareStatement("Select max(idProducto) FROM productos WHERE descripcion LIKE'" + producto + "'");
                    ResultSet res6 = pstm8.executeQuery();
                    if (res6.next() == true) {
                        idProducto = res6.getInt("max(idProducto)");
                        res6.close();

                        PreparedStatement pstm3 = con.getConnection().prepareStatement("INSERT into lineadeCompra(IdProducto,IdCompra,Precio,Cantidad,subTotal) values(?,?,?,?,?)");
                        pstm3.setInt(1, idProducto);
                        pstm3.setInt(2, idCompra);
                        pstm3.setFloat(3, precioCompra);
                        pstm3.setInt(4, cantidad);
                        pstm3.setFloat(5, subTotal);
                        pstm3.execute();
                        pstm3.close();
                        con.desconectarBaseDeDatos();
                    }
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se registro la Compra " + ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }
    }

    public void nuevoProducto(String descripcion, int cantidad, float precioVenta, float preciocompra, String fechaDeAlta, int estado) {
        try {
            con.conectarBaseDeDatos();
//  PreparedStatement pstm3 = con.getConnection().prepareStatement("SELECT Estado FROM productos WHERE IdProducto = ?"); // puede haber error
//  ResultSet res = pstm3.executeQuery();
//  if(res.next()==true){
//   if(res.getInt("Estado")==0){
//    int estados = 1;
//    PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE productos set estado = ? WHERE IdProducto = ?"); // puede haber error
//    pstm.setInt(1,estados);
//    pstm.execute();
//    pstm.close();
//    JOptionPane.showMessageDialog(null,"El Producto a sido dado de Alta","Alta",JOptionPane.INFORMATION_MESSAGE);
//    listadoDeClientes.m.setRowCount(0);
//    listadodeClientes();
//    nuevoCliente.nuevo();
//   }
//   else{
//    JOptionPane.showMessageDialog(null,"El Numero de ID se encuentra registrado por otro producto","ERROR",JOptionPane.ERROR_MESSAGE);
//   }
//  }
//  else{
            PreparedStatement pstm = con.getConnection().prepareStatement("INSERT into productos(descripcion,cantidad,precioVenta,preciocompra,Estado,fechaAlta) values(?,?,?,?,?,?)");
            pstm.setString(1, descripcion);
            pstm.setInt(2, cantidad);
            pstm.setFloat(3, precioVenta);
            pstm.setFloat(4, preciocompra);
            pstm.setInt(5, estado);
            pstm.setString(6, fechaDeAlta);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Registro Completo", "FELICIDADES", JOptionPane.INFORMATION_MESSAGE);
            con.desconectarBaseDeDatos();
            nuevoCliente.nuevo();
//  }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se registro el producto" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void buscarProducto(String descripcion) {
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT precioVenta, cantidad FROM productos WHERE descripcion LIKE '" + descripcion.toString() + "'");
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                nuevaVenta.txtPrecio.setText(res.getString("precioVenta"));
                controlStock(res.getString("cantidad"), descripcion.toString());
                nuevaVenta.btnAceptar.setEnabled(true);
                nuevaVenta.btnCambiar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "PRODUCTO NO ENCONTRADO", "Error", JOptionPane.ERROR_MESSAGE);
            }
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

//public void cargarCategoriaProductos(int tipo) {
//try{
// con.conectarBaseDeDatos();
// PreparedStatement pstm = con.getConnection().prepareStatement("SELECT Descripcion  FROM categoriaproductos");
// ResultSet res = pstm.executeQuery();
// while (res.next()) {
//  modeloCombo.addElement(res.getObject("Descripcion"));
// }
// res.close();
// if(tipo==1){
// nuevaCompra.comboCategoria.setModel(modeloCombo);
// }
// if(tipo==2){
//  actualizarProducto.comboCategoria.setModel(modeloCombo);
// }
// con.desconectarBaseDeDatos();
// }
// catch (SQLException ex) {
//  System.out.print(ex);
// }
//}
    public void listadeProductos() {
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT prod.descripcion,prod.Cantidad,prod.PrecioVenta FROM productos prod WHERE prod.estado = 1");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                listadoDeProductos.m.addRow(fila);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }
    }

    public void eliminarProducto(String descripcion, String fechadeBaja, int estado) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE productos set Estado = ?,fechaDeBaja = ?  WHERE descripcion = '" + descripcion + "'");
            pstm.setInt(1, estado);
            pstm.setString(2, fechadeBaja);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Producto Eliminado", "Gracias", JOptionPane.INFORMATION_MESSAGE);
            listadoDeProductos.m.removeRow(listadoDeProductos.listaProductos.getSelectedRow());
            con.desconectarBaseDeDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void busquedaDeProductos(String descripcion) {
        listadoDeProductos.m.setRowCount(0);
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT prod.descripcion,prod.Cantidad,prod.PrecioVenta FROM "
                    + "productos prod WHERE estado =1 AND descripcion LIKE '%" + descripcion + "%'");// + "AND prod.estado = 1");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            if (res.next() == true) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                listadoDeProductos.m.addRow(fila);
            } else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                this.listadeProductos();
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void actualizarProducto(String descripcion, float precioVenta, int cantidad) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE productos set PrecioVenta = ?, cantidad= ? WHERE descripcion = ?"); // puede haber error, en el ?
            pstm.setFloat(1, precioVenta);
            pstm.setInt(2, cantidad);
            pstm.setString(3, descripcion);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Producto Actualizado", "Gracias", JOptionPane.INFORMATION_MESSAGE);
            con.desconectarBaseDeDatos();
            con.desconectarBaseDeDatos();
            listadoDeProductos.m.setRowCount(0);
            listadeProductos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void reporteCompletoCompras(String fechadel, String fechaAl) {
        con.conectarBaseDeDatos();
        reporteCompras.m.setRowCount(0);
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT com.idCompra,com.dniEmpleado,pro.RazonSocial,com.Fecha,com.Hora,com.Total FROM compra com, proveedor pro WHERE com.idProveedor = pro.idProveedor AND com.Fecha BETWEEN '" + fechadel + "' AND'" + fechaAl + "'");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                reporteCompras.m.addRow(fila);
            }
            if (reporteCompras.m.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No hay compras registradas en esas fechas", "ERROR", JOptionPane.ERROR_MESSAGE);
                reporteCompras.btnMostrar.setEnabled(false);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void reporteCompras() {
        con.conectarBaseDeDatos();
        reporteCompras.m.setRowCount(0);
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT com.idCompra,pro.RazonSocial,com.Fecha,com.Hora,com.Total FROM compra com, proveedor pro WHERE com.idProveedor = pro.idProveedor");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                reporteCompras.m.addRow(fila);
            }
            if (reporteCompras.m.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No hay compras registradas en esas fechas", "ERROR", JOptionPane.ERROR_MESSAGE);
                reporteCompras.btnMostrar.setEnabled(false);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void reporteCompletoComprasProveedor(int idProveedor, String fechadel, String fechaAl) {
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT com.idCompra,prov.RazonSocial,com.Fecha,com.Hora,com.Total FROM compra com,proveedor prov WHERE com.idProveedor = prov.idProveedor AND prov.idProveedor = '" + idProveedor + "' AND com.fecha BETWEEN '" + fechadel + "' AND '" + fechaAl + "'");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                reporteCompras.m.addRow(fila);
            }
            if (reporteCompras.m.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No hay compras registradas en esas fechas", "ERROR", JOptionPane.ERROR_MESSAGE);
                reporteCompras.btnMostrar.setEnabled(false);
            } else {
                reporteCompras.btnMostrar.setEnabled(false);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void reporteProveedor(int idProveedor) {
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT com.idCompra,com.dniEmpleado,prov.RazonSocial,com.Fecha,com.Hora,com.Total FROM compra com,proveedor prov WHERE prov.idProveedor ='" + idProveedor + "'AND com.idProveedor = prov.idProveedor");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                reporteCompras.m.addRow(fila);
            }
            if (reporteCompras.m.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No hay compras registradas en esas fechas", "ERROR", JOptionPane.ERROR_MESSAGE);
                reporteCompras.btnMostrar.setEnabled(false);
            } else {
                reporteCompras.btnMostrar.setEnabled(false);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void cargarEmpleados(int categoria) {

        try {
            con.conectarBaseDeDatos();
            nuevaLiquidacion.comboEmpleados.setEnabled(true);
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT dniEmpleado FROM empleados WHERE Estado =1 AND idCategoria = '" + categoria + "'");
            ResultSet res = pstm.executeQuery();
            nuevaLiquidacion.comboEmpleados.removeAllItems();
            while (res.next()) {
                nuevaLiquidacion.comboEmpleados.addItem(res.getInt("dniEmpleado"));
            }
            res.close();
            con.desconectarBaseDeDatos();
        } catch (SQLException ex) {
            System.out.print(ex);
        }
    }

    public void cargarEmpleadosLiquidacion(String periodo, int dni) {
        try {

            Liquidacion liq = new Liquidacion();
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT emp.*,liq.*,cat.SalarioBasico FROM empleados emp, liquidacion liq, categoria cat WHERE emp.dniEmpleado ='" + dni + "' AND emp.idCategoria = cat.idCategoria");
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                System.out.println("dentro del if.");
                if (res.getString("liq.PeriodoDeLiquidacion").equals(periodo) && res.getInt("liq.dniEmpleado") == dni) {
                    JOptionPane.showMessageDialog(null, "El Empleado ya posse una Liquidacion en este Periodo", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    System.out.println("Dentr del else del if..");

                    liq.cargarSalario(res.getFloat("cat.SalarioBasico"));
                    nuevaLiquidacion.calcularSubTotal();
                    nuevaLiquidacion.calcularDescuento();
                    nuevaLiquidacion.activar();
                    nuevaLiquidacion.btnAceptar.setEnabled(false);
                    nuevaLiquidacion.btnAgregar.setEnabled(true);
                }
            }
            res.close();
            con.desconectarBaseDeDatos();
        } catch (SQLException ex) {
            System.out.print(ex);
        }
    }

    public void busquedaProductosVenta(String descripcion) {
        buscarProducto.tabla.setRowCount(0);
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT descripcion,cantidad,precioVenta FROM productos WHERE estado =1 AND descripcion LIKE '%" + descripcion + "%'");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                buscarProducto.tabla.addRow(fila);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }
    }

    public float obtenerJubilacion() {
        con.conectarBaseDeDatos();
        float jubilacion = 0;
        boolean porDefecto = false;
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT MontoVariable, porDefecto FROM conceptos WHERE Descripcion = 'Jubilacion'");
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                porDefecto = res.getBoolean("porDefecto");
                jubilacion = res.getFloat("MontoVariable");
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }
        if(porDefecto==false){
        jubilacion=0;
        }
        return jubilacion;
    }

    public float obtenerLey() {
        con.conectarBaseDeDatos();
        float ley = 0;
        boolean porDefecto = false;
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT MontoVariable, porDefecto FROM conceptos WHERE Descripcion = 'Ley 23660'");
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                porDefecto = res.getBoolean("porDefecto");
                ley = res.getFloat("MontoVariable");
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
                if(porDefecto==false){
        ley=0;
        }
        return ley;
    }
    public float obtenerAguinaldoJunio() {
        con.conectarBaseDeDatos();
        float aj = 0;
        boolean porDefecto = false;
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT MontoVariable, porDefecto FROM conceptos WHERE Descripcion = 'salario complementario junio'");
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                porDefecto = res.getBoolean("porDefecto");
                aj = res.getFloat("MontoVariable");
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
                if(porDefecto==false){
        aj=0;
        }
        return aj;
    }
public float obtenerAguinaldoDiciembre() {
        con.conectarBaseDeDatos();
        float ad = 0;
        boolean porDefecto = false;
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT MontoVariable, porDefecto FROM conceptos WHERE Descripcion = 'Salario Complementario Diciembre'");
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                porDefecto = res.getBoolean("porDefecto");
                ad = res.getFloat("MontoVariable");
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
                if(porDefecto==false){
        ad=0;
        }
        return ad;
    }
    public float obtenerObraSocial() {
        con.conectarBaseDeDatos();
        float obraSocial = 0;
        
        boolean porDefecto = false;
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT MontoVariable, porDefecto FROM conceptos WHERE Descripcion = 'obra Social'");
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                porDefecto = res.getBoolean("porDefecto");
                obraSocial = res.getFloat("MontoVariable");
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }
               if(porDefecto==false){
        obraSocial=0;
        }
        return obraSocial;
    }

    public float obtenerAporte() {
        con.conectarBaseDeDatos();
        float aporte = 0;
        boolean porDefecto = false;
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT MontoFijo, porDefecto FROM conceptos WHERE Descripcion = 'Aporte Obra Social'");
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                porDefecto=res.getBoolean("porDefecto");
                aporte = res.getFloat("MontoFijo");
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }
       if(porDefecto==false){
        aporte=0;
        }
        return aporte;
    }
    public float obtenerPresentismo() {
        con.conectarBaseDeDatos();
        float presentismo = 0;
        boolean porDefecto = false;
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT MontoFijo, porDefecto FROM conceptos WHERE Descripcion = 'Presentismo'");
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                porDefecto=res.getBoolean("porDefecto");
                presentismo = res.getFloat("MontoFijo");
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }
       if(porDefecto==false){
        presentismo=0;
        }
        return presentismo;
    }

    public float obtenerSindicato() {
        con.conectarBaseDeDatos();
        float sindicato = 0;
        boolean porDefecto = false;
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT MontoVariable, porDefecto FROM conceptos WHERE Descripcion = 'Aporte Sindicato'");
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                porDefecto = res.getBoolean("porDefecto");
                sindicato = res.getFloat("MontoVariable");
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }
          if(porDefecto==false){
        sindicato=0;
        }
        return sindicato;
    }

    public void nuevaLiquidacion(int dni, String fechaDesde, String fechaHasta, float salarioNeto, String periodo, int estado) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("INSERT into liquidacion(dniEmpleado,FechaDesde,FechaHasta,SalarioNeto,PeriodoDeLiquidacion,Estado) values(?,?,?,?,?,?)");
            pstm.setInt(1, dni);
            pstm.setString(2, fechaDesde);
            pstm.setString(3, fechaHasta);
            pstm.setFloat(4, salarioNeto);
            pstm.setString(5, periodo);
            pstm.setInt(6, estado);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Liquidacion Registrada");
            con.desconectarBaseDeDatos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se registro la Liquidacion" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void nuevoDetalle(int dni, String descripcion, float monto, float descuentos, float subTotal) {
        con.conectarBaseDeDatos();
        int idConcepto = 0;
        int idLiquidacion = 0;
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT max(idLiquidacion) FROM liquidacion WHERE dniEmpleado ='" + dni + "'");
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                idLiquidacion = res.getInt("max(idLiquidacion)");
            }
            res.close();
            PreparedStatement pstm2 = con.getConnection().prepareStatement("SELECT idConcepto FROM conceptos WHERE Descripcion LIKE '" + descripcion + "'");
            ResultSet res2 = pstm2.executeQuery();
            if (res2.next() == true) {
                idConcepto = res2.getInt("idConcepto");
            }
            res2.close();
            PreparedStatement pstm3 = con.getConnection().prepareStatement("INSERT into detalleliquidacion(idLiquidacion,idConcepto,Monto,descuentos,subTotal) values(?,?,?,?,?)");
            pstm3.setInt(1, idLiquidacion);
            pstm3.setInt(2, idConcepto);
            pstm3.setFloat(3, monto);
            pstm3.setFloat(4, descuentos);
            pstm3.setFloat(5, subTotal);
            pstm3.execute();
            pstm3.close();
            con.desconectarBaseDeDatos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se registro la Liquidacion" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarLinea(int numeroVenta) {
        mostrarLineaVenta.m.setRowCount(0);
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT ser.nombre, dv.subTotal FROM servicios ser, detalle_venta dv WHERE dv.venta_id ='" + numeroVenta + "' AND dv.servicio_id = ser.idServicio");
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

    public void mostrarLineaCompra(int numeroCompra) {
        mostrarLineaCompra.m.setRowCount(0);
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT pro.descripcion,lc.Cantidad,lc.Precio,lc.subTotal FROM productos pro, lineadecompra lc WHERE lc.idCompra ='" + numeroCompra + "' AND lc.idProducto = pro.idProducto");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                mostrarLineaCompra.m.addRow(fila);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void reporteCompletoCliente(int dni) {
        reporteVentas.m.setRowCount(0);
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT idVenta,dniCliente,Fecha,Hora,Total FROM ventas WHERE dniCliente = '" + dni + "'");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                reporteVentas.m.addRow(fila);
            }
            if (reporteVentas.m.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "El cliente no posee ventas registradas", "ERROR", JOptionPane.ERROR_MESSAGE);
                reporteVentas.btnMostrar.setEnabled(true);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

// public void buscarEmpleado(int dni){
// try{
//  con.conectarBaseDeDatos();
//  PreparedStatement pstm = con.getConnection().prepareStatement("SELECT Nombre,Apellido FROM empleados WHERE dniEmpleado = '"+dni+"'");
//  ResultSet res = pstm.executeQuery();
//  if(res.next()==true){
//   detalleLiquidacionn.txtNombre.setText(res.getString("Nombre") + " " +res.getString("Apellido"));
//  }
//  else{
//   JOptionPane.showMessageDialog( null, "Empleado No Encontrado","Error", JOptionPane.ERROR_MESSAGE);
//  }
//  con.desconectarBaseDeDatos();
// }
// catch(Exception ex){
//  System.out.print(ex);
// }
// }
    public void reporteCompletoLiquidacion(String fechaDesde, String fechaHasta) {
        reporteLiquidacion.m.setRowCount(0);
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT dniEmpleado,FechaDesde,FechaHasta,SalarioNeto,PeriodoDeLiquidacion,idLiquidacion FROM liquidacion WHERE FechaDesde >= '" + fechaDesde + "'AND FechaHasta <= '" + fechaHasta + "'");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                reporteLiquidacion.m.addRow(fila);
            }
            if (reporteLiquidacion.m.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No hay Liquidacioens Registradas", "ERROR", JOptionPane.ERROR_MESSAGE);
                reporteLiquidacion.btnMostrar.setEnabled(true);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void reporteCompletoLiq() {
        reporteLiquidacion.m.setRowCount(0);
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT dniEmpleado,FechaDesde,FechaHasta,SalarioNeto,PeriodoDeLiquidacion,idLiquidacion FROM liquidacion");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                reporteLiquidacion.m.addRow(fila);
            }
            if (reporteLiquidacion.m.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No hay Liquidaciones Registradas", "ERROR", JOptionPane.ERROR_MESSAGE);
                reporteLiquidacion.btnMostrar.setEnabled(true);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void reporteLiquidacionCliente(int dni, String fechaDesde, String fechaHasta) {
        reporteLiquidacion.m.setRowCount(0);
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT dniEmpleado,FechaDesde,FechaHasta,SalarioNeto,PeriodoDeLiquidacion,idLiquidacion FROM liquidacion WHERE dniEmpleado = '" + dni + "' AND FechaDesde >= '" + fechaDesde + "'AND FechaHasta <= '" + fechaHasta + "'");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                reporteLiquidacion.m.addRow(fila);
            }
            if (reporteLiquidacion.m.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No hay Liquidaciones Registradas", "ERROR", JOptionPane.ERROR_MESSAGE);
                reporteLiquidacion.btnMostrar.setEnabled(true);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void reporteTotalEmpleado(int dni) {
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT dniEmpleado,FechaDesde,FechaHasta,SalarioNeto,PeriodoDeLiquidacion,idLiquidacion FROM liquidacion WHERE dniEmpleado = '" + dni + "'");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                reporteLiquidacion.m.addRow(fila);
            }
            if (reporteLiquidacion.m.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No hay Liquidaciones Registradas", "ERROR", JOptionPane.ERROR_MESSAGE);
                reporteLiquidacion.btnMostrar.setEnabled(true);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void cargarSalario(int i) {
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT SalarioBasico FROM categoria WHERE idCategoria = '" + i + "'");
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                listadosConceptos.txtSalario.setText(String.valueOf(res.getInt("SalarioBasico")));
            }
            res.close();
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void cargarConceptos() {
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT MontoVariable FROM conceptos WHERE Descripcion LIKE 'Salario Complementario Junio'");
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                actualizarConceptos.txtAguinaldoDiciembre.setText(String.valueOf(res.getFloat("MontoVariable")));
            }
            res.close();
            PreparedStatement pstm2 = con.getConnection().prepareStatement("SELECT MontoVariable FROM conceptos WHERE Descripcion LIKE 'Salario Complementario Diciembre'");
            ResultSet res2 = pstm2.executeQuery();
            if (res2.next() == true) {
                actualizarConceptos.txtAguinaldoJunio.setText(String.valueOf(res2.getFloat("MontoVariable")));
            }
            res2.close();
            PreparedStatement pstm3 = con.getConnection().prepareStatement("SELECT MontoVariable FROM conceptos WHERE Descripcion LIKE 'obra social'");
            ResultSet res3 = pstm3.executeQuery();
            if (res3.next() == true) {
                actualizarConceptos.txtObra.setText(String.valueOf(res3.getFloat("MontoVariable")));
            }
            res3.close();
            PreparedStatement pstm4 = con.getConnection().prepareStatement("SELECT MontoVariable FROM conceptos WHERE Descripcion LIKE 'Jubilacion'");
            ResultSet res4 = pstm4.executeQuery();
            if (res4.next() == true) {
                actualizarConceptos.txtJubilacion.setText(String.valueOf(res4.getFloat("MontoVariable")));
            }
            res4.close();
            PreparedStatement pstm5 = con.getConnection().prepareStatement("SELECT MontoVariable FROM conceptos WHERE Descripcion LIKE 'Ley 23660'");
            ResultSet res5 = pstm5.executeQuery();
            if (res5.next() == true) {
                actualizarConceptos.txtLey.setText(String.valueOf(res5.getFloat("MontoVariable")));
            }
            res5.close();
            PreparedStatement pstm6 = con.getConnection().prepareStatement("SELECT MontoVariable FROM conceptos WHERE Descripcion LIKE 'Aporte sindicato'");
            ResultSet res6 = pstm6.executeQuery();
            if (res6.next() == true) {
                actualizarConceptos.txtSindicato.setText(String.valueOf(res6.getFloat("MontoVariable")));
            }
            res6.close();
            PreparedStatement pstm7 = con.getConnection().prepareStatement("SELECT MontoFijo FROM conceptos WHERE Descripcion LIKE 'Aporte Obra Social'");
            ResultSet res7 = pstm7.executeQuery();
            if (res7.next() == true) {
                actualizarConceptos.txtAporte.setText(String.valueOf(res7.getFloat("MontoFijo")));
            }
            res7.close();
            PreparedStatement pstm8 = con.getConnection().prepareStatement("SELECT MontoFijo FROM conceptos WHERE Descripcion LIKE 'presentismo'");
            ResultSet res8 = pstm8.executeQuery();
            if (res8.next() == true) {
                actualizarConceptos.txtPresentismo.setText(String.valueOf(res8.getFloat("MontoFijo")));
            }
            res8.close();
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void cargarProductos() {
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT descripcion,cantidad,PrecioVenta FROM productos WHERE estado =1 ORDER BY idProducto");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                buscarProducto.tabla.addRow(fila);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }
    }

    public void actualizarSalario(int categoria, float salario) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE categoria set SalarioBasico = ? WHERE idCategoria = ?");
            pstm.setFloat(1, salario);
            pstm.setInt(2, categoria);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Salario Actualizado", "Gracias", JOptionPane.INFORMATION_MESSAGE);
            con.desconectarBaseDeDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void actualizarConceptos(float salario, int categoria, float scj, float scd, float jubilacion, float ley, float sindicato, float presentismo, float obraSocial, float aporte) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE conceptos set MontoVariable= ? WHERE Descripcion = 'Jubilacion'");
            pstm.setFloat(1, jubilacion);
            pstm.execute();
            pstm.close();
            PreparedStatement pstm2 = con.getConnection().prepareStatement("UPDATE conceptos set MontoVariable= ? WHERE Descripcion = 'obra social'");
            pstm2.setFloat(1, obraSocial);
            pstm2.execute();
            pstm2.close();
            PreparedStatement pstm3 = con.getConnection().prepareStatement("UPDATE conceptos set MontoVariable= ? WHERE Descripcion = 'Salario Complementario Junio'");
            pstm3.setFloat(1, scj);
            pstm3.execute();
            pstm3.close();
            PreparedStatement pstm4 = con.getConnection().prepareStatement("UPDATE conceptos set MontoVariable= ? WHERE Descripcion = 'Salario Complementario Diciembre'");
            pstm4.setFloat(1, scd);
            pstm4.execute();
            pstm4.close();
            PreparedStatement pstm5 = con.getConnection().prepareStatement("UPDATE conceptos set MontoFijo= ? WHERE Descripcion = 'Presentismo'");
            pstm5.setFloat(1, presentismo);
            pstm5.execute();
            pstm5.close();
            PreparedStatement pstm6 = con.getConnection().prepareStatement("UPDATE conceptos set MontoVariable= ? WHERE Descripcion = 'Ley 23660'");
            pstm6.setFloat(1, ley);
            pstm6.execute();
            pstm6.close();
            PreparedStatement pstm7 = con.getConnection().prepareStatement("UPDATE conceptos set MontoFijo= ? WHERE Descripcion = 'Aporte Obra Social'");
            pstm7.setFloat(1, aporte);
            pstm7.execute();
            pstm7.close();
            PreparedStatement pstm8 = con.getConnection().prepareStatement("UPDATE conceptos set MontoVariable= ? WHERE Descripcion = 'Aporte Sindicato'");
            pstm8.setFloat(1, sindicato);
            pstm8.execute();
            pstm8.close();
            PreparedStatement pstm9 = con.getConnection().prepareStatement("UPDATE categoria set SalarioBasico = ? WHERE idCategoria = ?");
            pstm9.setFloat(1, salario);
            pstm9.setInt(2, categoria);
            pstm9.execute();
            pstm9.close();
            JOptionPane.showMessageDialog(null, "Conceptos Actualizado", "Gracias", JOptionPane.INFORMATION_MESSAGE);
            con.desconectarBaseDeDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public int obtenerUltimaVenta(int dni) {
        int idVenta = 0;
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("Select max(idVenta) FROM ventas WHERE dniCliente =" + dni);
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                idVenta = res.getInt("max(idVenta)");
            }
            con.desconectarBaseDeDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return idVenta;
    }

    public void cargarNombre(int dni) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("Select Nombre,Apellido,cuil FROM empleados WHERE dniEmpleado = '" + dni + "'");
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                nuevaLiquidacion.txtNombre.setText(res.getString("Apellido").toUpperCase() + " " + res.getString("Nombre").toUpperCase());
                nuevaLiquidacion.txtCuil.setText(res.getString("Cuil"));
            }
            res.close();
            con.desconectarBaseDeDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void mostrarDetalleLiquidacion(int dni, int numero) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT Nombre,Apellido FROM empleados WHERE dniEmpleado = '" + dni + "'");
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                //  detalleLiquidacionn.txtNombre.setText(res.getString("Apellido").toUpperCase() + " " + res.getString("Nombre").toUpperCase());
            }
            res.close();
            PreparedStatement pstm2 = con.getConnection().prepareStatement("SELECT con.descripcion,liq.Monto,liq.descuentos,liq.subTotal FROM "
                    + "conceptos con, detalleliquidacion liq WHERE "
                    + "liq.idLiquidacion = '" + numero + "' AND liq.idConcepto = con.idConcepto");
            ResultSet res2 = pstm2.executeQuery();
            ResultSetMetaData rsmd = res2.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res2.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res2.getObject(i + 1);
                }
                detalleLiquidacionn.txtMonto.setText(res2.getString("liq.subTotal"));
                detalleLiquidacionn.m.addRow(fila);
            }
            res2.close();
            con.desconectarBaseDeDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public int obtenerLiquidacion(int dni) {
        int idLiquidacion = 0;
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("Select max(idLiquidacion) FROM liquidacion WHERE dniEmpleado =" + dni);
            ResultSet res = pstm.executeQuery();
            if (res.next() == true) {
                idLiquidacion = res.getInt("max(idLiquidacion)");
            }
            con.desconectarBaseDeDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return idLiquidacion;
    }

    public void historialEmpleados() {
        con.conectarBaseDeDatos();
        historialEmpleados.m.setRowCount(0);
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT emp.dniEmpleado,emp.Nombre,emp.Apellido,emp.cuil,emp.fechadeingreso,emp.telefono,emp.Mail,emp.direccion,cat.Puesto"
                    + " FROM empleados emp,categoria cat WHERE  emp.idCategoria = cat.idCategoria AND emp.estado = '0'"); // puede haber error
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                historialEmpleados.m.addRow(fila);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void buscarEmpleadosEliminados(int dni) {
        historialEmpleados.m.setRowCount(0);
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT emp.dniEmpleado,emp.Nombre,emp.Apellido,emp.cuil,emp.fechadeingreso,emp.telefono,emp.Mail,emp.direccion, cat.Puesto "
                    + "FROM empleados emp,categoria cat WHERE emp.dniEmpleado = " + dni + " AND emp.idCategoria = cat.idCategoria AND emp.estado = '0'");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            if (res.next() == true) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                historialEmpleados.m.addRow(fila);
            } else {
                JOptionPane.showMessageDialog(null, "Empleado no encontrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                historialEmpleados.m.setRowCount(0);
                historialEmpleados();
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void altaEmpleado(int estado, int dni) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE empleados set Estado = ? WHERE dniEmpleado = '" + dni + "'");
            pstm.setInt(1, estado);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Empleado Dado de Alta ", "ACTUALIZADO", JOptionPane.INFORMATION_MESSAGE);
            con.desconectarBaseDeDatos();
            historialEmpleados();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }
    }

    public void listaFamiliar() {
// listadoGrupoFamiliar.m.setRowCount(0);
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT gf.dni,gf.Apellido,gf.Nombre,gf.fechaDeNacimiento,gf.parentesco,gf.discapacidad FROM grupofamiliar gf WHERE gf.estado = 1");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            if (res.next() == true) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                listadoGrupoFamiliar.m.addRow(fila);
            } else {
                JOptionPane.showMessageDialog(null, "Empleado no Posee grupo familiar", "ERROR", JOptionPane.ERROR_MESSAGE);
                listadoGrupoFamiliar.m.setRowCount(0);
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }

    public void nuevoGrupoFamiliar(int dniEmpleado, int dni, String nombre, String apellido, String fechaNac, String parentesco, Boolean discapacidad) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("INSERT into grupofamiliar(dniEmpleado,dni,Apellido,Nombre,fechaDeNacimiento,Parentesco,discapacidad) values(?,?,?,?,?,?,?)");
            pstm.setInt(1, dniEmpleado);
            pstm.setInt(2, dni);
            pstm.setString(3, nombre);
            pstm.setString(4, apellido);
            pstm.setString(5, fechaNac);
            pstm.setString(6, parentesco);
            pstm.setBoolean(7, discapacidad);
            pstm.execute();
            pstm.close();
            con.desconectarBaseDeDatos();
        } catch (SQLException e) {
        }
    }

    public void actualizarGrupoFamiliar(int dniEmpleado, int dni, String nombre, String apellido, String fechaNac, String parentesco, Boolean discapacidad) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE grupofamiliar set dni=?,Apellido = ?, Nombre = ?,fechaDeNacimiento = ?,Parentesco = ?,discapacidad = ? WHERE dniEmpleado = '" + dniEmpleado + "'");
            pstm.setInt(1, dni);
            pstm.setString(2, nombre);
            pstm.setString(3, apellido);
            pstm.setString(4, fechaNac);
            pstm.setString(5, parentesco);
            pstm.setBoolean(6, discapacidad);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Familiar Actualizado ", "ACTUALIZADO", JOptionPane.INFORMATION_MESSAGE);
            con.desconectarBaseDeDatos();
//  listadoEmpleados.m.setColumnCount(0);
//  listadoEmpleados.m.setRowCount(0);
            listaFamiliar(); // puede haber error
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }

    }

    public void buscarGrupoFamiliar(int dniEmpleado) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT dni,Apellido,Nombre,fechaDeNacimiento,Parentesco,discapacidad FROM grupofamiliar WHERE dniEmpleado = '" + dniEmpleado + "'"); // puede haber error
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            for (int i = 1; i <= cantidadColumnas; i++) {
                listadoGrupoFamiliar.m.addColumn(rsmd.getColumnLabel(i));
            }
            if (res.next() == true) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                listadoGrupoFamiliar.m.addRow(fila);
            } else {
                JOptionPane.showMessageDialog(null, "Empleado no posee grupo familiar", "ERROR", JOptionPane.ERROR_MESSAGE);
                listadoGrupoFamiliar.m.setColumnCount(0);
                listadoGrupoFamiliar.m.setRowCount(0);
                listaFamiliar();
            }
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            System.out.print(ex);
        }

    }

    public void eliminarGrupoFamiliar(int dni, int estado) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE grupofamiliar set estado = ?  WHERE dni = '" + dni + "'");
            pstm.setInt(1, estado);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Familiar Eliminado", "Gracias", JOptionPane.INFORMATION_MESSAGE);
            listadoEmpleados.m.removeRow(listadoEmpleados.listadoEmpleados.getSelectedRow());
            con.desconectarBaseDeDatos();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "No se pudo eliminar el Familiar" + e.getMessage());
        }

    }

    private void actualizarDisponibilidad() {
        String nombreInsumo = null;
        int idInsumo = 0, cantidadInsumo = 0, cantidadUso = 0, disponibilidadNueva = 0;
//        float disponibilidad = 0;

        int filas = nuevaVenta.lineaVenta.getRowCount();
        for (int i = 0; i < filas; i++) {
            System.out.println("dentro del for.. índice: " + i);
            nombreInsumo = nuevaVenta.lineaVenta.getValueAt(i, 1).toString();
            if (!nombreInsumo.equals("")) {
                try {
                    System.out.println("dentro de la consulta de datos del insumo: " + nombreInsumo);
                    PreparedStatement pstm = con.getConnection().prepareStatement("SELECT * FROM insumo WHERE nombre= '" + nombreInsumo + "'");
                    ResultSet res = pstm.executeQuery();
                    if (res.next()) {

                        idInsumo = res.getInt("idInsumo");
                        cantidadInsumo = res.getInt("cantidad");
                        cantidadUso = res.getInt("unidad_cantidad_uso");
                        disponibilidadNueva = res.getInt("disponibilidad") - 1;

                        float resultado = disponibilidadNueva % cantidadUso;
                        System.out.println("Dentro del result set, idInsumo:   " + idInsumo);
                        if (resultado == 0) {
                            System.out.println("El resultado de disponibilidad%Cantidad de uso = 0");
                            cantidadInsumo = cantidadInsumo - 1;
                            PreparedStatement pstm1 = con.getConnection().prepareStatement("UPDATE insumo set disponibilidad = ?, cantidad = ? WHERE idInsumo= '" + idInsumo + "'");
                            pstm1.setInt(1, disponibilidadNueva);
                            pstm1.setInt(2, cantidadInsumo);
                            pstm1.execute();
                            pstm1.close();

                        } else {
                            System.out.println("El resultado de disponibilidad%Cantidad de uso != 0");
                            PreparedStatement pstm2 = con.getConnection().prepareStatement("UPDATE insumo set disponibilidad = ? WHERE idInsumo= '" + idInsumo + "'");
                            pstm2.setInt(1, disponibilidadNueva);
                            pstm2.execute();
                            pstm2.close();
                        }
                        if (cantidadInsumo <= 2) {
                            JOptionPane.showMessageDialog(null, "Stock a punto de agotarse \n Por Favor Reponga El Insumo: " + nombreInsumo, "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            } else {
            }
        }
    }

    public void listaDeConceptos() {
        con.conectarBaseDeDatos();
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT con.idConcepto, con.descripcion, con.tipo, con.MontoFijo,con.montoVariable, con.porDefecto FROM conceptos con ");
            // PreparedStatement pstm = con.getConnection().prepareStatement("SELECT con.idConcepto, con.descripcion, con.tipo, con.MontoFijo,con.montoVariable FROM conceptos con ");
            ResultSet res = pstm.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            while (res.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                listadosConceptos.m.addRow(fila);
            }
            listadosConceptos.cambiarBooleanos();
            con.desconectarBaseDeDatos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }
    }

    public void nuevoConcepto(String descripcion, String tipo, float montofijo, float montoVariable, boolean porDefecto) {
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("INSERT into conceptos(descripcion, tipo, montoFijo, montoVariable, porDefecto) values(?,?,?,?,?)");
            pstm.setString(1, descripcion);
            pstm.setString(2, tipo);
            pstm.setFloat(3, montofijo);
            pstm.setFloat(4, montoVariable);
            pstm.setBoolean(5, porDefecto);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Registro Completo", "FELICIDADES", JOptionPane.INFORMATION_MESSAGE);
            con.desconectarBaseDeDatos();
            nuevoServicio.nuevo();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se registro el servicio" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actualizarConcepto(int idConcepto, String descripcion, String tipo, float montofijo, float montoVariable, boolean porDefecto) {
        try {
            
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE conceptos set descripcion = ?,tipo=?, montoFijo=?, montoVariable= ?, porDefecto= ? WHERE idConcepto =" + idConcepto); // puede haber error, en el ?
            pstm.setString(1, descripcion);
            pstm.setString(2, tipo);
            pstm.setFloat(3, montofijo);
            pstm.setFloat(4, montoVariable);
            pstm.setBoolean(5, porDefecto);

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Concepto Actualizado", "Gracias", JOptionPane.INFORMATION_MESSAGE);
            con.desconectarBaseDeDatos();
//   con.desconectarBaseDeDatos();
            listadosConceptos.m.setRowCount(0);
            listaDeConceptos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void eliminarConcepto(String descripcion) {
        
        try {
            con.conectarBaseDeDatos();
            PreparedStatement pstm = con.getConnection().prepareStatement("DELETE FROM conceptos WHERE descripcion = '"+descripcion+"'");
//   pstm.setString(1,nombre);
            pstm.executeUpdate();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Concepto Eliminado", "Gracias", JOptionPane.INFORMATION_MESSAGE);
            listadosConceptos.m.removeRow(listadosConceptos.listaConceptos.getSelectedRow());
            con.desconectarBaseDeDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
