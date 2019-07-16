package Liquidacion;

import Conceptos.Conceptos;
import java.awt.event.KeyEvent;

public class actualizarConceptos extends javax.swing.JDialog {
 Conceptos con = new Conceptos();
  public actualizarConceptos(java.awt.Frame parent, boolean modal) {
   super(parent, modal);
   initComponents();
  }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        txtAguinaldoJunio = new javax.swing.JTextField();
        txtPresentismo = new javax.swing.JTextField();
        txtAporte = new javax.swing.JTextField();
        txtJubilacion = new javax.swing.JTextField();
        txtAguinaldoDiciembre = new javax.swing.JTextField();
        txtLey = new javax.swing.JTextField();
        txtSindicato = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        comboCategoria1 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        txtObra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizar Conceptos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Actualizar Conceptos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(594, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sali.png"))); // NOI18N
        btnSalir.setText("ATRAS");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 519, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(-1,true));
        jLabel1.setText("Jubilacion:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(-1,true));
        jLabel2.setText("Salario Basico:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(-1,true));
        jLabel3.setText("Aguinaldo Junio:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(-1,true));
        jLabel4.setText("Aguinaldo Diciembre:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(-1,true));
        jLabel5.setText("Presentismo:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(-1,true));
        jLabel6.setText("Aporte Obra Social:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(-1,true));
        jLabel7.setText("Ley 23660:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(-1,true));
        jLabel8.setText("Aporte Sindicato:");

        txtSalario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalarioKeyTyped(evt);
            }
        });

        txtAguinaldoJunio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAguinaldoJunio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAguinaldoJunioKeyTyped(evt);
            }
        });

        txtPresentismo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPresentismo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPresentismoKeyTyped(evt);
            }
        });

        txtAporte.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAporteKeyTyped(evt);
            }
        });

        txtJubilacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtJubilacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJubilacionKeyTyped(evt);
            }
        });

        txtAguinaldoDiciembre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAguinaldoDiciembre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAguinaldoDiciembreKeyTyped(evt);
            }
        });

        txtLey.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLey.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLeyKeyTyped(evt);
            }
        });

        txtSindicato.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSindicato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSindicatoKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(-1,true));
        jLabel10.setText("Categoria:");

        comboCategoria1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comboCategoria1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCategoria1ItemStateChanged(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(-1,true));
        jLabel11.setText("Obra Social:");

        txtObra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtObra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtObraKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAporte)
                            .addComponent(txtPresentismo)
                            .addComponent(txtAguinaldoDiciembre)
                            .addComponent(txtAguinaldoJunio, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSindicato)
                            .addComponent(txtObra, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(txtLey)
                            .addComponent(txtJubilacion))))
                .addContainerGap(193, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(comboCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAguinaldoJunio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtJubilacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAguinaldoDiciembre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtLey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPresentismo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtSindicato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
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

        setSize(new java.awt.Dimension(802, 462));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     con.cargarCategorias();
     con.cargarConceptos();
     txtAguinaldoDiciembre.setEnabled(false);
     txtAguinaldoJunio.setEnabled(false);
     txtAporte.setEnabled(false);
     txtJubilacion.setEnabled(false);
     txtObra.setEnabled(false);
     txtPresentismo.setEnabled(false);
     txtSalario.setEnabled(false);
     txtSindicato.setEnabled(false);
     txtLey.setEnabled(false);

    }//GEN-LAST:event_formWindowOpened

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
     dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void comboCategoria1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCategoria1ItemStateChanged
     txtSalario.setText("");
     con.cargarSalario(comboCategoria1.getSelectedIndex()+1);
     txtAguinaldoDiciembre.setEnabled(true);
     txtAguinaldoJunio.setEnabled(true);
     txtAporte.setEnabled(true);
     txtJubilacion.setEnabled(true);
     txtObra.setEnabled(true);
     txtPresentismo.setEnabled(true);
     txtSalario.setEnabled(true);
     txtSindicato.setEnabled(true);
     txtLey.setEnabled(true);
     
    }//GEN-LAST:event_comboCategoria1ItemStateChanged

    private void txtJubilacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJubilacionKeyTyped
     int k=(int)evt.getKeyChar();
     numeros(k,evt);
    }//GEN-LAST:event_txtJubilacionKeyTyped

    private void txtAguinaldoJunioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAguinaldoJunioKeyTyped
     int k=(int)evt.getKeyChar();
     numeros(k,evt);
    }//GEN-LAST:event_txtAguinaldoJunioKeyTyped

    private void txtSalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioKeyTyped
     int k=(int)evt.getKeyChar();
     numeros(k,evt);
    }//GEN-LAST:event_txtSalarioKeyTyped

    private void txtAguinaldoDiciembreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAguinaldoDiciembreKeyTyped
     int k=(int)evt.getKeyChar();
     numeros(k,evt);
    }//GEN-LAST:event_txtAguinaldoDiciembreKeyTyped

    private void txtLeyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLeyKeyTyped
     int k=(int)evt.getKeyChar();
     numeros(k,evt);
    }//GEN-LAST:event_txtLeyKeyTyped

    private void txtPresentismoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPresentismoKeyTyped
     int k=(int)evt.getKeyChar();
     numeros(k,evt);
    }//GEN-LAST:event_txtPresentismoKeyTyped

    private void txtSindicatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSindicatoKeyTyped
     int k=(int)evt.getKeyChar();
     numeros(k,evt);
    }//GEN-LAST:event_txtSindicatoKeyTyped

    private void txtAporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAporteKeyTyped
     int k=(int)evt.getKeyChar();
     numeros(k,evt);
    }//GEN-LAST:event_txtAporteKeyTyped

    private void txtObraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObraKeyTyped
     int k=(int)evt.getKeyChar();
     numeros(k,evt);
    }//GEN-LAST:event_txtObraKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
     comboCategoria1.setSelectedIndex(0);
     txtSalario.setText("");
     txtAguinaldoJunio.setText("");
     txtAguinaldoDiciembre.setText("");
     txtPresentismo.setText("");
     txtAporte.setText("");
     txtJubilacion.setText("");
     txtLey.setText("");
     txtSindicato.setText("");
     txtObra.setText("");
     txtAguinaldoDiciembre.setEnabled(false);
     txtAguinaldoJunio.setEnabled(false);
     txtAporte.setEnabled(false);
     txtJubilacion.setEnabled(false);
     txtObra.setEnabled(false);
     txtPresentismo.setEnabled(false);
     txtSalario.setEnabled(false);
     txtSindicato.setEnabled(false);
     txtLey.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
     float salario = Float.parseFloat(txtSalario.getText().toLowerCase());
     int categoria = comboCategoria1.getSelectedIndex()+1;
     float scj = Float.parseFloat(txtAguinaldoJunio.getText().toLowerCase());
     float scd = Float.parseFloat(txtAguinaldoDiciembre.getText().toLowerCase());
     float jubilacion = Float.parseFloat(txtJubilacion.getText().toLowerCase());
     float ley = Float.parseFloat(txtLey.getText().toLowerCase());
     float sindicato = Float.parseFloat(txtSindicato.getText().toLowerCase());
     float presentismo = Float.parseFloat(txtPresentismo.getText().toLowerCase());
     float obraSocial = Float.parseFloat(txtObra.getText().toLowerCase());
     float aporte = Float.parseFloat(txtAporte.getText().toLowerCase());
     con.actualizarConceptos(salario,categoria,scj,scd,jubilacion,ley,sindicato,presentismo,obraSocial,aporte);
    }//GEN-LAST:event_btnAceptarActionPerformed

   private void numeros(int k, KeyEvent evt) {
    if (k >= 32 && k <= 45 || k==47 ||k>=58 && k<=255){
     evt.setKeyChar((char)KeyEvent.VK_CLEAR);
    }
   }

   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                actualizarConceptos dialog = new actualizarConceptos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalir;
    public static javax.swing.JComboBox comboCategoria1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JTextField txtAguinaldoDiciembre;
    public static javax.swing.JTextField txtAguinaldoJunio;
    public static javax.swing.JTextField txtAporte;
    public static javax.swing.JTextField txtJubilacion;
    public static javax.swing.JTextField txtLey;
    public static javax.swing.JTextField txtObra;
    public static javax.swing.JTextField txtPresentismo;
    public static javax.swing.JTextField txtSalario;
    public static javax.swing.JTextField txtSindicato;
    // End of variables declaration//GEN-END:variables
}