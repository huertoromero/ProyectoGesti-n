

package Compras;

import Clases.Compra;
import finalgestion.ventanaPrincipal;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class nuevaCompra extends javax.swing.JDialog {

public static DefaultTableModel m;
Compra com = new Compra();

public nuevaCompra(java.awt.Frame parent, boolean modal) {
 super(parent, modal);
 initComponents();
 lblFecha.setText(com.fh.fecha());
 lblHora.setText(com.fh.hora());
 com.prov.cargarProveedores(1);
 //com.lc.pro.cargarCategoria(1); // HASTA QUE TERMINE DE HACER LO DE PRODUCTO
 com.ins.listarInsumosenCompra();
 String[] titulos ={"Producto","Cantidad", "SubTotal"};
 m = new DefaultTableModel(null, titulos);
 lineaCompra.setModel(m);
// lineaCompra.getColumnModel().getColumn(5).setMaxWidth(0);              // POR AHORA LO DEJO AHI.
// lineaCompra.getColumnModel().getColumn(5).setMinWidth(0);
// lineaCompra.getColumnModel().getColumn(5).setPreferredWidth(0);

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblFechaBd = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        comboProveedor = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCambiar = new javax.swing.JButton();
        comboInsumos = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lineaCompra = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compra de Productos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hora:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha:");

        lblFecha.setFont(new java.awt.Font("Segoe UI Light", 1, 18));
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("xx/xx/xxxx");

        lblHora.setFont(new java.awt.Font("Segoe UI Light", 1, 18));
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("00:00:00");

        lblFechaBd.setFont(new java.awt.Font("Segoe UI Light", 1, 18));
        lblFechaBd.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaBd.setText("xx/xx/xxxx");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 501, Short.MAX_VALUE)
                .addComponent(lblFechaBd)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblFecha)
                    .addComponent(jLabel1)
                    .addComponent(lblHora)
                    .addComponent(lblFechaBd))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(-16777216,true)), "Datos del Producto"));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 18));
        jLabel10.setForeground(new java.awt.Color(-1,true));
        jLabel10.setText("Proveedor:");

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 18));
        jLabel11.setForeground(new java.awt.Color(-1,true));
        jLabel11.setText("Precio Compra $:");

        txtPrecioCompra.setEditable(false);
        txtPrecioCompra.setFont(new java.awt.Font("Tahoma", 0, 18));
        txtPrecioCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioCompraKeyTyped(evt);
            }
        });

        txtCantidad.setEditable(false);
        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 18));
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 1, 18));
        jLabel14.setForeground(new java.awt.Color(-1,true));
        jLabel14.setText("Cantidad:");

        comboProveedor.setFont(new java.awt.Font("Tahoma", 1, 18));
        comboProveedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboProveedorItemStateChanged(evt);
            }
        });
        comboProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProveedorActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 1, 18));
        jLabel15.setForeground(new java.awt.Color(-1,true));
        jLabel15.setText("Descripcion:");

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar.png"))); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setEnabled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCambiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cambiar.png"))); // NOI18N
        btnCambiar.setText("CAMBIAR");
        btnCambiar.setEnabled(false);
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCambiar)
                .addContainerGap(700, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboInsumos, 0, 335, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addGap(36, 36, 36)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecioCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))
                .addGap(459, 459, 459))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(comboInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCambiar))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sali.png"))); // NOI18N
        btnSalir.setText("ATRAS");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 661, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lineaCompra.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(lineaCompra);

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        jLabel18.setText("Total $:");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 18));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(473, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        setBounds((screenSize.width-954)/2, (screenSize.height-689)/2, 954, 689);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        int k=(int)evt.getKeyChar();
        if (k >= 32 && k <= 47 || k>=58 && k<=255){
         evt.setKeyChar((char)KeyEvent.VK_CLEAR);
         }
}//GEN-LAST:event_txtCantidadKeyTyped

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
     if(!txtCantidad.getText().equals("") && !comboInsumos.getSelectedItem().toString().equals("") && !txtPrecioCompra.getText().equals("")){
   if(Integer.parseInt(txtCantidad.getText())>0 && Float.parseFloat(txtPrecioCompra.getText())>0){
    nuevaLineaCompra();
    com.calcularTotal(m.getRowCount());
   // comboCategoria.setSelectedIndex(0);
//    txtProducto.setText("");
    txtCantidad.setText("");
    txtPrecioCompra.setText("");
    comboInsumos.requestFocus();
    btnCancelar.setEnabled(true);
   }
   else{
    JOptionPane.showMessageDialog(null,"Valores Incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
   }
  }
  else{
   JOptionPane.showMessageDialog(null,"Datos Faltantes", "Error", JOptionPane.ERROR_MESSAGE);
  }
}//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
//        txtProducto.setText("");
        txtCantidad.setText("");
        txtPrecioCompra.setText("");
    //    comboCategoria.setSelectedIndex(0);
        btnAceptar.setEnabled(true);
}//GEN-LAST:event_btnCambiarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        nuevo();
}//GEN-LAST:event_btnCancelarActionPerformed

    private void comboProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProveedorActionPerformed
      
    }//GEN-LAST:event_comboProveedorActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        float total = Float.parseFloat(txtTotal.getText());
        if(total>0){
        int dniEmpleado = Integer.parseInt(ventanaPrincipal.lblDniEmpleado.getText());
        com.emp.setDni(dniEmpleado);
        com.prov.setIdProveedor(comboProveedor.getSelectedIndex() + 1);
        com.setFecha(com.fh.fechaBD().toString().toLowerCase());
        com.setHora(lblHora.getText().toString().toLowerCase());
        com.setTotal(total);
        com.nuevaCompra();
        for(int i=0; i<m.getRowCount(); i++){
        int idProveedor = comboProveedor.getSelectedIndex() + 1;
        com.dc.is.setNombre(String.valueOf(m.getValueAt(i,0).toString().toLowerCase()));
        com.dc.setNumeroCompra(idProveedor);
        com.dc.setCantidad(Integer.parseInt(m.getValueAt(i,1).toString().toLowerCase()));
//      com.dc.setPrecioCompra(Float.parseFloat(txtPrecioCompra.getText()));
        com.dc.setSubtotal(Float.parseFloat(m.getValueAt(i,2).toString().toLowerCase()));
        com.dc.nuevaLineaCompra(idProveedor);
        }
        nuevo();
        }
        else{
        JOptionPane.showMessageDialog(null,"DATOS FALTANTES", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        //if(!txtMonto.getText().equals("") && !txtVuelto.getText().equals("")){
//    float Monto = Float.parseFloat(txtMonto.getText());
//    float vuelto = Float.parseFloat(txtVuelto.getText());
//    float total = Float.parseFloat(txtTotal.getText());
//    if(Monto >0 && vuelto >=0 && Monto >=total && total>0){
//       // com.emp.setDni(Integer.parseInt(ventanaPrincipal.lblDniEmpleado.getText()));
//        com.prov.setIdProveedor(comboProveedor.getSelectedIndex() + 1);
//        com.setFecha(com.fh.fechaBD().toString().toLowerCase());
//        com.setHora(lblHora.getText().toString().toLowerCase());
//        com.setTotal(Float.parseFloat(txtTotal.getText().toString().toLowerCase()));
//        com.setMontoAbonado(Float.parseFloat(txtMonto.getText().toString().toLowerCase()));
//        com.setVuelto(Float.parseFloat(txtVuelto.getText().toString().toLowerCase()));
//        com.nuevaCompra();
//        for(int i =0; i < m.getRowCount(); i++){
//        int proveedor = comboProveedor.getSelectedIndex()+1;
//        com.lc.pro.setDescripcion(String.valueOf(m.getValueAt(i,0).toString().toLowerCase()));
//        com.lc.setPrecioCompra(Float.parseFloat(m.getValueAt(i,1).toString().toLowerCase()));
//        com.lc.setCantidad(Integer.parseInt(m.getValueAt(i,2).toString().toLowerCase()));
//        com.lc.setSubTotal(Float.parseFloat(m.getValueAt(i,3).toString().toLowerCase()));
//        com.lc.setPrecioVenta(Float.parseFloat(m.getValueAt(i,4).toString().toLowerCase()));
////        com.lc.pro.setCategoria(Integer.parseInt(m.getValueAt(i,6).toString()));  // HASTA QUE TERMINE DE HACER LO DE PRODUCTO
//        com.lc.setFechaAlta((lblFechaBd.getText().toLowerCase()));
//        com.lc.nuevaLineaCompra(proveedor);
//        }
//        nuevo();
//    }
//    else{
//     JOptionPane.showMessageDialog(null,"Monto Insuficiente", "Error", JOptionPane.ERROR_MESSAGE);
//    }
//}
//else{
// JOptionPane.showMessageDialog(null,"DATOS FALTANTES", "Error", JOptionPane.ERROR_MESSAGE);
// }
}//GEN-LAST:event_btnAgregarActionPerformed

    private void txtPrecioCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCompraKeyTyped
      int k=(int)evt.getKeyChar();
      if (k >= 32 && k <= 45 || k==47 ||k>=58 && k<=255){
       evt.setKeyChar((char)KeyEvent.VK_CLEAR);
      }
    }//GEN-LAST:event_txtPrecioCompraKeyTyped

    private void comboProveedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboProveedorItemStateChanged
      comboProveedor.setEnabled(false);
      btnCancelar.setEnabled(true);
//      txtProducto.setEditable(true);
      comboInsumos.requestFocus();
      txtCantidad.setEditable(true);
      txtPrecioCompra.setEditable(true);
      btnAceptar.setEnabled(true);
      btnCambiar.setEnabled(true);
   //   comboCategoria.setEnabled(true);
//      txtVuelto.setEnabled(false);
    }//GEN-LAST:event_comboProveedorItemStateChanged

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        lblFechaBd.setText(com.fh.fechaBD());
        lblFechaBd.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

private void nuevo() {
//txtProducto.setText("");
txtCantidad.setText("");
txtPrecioCompra.setText("");
comboProveedor.setSelectedIndex(0);
comboProveedor.setEnabled(true);
//comboCategoria.setSelectedIndex(0);
//comboCategoria.setEnabled(true);
txtCantidad.setEditable(false);
txtPrecioCompra.setEditable(false);
//txtProducto.setEditable(false);
btnCambiar.setEnabled(false);
btnAceptar.setEnabled(false);
m.setRowCount(0);
//txtMonto.setEnabled(false);
//txtMonto.setText("");
//txtVuelto.setEnabled(false);
//txtVuelto.setText("");
//txtMonto.setEnabled(false);
txtTotal.setText("");
btnAgregar.setEnabled(false);
btnCancelar.setEnabled(false);
}

private void nuevaLineaCompra() {

 int encontrado=0;
 String[] datos = new String[3];

 if(lineaCompra.getRowCount()==0){
  datos[0]=  comboInsumos.getSelectedItem().toString();
//  datos[1] = txtPrecioCompra.getText();
  datos[1] = txtCantidad.getText();
  datos[2]= String.valueOf(Float.parseFloat(txtPrecioCompra.getText()) * Float.parseFloat(txtCantidad.getText()));
//  datos[4] = String.valueOf(comboCategoria.getSelectedItem().toString());
//  datos[4]= String.valueOf(com.lc.calcularPrecioVenta(Float.parseFloat(txtPrecioCompra.getText())));
  //datos[5]= String.valueOf(comboCategoria.getSelectedIndex()+1);
  encontrado=1;
  m.addRow(datos);
  lineaCompra.setModel(m);
  calcularTotal();
 }
 else{
 for(int i=0; i < m.getRowCount(); i++){
  String insumo = String.valueOf(m.getValueAt(i,0).toString());
  if(insumo.equals(comboInsumos.getSelectedItem().toString())){
   datos[0]= comboInsumos.getSelectedItem().toString();
//   datos[1] = txtPrecioCompra.getText();
   datos[1] = txtCantidad.getText();
   datos[2]= String.valueOf(Float.parseFloat(txtPrecioCompra.getText()) * Float.parseFloat(txtCantidad.getText()));
//   datos[4] = String.valueOf(comboCategoria.getSelectedItem().toString());
//   datos[4]= String.valueOf(com.lc.calcularPrecioVenta(Float.parseFloat(txtPrecioCompra.getText())));
//   datos[6]= String.valueOf(comboCategoria.getSelectedIndex()+1);
   m.removeRow(i);
   m.addRow(datos);
   lineaCompra.setModel(m);
   i=m.getRowCount();
   encontrado=1;
   calcularTotal();
   }
   else{
    i = i+1;
   }
  }
 }
 if(encontrado==0){
  datos[0]= comboInsumos.getSelectedItem().toString();
  datos[1] = txtCantidad.getText();
//  datos[2] = txtPrecioCompra.getText();
  datos[2]= String.valueOf(Float.parseFloat(txtPrecioCompra.getText()) * Float.parseFloat(txtCantidad.getText()));
 // datos[4] = String.valueOf(comboCategoria.getSelectedItem().toString());
//  datos[4]= String.valueOf(com.lc.calcularPrecioVenta(Float.parseFloat(txtPrecioCompra.getText())));
 //datos[6]= String.valueOf(comboCategoria.getSelectedIndex()+1);
  m.addRow(datos);
  lineaCompra.setModel(m);
  calcularTotal();
 }
}

private void calcularTotal() {
 float total= 0;
 System.out.println("Dentro de calcular total");
 for(int i =0; i < m.getRowCount(); i++){
 System.out.println("dentro del for para la columna"+i);
  total = total + Float.parseFloat(m.getValueAt(i,2).toString());
 }
 if(total==0){
  txtTotal.setText("");
//  txtVuelto.setText("");
//  txtMonto.setText("");
  btnAgregar.setEnabled(false);
  btnCancelar.setEnabled(false);
 }
 else{
  txtTotal.setText(String.valueOf(total));
//  txtMonto.setText("");
//  txtVuelto.setText("");
 }
}

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nuevaCompra dialog = new nuevaCompra(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAceptar;
    public static javax.swing.JButton btnAgregar;
    public static javax.swing.JButton btnCambiar;
    public static javax.swing.JButton btnCancelar;
    public static javax.swing.JButton btnSalir;
    public static javax.swing.JComboBox comboInsumos;
    public static javax.swing.JComboBox comboProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFechaBd;
    private javax.swing.JLabel lblHora;
    public static javax.swing.JTable lineaCompra;
    public static javax.swing.JTextField txtCantidad;
    public static javax.swing.JTextField txtPrecioCompra;
    public static javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables



}
