package Compras;

import Clases.Compra;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class reporteCompras extends javax.swing.JDialog {

 public static DefaultTableModel m;
  Compra com = new Compra();
  private String[] titulos;
  public String strTituloPDF = "UTN - FRT";
  public DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
  
  public reporteCompras(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    txtFechaDel.setVisible(false);
    txtFechaAl.setVisible(false);
    com.prov.cargarProveedores(3);
    comboProveedor.setEnabled(false);
    nuevo();
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnMostrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnImprimir1 = new javax.swing.JButton();
        radioTodos = new javax.swing.JRadioButton();
        radioProveedor = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JDtChFechaDel = new datechooser.beans.DateChooserCombo();
        JDtChFechaAl = new datechooser.beans.DateChooserCombo();
        txtFechaAl1 = new javax.swing.JTextField();
        txtFechaDel = new javax.swing.JTextField();
        txtFechaAl = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReportes = new javax.swing.JTable();
        txtFechaDel2 = new javax.swing.JTextField();
        comboProveedor = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LISTADO DE COMPRAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(754, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportee.png"))); // NOI18N
        btnMostrar.setText("MOSTRAR");
        btnMostrar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnImprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sali.png"))); // NOI18N
        btnImprimir1.setText("ATRAS");
        btnImprimir1.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnImprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 653, Short.MAX_VALUE)
                .addComponent(btnImprimir1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrar)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        radioTodos.setBackground(new java.awt.Color(0, 204, 204));
        radioTodos.setFont(new java.awt.Font("Segoe UI Light", 1, 14));
        radioTodos.setSelected(true);
        radioTodos.setText("MOSTRAR TODAS");
        radioTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioTodosMouseClicked(evt);
            }
        });

        radioProveedor.setBackground(new java.awt.Color(0, 204, 204));
        radioProveedor.setFont(new java.awt.Font("Segoe UI Light", 1, 14));
        radioProveedor.setText("POR PROVEEDOR");
        radioProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioProveedorMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14));
        jLabel2.setText("DEL DIA:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14));
        jLabel3.setText("AL DIA:");

        JDtChFechaDel.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                JDtChFechaDelOnCommit(evt);
            }
        });

        JDtChFechaAl.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                JDtChFechaAlOnCommit(evt);
            }
        });

        txtFechaAl1.setEditable(false);
        txtFechaAl1.setFont(new java.awt.Font("Tahoma", 1, 18));
        txtFechaAl1.setForeground(new java.awt.Color(255, 0, 0));

        txtFechaDel.setFont(new java.awt.Font("Tahoma", 1, 12));
        txtFechaDel.setEnabled(false);

        txtFechaAl.setFont(new java.awt.Font("Tahoma", 1, 12));
        txtFechaAl.setEnabled(false);

        tablaReportes.setFont(new java.awt.Font("Tahoma", 1, 14));
        tablaReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaReportesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaReportes);

        txtFechaDel2.setEditable(false);
        txtFechaDel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        txtFechaDel2.setForeground(new java.awt.Color(204, 0, 0));

        comboProveedor.setFont(new java.awt.Font("Tahoma", 1, 18));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaDel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JDtChFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaAl1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JDtChFechaAl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaAl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(radioTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(radioProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTodos)
                    .addComponent(radioProveedor)
                    .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFechaDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFechaAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtFechaDel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JDtChFechaAl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFechaAl1)
                                .addComponent(jLabel3))
                            .addComponent(JDtChFechaDel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-938)/2, (screenSize.height-579)/2, 938, 579);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        if(radioTodos.isSelected()){
         if((txtFechaDel2.getText().equals(""))&& txtFechaAl1.getText().equals("")){
          muestra3();
         }
         else{
          muestra();
         }
        }
        if(radioProveedor.isSelected()){
         if((txtFechaDel2.getText().equals(""))&& txtFechaAl1.getText().equals("")){
          muestra4();
         }
         else{
          muestra2();
         }
         }
}//GEN-LAST:event_btnMostrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
     m.setRowCount(0);
     btnMostrar.setEnabled(true);
     radioProveedor.setEnabled(true);
     radioTodos.setEnabled(true);
     radioTodos.setSelected(true);
     radioProveedor.setSelected(false);
     txtFechaDel.setText("");
     txtFechaAl1.setText("");
     txtFechaDel2.setText("");
     txtFechaAl.setText("");
     comboProveedor.setEnabled(false);
}//GEN-LAST:event_btnCancelarActionPerformed

    private void radioTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioTodosMouseClicked
        if(radioTodos.isSelected()==true){
         radioProveedor.setSelected(false);
         comboProveedor.setEnabled(false);
        }
        else{
         radioProveedor.setSelected(true);
         comboProveedor.setEnabled(true);
         radioTodos.setSelected(false);
        }
}//GEN-LAST:event_radioTodosMouseClicked

    private void radioProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioProveedorMouseClicked
        if(radioProveedor.isSelected()== true){
         comboProveedor.setEnabled(true);
         radioTodos.setSelected(false);
        }
        else{
         comboProveedor.setEnabled(false);
         radioTodos.setSelected(true);
        }
}//GEN-LAST:event_radioProveedorMouseClicked

    private void JDtChFechaDelOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_JDtChFechaDelOnCommit
        String []datos=JDtChFechaDel.getText().split("/");
        String Dia, Mes, Ano;
        Ano="";
        Mes="";
        Dia="";
        Ano=datos[2];
        Mes=datos[1];
        Dia=datos[0];
        txtFechaDel2.setText(Dia +"-" + Mes + "-"+ Ano);
        txtFechaDel.setText(Ano +"-" + Mes + "-" + Dia);
}//GEN-LAST:event_JDtChFechaDelOnCommit

    private void JDtChFechaAlOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_JDtChFechaAlOnCommit
        String []datos=JDtChFechaAl.getText().split("/");
        String Dia, Mes, Ano;
        Ano="";
        Mes="";
        Dia="";
        Ano=datos[2];
        Mes=datos[1];
        Dia=datos[0];
        txtFechaAl1 .setText(Dia+"-" + Mes + "-"+ Ano);
        txtFechaAl.setText(Ano+"-" + Mes + "-"+ Dia);
}//GEN-LAST:event_JDtChFechaAlOnCommit

    private void tablaReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaReportesMouseClicked
     tablaReportes.setSelectionBackground(Color.YELLOW);
     mostrarLineaCompra lc = new mostrarLineaCompra(null,true);
     lc.setVisible(true);
    }//GEN-LAST:event_tablaReportesMouseClicked

    private void btnImprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir1ActionPerformed
      dispose();
    }//GEN-LAST:event_btnImprimir1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                reporteCompras dialog = new reporteCompras(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo JDtChFechaAl;
    private datechooser.beans.DateChooserCombo JDtChFechaDel;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnImprimir1;
    public static javax.swing.JButton btnMostrar;
    public static javax.swing.JComboBox comboProveedor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioProveedor;
    private javax.swing.JRadioButton radioTodos;
    public static javax.swing.JTable tablaReportes;
    private javax.swing.JTextField txtFechaAl;
    private javax.swing.JTextField txtFechaAl1;
    private javax.swing.JTextField txtFechaDel;
    private javax.swing.JTextField txtFechaDel2;
    // End of variables declaration//GEN-END:variables

    private void muestra() {
    if(!txtFechaDel.getText().equals("")&& !txtFechaAl.getText().equals("")){
     btnMostrar.setEnabled(false);
     radioProveedor.setEnabled(false);
     radioTodos.setEnabled(false);
     String fechadel = txtFechaDel.getText();
     String fechaAl = txtFechaAl.getText();
     com.reporteCompleto(fechadel,fechaAl);
    }
    else{
     JOptionPane.showMessageDialog(this,"Ingrese Rango de Fechas a buscar","Error",JOptionPane.ERROR_MESSAGE);
     btnMostrar.setEnabled(true);
    }
    }

   private void muestra2() {
    if(!txtFechaDel.getText().equals("") && !txtFechaAl.getText().equals("")){
     btnMostrar.setEnabled(false);
     radioProveedor.setEnabled(false);
     radioTodos.setEnabled(false);
     String fechadel = txtFechaDel.getText();
     String fechaAl = txtFechaAl.getText();
     com.prov.setIdProveedor(comboProveedor.getSelectedIndex()+1);
     com.reporteCompraProveedor(fechadel,fechaAl);
     }
     else{
      JOptionPane.showMessageDialog(this,"Ingrese Rango de Fechas a buscar","Error",JOptionPane.ERROR_MESSAGE);
     }
    }

    private void muestra3() {
     btnMostrar.setEnabled(false);
     radioProveedor.setEnabled(false);
     radioTodos.setEnabled(false);
     com.reporteCompras();
    }

    private void nuevo() {
     txtFechaDel.setVisible(false);
     txtFechaAl.setVisible(false);
     titulos = new String[5];
     titulos[0]= "Numero de Compra";
//     titulos[1] = "DniEmpleado";
     titulos[1] = "Razon Social";
     titulos[2] = "Fecha";
     titulos[3] = "Hora";
     titulos[4] = "Total";
     m = new DefaultTableModel(null,titulos);
     tablaReportes.setModel(m);
     for(int i=0; i < 5; i++){
     modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
     tablaReportes.getColumnModel().getColumn(i).setCellRenderer(modelocentrar);
     }
    }

    private void muestra4() {
     btnMostrar.setEnabled(false);
     radioProveedor.setEnabled(false);
     radioTodos.setEnabled(false);
     com.prov.setIdProveedor(comboProveedor.getSelectedIndex()+1);
     com.reporteProveedor();
    }


}
