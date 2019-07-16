
package Clases;

import Conceptos.Conceptos;
import BaseDeDatos.Operaciones;
import Liquidacion.nuevaLiquidacion;

public class Liquidacion {
 public Empleados emp = new Empleados();
 public FechayHora fh = new FechayHora();
 public Conceptos con = new Conceptos();
 public Operaciones op = new Operaciones();
 public DetalleLiquidacion dl = new DetalleLiquidacion();

 private String fechaDesde;
 private String fechaHasta;
 private float salarioNeto;
 private String periodo;
 private int estado;
 private int numero;

public int getNumero() {
    return numero;
}

public void setNumero(int numero) {
    this.numero = numero;
}
 
public int getEstado() {
 return estado;
}

public void setEstado(int estado) {
 this.estado = estado;
}

public String getFechaDesde() {
 return fechaDesde;
}

public void setFechaDesde(String fechaDesde) {
 this.fechaDesde = fechaDesde;
}

public String getFechaHasta() {
 return fechaHasta;
}

public void setFechaHasta(String fechaHasta) {
 this.fechaHasta = fechaHasta;
}

public String getPeriodo() {
 return periodo;
}

public void setPeriodo(String periodo) {
 this.periodo = periodo;
}

public float getSalarioNeto() {
 return salarioNeto;
}

public void setSalarioNeto(float salarioNeto) {
 this.salarioNeto = salarioNeto;
}

public void cargarSalario(float salario) {
 String[] datos = new String[3];
 datos[0] = "Salario Basico";
 datos[1]= String.valueOf(salario);
 datos[2] = "0";
 nuevaLiquidacion.m.addRow(datos);
 
 float jub = op.obtenerJubilacion();
 if(jub>0){
 float jubilacion = salario * jub;
 datos[0] = "Jubilacion";
 datos[1] = "0";
 datos[2]= String.valueOf(jubilacion);
 nuevaLiquidacion.m.addRow(datos);
 }
 
 
 float obra = op.obtenerObraSocial();
 if(obra>0){
 float obraSocial = salario * obra;
 datos[0] = "Obra Social";
 datos[1] = "0";
 datos[2]= String.valueOf(obraSocial);
 nuevaLiquidacion.m.addRow(datos);
 }
 

 float aporte = op.obtenerAporte();
 if(aporte>0){
 datos[0] = "Aporte Obra Social";
 datos[1] = "0";
 datos[2]= String.valueOf(aporte);
 nuevaLiquidacion.m.addRow(datos);
 }
 
 float sin = op.obtenerSindicato();
 if(sin>0){
 float sindicato = sin*salario;
 datos[0] = "Aporte Sindicato";
 datos[1] = "0";
 datos[2]= String.valueOf(sindicato);
 nuevaLiquidacion.m.addRow(datos);
 }
 
 float le = op.obtenerLey();
 if(le>0){
 float ley = le*salario;
 datos[0] = "Ley 23660";
 datos[1] = "0";
 datos[2]= String.valueOf(ley);
 nuevaLiquidacion.m.addRow(datos);
 }
 
 float aj = op.obtenerAguinaldoJunio();
 if(aj>0){
 float aju = aj*salario;
 datos[0] = "Aguinaldo Junio";
 datos[1]= String.valueOf(aju);
 datos[2] = "0";
 nuevaLiquidacion.m.addRow(datos);
 }
 
  float ad = op.obtenerAguinaldoDiciembre();
 if(aj>0){
 float adi = aj*salario;
 datos[0] = "Aguinaldo Diciembre";
 datos[1]= String.valueOf(adi);
 datos[2] = "0";
 nuevaLiquidacion.m.addRow(datos);
 }
 
 float presentismo = op.obtenerPresentismo();
 if(presentismo>0){
 datos[0] = "Presentismo";
 datos[1]= String.valueOf(presentismo);
 datos[2] = "0";
 nuevaLiquidacion.m.addRow(datos);
 }
 
}
      
public void nuevaLiquidacion() {
 op.nuevaLiquidacion(emp.getDni(),fechaDesde,fechaHasta,salarioNeto,periodo,estado);
}

public void reporteCompleto() {
 op.reporteCompletoLiquidacion(fechaDesde,fechaHasta);
}

public void reporteCompletoLiquidacion() {
 op.reporteCompletoLiq();
}

public void reporteLiquidacionPorCliente() {
 op.reporteLiquidacionCliente(emp.getDni(),fechaDesde, fechaHasta);
}

public void reporteTotalEmpleado() {
 op.reporteTotalEmpleado(emp.getDni());
}

    public int ultimaLiquidacion(int dni) {
     int liquidacion = op.obtenerLiquidacion(dni);
     return liquidacion;
    }

//public void buscar(int dni){
// op.buscarEmpleado(emp.getDni());
//}
    

}