
package Empleados;

import Clases.Empleados;
import Clases.GrupoFamiliar;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class nuevoGrupo extends javax.swing.JDialog {
 Empleados emp = new Empleados();
 GrupoFamiliar gf = new GrupoFamiliar();
    public nuevoGrupo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        comboParentesco = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        comboDia = new javax.swing.JComboBox();
        comboMes = new javax.swing.JComboBox();
        comboAño = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        txtNombreGrupo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellidoGrupo = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtDniGrupo = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        comboDiscapacidad = new javax.swing.JComboBox();
        txtDniEmpleado = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(-16777216,true)), "GRUPO FAMILIAR"));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
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

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        jLabel10.setForeground(new java.awt.Color(-1,true));
        jLabel10.setText("Parentesco:");

        comboParentesco.setFont(new java.awt.Font("Tahoma", 0, 18));
        comboParentesco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Esposo/a", "Hijo/a", "Padre", "Madre", "Hermano/a" }));

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        jLabel20.setForeground(new java.awt.Color(-1,true));
        jLabel20.setText("Fecha de Nacimiento:");

        comboDia.setFont(new java.awt.Font("Tahoma", 0, 18));
        comboDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        comboMes.setFont(new java.awt.Font("Tahoma", 0, 18));
        comboMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MES", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", " " }));

        comboAño.setFont(new java.awt.Font("Tahoma", 0, 18));
        comboAño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Año", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016" }));

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        jLabel21.setForeground(new java.awt.Color(-1,true));
        jLabel21.setText("Nombre:");

        txtNombreGrupo.setFont(new java.awt.Font("Tahoma", 0, 18));
        txtNombreGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreGrupoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        jLabel6.setForeground(new java.awt.Color(-1,true));
        jLabel6.setText("Apellido:");

        txtApellidoGrupo.setFont(new java.awt.Font("Tahoma", 0, 18));
        txtApellidoGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoGrupoKeyTyped(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        jLabel28.setForeground(new java.awt.Color(-1,true));
        jLabel28.setText("Dni:");

        txtDniGrupo.setFont(new java.awt.Font("Tahoma", 0, 18));
        txtDniGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniGrupoKeyTyped(evt);
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

        jLabel24.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        jLabel24.setForeground(new java.awt.Color(-1,true));
        jLabel24.setText("Discapacidad:");

        comboDiscapacidad.setFont(new java.awt.Font("Tahoma", 0, 18));
        comboDiscapacidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "NO", "SI", " " }));

        txtDniEmpleado.setFont(new java.awt.Font("Tahoma", 0, 18));
        txtDniEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniEmpleadoKeyTyped(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        jLabel22.setForeground(new java.awt.Color(-1,true));
        jLabel22.setText("Empleado:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addComponent(jLabel22)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDniEmpleado)
                            .addComponent(txtDniGrupo)
                            .addComponent(txtApellidoGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(txtNombreGrupo)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel20)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(comboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboDiscapacidad, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboParentesco, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 396, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDniEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDniGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(txtNombreGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(comboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(comboParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(comboDiscapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-703)/2, (screenSize.height-448)/2, 703, 448);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniGrupoKeyTyped
        int k=(int)evt.getKeyChar();
        Numeros(k,evt);
        if (txtDniGrupo.getText().length()== 8){
            evt.consume();
        }
}//GEN-LAST:event_txtDniGrupoKeyTyped

    private void txtApellidoGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoGrupoKeyTyped
        int k=(int)evt.getKeyChar();
        if (k >= 0 && k <= 31 || k >= 33 && k <= 64 || k>=91 && k<=96 || k>=123 && k<=255){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
        }
}//GEN-LAST:event_txtApellidoGrupoKeyTyped

    private void txtNombreGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreGrupoKeyTyped
        int k=(int)evt.getKeyChar();
        if (k >= 0 && k <= 31 || k >= 33 && k <= 64 || k>=91 && k<=96 || k>=123 && k<=255){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
        }
}//GEN-LAST:event_txtNombreGrupoKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtDniGrupo.setText("");
        txtNombreGrupo.setText("");
        txtApellidoGrupo.setText("");
        comboParentesco.setSelectedIndex(0);
        comboDiscapacidad.setSelectedIndex(0);
        comboDia.setSelectedIndex(0);
        comboMes.setSelectedIndex(0);
        comboAño.setSelectedIndex(0);
        
}//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
  if(!txtDniGrupo.getText().equals("")&&!txtNombreGrupo.getText().equals("") && !txtApellidoGrupo.getText().equals("") 
     && !txtDniEmpleado.getText().equals("") && comboDia.getSelectedIndex()!=0  && comboMes.getSelectedIndex()!=0  &&
     comboAño.getSelectedIndex()!=0 && comboParentesco.getSelectedIndex()!=0 && comboDiscapacidad.getSelectedIndex()!=0
     && !buscaDniF(txtDniGrupo.getText())){
      
    String mes = String.valueOf(comboMes.getSelectedIndex());
    String fecha = comboDia.getSelectedItem().toString() + "/" + mes + "/" + comboAño.getSelectedItem().toString();
    int disc = comboDiscapacidad.getSelectedIndex();

    if(emp.fh.confirmarFecha(fecha)== true){
    String fec = comboAño.getSelectedItem().toString() + "/" + mes + "/" + comboDia.getSelectedItem().toString();
    emp.gf.setDni(Integer.parseInt(txtDniGrupo.getText()));
    emp.gf.setNombre(txtNombreGrupo.getText().toLowerCase());
    emp.gf.setApellido(txtApellidoGrupo.getText().toLowerCase());
    emp.gf.setParentesco(comboParentesco.getSelectedItem().toString().toLowerCase());
    emp.gf.setDniEmpleado(Integer.parseInt(txtDniEmpleado.getText()));
    emp.gf.setFechaNac(fec);
    if(disc==1){
    emp.gf.setDiscapacidad(false);
        }
        if(disc==2)
          {
    emp.gf.setDiscapacidad(true);
 }
    emp.gf.nuevoGrupoFamiliar();
    txtDniGrupo.setText("");
    txtNombreGrupo.setText("");
    txtApellidoGrupo.setText("");
    comboParentesco.setSelectedIndex(0);
    comboDia.setSelectedIndex(0);
    comboMes.setSelectedIndex(0);
    comboAño.setSelectedIndex(0);
    comboDiscapacidad.setSelectedIndex(0);
    txtDniGrupo.requestFocus();
   }
   else{
    JOptionPane.showMessageDialog(null,"Fecha de Nacimiento Incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
   }
   }
  else{
   JOptionPane.showMessageDialog(null,"INGRESE DATOS", "Error", JOptionPane.ERROR_MESSAGE);
  }
}//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
     dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtDniEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniEmpleadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniEmpleadoKeyTyped

    private void Numeros(int k, KeyEvent evt) {
      if (k >= 32 && k <= 47 || k>=58 && k<=255){
      evt.setKeyChar((char)KeyEvent.VK_CLEAR);
     }
    }

    private boolean buscaDniF(String dni) {
        txtDniGrupo.getText();
        gf.setDni(Integer.valueOf(txtDniGrupo.getText().toLowerCase()));
        return gf.buscar();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nuevoGrupo dialog = new nuevoGrupo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox comboAño;
    private javax.swing.JComboBox comboDia;
    private javax.swing.JComboBox comboDiscapacidad;
    private javax.swing.JComboBox comboMes;
    private javax.swing.JComboBox comboParentesco;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtApellidoGrupo;
    private javax.swing.JTextField txtDniEmpleado;
    private javax.swing.JTextField txtDniGrupo;
    private javax.swing.JTextField txtNombreGrupo;
    // End of variables declaration//GEN-END:variables

   

}
