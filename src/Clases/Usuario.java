

package Clases;

import BaseDeDatos.Operaciones;
import java.security.MessageDigest;

public class Usuario {
 Operaciones op = new Operaciones();
 private String Usuario;
 private String Contraseña;
 private String NuevoUsuario;
 private String NuevaContraseña;
 private int menuCliente;
 private int menuEmpleados;
 private int menuProveedor;
 private int menuSalario;
 private int menuProducto;
 private int menuServicios;
 private int menuVenta;
 private int menuCompra;

public String getContraseña() {
 return Contraseña;
}

public void setContraseña(String Contraseña) {
 this.Contraseña = Contraseña;
}

public String getUsuario() {
 return Usuario;
}

public void setUsuario(String Usuario) {
 this.Usuario = Usuario;
}

public int getMenuCliente() {
 return menuCliente;
}

public void setMenuCliente(int menuCliente) {
 this.menuCliente = menuCliente;
}

public int getMenuCompra() {
 return menuCompra;
}

public void setMenuCompra(int menuCompra) {
 this.menuCompra = menuCompra;
}

public int getMenuEmpleados() {
 return menuEmpleados;
}

public void setMenuEmpleados(int menuEmpleados) {
 this.menuEmpleados = menuEmpleados;
}

public int getMenuProducto() {
 return menuProducto;
}

public void setMenuProducto(int menuProducto) {
 this.menuProducto = menuProducto;
}

public int getMenuProveedor() {
 return menuProveedor;
}

public void setMenuProveedor(int menuProveedor) {
 this.menuProveedor = menuProveedor;
}

public int getMenuSalario() {
 return menuSalario;
}

public void setMenuSalario(int menuSalario) {
 this.menuSalario = menuSalario;
}

public int getMenuVenta() {
 return menuVenta;
}

public void setMenuVenta(int menuVenta) {
 this.menuVenta = menuVenta;
}

public String getNuevaContraseña() {
 return NuevaContraseña;
}

public void setNuevaContraseña(String NuevaContraseña) {
 this.NuevaContraseña = NuevaContraseña;
}

public String getNuevoUsuario() {
 return NuevoUsuario;
}

public void setNuevoUsuario(String NuevoUsuario) {
 this.NuevoUsuario = NuevoUsuario;
}



public String encriptacion (String contraseña) throws Exception {
 MessageDigest md = MessageDigest.getInstance("MD5");
 byte[] b = md.digest(contraseña.getBytes());
 int size = b.length;
 StringBuilder h = new StringBuilder(size);
 for (int i = 0; i < size; i++){
  int u = b[i] & 255;
  if (u < 10){
  h.append("0").append(Integer.toHexString(u));
  }
  else{
  h.append(Integer.toHexString(u));
  }
 }
 return  h.toString();
}

public boolean cargarUsuario(int dni) {
 boolean usuario = op.NuevoUsuario(dni,Usuario,Contraseña,menuCliente,menuEmpleados,menuProveedor,menuSalario,menuProducto,menuVenta,menuCompra, getMenuServicios());
 if(usuario ==true){
  return true;   
 }
 else{
  return false;   
 }
}

public int autentificacion() {
 int autentificacion = op.logeo(Usuario, Contraseña);
 return autentificacion;
}

public void actualizarUsuario(int dni) {
 op.actualizarUsuario(Usuario,Contraseña,NuevoUsuario,NuevaContraseña,dni);
}

    /**
     * @return the menuServicios
     */
    public int getMenuServicios() {
        return menuServicios;
    }

    /**
     * @param menuServicios the menuServicios to set
     */
    public void setMenuServicios(int menuServicios) {
        this.menuServicios = menuServicios;
    }

}
