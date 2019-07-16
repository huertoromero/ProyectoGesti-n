package Pdf;

import Pdf.CrearConexion;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
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

public class GenerarPDFEmpleados {

    private String strNombreDelPDF;
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

    public GenerarPDFEmpleados(String titulo) {
        Colocar_Destino();
        strRotuloPDF = titulo;
        try {
            document = new Document(PageSize.A4.rotate(), 150, 150, 150, 150);
            writer.getInstance(document, new FileOutputStream(this.ruta_destino_1 + ".pdf"));
            document.open();
            Paragraph titulo1 = new Paragraph("elSalon System", FontFactory.getFont(FontFactory.HELVETICA, 18, Font.BOLDITALIC));
            Chapter capitulo1 = new Chapter(titulo1, 1);
            capitulo1.setNumberDepth(0);
            document.add(capitulo1);
            agregarMetaDatos(document);
            document.close();
            this.abrirPDF(this.ruta_destino_1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    void abrirPDF(String ruta) {
        try {
            JOptionPane.showMessageDialog(null, "Se ha generado el listado", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            File path = new File(ruta + ".pdf");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void agregarMetaDatos(Document document) throws DocumentException {
        Paragraph ParrafoHoja = new Paragraph();
        agregarLineasEnBlanco(ParrafoHoja, 1);
        ParrafoHoja.add(new Paragraph(strRotuloPDF.toUpperCase()));
        agregarLineasEnBlanco(ParrafoHoja, 1);
        agregarTabla(ParrafoHoja);
        agregarLineasEnBlanco(ParrafoHoja, 2);
        document.add(ParrafoHoja);
    }

    private void agregarLineasEnBlanco(Paragraph parrafo, int nLineas) {
        for (int i = 0; i < nLineas; i++) {
            parrafo.add(new Paragraph(" "));
        }
    }

    private void agregarTabla(Paragraph parrafo) {
        float anchosFilas[] = {1f, 2.5f, 2f, 1.5f, 2f};
        PdfPTable tabla = new PdfPTable(anchosFilas);
        String rotulosColumnas[] = {"Dni", "Nombre", "E-Mail", "Telefono", "Direccion"};
        tabla.setWidthPercentage(150);
        tabla.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell cell = new PdfPCell(new Paragraph("EMPLEADOS"));
        cell.setColspan(12);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        tabla.addCell(cell);
        try {
            if (ConectarBD()) {
                for (int i = 0; i < rotulosColumnas.length; i++) {
                    cell = new PdfPCell(new Paragraph(rotulosColumnas[i]));
                    cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    tabla.addCell(cell);
                }
                strConsultaSQL = "SELECT emp.dniEmpleado,emp.Nombre,emp.Apellido,emp.Mail,emp.Telefono,emp.direccion FROM empleados emp WHERE emp.estado = 1";  // puede haber error o mostrar mal los datos
                rs = estSQL1.executeQuery(strConsultaSQL);
                while (rs.next()) {
                    cell = new PdfPCell(new Paragraph(String.valueOf(rs.getInt("dniEmpleado"))));
                    tabla.addCell(cell);
                    cell = new PdfPCell(new Paragraph(rs.getString("Nombre") + " " + rs.getString("Apellido")));
                    tabla.addCell(cell);
                    cell = new PdfPCell(new Paragraph(rs.getString("Mail")));
                    tabla.addCell(cell);
                    cell = new PdfPCell(new Paragraph(String.valueOf(rs.getLong("Telefono"))));
                    tabla.addCell(cell);
                    cell = new PdfPCell(new Paragraph(String.valueOf(rs.getString("direccion"))));
                    tabla.addCell(cell);
                }

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
        this.ruta_destino_1 = "C:\\Reportes\\Empleados\\ListadoDeEmpleado  " + ventanaPrincipal.listEmpleados++;

    }
}
