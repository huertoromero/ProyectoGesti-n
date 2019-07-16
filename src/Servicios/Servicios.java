package Servicios;

import BaseDeDatos.ServiciosOperaciones;
import Clases.FechayHora;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servicios {

    public FechayHora fh = new FechayHora();

    private int codigo;
    private String nombre;
    private float precio;

    private ServiciosOperaciones op = new ServiciosOperaciones();

    public FechayHora getFh() {
        return fh;
    }

    public void setFh(FechayHora fh) {
        this.fh = fh;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public ServiciosOperaciones getOp() {
        return op;
    }

    public void setOp(ServiciosOperaciones op) {
        this.op = op;
    }

    //consulta bASE de datos
    public void busquedaDeServicios() {

        op.busquedaDeServicios(nombre);
    }

    public void listadoServicios() {
        op.listadeServicios();
    }

    public void nuevoServicio() {
        op.nuevoServicio(nombre, precio);
    }

    public void eliminarServicio() {
        op.eliminarServicio(nombre);
    }

    public void actualizarServicio() {
        op.actualizarServicio(codigo, nombre, precio);
    }

    void cargarServicios() {
        op.cargarServicios();
  
    }


    void nuevoServicioInsumo(String nombreI) {
        op.nuevoServicioInsumo(nombre, nombreI);
    }

    void cargarInsumosDelServicio(int idServicio){
        op.cargarInsumos_Servicio(idServicio);
                    System.out.println("Dentro del if. mostrando id cargarinsumosdelservicio "+idServicio);

    }



}
