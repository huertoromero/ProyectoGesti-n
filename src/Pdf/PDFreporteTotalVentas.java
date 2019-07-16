
package pdf;

import Pdf.CrearConexion;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;;
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

final class PDFreporteTotalVentas {
 private String strNombreDelPDF;
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

 public PDFreporteTotalVentas(String titulo) {
  Colocar_Destino();
  strRotuloPDF = titulo;
  if(this.ruta_destino!=null){
   try {
    document = new Document( PageSize.A4, 50, 50, 50, 50 );
    writer.getInstance(document, new FileOutputStream(this.ruta_destino + ".pdf"));
    document.open();
    Paragraph titulo1 = new Paragraph("elSalon System",FontFactory.getFont(FontFactory.HELVETICA,18, Font.BOLDITALIC));
    Chapter capitulo1 = new Chapter(titulo1,1);
    capitulo1.setNumberDepth(0);
    document.add(capitulo1);
    Image jpg = Image.getInstance("src/Imagenes/avon.jpg");
    jpg.setAlignment(Image.RIGHT);
    jpg.scalePercent(40,40);
    document.add(jpg);
    agregarMetaDatos(document);
    document.close();
    this.abrir();
   }
  catch (Exception e){
   JOptionPane.showMessageDialog(null,e, "Error", JOptionPane.ERROR_MESSAGE);
  }
 }
 }

  private void agregarMetaDatos(Document document) throws DocumentException {
 Paragraph ParrafoHoja = new Paragraph();
  agregarLineasEnBlanco(ParrafoHoja, 1);
  ParrafoHoja.add(new Paragraph(strRotuloPDF.toUpperCase ()));
  agregarLineasEnBlanco(ParrafoHoja, 1);
  agregarTabla(ParrafoHoja);
  agregarLineasEnBlanco(ParrafoHoja, 2);
  document.add(ParrafoHoja);
}

private void agregarLineasEnBlanco(Paragraph parrafo, int nLineas) {
 for (int i = 0; i < nLineas; i++){
   parrafo.add(new Paragraph(" "));
  }
}

private void agregarTabla(Paragraph parrafo) {
 float anchosFilas[] = {1f,1f,0.7f,1f,1f};
     PdfPTable tabla = new PdfPTable(anchosFilas);
     String rotulosColumnas[] = {"Numero de Venta","Dni Cliente","Fecha","Hora","Total"};
     tabla.setWidthPercentage(100);
     tabla.setHorizontalAlignment(Element.ALIGN_CENTER);
     PdfPCell cell = new PdfPCell(new Paragraph("VENTAS REALIZADAS"));
     cell.setColspan(8);
     cell.setHorizontalAlignment(Element.ALIGN_CENTER);
     tabla.addCell(cell);
     try {
      if (ConectarBD()){
       for(int i=0; i<rotulosColumnas.length; i++){
        cell = new PdfPCell(new Paragraph(rotulosColumnas[i]));
	cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
	cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        tabla.addCell(cell);
       }
      strConsultaSQL = "SELECT idVentas,dniCliente,Fecha,Hora,Total FROM ventas";
      rs = estSQL1.executeQuery(strConsultaSQL);
      while (rs.next()){
       cell = new PdfPCell(new Paragraph(String.valueOf(rs.getInt ("idVentas"))));
       tabla.addCell(cell);
       cell = new PdfPCell(new Paragraph(String.valueOf(rs.getInt ("dniCliente"))));
       tabla.addCell(cell);
       cell = new PdfPCell(new Paragraph(String.valueOf(rs.getDate("Fecha"))));
       tabla.addCell(cell);
       cell = new PdfPCell(new Paragraph(String.valueOf(rs.getTime("Hora"))));
       tabla.addCell(cell);
       cell = new PdfPCell(new Paragraph(String.valueOf(rs.getFloat("Total"))));
       tabla.addCell(cell);
      }
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

 void abrir() {
  JOptionPane.showMessageDialog(null,"Se ha generado el Archivo en formato PDF", "Confirmacion", JOptionPane.ERROR_MESSAGE);
 }

}

