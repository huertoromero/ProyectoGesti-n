
package Clases;

import BaseDeDatos.Operaciones;

public class GrupoFamiliar {

public Operaciones op = new Operaciones();
//public FechayHora fh = new FechayHora();

private int dniEmpleado;
private int dni;
private String nombre;
private String apellido;
private String fechaNac;
private String parentesco;
private int estado;
private Boolean discapacidad;


public int getEstado() {
        return estado;
    }

public void setEstado(int estado) {
        this.estado = estado;
    }

    public Boolean getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(Boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

public int getDniEmpleado() {
 return dniEmpleado;
}

public void setDniEmpleado(int dniEmpleado) {
 this.dniEmpleado = dniEmpleado;
}

public String getApellido() {
 return apellido;
}

public void setApellido(String apellido) {
 this.apellido = apellido;
}

public int getDni() {
 return dni;
}

public void setDni(int dni) {
 this.dni = dni;
}

public String getFechaNac() {
 return fechaNac;
}

public void setFechaNac(String fechaNac) {
 this.fechaNac = fechaNac;
}

public String getNombre() {
 return nombre;
}

public void setNombre(String nombre) {
 this.nombre = nombre;
}

public String getParentesco() {
 return parentesco;
}

public void setParentesco(String parentesco) {
 this.parentesco = parentesco;
}


public void nuevoGrupoFamiliar() {
 op.nuevoGrupoFamiliar(dniEmpleado,dni,nombre,apellido,fechaNac,parentesco,discapacidad);
}

public void listaFamiliar() {
 op.listaFamiliar();
}

public void actualizarGrupoFamiliar(){
op.actualizarGrupoFamiliar(dniEmpleado,dni,nombre,apellido,fechaNac,parentesco,discapacidad);
}

public void buscarGrupoFamiliar(){
op.buscarGrupoFamiliar(dniEmpleado);
}

public void eliminarGrupoFamiliar(){
op.eliminarGrupoFamiliar(dni,estado);
}

public boolean buscar() {
    boolean resultado = false;
    op.verificarDniF(resultado,dni);
    return resultado;
}

}
