package Pdf;

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
import finalgestion.ventanaPrincipal;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class reporteDetalleCompra {

    FechayHora fec = new FechayHora();
    Color grisClaro = new Color(230, 230, 230);
    Color azulClaro = new Color(124, 195, 255);
    String strConsultaSQL;
    Connection conn = null;
    Statement estSQL1;
    ResultSet rs;
    Document document;
    PdfWriter writer;
    String strRotuloPDF;
    private String ruta_destino_1 = "";

    public reporteDetalleCompra(int idCompra, String razonSocial) {

        Colocar_Destino();
        try {
            document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(this.ruta_destino_1 + ".pdf"));
            document.open();
            document.setPageSize(PageSize.A8.rotate());
            document.add(new Paragraph(String.valueOf(fec.fecha())));
            document.addTitle("Reporte de Compra");
            document.addAuthor("Salinas German");
            document.addSubject("Compras");
            document.addKeywords("12345678");
            Paragraph ParrafoHoja1 = new Paragraph();
            Paragraph ParrafoHoja2 = new Paragraph();
            Paragraph ParrafoHoja3 = new Paragraph();
            Paragraph ParrafoHoja4 = new Paragraph();
            Paragraph ParrafoHoja5 = new Paragraph();
            ParrafoHoja1.add(new Paragraph("elSalon System", FontFactory.getFont("Times New Roman", 48, Font.NORMAL, BaseColor.BLACK)));
            ParrafoHoja1.setAlignment(2);
            document.add(ParrafoHoja1);
            agregarLineasEnBlanco(ParrafoHoja1, 1);
            ParrafoHoja2.add(new Paragraph("MARAÑON 570 PB - JUAN BAUTISTA ALBERDI - TUCUMÁN", FontFactory.getFont("arial", 10, Font.NORMAL, BaseColor.BLACK)));
            ParrafoHoja2.setAlignment(2);
            document.add(ParrafoHoja2);
            agregarLineasEnBlanco(ParrafoHoja2, 1);
            ParrafoHoja3.add(new Paragraph("Numero de Compra: " + idCompra + "       " + "  Fecha: " + fecha(idCompra) + "        Hora: " + hora(idCompra), FontFactory.getFont("arial", 12, Font.ITALIC, BaseColor.BLACK)));
            agregarLineasEnBlanco(ParrafoHoja3, 1);
            document.add(ParrafoHoja3);
            ParrafoHoja4.add(new Paragraph("Proveedor: " + buscarProveedor(razonSocial), FontFactory.getFont("arial", 12, Font.ITALIC, BaseColor.BLACK)));
            agregarLineasEnBlanco(ParrafoHoja4, 1);
            document.add(ParrafoHoja4);
// POR EL MOMENTO QUEDA ASI  ParrafoHoja5.add(new Paragraph("Vendedor: " + buscarV(idCompra), FontFactory.getFont("arial", 12, Font.ITALIC, BaseColor.BLACK)));
//   agregarLineasEnBlanco(ParrafoHoja5,1);
//   document.add(ParrafoHoja5);
            agregarMetaDatos(document, idCompra);
            document.close();
            abrir(this.ruta_destino_1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void agregarMetaDatos(Document document, int idCompra) throws DocumentException, Exception {
        Paragraph ParrafoHoja = new Paragraph();
        agregarLineasEnBlanco(ParrafoHoja, 1);
        agregarTabla(ParrafoHoja, idCompra);
        agregarLineasEnBlanco(ParrafoHoja, 2);
        ParrafoHoja.add(new Paragraph("Total a Pagar: " + String.valueOf(total(idCompra)), FontFactory.getFont("arial", 12, Font.NORMAL, BaseColor.BLACK)));
//  ParrafoHoja.add(new Paragraph("Monto Abonado: " + String.valueOf(monto(idCompra)),FontFactory.getFont("arial",12,Font.NORMAL,BaseColor.BLACK)));
//  ParrafoHoja.add(new Paragraph("Vuelto: " + String.valueOf(vuelto(idCompra)),FontFactory.getFont("arial",12,Font.NORMAL,BaseColor.BLACK)));
        document.add(ParrafoHoja);
    }

    private void agregarLineasEnBlanco(Paragraph parrafo, int nLineas) {
        for (int i = 0; i < nLineas; i++) {
            parrafo.add(new Paragraph(" "));
        }
    }

    private void agregarTabla(Paragraph parrafo, int idCompra) {
        float anchosFilas[] = {1.2f, 0.5f, 0.6f};
        PdfPTable tabla = new PdfPTable(anchosFilas);
        String rotulosColumnas[] = {"NombreInsumo", "Cantidad", "SubTotal"};
        tabla.setWidthPercentage(100);
        tabla.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell cell = new PdfPCell(new Paragraph());
        cell.setColspan(6);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        tabla.addCell(cell);
        try {
            if (ConectarBD()) {
                for (int i = 0; i < rotulosColumnas.length; i++) {
                    cell = new PdfPCell(new Paragraph(rotulosColumnas[i]));
                    cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell.setUseAscender(true);
                    tabla.addCell(cell);
                }
                strConsultaSQL = "SELECT ins.nombre, dc.cantidad, dc.subTotal FROM insumo ins, detalle_compra dc WHERE ins.idInsumo = dc.insumo_id AND dc.compra_id = '" + idCompra + "'";
                rs = estSQL1.executeQuery(strConsultaSQL);
                while (rs.next()) {
                    cell = new PdfPCell(new Paragraph(rs.getString("ins.nombre")));
                    cell.setBorder(0);
                    tabla.addCell(cell);
                    cell = new PdfPCell(new Paragraph(String.valueOf(rs.getInt("dc.cantidad"))));
                    cell.setBorder(0);
                    tabla.addCell(cell);
                    cell = new PdfPCell(new Paragraph(String.valueOf(rs.getFloat("dc.subTotal"))));
                    cell.setBorder(0);
                    tabla.addCell(cell);
                    cell.setBorder(1);
                }
                tabla.addCell(cell);
                CrearConexion.cerrar(rs);
                CrearConexion.cerrar(estSQL1);
                CrearConexion.cerrar(conn);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        parrafo.add(tabla);
    }

    private boolean ConectarBD() throws Exception {
        try {
            CrearConexion con = new CrearConexion("root", "", "salonbelleza");
            conn = (Connection) con.getConnection();
            if (conn != null) {
                estSQL1 = conn.createStatement();
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private void Colocar_Destino() {
        this.ruta_destino_1 = "C:\\Reportes\\Reportes de Compras\\Reporte de compra  " + ventanaPrincipal.listReporteCompra++;

    }

    private void abrir(String ruta) {
        try {
            JOptionPane.showMessageDialog(null, "Se ha generado el reporte", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            File path = new File(ruta + ".pdf");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private String total(int idCompra) throws Exception {
        float total = 0;
        ConectarBD();
        strConsultaSQL = "SELECT Total FROM compra WHERE idCompra ='" + idCompra + "'";
        rs = estSQL1.executeQuery(strConsultaSQL);
        if (rs.next() == true) {
            total = rs.getFloat("Total");
        }
        return String.valueOf(total);
    }

// private String monto(int idCompra) throws Exception {
//  float monto =0;
//  ConectarBD();
//  strConsultaSQL= "SELECT MontoAbonado FROM compra WHERE idCompra ='" + idCompra + "'";
//  rs = estSQL1.executeQuery(strConsultaSQL);
//  if(rs.next()==true){
//   monto = rs.getFloat("MontoAbonado");
//  }
//  return String.valueOf(monto);
// }
//
// private String vuelto(int idCompra) throws Exception {
//  float vuelto =0;
//  ConectarBD();
//  strConsultaSQL= "SELECT Vuelto FROM compra WHERE idCompra ='" + idCompra + "'";
//  rs = estSQL1.executeQuery(strConsultaSQL);
//  if(rs.next()==true){
//   vuelto = rs.getFloat("Vuelto");
//  }
//  return String.valueOf(vuelto);
// }
    private String fecha(int idCompra) throws Exception {
        String fecha = "";
        ConectarBD();
        strConsultaSQL = "SELECT Fecha FROM compra WHERE idCompra ='" + idCompra + "'";
        rs = estSQL1.executeQuery(strConsultaSQL);
        if (rs.next() == true) {
            fecha = rs.getString("Fecha");
        }
        return fecha;
    }

    private String hora(int idCompra) throws Exception {
        String hora = "";
        ConectarBD();
        strConsultaSQL = "SELECT Hora FROM compra WHERE idCompra ='" + idCompra + "'";
        rs = estSQL1.executeQuery(strConsultaSQL);
        if (rs.next() == true) {
            hora = rs.getString("Hora");
        }
        return hora;
    }

    private String buscarProveedor(String razonSocial) throws Exception {
        String proveedor = "";
        ConectarBD();
        strConsultaSQL = "SELECT pro.RazonSocial,pro.Telefono,pro.Email FROM proveedor pro WHERE pro.RazonSocial = '" + razonSocial + "'";
        rs = estSQL1.executeQuery(strConsultaSQL);
        if (rs.next() == true) {
            proveedor = rs.getString("pro.RazonSocial");
        }
        return proveedor;
    }

//private String buscarVendedor(int idVenta) throws Exception {
// String hora = "";
//  ConectarBD();
//  strConsultaSQL= "SELECT dniEmpleado FROM ventas WHERE idVentas ='" + idVenta + "'";
//  rs = estSQL1.executeQuery(strConsultaSQL);
//  if(rs.next()==true){
//   int dni = rs.getInt("dniEmpleado");
//   strConsultaSQL= "SELECT Apellido,Nombre FROM empleados WHERE dniEmpleado ='" + dni + "'";
//   rs = estSQL1.executeQuery(strConsultaSQL);
//   if(rs.next()==true){
//    hora = rs.getString("Apellido") + " " + rs.getString("Nombre");
//   }
//  }
// return hora.toUpperCase();
//}
}
