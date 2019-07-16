package Clases;

import BaseDeDatos.Operaciones;

public class Clientes {

 
 public Operaciones op = new Operaciones();
 public FechayHora fh = new FechayHora();

 private int dni;
 private String nombre;
 private String apellido;
 private long telefono;
 private String mail;
 private String fechadeAlta;
 private String fechadeBaja;
 private int estado;
 private String direccion;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



public String getFechadeBaja() {
 return fechadeBaja;
}

public void setFechadeBaja(String fechadeBaja) {
 this.fechadeBaja = fechadeBaja;
}

public int getDni() {
 return dni;
}

public void setDni(int dni) {
 this.dni = dni;
}

public String getApellido() {
 return apellido;
}

public void setApellido(String apellido) {
 this.apellido = apellido;
}


public String getMail() {
 return mail;
}

public void setMail(String mail) {
 this.mail = mail;
}

public int getEstado() {
 return estado;
}

public void setEstado(int estado) {
 this.estado = estado;
}

public String getFechadeAlta() {
 return fechadeAlta;
}

public void setFechadeAlta(String fechadeAlta) {
 this.fechadeAlta = fechadeAlta;
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

public void nuevoCliente(){
 op.nuevoCliente(dni,apellido,nombre,telefono,mail,fechadeAlta,estado,direccion);
}

public void listaClientes() {
 op.listadodeClientes();
}

public void buscarClientes() {
 op.buscarClientes(dni);
}

public void actualizarCliente(){
 op.actualizarClientes(dni,nombre,apellido,telefono,mail,direccion);
}

public void eliminarCliente(){
 op.eliminarCliente(dni,fechadeBaja);
}

public boolean buscar() {
    boolean resultado = false;
    op.verificarDni(resultado,dni);
    return resultado;
}
 
}