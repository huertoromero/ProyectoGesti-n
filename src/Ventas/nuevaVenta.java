package Ventas;

import Productos.buscarProducto;
import Clases.Ventas;
import Clientes.buscarCliente;
import Clientes.buscarClientes;
import Servicios.buscarServicio;
import Pdf.boletaVenta;
import finalgestion.ventanaPrincipal;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class nuevaVenta extends javax.swing.JDialog {

    public static DefaultTableModel m;
    public static int idServ;
 Ventas vent = new Ventas();
 
    public nuevaVenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        String[] titulos ={"Servicio","Insumo","SubTotal", "IdServicio"};
        m = new DefaultTableModel(null,titulos);
        lineaVenta.setModel(m);
        lblFecha.setText(vent.fh.fecha());
        lblFecha2.setText(vent.fh.fechaBD());
        lblHora.setText(vent.fh.hora());
        lblFecha2.setVisible(false);
        txtNombre.setText("");
        txtDni.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtServicio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCambiar = new javax.swing.JButton();
        btnBuscarCliente1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtInsumo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblIdServicio = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnBuscarCliente2 = new javax.swing.JButton();
        jPanelNuevaVenta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblFecha2 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lineaVenta = new javax.swing.JTable();
        btnEliminarProducto = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtVuelto = new javax.swing.JTextField();

        setDefaultCloseOperation(Clientes.buscarCliente.DISPOSE_ON_CLOSE);
        setTitle("Nueva Venta");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(-16777216,true)), "Datos del Servicio"));

        txtServicio.setFont(new java.awt.Font("Tahoma", 0, 18));
        txtServicio.setForeground(txtPrecio.getForeground());
        txtServicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtServicioKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Courier New", 1, 18));
        jLabel10.setForeground(new java.awt.Color(-1,true));
        jLabel10.setText("Insumo:");

        jLabel11.setFont(new java.awt.Font("Courier New", 1, 18));
        jLabel11.setForeground(new java.awt.Color(-1,true));
        jLabel11.setText("Precio $:");

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 18));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnAceptar.setEnabled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCambiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cambiar.png"))); // NOI18N
        btnCambiar.setText("Cambiar");
        btnCambiar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnCambiar.setEnabled(false);
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        btnBuscarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnBuscarCliente1.setText("BUSCAR");
        btnBuscarCliente1.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnBuscarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCliente1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Courier New", 1, 18));
        jLabel12.setForeground(new java.awt.Color(-1,true));
        jLabel12.setText("Servicio:");

        txtInsumo.setFont(new java.awt.Font("Tahoma", 0, 18));
        txtInsumo.setForeground(txtPrecio.getForeground());
        txtInsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInsumoKeyTyped(evt);
            }
        });

        jLabel2.setFont(jLabel12.getFont());
        jLabel2.setForeground(new java.awt.Color(-1,true));
        jLabel2.setText("ID Servicio:");

        lblIdServicio.setFont(jLabel12.getFont());
        lblIdServicio.setForeground(new java.awt.Color(-1,true));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(btnCambiar))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAceptar)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel10)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnBuscarCliente1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIdServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(345, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel12)
                    .addContainerGap(886, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarCliente1)
                            .addComponent(jLabel11)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(txtServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lblIdServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCambiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jLabel12)
                    .addContainerGap(101, Short.MAX_VALUE)))
        );

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(-16777216,true)), "Datos de Cliente"));

        jLabel18.setFont(new java.awt.Font("Courier New", 1, 18));
        jLabel18.setForeground(new java.awt.Color(-1,true));
        jLabel18.setText("Nombre:");

        txtDni.setFont(new java.awt.Font("Tahoma", 0, 18));
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Courier New", 1, 18));
        jLabel19.setForeground(new java.awt.Color(-1,true));
        jLabel19.setText("DNI");

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 18));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Courier New", 1, 18));
        jLabel20.setForeground(new java.awt.Color(-1,true));
        jLabel20.setText("Apellido:");

        lblApellido.setFont(new java.awt.Font("Courier New", 1, 18));
        lblApellido.setForeground(new java.awt.Color(-1,true));

        btnBuscarCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnBuscarCliente2.setText("BUSCAR");
        btnBuscarCliente2.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnBuscarCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCliente2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnBuscarCliente2)
                .addGap(36, 36, 36)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(lblApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(41, 41, 41)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(btnBuscarCliente2)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelNuevaVenta.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hora:");

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha:");

        lblFecha.setFont(new java.awt.Font("Courier New", 1, 18));
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("xx/xx/xxxx");

        lblFecha2.setFont(new java.awt.Font("Courier New", 1, 18));
        lblFecha2.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha2.setText("00:00:00");

        lblHora.setFont(new java.awt.Font("Courier New", 1, 18));
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("00:00:00");

        javax.swing.GroupLayout jPanelNuevaVentaLayout = new javax.swing.GroupLayout(jPanelNuevaVenta);
        jPanelNuevaVenta.setLayout(jPanelNuevaVentaLayout);
        jPanelNuevaVentaLayout.setHorizontalGroup(
            jPanelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNuevaVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFecha2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHora)
                .addContainerGap(566, Short.MAX_VALUE))
        );
        jPanelNuevaVentaLayout.setVerticalGroup(
            jPanelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNuevaVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(lblFecha))
                    .addGroup(jPanelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFecha2)
                        .addComponent(jLabel1)
                        .addComponent(lblHora)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        lineaVenta.setFont(new java.awt.Font("Tahoma", 0, 14));
        lineaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Servicio", "Insumo", "SubTotal"
            }
        ));
        lineaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lineaVentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lineaVenta);

        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnEliminarProducto.setText("Eliminar Producto");
        btnEliminarProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnEliminarProducto.setEnabled(false);
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cambiar.png"))); // NOI18N
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

        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelar1.setText("SALIR");
        btnCancelar1.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar1)
                .addContainerGap(766, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnCancelar1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap())
        );

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 18));

        jLabel15.setFont(new java.awt.Font("Courier New", 1, 18));
        jLabel15.setText("Total $:");

        jLabel16.setFont(new java.awt.Font("Courier New", 1, 18));
        jLabel16.setText("Monto $:");

        txtMonto.setEditable(false);
        txtMonto.setFont(new java.awt.Font("Tahoma", 0, 18));
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Courier New", 1, 18));
        jLabel17.setText("Vuelto $:");

        txtVuelto.setEditable(false);
        txtVuelto.setFont(new java.awt.Font("Tahoma", 0, 18));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEliminarProducto)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtVuelto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanelNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarProducto)
                    .addComponent(jLabel16)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtVuelto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1031)/2, (screenSize.height-734)/2, 1031, 734);
    }// </editor-fold>//GEN-END:initComponents

    private void txtServicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtServicioKeyTyped
     Character c = evt.getKeyChar();
     if(Character.isLetter(c)) {
      evt.setKeyChar(Character.toUpperCase(c));
     }
}//GEN-LAST:event_txtServicioKeyTyped

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
//         if(!txtPrecio.getText().equals("")){
//          if((Integer.parseInt(txtCantidad.getText()) <= Integer.parseInt(txtStock.getText()))&& Integer.parseInt(txtCantidad.getText())> 0){
            nuevaLineaVenta();
            calcularTotal();
            System.out.println("paso calcular");
            txtServicio.setText("");
            txtPrecio.setText("");
            txtInsumo.setText("");
            txtMonto.setEditable(true);
            txtServicio.setEditable(true);
            txtServicio.requestFocus();
            btnAceptar.setEnabled(false);
            btnCambiar.setEnabled(false);
//           }
//           else{
//            JOptionPane.showMessageDialog(null,"Cantidad Incorrecta", "Error", JOptionPane.ERROR_MESSAGE);  
//           }
//          }
//        else{
//         JOptionPane.showMessageDialog(null,"INGRESE CANTIDAD", "Error", JOptionPane.ERROR_MESSAGE);
//        }
}//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
     txtServicio.setText("");
     txtPrecio.setText("");
     btnCancelar.setEnabled(false);
     btnCambiar.setEnabled(false);
     txtServicio.requestFocus();
}//GEN-LAST:event_btnCambiarActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
     int k=(int)evt.getKeyChar();
     NumerosDni(k,evt);
     if (txtDni.getText().length()== 8){
      evt.consume();
     }
}//GEN-LAST:event_txtDniKeyTyped

    private void lineaVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lineaVentaMouseClicked
     btnEliminarProducto.setEnabled(true);
}//GEN-LAST:event_lineaVentaMouseClicked

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
  Object [] opciones ={"Aceptar","Cancelar"};
     int eleccion = JOptionPane.showOptionDialog(null,"Desea Eliminar el Producto de la Venta","Confirmar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
      if (eleccion == JOptionPane.YES_OPTION){
       m.removeRow(lineaVenta.getSelectedRow());
       calcularTotal();
       if(lineaVenta.getRowCount()==0 && lineaVenta.getSelectedRow()==-1){
        btnEliminarProducto.setEnabled(false);
        btnAceptar.setEnabled(false);
       }
     }
}//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    nuevo();
}//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    try {
     vent.emp.setDni(Integer.parseInt(ventanaPrincipal.lblDniEmpleado.getText()));
     vent.setFecha(vent.fh.fechaBD());
     vent.setHora(vent.fh.hora());
     vent.cli.setDni(Integer.parseInt(txtDni.getText()));
     vent.setTotal(Float.parseFloat(txtTotal.getText()));
     vent.setMontoAbonado(Float.parseFloat(txtMonto.getText()));
     vent.setVuelto(Float.parseFloat(txtVuelto.getText()));
     vent.nuevaVenta();
     int Dni = Integer.parseInt(txtDni.getText());
          int ultima = vent.obtenerUltimaVenta(Dni);
     System.out.println("antes de crear la boleta de venta 1" +ultima);
     for (int i = 0; i < m.getRowCount(); i++) {
         System.out.println("entra en el for 0");
       int idServi = (Integer.parseInt((String) m.getValueAt(i,3)));
       float subTotal = (Float.parseFloat((String) m.getValueAt(i,2)));
//     vent.dv.ser.setNombre(String.valueOf(m.getValueAt(i, 0).toString().toLowerCase()));
//     vent.dv.setSubtotal(Float.parseFloat(m.getValueAt(i, 2).toString()));
//     vent.dv.setIdServicio(Integer.parseInt(m.getValueAt(i, 3).toString()));
     vent.dv.nuevaLineaDeVenta(ultima,idServi,subTotal);
     }

     boletaVenta bv = new boletaVenta(ultima,Integer.parseInt(txtDni.getText()));
     nuevo();
    }
    catch (Exception ex) {
     Logger.getLogger(nuevaVenta.class.getName()).log(Level.SEVERE, null, ex);
    }   nuevo();
}//GEN-LAST:event_btnAgregarActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
     float vuelto = Float.parseFloat(txtMonto.getText())- Float.parseFloat(txtTotal.getText());
     if(vuelto >=0){
      txtVuelto.setText(String.valueOf(vuelto));
      btnAgregar.setEnabled(true);
      btnCancelar.setEnabled(true);
     }
     else{
      JOptionPane.showMessageDialog(null,"Cantidad Insuficiente", "Error", JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_txtMontoActionPerformed

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped
     int k=(int)evt.getKeyChar();
     NumerosPago(k,evt);
    }//GEN-LAST:event_txtMontoKeyTyped

    private void btnBuscarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCliente1ActionPerformed
     txtServicio.setText("");
     txtPrecio.setText("");
    buscarServicio bs = new buscarServicio(null,true);
    bs.setVisible(true);
     // buscarProducto bp = new buscarProducto(null,true);
    // bp.setVisible(true);
    }//GEN-LAST:event_btnBuscarCliente1ActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
     if(!txtDni.getText().equals("")){
     vent.cli.setDni(Integer.parseInt(txtDni.getText()));
     vent.buscar();
     }
     else{
     JOptionPane.showMessageDialog( null, "Ingrese Dni","Error", JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_txtDniActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
     dispose();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void txtInsumoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInsumoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInsumoKeyTyped

private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtNombreActionPerformed

private void btnBuscarCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCliente2ActionPerformed
buscarClientes bc = new buscarClientes(null, true);
bc.setVisible(true);

}//GEN-LAST:event_btnBuscarCliente2ActionPerformed

public void nuevaLineaVenta(){
    System.out.println("linea de venta");
 int encontrado=0;
  String[] datos = new String[4];
 if(lineaVenta.getRowCount()==0 && lineaVenta.getSelectedRow()==-1){
  datos[0]=  txtServicio.getText();
  datos[1]= txtInsumo.getText();
  datos[2] = txtPrecio.getText();
  datos[3] = lblIdServicio.getText();
  encontrado=1;
  m.addRow(datos);
  lineaVenta.setModel(m);
 }
 else{
  for(int i =0; i < m.getRowCount(); i++){
  String servicio = String.valueOf(m.getValueAt(i,0).toString());
  if(servicio.equals(txtServicio.getText().toString())){
   datos[0]= txtServicio.getText();
   datos[1]= txtInsumo.getText();
   datos[2] = txtPrecio.getText();
   datos[3] = lblIdServicio.getText();
   m.removeRow(i);
   m.addRow(datos);
   
   lineaVenta.setModel(m);
   i=m.getRowCount();
   encontrado=1;
   }
  }
 }
 if(encontrado==0){
  datos[0]= txtServicio.getText();
  datos[1] = txtInsumo.getText();
  datos[2]= txtPrecio.getText();
  datos[3]= lblIdServicio.getText();
  m.addRow(datos);
  lineaVenta.setModel(m);
 }
}

private void calcularTotal() {
 float total= 0;
 for(int i =0; i < m.getRowCount(); i++){
  total = total + Float.parseFloat(m.getValueAt(i,2).toString());
 }
 if(total==0){
  txtTotal.setText("");
 }
 else{
  txtTotal.setText(String.valueOf(total));
 }
}

 public void nuevo() {
  lblApellido.setText("");
  txtDni.setText("");
  txtNombre.setText("");
  txtServicio.setText("");
  txtTotal.setText("");
  lblFecha.setText(vent.fh.fecha());
  lblFecha2.setText(vent.fh.fechaBD());
  lblHora.setText(vent.fh.hora());
  txtPrecio.setText("");
  txtVuelto.setText("");
  txtMonto.setText("");
  txtMonto.setEditable(false);
  txtServicio.setEditable(false);
  btnAceptar.setEnabled(false);
  btnCambiar.setEnabled(false);
  btnEliminarProducto.setEnabled(false);
  btnAgregar.setEnabled(false);
  btnCancelar.setEnabled(false);
  txtDni.setEditable(true);
  txtDni.requestFocus();
  m.setRowCount(0);
 }

 private void NumerosDni(int k, KeyEvent evt) {
  if (k >= 32 && k <= 47){
   evt.setKeyChar((char)KeyEvent.VK_CLEAR);
  }
  if (k >= 97 && k <= 126 || k>=58 && k<=90){
   evt.setKeyChar((char)KeyEvent.VK_CLEAR);
  }
  if(k==241 || k==209){
   evt.setKeyChar((char)KeyEvent.VK_CLEAR);
  }
 }

 private void NumerosPago(int k, KeyEvent evt) {
  if (k >= 97 && k <= 126 || k>=58 && k<=90){
   evt.setKeyChar((char)KeyEvent.VK_CLEAR);
  }
  if(k==241 || k==209){
   evt.setKeyChar((char)KeyEvent.VK_CLEAR);
  }
 }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nuevaVenta dialog = new nuevaVenta(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAgregar;
    public static javax.swing.JButton btnBuscarCliente1;
    public static javax.swing.JButton btnBuscarCliente2;
    public static javax.swing.JButton btnCambiar;
    public static javax.swing.JButton btnCancelar;
    public static javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelNuevaVenta;
    private javax.swing.JScrollPane jScrollPane1;
    public static final javax.swing.JLabel lblApellido = new javax.swing.JLabel();
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFecha2;
    private javax.swing.JLabel lblHora;
    public static javax.swing.JLabel lblIdServicio;
    public static javax.swing.JTable lineaVenta;
    public static final javax.swing.JTextField txtDni = new javax.swing.JTextField();
    public static javax.swing.JTextField txtInsumo;
    private javax.swing.JTextField txtMonto;
    public static final javax.swing.JTextField txtNombre = new javax.swing.JTextField();
    public static javax.swing.JTextField txtPrecio;
    public static javax.swing.JTextField txtServicio;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtVuelto;
    // End of variables declaration//GEN-END:variables

}