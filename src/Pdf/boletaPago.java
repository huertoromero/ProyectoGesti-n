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

public class boletaPago {

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

    public boletaPago(int dni, int idLiquidacion, float monto, float descuento, float neto) throws Exception {
        Colocar_Destino();
        FechayHora fec = new FechayHora();
        try {
            document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(this.ruta_destino_1 + ".pdf"));
            document.open();
            document.setPageSize(PageSize.A8.rotate());
            document.add(new Paragraph(String.valueOf(fec.fecha())));
            document.addTitle("Liquidacion de Salario");
            document.addAuthor("Martina Di Trento");
            document.addSubject("Salario");
            document.addKeywords("12345678");
            Paragraph ParrafoHoja1 = new Paragraph();
            Paragraph ParrafoHoja2 = new Paragraph();
            Paragraph ParrafoHoja4 = new Paragraph();
            Paragraph ParrafoHoja5 = new Paragraph();
            ParrafoHoja1.add(new Paragraph("elSalon System ", FontFactory.getFont("Times New Roman", 48, Font.NORMAL, BaseColor.BLACK)));
            ParrafoHoja1.setAlignment(2);
            document.add(ParrafoHoja1);
            agregarLineasEnBlanco(ParrafoHoja1, 1);
            ParrafoHoja2.add(new Paragraph("MARAÑON 570 PB - JUAN BAUTISTA ALBERDI - TUCUMÁN", FontFactory.getFont("arial", 10, Font.NORMAL, BaseColor.BLACK)));
            ParrafoHoja2.setAlignment(2);
            document.add(ParrafoHoja2);
            agregarLineasEnBlanco(ParrafoHoja2, 1);
            ParrafoHoja4.add(new Paragraph("Liquidacion: " + buscarLiquidacion(idLiquidacion), FontFactory.getFont("arial", 12, Font.ITALIC, BaseColor.BLACK)));
            agregarLineasEnBlanco(ParrafoHoja4, 1);
            document.add(ParrafoHoja4);
            ParrafoHoja5.add(new Paragraph("Empleado: " + buscarEmpleado(dni), FontFactory.getFont("arial", 12, Font.ITALIC, BaseColor.BLACK)));
            agregarLineasEnBlanco(ParrafoHoja5, 1);
            document.add(ParrafoHoja5);
            agregarMetaDatos(document, idLiquidacion, monto, descuento, neto);
            document.close();
            abrir(this.ruta_destino_1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            System.out.print(e);
        }
    }

    private void agregarMetaDatos(Document document, int idLiquidacion, float monto, float descuento, float neto) throws DocumentException, Exception {
        Paragraph ParrafoHoja = new Paragraph();
        agregarLineasEnBlanco(ParrafoHoja, 1);
        agregarTabla(ParrafoHoja, idLiquidacion);
        agregarLineasEnBlanco(ParrafoHoja, 2);
        ParrafoHoja.add(new Paragraph("Monto: " + String.valueOf(monto), FontFactory.getFont("arial", 12, Font.NORMAL, BaseColor.BLACK)));
        ParrafoHoja.add(new Paragraph("Descuento: " + String.valueOf(descuento), FontFactory.getFont("arial", 12, Font.NORMAL, BaseColor.BLACK)));
        ParrafoHoja.add(new Paragraph("Salario Neto " + String.valueOf(neto), FontFactory.getFont("arial", 12, Font.NORMAL, BaseColor.BLACK)));
        document.add(ParrafoHoja);
    }

    private void agregarLineasEnBlanco(Paragraph parrafo, int nLineas) {
        for (int i = 0; i < nLineas; i++) {
            parrafo.add(new Paragraph(" "));
        }
    }

    private void agregarTabla(Paragraph parrafo, int idLiquidacion) {
        float anchosFilas[] = {1.2f, 0.5f, 0.6f, 0.6f};
        PdfPTable tabla = new PdfPTable(anchosFilas);
        String rotulosColumnas[] = {"Concepto", "Monto", "Descuento", "SubTotal"};
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
                strConsultaSQL = "SELECT con.Descripcion, dl.Monto,dl.descuentos,dl.subtotal FROM conceptos con, detalleliquidacion dl WHERE con.idConcepto = dl.idConcepto AND dl.idLiquidacion = '" + idLiquidacion + "'";
                rs = estSQL1.executeQuery(strConsultaSQL);
                while (rs.next()) {
                    cell = new PdfPCell(new Paragraph(rs.getString("con.Descripcion")));
                    tabla.addCell(cell);
                    cell = new PdfPCell(new Paragraph(String.valueOf(rs.getFloat("dl.Monto"))));
                    tabla.addCell(cell);
                    cell = new PdfPCell(new Paragraph(String.valueOf(rs.getFloat("dl.descuentos"))));
                    tabla.addCell(cell);
                    cell = new PdfPCell(new Paragraph(String.valueOf(rs.getFloat("dl.subTotal"))));
                    tabla.addCell(cell);
                }
                CrearConexion.cerrar(rs);
                CrearConexion.cerrar(estSQL1);
                CrearConexion.cerrar(conn);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            System.out.print(e);
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
        this.ruta_destino_1 = "C:\\Reportes\\Pago\\Boleta de pago  " + ventanaPrincipal.listPago++;
    }

    private void abrir(String ruta) {
        try {
            JOptionPane.showMessageDialog(null, "Se ha generado la boleta de pago ", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            File path = new File(ruta + ".pdf");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private String neto(int idLiquidacion) throws Exception {
        float total = 0;
        ConectarBD();
        strConsultaSQL = "SELECT SalarioNeto FROM liquidacion WHERE idLiquidacion ='" + idLiquidacion + "'";
        rs = estSQL1.executeQuery(strConsultaSQL);
        if (rs.next() == true) {
            total = rs.getFloat("SalarioNeto");
        }
        return String.valueOf(total);
    }

    private String Basico(int dni) throws Exception {
        float monto = 0;
        int categoria = 0;
        ConectarBD();
        strConsultaSQL = "SELECT idCategoria FROM empleados WHERE dniEmpleado ='" + dni + "'";
        rs = estSQL1.executeQuery(strConsultaSQL);
        if (rs.next() == true) {
            categoria = rs.getInt("idCategoria");
        }
        strConsultaSQL = "SELECT SalarioBasico FROM categoria WHERE idCategoria ='" + categoria + "'";
        rs = estSQL1.executeQuery(strConsultaSQL);
        if (rs.next() == true) {
            monto = rs.getFloat("SalarioBasico");
        }
        return String.valueOf(monto);
    }

    private String buscarLiquidacion(int idLiquidacion) throws Exception {
        String liquidacion = "";
        ConectarBD();
        strConsultaSQL = "SELECT FechaDesde,FechaHasta,PeriodoDeLiquidacion FROM liquidacion WHERE idLiquidacion ='" + idLiquidacion + "'";
        rs = estSQL1.executeQuery(strConsultaSQL);
        if (rs.next() == true) {
            liquidacion = "Fecha Desde: " + rs.getString("FechaDesde") + " Fecha Hasta: " + rs.getString("FechaHasta") + " Periodo de Liquidacion: " + rs.getString("PeriodoDeLiquidacion");
        }
        return liquidacion;
    }

    private String buscarEmpleado(int dni) throws Exception {
        String hora = "";
        ConectarBD();
        strConsultaSQL = "SELECT Apellido,Nombre FROM empleados WHERE dniEmpleado ='" + dni + "'";
        rs = estSQL1.executeQuery(strConsultaSQL);
        if (rs.next() == true) {
            hora = rs.getString("Apellido") + " " + rs.getString("Nombre");
        }
        return hora.toUpperCase();
    }

}
