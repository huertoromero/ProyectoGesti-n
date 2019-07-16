
package Clases;

import BaseDeDatos.Operaciones;

public class Empleados {

 private Operaciones op = new Operaciones();
 public FechayHora fh = new FechayHora();
 public GrupoFamiliar gf = new GrupoFamiliar();
 public Usuario ur = new Usuario();

 private int dni;
 private String nombre;
 private String apellido;
 private String fechaDeNacimiento;
 private long cuil;
 private String fechaDeIngreso;
 private String Email;
 private long telefono;
 private int categoria;
 private int estado;
 private String fechaDeBaja;
 private String direccion;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
 

public String getFechaDeBaja() {
 return fechaDeBaja;
}

public void setFechaDeBaja(String fechaDeBaja) {
 this.fechaDeBaja = fechaDeBaja;
}

public int getEstado() {
 return estado;
}

public void setEstado(int estado) {
 this.estado = estado;
}


 public int getCategoria() {
 return categoria;
}

public void setCategoria(int categoria) {
 this.categoria = categoria;
}

public String getEmail() {
 return Email;
}

public void setEmail(String Email) {
 this.Email = Email;
}



public String getApellido() {
 return apellido;
}

public void setApellido(String apellido) {
 this.apellido = apellido;
}

public long getCuil() {
 return cuil;
}

public void setCuil(long cuil) {
 this.cuil = cuil;
}

public int getDni() {
 return dni;
}

public void setDni(int dni) {
 this.dni = dni;
}



public String getFechaDeIngreso() {
 return fechaDeIngreso;
}

public void setFechaDeIngreso(String fechaDeIngreso) {
 this.fechaDeIngreso = fechaDeIngreso;
}

public String getFechaDeNacimiento() {
 return fechaDeNacimiento;
}

public void setFechaDeNacimiento(String fechaDeNacimiento) {
 this.fechaDeNacimiento = fechaDeNacimiento;
}

public String getNombre() {
 return nombre;
}

public void setNombre(String nombre) {
 this.nombre = nombre;
}


public long getTelefono() {
 return telefono;
}

public void setTelefono(long telefono) {
 this.telefono = telefono;
}

public Boolean nuevoEmpleado(){
 Boolean empleado = op.nuevoEmpleado(dni,categoria,nombre,apellido,fechaDeNacimiento,cuil,fechaDeIngreso,telefono,Email,direccion,estado);
 if(empleado == true){
  return true;
 }
 else{
  return false;
 }
}

public void listaEmpleados(){
 op.listadoEmpleados(); // puede haber error
}

public void historial(){
 op.historialEmpleados();
}

 public void buscarEmpleados() {
  op.BuscarEmpleados(dni);
 }

public void eliminarEmpleados() {
 op.eliminarEmpleado(dni,fechaDeBaja,estado);
}

 public void cargarCategoria(int numero) {
  op.cargarCategoriaEmpleados(numero);
 }

 public void actualizarEmpleado() {
  op.actualizarEmpleados(dni,nombre,apellido,telefono,Email,direccion,categoria);
 }

public void cargarEmpleado() {
 op.cargarEmpleados(categoria);
}

public void cargarEmpleadoLiquidacion(String periodo) {
    System.out.println("Cargando empleados liquidacion.");
 op.cargarEmpleadosLiquidacion(periodo,dni);
}

public void cargarNombre() {
 op.cargarNombre(dni);
}

public void altaEmpleado(int dni) {
 int estado =1;
 op.altaEmpleado(estado,dni);
}

public void empleadosEliminados(){
 op.buscarEmpleadosEliminados(dni);
}

public boolean buscar() {
    boolean resultado = false;
    op.verificarDniE(resultado,dni);
    return resultado;
}


}
