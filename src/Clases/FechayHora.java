package Clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class FechayHora {
 private String dia;
 private String mes;
 private String año;
 private String minutos;
 private String hora;
 private Calendar cal=Calendar.getInstance();

public String getAño() {
 return año;
}

public void setAño(String año) {
 this.año = año;
}

public String getDia() {
 return dia;
}

public void setDia(String dia) {
 this.dia = dia;
}

public String getHora() {
 return hora;
}

public void setHora(String hora) {
 this.hora = hora;
}

public String getMes() {
 return mes;
}

public void setMes(String mes) {
 this.mes = mes;
}

public String getMinutos() {
 return minutos;
}

public void setMinutos(String minutos) {
 this.minutos = minutos;
}

 public String fecha() {
  setDia(String.valueOf(cal.get(Calendar.DATE)));
  setMes(String.valueOf(cal.get(Calendar.MONTH)+1));
  setAño(String.valueOf(cal.get(Calendar.YEAR)));
  return dia + "/"+ mes +"/"+ año;
 }

 public String fechaDesde(){
  setDia(String.valueOf(cal.get(Calendar.DATE)));
  int mesFecha = (cal.get(Calendar.MONTH));
  if(mesFecha ==0){
   setMes(String.valueOf(12));
  }
  else{
   setMes(String.valueOf(mesFecha));
  }
  setAño(String.valueOf(cal.get(Calendar.YEAR)));
  return getDia() + "/" + getMes() +"/" + getAño();
 }

 public String fechaBD() {
  setDia(String.valueOf(cal.get(Calendar.DATE)));
  setMes(String.valueOf(cal.get(Calendar.MONTH)+1));
  setAño(String.valueOf(cal.get(Calendar.YEAR)));

  return año + "/"+ mes +"/"+ dia;
 }

 public String hora(){
  setHora(String.valueOf(cal.get(Calendar.HOUR_OF_DAY)));
  setMinutos(String.valueOf(cal.get(Calendar.MINUTE)));
  return hora +":"+ minutos;
 }
 
public boolean confirmarFecha(String fecha){
 try {
  SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy",Locale.getDefault());
  formatoFecha.setLenient(false);
  formatoFecha.parse(fecha);
  return true;
 }
 catch (ParseException e) {
  return false;
 }
}

public String periodo() {
 int mes = cal.get(Calendar.MONTH)+1;
 return String.valueOf(mes+"/12");
}

 public String fechaDesdeBd() {
  setDia(String.valueOf(cal.get(Calendar.DATE)));
  int mesFecha = (cal.get(Calendar.MONTH));
  if(mesFecha ==0){
   setMes(String.valueOf(12));
  }
  else{
   setMes(String.valueOf(mesFecha));
  }
  setAño(String.valueOf(cal.get(Calendar.YEAR)));
  return getAño() + "/" + getMes() +"/" + getDia();
 }     

 public String fechaHastaBd() {
  setDia(String.valueOf(cal.get(Calendar.DATE)));
  setMes(String.valueOf(cal.get(Calendar.MONTH)+1));
  setAño(String.valueOf(cal.get(Calendar.YEAR)));
  return año + "/"+ mes +"/"+ dia;
 }

}
