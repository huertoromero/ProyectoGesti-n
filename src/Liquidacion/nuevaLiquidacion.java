
package Liquidacion;

import Liquidacion.detalleLiquidacionn;
import Clases.Liquidacion;
import Clases.Salario;
import Pdf.boletaPago;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class nuevaLiquidacion extends javax.swing.JDialog {

 Liquidacion liq = new Liquidacion();
 Salario sal = new Salario();
 public static DefaultTableModel m;


public nuevaLiquidacion(java.awt.Frame parent, boolean modal) {
 super(parent, modal);
 initComponents();
 liq.emp.cargarCategoria(3);
 comboEmpleados.setEnabled(false);
 lblDesde.setText(liq.fh.fechaDesde());
 lblHasta.setText(liq.fh.fecha());
 lblPeriodo.setText(liq.fh.periodo());
 btnAceptar.setEnabled(false);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroupAguinaldo = new javax.swing.ButtonGroup();
        btngroupVacaciones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        comboEmpleados = new javax.swing.JComboBox();
        lblFechaHasta1 = new javax.swing.JLabel();
        lblFechaHasta5 = new javax.swing.JLabel();
        lblHasta = new javax.swing.JLabel();
        lblFechaHasta7 = new javax.swing.JLabel();
        lblDesde = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        lblPeriodo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSalarioNeto = new javax.swing.JTextField();
        panelConcepto = new javax.swing.JPanel();
        radAguinaldoJ = new javax.swing.JRadioButton();
        radAguinaldoD = new javax.swing.JRadioButton();
        radVacaciones14 = new javax.swing.JRadioButton();
        radVacaciones = new javax.swing.JRadioButton();
        radPresentismo = new javax.swing.JRadioButton();
        radVacaciones21 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConceptos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCuil = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva Liquidacion");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(-16777216,true))));

        jLabel9.setBackground(new java.awt.Color(-16711681,true));
        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        jLabel9.setForeground(new java.awt.Color(-1,true));
        jLabel9.setText("Categoria:");

        comboCategoria.setFont(new java.awt.Font("Tahoma", 1, 18));
        comboCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCategoriaItemStateChanged(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(-16711681,true));
        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        jLabel11.setForeground(new java.awt.Color(-1,true));
        jLabel11.setText("DNI DEL EMPLEADO:");

        comboEmpleados.setFont(new java.awt.Font("Tahoma", 1, 18));
        comboEmpleados.setName("comboEmpleados"); // NOI18N
        comboEmpleados.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboEmpleadosItemStateChanged(evt);
            }
        });

        lblFechaHasta1.setBackground(new java.awt.Color(-16711681,true));
        lblFechaHasta1.setFont(new java.awt.Font("Segoe UI Light", 1, 18));
        lblFechaHasta1.setForeground(new java.awt.Color(-1,true));
        lblFechaHasta1.setText("Periodo:");

        lblFechaHasta5.setBackground(new java.awt.Color(-16711681,true));
        lblFechaHasta5.setFont(new java.awt.Font("Segoe UI Light", 1, 18));
        lblFechaHasta5.setForeground(new java.awt.Color(-1,true));
        lblFechaHasta5.setText("HASTA:");

        lblHasta.setBackground(new java.awt.Color(-16711681,true));
        lblHasta.setFont(new java.awt.Font("Segoe UI Light", 1, 18));
        lblHasta.setForeground(new java.awt.Color(-1,true));
        lblHasta.setText("xx/xx/xxxx");

        lblFechaHasta7.setBackground(new java.awt.Color(-16711681,true));
        lblFechaHasta7.setFont(new java.awt.Font("Segoe UI Light", 1, 18));
        lblFechaHasta7.setForeground(new java.awt.Color(-1,true));
        lblFechaHasta7.setText("DESDE:");

        lblDesde.setBackground(new java.awt.Color(-16711681,true));
        lblDesde.setFont(new java.awt.Font("Segoe UI Light", 1, 18));
        lblDesde.setForeground(new java.awt.Color(-1,true));
        lblDesde.setText("xx/xx/xxxx");

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar.png"))); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblPeriodo.setBackground(new java.awt.Color(-16711681,true));
        lblPeriodo.setFont(new java.awt.Font("Segoe UI Light", 1, 18));
        lblPeriodo.setForeground(new java.awt.Color(-1,true));
        lblPeriodo.setText("xx/xx/xxxx");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblFechaHasta7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDesde)
                        .addGap(99, 99, 99)
                        .addComponent(lblFechaHasta5)
                        .addGap(18, 18, 18)
                        .addComponent(lblHasta)
                        .addGap(152, 152, 152)
                        .addComponent(lblFechaHasta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPeriodo))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAceptar)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaHasta7)
                    .addComponent(lblDesde)
                    .addComponent(lblFechaHasta1)
                    .addComponent(lblFechaHasta5)
                    .addComponent(lblHasta)
                    .addComponent(lblPeriodo))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(comboEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setBackground(new java.awt.Color(-16711681,true));
        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        jLabel13.setText("Descuentos:");

        txtSubTotal.setEditable(false);
        txtSubTotal.setFont(new java.awt.Font("Tahoma", 0, 18));

        jLabel15.setBackground(new java.awt.Color(-16711681,true));
        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        jLabel15.setText("Salario Neto:");

        txtSalarioNeto.setEditable(false);
        txtSalarioNeto.setFont(new java.awt.Font("Tahoma", 1, 18));

        panelConcepto.setBackground(new java.awt.Color(0, 102, 102));
        panelConcepto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(-16777216,true)), "Conceptos"));
        panelConcepto.setForeground(new java.awt.Color(-1,true));

        radAguinaldoJ.setBackground(new java.awt.Color(-16751002,true));
        btngroupAguinaldo.add(radAguinaldoJ);
        radAguinaldoJ.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        radAguinaldoJ.setForeground(new java.awt.Color(-1,true));
        radAguinaldoJ.setText("Aguinaldo Junio");
        radAguinaldoJ.setEnabled(false);
        radAguinaldoJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radAguinaldoJMouseClicked(evt);
            }
        });

        radAguinaldoD.setBackground(new java.awt.Color(-16751002,true));
        btngroupAguinaldo.add(radAguinaldoD);
        radAguinaldoD.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        radAguinaldoD.setForeground(new java.awt.Color(-1,true));
        radAguinaldoD.setText("Aguinaldo Diciembre");
        radAguinaldoD.setEnabled(false);
        radAguinaldoD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radAguinaldoDMouseClicked(evt);
            }
        });

        radVacaciones14.setBackground(new java.awt.Color(-16751002,true));
        btngroupVacaciones.add(radVacaciones14);
        radVacaciones14.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        radVacaciones14.setForeground(new java.awt.Color(-1,true));
        radVacaciones14.setText("Vacaciones 14 dias");
        radVacaciones14.setEnabled(false);
        radVacaciones14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radVacaciones14MouseClicked(evt);
            }
        });

        radVacaciones.setBackground(new java.awt.Color(-16751002,true));
        btngroupVacaciones.add(radVacaciones);
        radVacaciones.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        radVacaciones.setForeground(new java.awt.Color(-1,true));
        radVacaciones.setText("Vacaciones  7 dias");
        radVacaciones.setEnabled(false);
        radVacaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radVacacionesMouseClicked(evt);
            }
        });

        radPresentismo.setBackground(new java.awt.Color(-16751002,true));
        radPresentismo.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        radPresentismo.setForeground(new java.awt.Color(-1,true));
        radPresentismo.setText("Presentismo");
        radPresentismo.setEnabled(false);
        radPresentismo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radPresentismoMouseClicked(evt);
            }
        });

        radVacaciones21.setBackground(new java.awt.Color(-16751002,true));
        btngroupVacaciones.add(radVacaciones21);
        radVacaciones21.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        radVacaciones21.setForeground(new java.awt.Color(-1,true));
        radVacaciones21.setText("Vacaciones 21 dias");
        radVacaciones21.setEnabled(false);
        radVacaciones21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radVacaciones21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelConceptoLayout = new javax.swing.GroupLayout(panelConcepto);
        panelConcepto.setLayout(panelConceptoLayout);
        panelConceptoLayout.setHorizontalGroup(
            panelConceptoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConceptoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelConceptoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radPresentismo)
                    .addComponent(radVacaciones21)
                    .addComponent(radVacaciones14)
                    .addComponent(radVacaciones)
                    .addComponent(radAguinaldoJ)
                    .addComponent(radAguinaldoD))
                .addContainerGap())
        );
        panelConceptoLayout.setVerticalGroup(
            panelConceptoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConceptoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radAguinaldoJ)
                .addGap(18, 18, 18)
                .addComponent(radAguinaldoD)
                .addGap(18, 18, 18)
                .addComponent(radVacaciones)
                .addGap(18, 18, 18)
                .addComponent(radVacaciones14)
                .addGap(18, 18, 18)
                .addComponent(radVacaciones21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(radPresentismo))
        );

        jLabel14.setBackground(new java.awt.Color(-16711681,true));
        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        jLabel14.setText("Monto:");

        txtDescuento.setEditable(false);
        txtDescuento.setFont(new java.awt.Font("Tahoma", 0, 18));

        tablaConceptos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaConceptos);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnAgregar.setEnabled(false);
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

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sali.png"))); // NOI18N
        btnSalir.setText("ATRAS");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 631, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir)))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(-16777216,true)), "Datos del Empleado"));

        jLabel10.setBackground(new java.awt.Color(-16711681,true));
        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        jLabel10.setForeground(new java.awt.Color(-1,true));
        jLabel10.setText("Apellido y Nombre:");

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 18));

        txtCuil.setEditable(false);
        txtCuil.setFont(new java.awt.Font("Tahoma", 0, 18));

        jLabel12.setBackground(new java.awt.Color(-16711681,true));
        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 18));
        jLabel12.setForeground(new java.awt.Color(-1,true));
        jLabel12.setText("Cuil:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCuil, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(panelConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSalarioNeto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 175, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtSalarioNeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-924)/2, (screenSize.height-676)/2, 924, 676);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     String[] titulos ={"Descripcion","Monto","Descuento"};
     m = new DefaultTableModel(null,titulos);
     tablaConceptos.setModel(m);
    }//GEN-LAST:event_formWindowOpened

    private void comboCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCategoriaItemStateChanged
     sal.emp.setCategoria(comboCategoria.getSelectedIndex()+1);
     sal.emp.cargarEmpleado();
     btnAceptar.setEnabled(true);
    }//GEN-LAST:event_comboCategoriaItemStateChanged

    private void radAguinaldoJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radAguinaldoJMouseClicked
        seleccion();
    }//GEN-LAST:event_radAguinaldoJMouseClicked

    private void radAguinaldoDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radAguinaldoDMouseClicked
        seleccion();
    }//GEN-LAST:event_radAguinaldoDMouseClicked

    private void radVacaciones14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radVacaciones14MouseClicked
//      if(radVacaciones14.isSelected()==true){
//      sal.calcularVacaciones14(Float.parseFloat(tablaConceptos.getValueAt(0,1).toString()));
//      calcularSubTotal();
//      calcularTotal();
//     }
//     else{
//      for(int i =0; i < m.getRowCount(); i++){
//      if(m.getValueAt(i,0).toString().equals("Vacaciones 14 Dias")){
//       m.removeRow(i);
//       calcularSubTotal();
//       calcularTotal();
//      }
//     }
//     }
        seleccionVacaciones();
    }//GEN-LAST:event_radVacaciones14MouseClicked

    private void radVacacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radVacacionesMouseClicked
//     if(radVacaciones.isSelected()==true){
//      sal.calcularVacaciones(Float.parseFloat(tablaConceptos.getValueAt(0,1).toString()));
//      calcularSubTotal();
//      calcularTotal();
//     }
//     else{
//      for(int i =0; i < m.getRowCount(); i++){
//      if(m.getValueAt(i,0).toString().equals("Vacaciones 7 Dias")){
//       m.removeRow(i);
//       calcularSubTotal();
//       calcularTotal();
//      }
//     }
//     }
        seleccionVacaciones();
    }//GEN-LAST:event_radVacacionesMouseClicked

    private void comboEmpleadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboEmpleadosItemStateChanged
     nuevo();
     btnAceptar.setEnabled(true);
    }//GEN-LAST:event_comboEmpleadosItemStateChanged

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
     liq.emp.setDni(Integer.parseInt(comboEmpleados.getSelectedItem().toString()));
     liq.emp.cargarNombre();
     liq.emp.cargarEmpleadoLiquidacion(lblPeriodo.getText());
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void radPresentismoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radPresentismoMouseClicked
    if(radPresentismo.isSelected()==true){
      sal.calcularPresentismo();
      calcularSubTotal();
      calcularTotal();
     }
     else{
      for(int i =0; i < m.getRowCount(); i++){
      if(m.getValueAt(i,0).toString().equals("Presentismo")){
       m.removeRow(i);
       calcularSubTotal();
       calcularTotal();
      }
     }
    }
    }//GEN-LAST:event_radPresentismoMouseClicked

    private void radVacaciones21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radVacaciones21MouseClicked
//     if(radVacaciones21.isSelected()==true){
//      sal.calcularVacaciones21(Float.parseFloat(tablaConceptos.getValueAt(0,1).toString()));
//      calcularSubTotal();
//      calcularTotal();
//     }
//     else{
//     for(int i =0; i < m.getRowCount(); i++){
//      if(m.getValueAt(i,0).toString().equals("Vacaciones 21 Dias")){
//       m.removeRow(i);
//       calcularSubTotal();
//       calcularTotal();
//      }
//     }
//    }
        seleccionVacaciones();
    }//GEN-LAST:event_radVacaciones21MouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
     liq.emp.setDni(Integer.parseInt(comboEmpleados.getSelectedItem().toString()));
     liq.setFechaDesde(liq.fh.fechaDesdeBd().toLowerCase());
     liq.setFechaHasta(liq.fh.fechaHastaBd().toLowerCase());
     liq.setSalarioNeto(Float.parseFloat(txtSalarioNeto.getText().toLowerCase()));
     liq.setPeriodo(lblPeriodo.getText().toLowerCase());
     liq.setEstado(1);
     liq.nuevaLiquidacion();
     for(int i =0; i < m.getRowCount(); i++){
      liq.dl.con.setDescripcion(String.valueOf(m.getValueAt(i, 0).toString()));
      liq.dl.setMonto(Float.parseFloat(m.getValueAt(i,1).toString()));
      liq.dl.setDescuentos(Float.parseFloat(m.getValueAt(i,2).toString()));
      liq.dl.setSubTotal(Float.parseFloat(m.getValueAt(i,1).toString())- Float.parseFloat(m.getValueAt(i,2).toString()));
      liq.dl.nuevoDetalle(Integer.parseInt(comboEmpleados.getSelectedItem().toString().toLowerCase()));
      }
     try {
     int idLiquidacion = liq.ultimaLiquidacion(Integer.parseInt(comboEmpleados.getSelectedItem().toString()));
     boletaPago bp = new boletaPago(Integer.parseInt(comboEmpleados.getSelectedItem().toString()),idLiquidacion,Float.parseFloat(txtSubTotal.getText()),Float.parseFloat(txtDescuento.getText()),Float.parseFloat(txtSalarioNeto.getText()));
     nuevo();
     }
    catch (Exception ex) {
     Logger.getLogger(detalleLiquidacionn.class.getName()).log(Level.SEVERE, null, ex);
    }
     
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
     nuevo();
     btnAceptar.setEnabled(false);
     btnAgregar.setEnabled(true);
     comboCategoria.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
     dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public void nuevo() {
     txtNombre.setText("");
     txtCuil.setText("");
     txtSubTotal.setText("");
     txtDescuento.setText("");
     txtSalarioNeto.setText("");
     radAguinaldoJ.setSelected(false);
     radAguinaldoD.setSelected(false);
     radVacaciones14.setSelected(false);
     radVacaciones.setSelected(false);
     radVacaciones21.setSelected(false);
     radPresentismo.setSelected(false);
     m.setRowCount(0);
     radAguinaldoJ.setEnabled(false);
     radAguinaldoD.setEnabled(false);
     radVacaciones.setEnabled(false);
     radVacaciones.setEnabled(false);
     radVacaciones14.setEnabled(false);
     radVacaciones21.setEnabled(false);
     radPresentismo.setEnabled(false);
    }

    public static void calcularSubTotal() {
    float subtotal =0;
    if(m.getRowCount()!=0){
    for(int i =0; i < m.getRowCount(); i++){
    if(!m.getValueAt(i,1).toString().equals("")){
     subtotal = subtotal + Float.parseFloat(m.getValueAt(i,1).toString());
    }
    }
    txtSubTotal.setText(String.valueOf(subtotal));
    }
   }

    public static void calcularDescuento() {
    float descuento=0;
    if(m.getRowCount()!=0){
    for(int i =0; i < m.getRowCount(); i++){
    if(!m.getValueAt(i,2).toString().equals("")){
    descuento = descuento + Float.parseFloat(m.getValueAt(i,2).toString());
    }
    }
    txtDescuento.setText(String.valueOf(descuento));
    calcularTotal();
    }
    }

    public static void calcularTotal() {
     if(!txtSubTotal.getText().equals("") && !txtDescuento.getText().equals("")){
      float total = Float.parseFloat(txtSubTotal.getText()) - Float.parseFloat(txtDescuento.getText());
      txtSalarioNeto.setText(String.valueOf(total));
     }
    }

    public void seleccion(){
        int j=0;
        int k=0;
        if(radAguinaldoJ.isSelected()==true){
        for(int i =0; i < m.getRowCount(); i++){
      if(m.getValueAt(i,0).toString().equals("Salario Complementario Diciembre")){
      m.removeRow(i);
      sal.CalcularAguinaldo(Float.parseFloat(tablaConceptos.getValueAt(0,1).toString()));
      calcularSubTotal();
      calcularTotal();
      radAguinaldoD.setEnabled(true);
      radAguinaldoJ.setEnabled(false);
        }
      j=i;
        }
        if(m.getValueAt(j,0).toString().equals("Ley 23660")||m.getValueAt(j,0).toString().equals("Vacaciones 7 Dias")
           || m.getValueAt(j,0).toString().equals("Vacaciones 14 Dias") || m.getValueAt(j,0).toString().equals("Vacaciones 21 Dias")
           || m.getValueAt(j,0).toString().equals("Presentismo")){
      sal.CalcularAguinaldo(Float.parseFloat(tablaConceptos.getValueAt(0,1).toString()));
      calcularSubTotal();
      calcularTotal();
      radAguinaldoD.setEnabled(true);
      radAguinaldoJ.setEnabled(false);
        }
        }
        else {

      if(radAguinaldoD.isSelected() == true){
      for(int i =0; i < m.getRowCount(); i++){
      if(m.getValueAt(i,0).toString().equals("Salario Complementario Junio")){
      m.removeRow(i);
      sal.CalcularAguinaldoDiciembre(Float.parseFloat(tablaConceptos.getValueAt(0,1).toString()));
      calcularSubTotal();
      calcularTotal();
      radAguinaldoD.setEnabled(false);
      radAguinaldoJ.setEnabled(true);
        }
      k=i;
        }
      if(m.getValueAt(k,0).toString().equals("Ley 23660")||m.getValueAt(k,0).toString().equals("Vacaciones 7 Dias")
           || m.getValueAt(k,0).toString().equals("Vacaciones 14 Dias") || m.getValueAt(k,0).toString().equals("Vacaciones 21 Dias")
           || m.getValueAt(k,0).toString().equals("Presentismo")){
      sal.CalcularAguinaldoDiciembre(Float.parseFloat(tablaConceptos.getValueAt(0,1).toString()));
      calcularSubTotal();
      calcularTotal();
      radAguinaldoD.setEnabled(false);
      radAguinaldoJ.setEnabled(true);        }

        }
        }
    }

    public void seleccionVacaciones(){
        int j=0,k=0,l=0;

        if(radVacaciones.isSelected()==true){
        for(int i =0; i < m.getRowCount(); i++){
      if(m.getValueAt(i,0).toString().equals("Vacaciones 14 Dias") || m.getValueAt(i,0).toString().equals("Vacaciones 21 Dias")){
      m.removeRow(i);
      sal.calcularVacaciones(Float.parseFloat(tablaConceptos.getValueAt(0,1).toString()));
      calcularSubTotal();
      calcularTotal();
      radVacaciones14.setEnabled(true);
      radVacaciones21.setEnabled(true);
      radVacaciones.setEnabled(false);
        }
      j=i;
        }
        if(m.getValueAt(j,0).toString().equals("Ley 23660")||m.getValueAt(j,0).toString().equals("Salario Complementario Junio")
           || m.getValueAt(j,0).toString().equals("Salario Complementario Diciembre")
           || m.getValueAt(j,0).toString().equals("Presentismo")){
      sal.calcularVacaciones(Float.parseFloat(tablaConceptos.getValueAt(0,1).toString()));
      calcularSubTotal();
      calcularTotal();
      radVacaciones21.setEnabled(true);
      radVacaciones14.setEnabled(true);
      radVacaciones.setEnabled(false);
        }
        }
        else {
      if(radVacaciones14.isSelected() == true){
      for(int i =0; i < m.getRowCount(); i++){
      if(m.getValueAt(i,0).toString().equals("Vacaciones 7 Dias") || m.getValueAt(i,0).toString().equals("Vacaciones 21 Dias")){
      m.removeRow(i);
      sal.calcularVacaciones14(Float.parseFloat(tablaConceptos.getValueAt(0,1).toString()));
      calcularSubTotal();
      calcularTotal();
      radVacaciones14.setEnabled(false);
      radVacaciones21.setEnabled(true);
      radVacaciones.setEnabled(true);
        }
      k=i;
        }
      if(m.getValueAt(k,0).toString().equals("Ley 23660")||m.getValueAt(k,0).toString().equals("Salario Complementario Junio")
           || m.getValueAt(k,0).toString().equals("Salario Complementario Diciembre")
           || m.getValueAt(k,0).toString().equals("Presentismo")){
      sal.calcularVacaciones14(Float.parseFloat(tablaConceptos.getValueAt(0,1).toString()));
      calcularSubTotal();
      calcularTotal();
      radVacaciones14.setEnabled(false);
      radVacaciones.setEnabled(true);
      radVacaciones21.setEnabled(true);
      }
        }
        }

      if(radVacaciones21.isSelected() == true){
      for(int i =0; i < m.getRowCount(); i++){
      if(m.getValueAt(i,0).toString().equals("Vacaciones 7 Dias") || m.getValueAt(i,0).toString().equals("Vacaciones 14 Dias")){
      m.removeRow(i);
      sal.calcularVacaciones21(Float.parseFloat(tablaConceptos.getValueAt(0,1).toString()));
      calcularSubTotal();
      calcularTotal();
      radVacaciones14.setEnabled(true);
      radVacaciones21.setEnabled(false);
      radVacaciones.setEnabled(true);
        }
      l=i;
        }
      if(m.getValueAt(l,0).toString().equals("Ley 23660")||m.getValueAt(l,0).toString().equals("Salario Complementario Junio")
           || m.getValueAt(l,0).toString().equals("Salario Complementario Diciembre")
           || m.getValueAt(l,0).toString().equals("Presentismo")){
      sal.calcularVacaciones14(Float.parseFloat(tablaConceptos.getValueAt(0,1).toString()));
      calcularSubTotal();
      calcularTotal();
      radVacaciones21.setEnabled(false);
      radVacaciones.setEnabled(true);
      radVacaciones14.setEnabled(true);
          }
      }
    }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nuevaLiquidacion dialog = new nuevaLiquidacion(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup btngroupAguinaldo;
    private javax.swing.ButtonGroup btngroupVacaciones;
    public static javax.swing.JComboBox comboCategoria;
    public static javax.swing.JComboBox comboEmpleados;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDesde;
    private javax.swing.JLabel lblFechaHasta1;
    private javax.swing.JLabel lblFechaHasta5;
    private javax.swing.JLabel lblFechaHasta7;
    private javax.swing.JLabel lblHasta;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JPanel panelConcepto;
    public static javax.swing.JRadioButton radAguinaldoD;
    public static javax.swing.JRadioButton radAguinaldoJ;
    public static javax.swing.JRadioButton radPresentismo;
    public static javax.swing.JRadioButton radVacaciones;
    public static javax.swing.JRadioButton radVacaciones14;
    public static javax.swing.JRadioButton radVacaciones21;
    public static javax.swing.JTable tablaConceptos;
    public static javax.swing.JTextField txtCuil;
    public static javax.swing.JTextField txtDescuento;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtSalarioNeto;
    public static javax.swing.JTextField txtSubTotal;
    // End of variables declaration//GEN-END:variables

    public static void activar() {
     radAguinaldoJ.setEnabled(true);
     radAguinaldoD.setEnabled(true);
     radVacaciones.setEnabled(true);
     radVacaciones.setEnabled(true);
     radVacaciones14.setEnabled(true);
     radVacaciones21.setEnabled(true);
     radPresentismo.setEnabled(true);
    }





}