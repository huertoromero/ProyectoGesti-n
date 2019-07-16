package Conceptos;

import BaseDeDatos.Operaciones;

public class Conceptos {

    public Operaciones op = new Operaciones();

    private int idConcepto;
    private String descripcion;
    private String tipo;
    private float montofijo;
    private float montoVariable;
    private boolean porDefecto;
    public int getIdConcepto() {
        return idConcepto;
    }

    public void setIdConcepto(int idConcepto) {
        this.idConcepto = idConcepto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getMontofijo() {
        return montofijo;
    }

    public void setMontofijo(float montofijo) {
        this.montofijo = montofijo;
    }

    public float getMontoVariable() {
        return montoVariable;
    }

    public void setMontoVariable(float montoVariable) {
        this.montoVariable = montoVariable;
    }

    public void cargarCategorias() {
        op.cargarCategoriaEmpleados(4);
    }

    public void cargarSalario(int i) { 
        op.cargarSalario(i);
    }

    public void cargarConceptos() {
        op.cargarConceptos();
    }

    public void actualizarConceptos(float salario, int categoria, float scj, float scd, float jubilacion, float ley, float sindicato, float presentismo, float obraSocial, float aporte) {
        op.actualizarConceptos(salario, categoria, scj, scd, jubilacion, ley, sindicato, presentismo, obraSocial, aporte);
    }

    public void listadoConceptos() {
        
        op.listaDeConceptos();
    }

    void nuevoConcepto() {
        op.nuevoConcepto(descripcion, tipo, montofijo, montoVariable, porDefecto);
    }

    void actualizarConcepto() {
        op.actualizarConcepto(idConcepto,descripcion, tipo, montofijo, montoVariable, porDefecto);
    }

    void eliminarConcepto() {
        op.eliminarConcepto(descripcion);
    }

    /**
     * @return the porDefecto
     */
    public boolean getPorDefecto() {
        return porDefecto;
    }

    /**
     * @param porDefecto the porDefecto to set
     */
    public void setPorDefecto(boolean porDefecto) {
        this.porDefecto = porDefecto;
    }

}
