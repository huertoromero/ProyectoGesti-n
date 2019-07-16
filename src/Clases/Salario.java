
package Clases;

import BaseDeDatos.Operaciones;
import Liquidacion.nuevaLiquidacion;

public class Salario {

public FechayHora FH = new FechayHora();
public Empleados emp = new Empleados();
public Operaciones op = new Operaciones();

public void CalcularAguinaldo(float salario) {
 float aguinaldo = (salario*50)/100;
 String[] datos = new String[3];
 datos[0] = "Salario Complementario Junio";
 datos[1]= String.valueOf(aguinaldo);
 datos[2]= "0";
 nuevaLiquidacion.m.addRow(datos);
}

public void CalcularAguinaldoDiciembre(float salario) {
 float aguinaldo = (salario*50)/100;
 String[] datos = new String[3];
 datos[0] = "Salario Complementario Diciembre";
 datos[1]= String.valueOf(aguinaldo);
 datos[2]= "0";
 nuevaLiquidacion.m.addRow(datos);
}

public void calcularVacaciones(float salario) {
 float vacaciones = (salario/25)*7;
 String[] datos = new String[3];
 datos[0] = "Vacaciones 7 Dias";
 datos[1]= String.valueOf(vacaciones);
 datos[2]= "0";
 nuevaLiquidacion.m.addRow(datos);
}

public void calcularVacaciones14(float salario) {
 float vacaciones = (salario/25)*14;
 String[] datos = new String[3];
 datos[0] = "Vacaciones 14 Dias";
 datos[1]= String.valueOf(vacaciones);
 datos[2]= "0";
 nuevaLiquidacion.m.addRow(datos);
}

public void calcularVacaciones21(float salario) {
 float vacaciones = (salario/25)*21;
 System.out.print(vacaciones);
 String[] datos = new String[3];
 datos[0] = "Vacaciones 21 Dias";
 datos[1]= String.valueOf(vacaciones);
 datos[2]= "0";
 nuevaLiquidacion.m.addRow(datos);
}

public void calcularPresentismo() {
 float presentismo = op.obtenerPresentismo();
 String[] datos = new String[3];
 datos[0] = "Presentismo";
 datos[1]= String.valueOf(presentismo);
 datos[2]= "0";
 nuevaLiquidacion.m.addRow(datos);
}

}