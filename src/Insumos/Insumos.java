package Insumos;

import BaseDeDatos.ComprasOperaciones;
import BaseDeDatos.InsumosOperaciones;
import Clases.FechayHora;

public class Insumos {

    public FechayHora fh = new FechayHora();

    private int codigo;
    private String nombre;
    private int cantidad;
    private int cantidadUsos;
    
    private InsumosOperaciones op = new InsumosOperaciones();
    private ComprasOperaciones opC = new ComprasOperaciones();

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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidadUsos() {
        return cantidadUsos;
    }

    public void setCantidadUsos(int cantidadUsos) {
        this.cantidadUsos = cantidadUsos;
    }

    public InsumosOperaciones getOp() {
        return op;
    }

    public void setOp(InsumosOperaciones op) {
        this.op = op;
    }

    
    public void listarInsumosenCompra(){
    opC.listarInsumosenCompra();
    }
        public void listadoInsumos() {
        op.listadeInsumos();
    }
        
        public void nuevoInsumo() {
        op.nuevoInsumo(nombre, cantidad, cantidadUsos);
    }
         public void actualizarInsumo() {
        op.actualizarInsumo(codigo, nombre, cantidad, cantidadUsos);
    }
         
        public void eliminarInsumo() {
        op.eliminarInsumo(nombre);
    }
        
            public void busquedaDeInsumos() {

        op.busquedaDeInsumos(nombre);
    }

    void cargarInsumos() {
        op.cargarInsumo();
    }
}
