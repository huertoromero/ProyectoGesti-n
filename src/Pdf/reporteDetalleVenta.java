package pdf;

import Clases.FechayHora;
import Pdf.CrearConexion;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class reporteDetalleVenta {
FechayHora fec = new FechayHora();
Color grisClaro = new Color( 230,230,230);
Color azulClaro = new Color( 124,195,255 );
String strConsultaSQL;
Connection conn = null;
Statement estSQL1;
ResultSet rs;
Document document;
PdfWriter writer;
String strRotuloPDF;
private File ruta_destino=null;

public reporteDetalleVenta(int idVenta,int dni){
 Colocar_Destino();
 if(this.ruta_destino!=null){
  try {
   document = new Document();
   PdfWriter.getInstance(document,new FileOutputStream(this.ruta_destino + ".pdf"));
   document.open();
   document.setPageSize(PageSize.A8.rotate());
   document.add(new Paragraph(String.valueOf(fec.fecha())));
   document.addTitle("Reporte de Venta");
   document.addAuthor("Salinas German");
   document.addSubject("Ventas");
   document.addKeywords("12345678");
   Paragraph ParrafoHoja1 = new Paragraph();
   Paragraph ParrafoHoja2 = new Paragraph();
   Paragraph ParrafoHoja3 = new Paragraph();
   Paragraph ParrafoHoja4 = new Paragraph();
   Paragraph ParrafoHoja5 = new Paragraph();
   ParrafoHoja1.add(new Paragraph("COMBREL SRL",FontFactory.getFont("Times New Roman",48, Font.NORMAL, BaseColor.BLACK)));
   ParrafoHoja1.setAlignment(2);
   document.add(ParrafoHoja1);
   agregarLineasEnBlanco(ParrafoHoja1,1);
   ParrafoHoja2.add(new Paragraph("LUCAS CORDOBA 885 - SAN MIGUEL DE TUCUMAN",FontFactory.getFont("arial",10, Font.NORMAL, BaseColor.BLACK)));
   ParrafoHoja2.setAlignment(2);
   document.add(ParrafoHoja2);
   agregarLineasEnBlanco(ParrafoHoja2,1);
   ParrafoHoja3.add(new Paragraph("Numero de Venta: "+ idVenta + "       " +"  Fecha: "+ fecha(idVenta) + "        Hora: " + hora(idVenta),FontFactory.getFont("arial",12, Font.ITALIC, BaseColor.BLACK)));
   agregarLineasEnBlanco(ParrafoHoja3,1);
   document.add(ParrafoHoja3);
   ParrafoHoja4.add(new Paragraph("Cliente: " + buscarCliente(dni), FontFactory.getFont("arial", 12, Font.ITALIC, BaseColor.BLACK)));
   agregarLineasEnBlanco(ParrafoHoja4,1);
   document.add(ParrafoHoja4);
   ParrafoHoja5.add(new Paragraph("Vendedor: " + buscarVendedor(idVenta), FontFactory.getFont("arial", 12, Font.ITALIC, BaseColor.BLACK)));
   agregarLineasEnBlanco(ParrafoHoja5,1);
   document.add(ParrafoHoja5);
   agregarMetaDatos(document,idVenta);
   document.close();
   abrir();
  }
  catch (Exception e){
   JOptionPane.showMessageDialog(null,e, "Error", JOptionPane.ERROR_MESSAGE);
  }
 }
 }

private void agregarMetaDatos(Document document,int idVenta) throws DocumentException, Exception {
  Paragraph ParrafoHoja = new Paragraph();
  agregarLineasEnBlanco(ParrafoHoja, 1);
  agregarTabla(ParrafoHoja,idVenta);
  agregarLineasEnBlanco(ParrafoHoja, 2);
  ParrafoHoja.add(new Paragraph("Total a Pagar: " + String.valueOf(total(idVenta)),FontFactory.getFont("arial",12,Font.NORMAL,BaseColor.BLACK)));
  ParrafoHoja.add(new Paragraph("Monto Abonado: " + String.valueOf(monto(idVenta)),FontFactory.getFont("arial",12,Font.NORMAL,BaseColor.BLACK)));
  ParrafoHoja.add(new Paragraph("Vuelto: " + String.valueOf(vuelto(idVenta)),FontFactory.getFont("arial",12,Font.NORMAL,BaseColor.BLACK)));
  document.add(ParrafoHoja);
}

private void agregarLineasEnBlanco(Paragraph parrafo, int nLineas) {
 for (int i = 0; i < nLineas; i++){
   parrafo.add(new Paragraph(" "));
  }
}

private void agregarTabla(Paragraph parrafo,int idVenta) {
 float anchosFilas[] = { 1.2f,0.5f,0.6f,0.6f};
 PdfPTable tabla = new PdfPTable(anchosFilas);
 String rotulosColumnas[] = {"Descripcion","Cantidad","Precio","SubTotal"};
 tabla.setWidthPercentage(100);
 tabla.setHorizontalAlignment(Element.ALIGN_CENTER);
 PdfPCell cell = new PdfPCell(new Paragraph());
 cell.setColspan(6);
 cell.setHorizontalAlignment(Element.ALIGN_CENTER);
 tabla.addCell(cell);
 try {
  if (ConectarBD()){
  for(int i=0; i<rotulosColumnas.length; i++){
  cell = new PdfPCell(new Paragraph(rotulosColumnas[i]));
  cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
  cell.setHorizontalAlignment(Element.ALIGN_CENTER);
  cell.setUseAscender(true);
  tabla.addCell(cell);
  }
  strConsultaSQL= "SELECT pro.Descripcion, lv.Precio,lv.Cantidad, lv.subtotal FROM productos pro, lineadeventa lv WHERE pro.idProducto = lv.idProducto AND lv.idVentas = '" + idVenta +"'";
  rs = estSQL1.executeQuery(strConsultaSQL);
  while (rs.next()){
  cell = new PdfPCell(new Paragraph(rs.getString("pro.descripcion")));
  cell.setBorder(0);
  tabla.addCell(cell);
  cell = new PdfPCell(new Paragraph(String.valueOf(rs.getInt("lv.Cantidad"))));
  cell.setBorder(0);
  tabla.addCell(cell);
  cell = new PdfPCell(new Paragraph(String.valueOf(rs.getFloat("lv.Precio"))));
  cell.setBorder(0);
  tabla.addCell(cell);
  cell = new PdfPCell(new Paragraph(String.valueOf(rs.getFloat("lv.subtotal"))));
  cell.setBorder(0);
  tabla.addCell(cell);
  cell.setBorder(1);
 }
 tabla.addCell(cell);
 CrearConexion.cerrar(rs);
 CrearConexion.cerrar(estSQL1);
 CrearConexion.cerrar(conn);
 }
}
catch(Exception e){
JOptionPane.showMessageDialog(null,e, "Error", JOptionPane.ERROR_MESSAGE);
}
parrafo.add(tabla);
   }

 private boolean ConectarBD() throws Exception{
  try{
  CrearConexion con  = new CrearConexion("root","","salonbelleza");
   conn =   (Connection) con.getConnection();
   if(conn!=null){
    estSQL1 = conn.createStatement();
    return true;
   }
   else return false;
  }
  catch (SQLException e){
   JOptionPane.showMessageDialog(null,e, "Error", JOptionPane.ERROR_MESSAGE);
   return false;
  }
 }

private void Colocar_Destino() {
FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo PDF","pdf","PDF");
 JFileChooser fileChooser = new JFileChooser();
 fileChooser.setFileFilter(filter);
 int result = fileChooser.showSaveDialog(null);
  if ( result == JFileChooser.APPROVE_OPTION ){
    this.ruta_destino = fileChooser.getSelectedFile().getAbsoluteFile();
  }
 }

private void abrir() {
 JOptionPane.showMessageDialog(null,"Se ha generado el PDF", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
}

private String total(int idVenta) throws Exception {
  float total=0;
  ConectarBD();
  strConsultaSQL= "SELECT total FROM ventas WHERE idVentas ='" + idVenta + "'";
  rs = estSQL1.executeQuery(strConsultaSQL);
  if(rs.next()==true){
   total = rs.getFloat("total");
  }
  return String.valueOf(total);
 }

 private String monto(int idVenta) throws Exception {
  float monto =0;
  ConectarBD();
  strConsultaSQL= "SELECT Monto FROM ventas WHERE idVentas ='" + idVenta + "'";
  rs = estSQL1.executeQuery(strConsultaSQL);
  if(rs.next()==true){
   monto = rs.getFloat("Monto");
  }
  return String.valueOf(monto);
 }

 private String vuelto(int idVenta) throws Exception {
  float vuelto =0;
  ConectarBD();
  strConsultaSQL= "SELECT Vuelto FROM ventas WHERE idVentas ='" + idVenta + "'";
  rs = estSQL1.executeQuery(strConsultaSQL);
  if(rs.next()==true){
   vuelto = rs.getFloat("Vuelto");
  }
  return String.valueOf(vuelto);
 }

 private String fecha(int idVenta) throws Exception {
  String fecha = "";
  ConectarBD();
  strConsultaSQL= "SELECT Fecha FROM ventas WHERE idVentas ='" + idVenta + "'";
  rs = estSQL1.executeQuery(strConsultaSQL);
  if(rs.next()==true){
   fecha = rs.getString("Fecha");
  }
  return fecha;
 }

private String hora(int idVenta) throws Exception {
 String hora = "";
  ConectarBD();
  strConsultaSQL= "SELECT Hora FROM ventas WHERE idVentas ='" + idVenta + "'";
  rs = estSQL1.executeQuery(strConsultaSQL);
  if(rs.next()==true){
   hora = rs.getString("Hora");
  }
 return hora;
}

private String buscarCliente(int dni) throws Exception {
 String cliente = "";
  ConectarBD();
  strConsultaSQL= "SELECT cli.Apellido,cli.Nombre,cli.direccion FROM clientes cli WHERE cli.dniCliente ='" + dni + "'";
  rs = estSQL1.executeQuery(strConsultaSQL);
  if(rs.next()==true){
   cliente = rs.getString("cli.Apellido") + " " + rs.getString("cli.Nombre");
  }
 return cliente.toUpperCase();
}

private String buscarVendedor(int idVenta) throws Exception {
 String vendedor = "";
  ConectarBD();
  strConsultaSQL= "SELECT dniEmpleado FROM ventas WHERE idVentas ='" + idVenta + "'";
  rs = estSQL1.executeQuery(strConsultaSQL);
  if(rs.next()==true){
   int dni = rs.getInt("dniEmpleado");
   strConsultaSQL= "SELECT Apellido,Nombre FROM empleados WHERE dniEmpleado ='" + dni + "'";
   rs = estSQL1.executeQuery(strConsultaSQL);
   if(rs.next()==true){
    vendedor = rs.getString("Apellido") + " " + rs.getString("Nombre");
   }
  }
 return vendedor.toUpperCase();
}


}