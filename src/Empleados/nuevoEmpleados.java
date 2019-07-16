package Empleados;

import Clases.Empleados;
import Clases.GrupoFamiliar;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public final class nuevoEmpleados extends javax.swing.JDialog {


public DefaultTableModel m;
private Empleados emp = new Empleados();
private GrupoFamiliar gf = new GrupoFamiliar();

public nuevoEmpleados(java.awt.Frame parent, boolean modal) {
 super(parent, modal);
 initComponents();
 String[] titulos ={"Dni","Apellido","Nombre","Fecha de Nacimiento","Parentesco"};
 m = new DefaultTableModel(null,titulos);
 tablaGrupo.setModel(m);
 centrarDatos();
// emp.dir.loc.cargarLocalidades(1);
 emp.cargarCategoria(1);
 lblFecha.setText(emp.fh.fecha());
 lblHora.setText(emp.fh.hora());
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        panelPersonales = new javax.swing.JTabbedPane();
        panelPersonal = new javax.swing.JPanel();
        txtCuil = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        diaIngreso = new javax.swing.JComboBox();
        mesIngreso = new javax.swing.JComboBox();
        añoIngreso = new javax.swing.JComboBox();
        diaNac = new javax.swing.JComboBox();
        mesNac = new javax.swing.JComboBox();
        añoNac = new javax.swing.JComboBox();
        radv = new javax.swing.JRadioButton();
        panelLaboral = new javax.swing.JPanel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGrupo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCancelar2 = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NUEVOS EMPLEADOS");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelPersonal.setBackground(new java.awt.Color(0, 102, 102));

        txtCuil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCuil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuilKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(-1,true));
        jLabel8.setText("Cuil:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(-1,true));
        jLabel7.setText("Fecha de Nacimiento:");

        jComboBox6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", " " }));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(-1,true));
        jLabel4.setText("Apellido:");

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(-1,true));
        jLabel12.setText("Telefono:");

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(-1,true));
        jLabel13.setText("E-Mail:");

        txtMail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(-1,true));
        jLabel14.setText("Calle:");

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(-1,true));
        jLabel15.setText("Direccion:");

        txtCalle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCalleKeyTyped(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(-1,true));
        jLabel2.setText("Dni:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(-1,true));
        jLabel3.setText("Nombre:");

        txtDni.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(-1,true));
        jLabel23.setText("Puesto de Empleo:");

        comboCategoria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Gerente", "Contador", "Repositor", "Vendedor", "Cajero", "Administrador" }));
        comboCategoria.setToolTipText("");

        jLabel27.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(-1,true));
        jLabel27.setText("Fecha de Ingreso:");

        diaIngreso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        diaIngreso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        mesIngreso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesIngreso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MES", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        añoIngreso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        añoIngreso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Año", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016" }));

        diaNac.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        diaNac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        mesNac.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesNac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MES", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", " " }));

        añoNac.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        añoNac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Año", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000" }));

        radv.setText("jRadioButton2");

        javax.swing.GroupLayout panelPersonalLayout = new javax.swing.GroupLayout(panelPersonal);
        panelPersonal.setLayout(panelPersonalLayout);
        panelPersonalLayout.setHorizontalGroup(
            panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPersonalLayout.createSequentialGroup()
                        .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPersonalLayout.createSequentialGroup()
                                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelPersonalLayout.createSequentialGroup()
                                        .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDni, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(46, 46, 46)
                                        .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel13))
                                        .addGap(29, 29, 29)
                                        .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtMail)
                                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCuil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                                        .addGap(40, 40, 40))
                                    .addGroup(panelPersonalLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(radv)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jComboBox6, 0, 0, Short.MAX_VALUE))
                            .addGroup(panelPersonalLayout.createSequentialGroup()
                                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelPersonalLayout.createSequentialGroup()
                                        .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(panelPersonalLayout.createSequentialGroup()
                                                .addComponent(jLabel27)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                                .addComponent(diaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(mesIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelPersonalLayout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(diaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(mesNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(añoIngreso, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(añoNac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panelPersonalLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(39, 39, 39)
                                        .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15))
                                .addGap(117, 117, 117)))
                        .addContainerGap())
                    .addGroup(panelPersonalLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(416, 416, 416))))
        );
        panelPersonalLayout.setVerticalGroup(
            panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPersonalLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPersonalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(31, 31, 31)
                        .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(radv)))
                .addGap(11, 11, 11)
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(204, 204, 204))
        );

        panelPersonales.addTab("DATOS PERSONALES ", panelPersonal);

        panelLaboral.setBackground(new java.awt.Color(0, 204, 204));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "GRUPO FAMILIAR"));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
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

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(-1,true));
        jLabel10.setText("Parentesco:");

        comboParentesco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboParentesco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Esposo/a", "Hijo/a", "Padre", "Madre", "Hermano/a" }));

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(-1,true));
        jLabel20.setText("Fecha de Nacimiento:");

        comboDia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        comboMes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MES", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", " " }));

        comboAño.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboAño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Año", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016" }));

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(-1,true));
        jLabel21.setText("Nombre:");

        txtNombreGrupo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombreGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreGrupoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(-1,true));
        jLabel6.setText("Apellido:");

        txtApellidoGrupo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtApellidoGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoGrupoKeyTyped(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(-1,true));
        jLabel28.setText("Dni:");

        txtDniGrupo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDniGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniGrupoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboParentesco, 0, 274, Short.MAX_VALUE)))
                                .addGap(6, 6, 6))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)
                                .addGap(30, 30, 30)))
                        .addComponent(comboAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombreGrupo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDniGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(txtDniGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtNombreGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(comboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(comboParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        tablaGrupo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tablaGrupo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Fecha Nacimiento", "Parentesco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaGrupoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaGrupo);
        if (tablaGrupo.getColumnModel().getColumnCount() > 0) {
            tablaGrupo.getColumnModel().getColumn(0).setResizable(false);
            tablaGrupo.getColumnModel().getColumn(1).setResizable(false);
            tablaGrupo.getColumnModel().getColumn(2).setResizable(false);
            tablaGrupo.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout panelLaboralLayout = new javax.swing.GroupLayout(panelLaboral);
        panelLaboral.setLayout(panelLaboralLayout);
        panelLaboralLayout.setHorizontalGroup(
            panelLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLaboralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panelLaboralLayout.setVerticalGroup(
            panelLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLaboralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panelPersonales.addTab("DATOS DEL GRUPO FAMILIAR", panelLaboral);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(-1,true));
        jLabel22.setText("Usuario:");

        jLabel24.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(-1,true));
        jLabel24.setText("Contraseña:");

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        txtContra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel30.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Fecha:");

        lblFecha.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("xx/xx/xxxx");

        jLabel32.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Hora:");

        lblHora.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("00:00:00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHora)
                .addGap(66, 66, 66))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(lblHora)
                    .addComponent(jLabel32)
                    .addComponent(lblFecha))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        btnAceptar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(-1,true));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(-1,true));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sali.png"))); // NOI18N
        btnSalir.setText("ATRAS");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCancelar2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnCancelar2.setForeground(new java.awt.Color(-1,true));
        btnCancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelar2.setText("CANCELAR");
        btnCancelar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar2.setContentAreaFilled(false);
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
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
                .addComponent(btnCancelar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 475, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtContra, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(223, 223, 223))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(141, 141, 141)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelPersonales.addTab("DATOS DE USUARIO", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 480, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("INGRESO DE EMPLEADOS");

        setSize(new java.awt.Dimension(838, 525));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

public void centrarDatos(){
 DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
 modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
 tablaGrupo.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
 tablaGrupo.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
 tablaGrupo.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
}



private void ingresarEmpleado(){
 if(!txtDni.getText().equals("") && comboCategoria.getSelectedIndex()!=-1 && !txtNombre.getText().equals("") && 
         !txtApellido.getText().equals("") && !txtCuil.getText().equals("") &&  !txtTelefono.getText().equals("")
         && !txtUsuario.getText().equals("") && !txtContra.getText().equals("") && !buscaDni(txtDni.getText())
         && !buscaDni2(txtDniGrupo.getText())){
 int mesIng = mesIngreso.getSelectedIndex();
 int mesNa = mesNac.getSelectedIndex();
 if(emp.fh.confirmarFecha(String.valueOf(diaIngreso.getSelectedItem().toString()+"/"+ mesIng +"/"+ añoIngreso.getSelectedItem().toString())) == true && emp.fh.confirmarFecha(String.valueOf(diaNac.getSelectedItem().toString() +"/"+ mesNa +"/"+ añoNac.getSelectedItem().toString())) == true){
 String ingreso = añoIngreso.getSelectedItem().toString() + "/" + mesIng + "/" + diaIngreso.getSelectedItem().toString();
 String nacimiento = añoNac.getSelectedItem().toString() + "/" + mesNa + "/" + diaNac.getSelectedItem().toString();
 emp.setDni(Integer.valueOf(txtDni.getText().toLowerCase()));
 emp.setCategoria(comboCategoria.getSelectedIndex()+1);
 emp.setNombre(txtNombre.getText().toLowerCase());
 emp.setApellido(txtApellido.getText().toLowerCase());
 emp.setFechaDeNacimiento(nacimiento);
 emp.setCuil(Long.parseLong(txtCuil.getText().toString()));
// emp.setEstadoCivil(comboEstado.getSelectedItem().toString());
// emp.setSexo(comboSexo.getSelectedItem().toString());
 emp.setFechaDeIngreso(ingreso);
 emp.setTelefono(Long.parseLong(txtTelefono.getText()));
// emp.setCelular(Long.parseLong(txtCelular.getText()));
 emp.setEmail(txtMail.getText().toLowerCase());
 emp.setEstado(1);
// int idLocalidad = comboLocalidad.getSelectedIndex() + 1;
// emp.dir.loc.setDescripcion(idLocalidad);
 emp.setDireccion(txtCalle.getText().toString().toLowerCase());
// if(!txtNumero.getText().equals("")){}{emp.dir.setNumero(Integer.parseInt(txtNumero.getText().toString()));}
// if(comboPiso.getSelectedIndex()!=0){emp.dir.setPiso(Integer.valueOf(comboPiso.getSelectedItem().toString()));}
// if(comboDepartamento.getSelectedIndex()!=0){emp.dir.setDepartamento(comboDepartamento.getSelectedItem().toString());}
 boolean empleado = emp.nuevoEmpleado();
 if(empleado==true){
  cargarUsuario();
  }
 }
 // NO ESTAN BIEN ESTOS IF, SIEMPRE SALE ERROR DE FECHAS. PERO IGUAL SE GRABAN
 
// if(emp.fh.confirmarFecha(String.valueOf(diaIngreso.getSelectedItem().toString()+"/"+ mesIng +"/"+ añoIngreso.getSelectedItem().toString())) ==false){
//  JOptionPane.showMessageDialog(null,"Fecha de Ingreso no Valida", "Error", JOptionPane.ERROR_MESSAGE);
// }
// if(emp.fh.confirmarFecha(String.valueOf(diaNac.getSelectedItem().toString() +"/"+ mesNa +"/"+ añoNac.getSelectedItem().toString()))==false){
//  JOptionPane.showMessageDialog(null,"Fecha de Nacimiento no Valida", "Error", JOptionPane.ERROR_MESSAGE);
// }
}
 else{
  JOptionPane.showMessageDialog(null,"FALTAN DATOS", "Error", JOptionPane.ERROR_MESSAGE);
 }
}

public void cargarUsuario(){
  try {
   emp.ur.setUsuario(txtUsuario.getText());
   emp.ur.setContraseña(emp.ur.encriptacion(txtContra.getText().toString()));
   
   if(comboCategoria.getSelectedIndex()+1==1){
       if(radv.isSelected()==true){
               emp.ur.setMenuCliente(1);
    emp.ur.setMenuCompra(1);
    emp.ur.setMenuEmpleados(1);
    emp.ur.setMenuProducto(1);
    emp.ur.setMenuProveedor(1);
    emp.ur.setMenuSalario(1);
    emp.ur.setMenuVenta(1);
    emp.ur.setMenuServicios(1);
           
       }

   }
   if(comboCategoria.getSelectedIndex()+1==2){
    emp.ur.setMenuCliente(1);
    emp.ur.setMenuCompra(0);
    emp.ur.setMenuEmpleados(1);
    emp.ur.setMenuProducto(0);
    emp.ur.setMenuProveedor(0);
    emp.ur.setMenuSalario(0);
    emp.ur.setMenuVenta(0);
    emp.ur.setMenuServicios(0);
   }
   if(comboCategoria.getSelectedIndex()+1==3){
    emp.ur.setMenuCliente(0);
    emp.ur.setMenuCompra(0);
    emp.ur.setMenuEmpleados(0);
    emp.ur.setMenuProducto(0);
    emp.ur.setMenuProveedor(0);
    emp.ur.setMenuSalario(1);
    emp.ur.setMenuVenta(0);
    emp.ur.setMenuServicios(1);
   }
   if(comboCategoria.getSelectedIndex()+1==4){
    emp.ur.setMenuCliente(0);
    emp.ur.setMenuCompra(0);
    emp.ur.setMenuEmpleados(0);
    emp.ur.setMenuProducto(1);
    emp.ur.setMenuProveedor(0);
    emp.ur.setMenuSalario(0);
    emp.ur.setMenuVenta(1);
    emp.ur.setMenuServicios(0);
   }
   if(comboCategoria.getSelectedIndex()+1==5){
    emp.ur.setMenuCliente(0);
    emp.ur.setMenuCompra(1);
    emp.ur.setMenuEmpleados(0);
    emp.ur.setMenuProducto(1);
    emp.ur.setMenuProveedor(1);
    emp.ur.setMenuSalario(0);
    emp.ur.setMenuVenta(0);
    emp.ur.setMenuServicios(0);
   }
   boolean usuario = emp.ur.cargarUsuario(Integer.parseInt(txtDni.getText()));
   if(usuario == true){
    if(m.getRowCount() >=1){
     ingresarGrupoFamiliar();
    }
    else{
     nuevo();
    }
   }
  } 
  catch (Exception ex) {
   Logger.getLogger(nuevoEmpleados.class.getName()).log(Level.SEVERE, null, ex);
  }
 }

private void ingresarGrupoFamiliar(){
 for(int i =0; i < m.getRowCount(); i++){
  
  emp.gf.setDniEmpleado(Integer.valueOf(txtDni.getText()));
  emp.gf.setDni(Integer.parseInt(m.getValueAt(i,0).toString()));
  emp.gf.setNombre(String.valueOf(m.getValueAt(i,1).toString()));
  emp.gf.setApellido(String.valueOf(m.getValueAt(i,2).toString()));
  emp.gf.setFechaNac(String.valueOf(m.getValueAt(i,3).toString()));
  emp.gf.setParentesco(String.valueOf(m.getValueAt(i,4).toString()));
  emp.gf.nuevoGrupoFamiliar();
 }
 nuevo();
}

public void nuevo() {
 txtDni.setText("");
 txtCuil.setText("");
 txtNombre.setText("");
 txtApellido.setText("");
// comboEstado.setSelectedIndex(0);
// comboSexo.setSelectedIndex(0);
 txtTelefono.setText("");
// txtCelular.setText("");
 comboCategoria.setSelectedIndex(0);
 txtMail.setText("");
 diaIngreso.setSelectedIndex(0);
 mesIngreso.setSelectedIndex(0);
 añoIngreso.setSelectedIndex(0);
 diaNac.setSelectedIndex(0);
 mesNac.setSelectedIndex(0);
 añoNac.setSelectedIndex(0);
 txtCalle.setText("");
// txtNumero.setText("");
// comboPiso.setSelectedIndex(0);
// comboDepartamento.setSelectedIndex(0);
// comboLocalidad.setSelectedIndex(0);
 txtDniGrupo.setText("");
 txtNombreGrupo.setText("");
 txtApellidoGrupo.setText("");
 comboDia.setSelectedIndex(0);
 comboMes.setSelectedIndex(0);
 comboAño.setSelectedIndex(0);
 comboParentesco.setSelectedIndex(0);
 m.setRowCount(0);
 txtUsuario.setText("");
 txtContra.setText("");
}

public void verificarTabla(){
 int encontrado=0;
 String[] datos = new String[5];
 if(this.tablaGrupo.getRowCount()==0){
  encontrado =1;
  ingresarDatosTablaGrupoFamiliar(datos);
  m.addRow(datos);
  centrarDatos();
  this.tablaGrupo.setModel(m);
 }
 else{
  for(int i =0; i < m.getRowCount(); i++){
   String dni = String.valueOf(m.getValueAt(i,0).toString());
   if(dni.equals(txtDniGrupo.getText().toString())){
   ingresarDatosTablaGrupoFamiliar(datos);
   m.removeRow(i);
   m.addRow(datos);
   centrarDatos();
   tablaGrupo.setModel(m);
   i=m.getRowCount();
   encontrado=1;
  }}}
 if(encontrado==0){
  ingresarDatosTablaGrupoFamiliar(datos);
  m.addRow(datos);
  centrarDatos();
  tablaGrupo.setModel(m);
 }
}

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
 
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
     int k=(int)evt.getKeyChar();
     Numeros(k,evt);
     if (txtDni.getText().length()== 8){
      evt.consume();
     }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtCuilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuilKeyTyped
     int k=(int)evt.getKeyChar();
     Numeros(k,evt);
     if (txtCuil.getText().length()==20){
      evt.consume();
     }
    }//GEN-LAST:event_txtCuilKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
      if(!txtDniGrupo.getText().equals("")&&!txtNombreGrupo.getText().equals("") && !txtApellidoGrupo.getText().equals("")
       && comboDia.getSelectedIndex()!=0  && comboMes.getSelectedIndex()!=0  && comboAño.getSelectedIndex()!=0 && comboParentesco.getSelectedIndex()!=0){
       String mes = String.valueOf(comboMes.getSelectedIndex());
       String fecha = comboDia.getSelectedItem().toString() + "/" + mes + "/" + comboAño.getSelectedItem().toString();
       if(emp.fh.confirmarFecha(fecha)== true){
       verificarTabla();
       txtDniGrupo.setText("");
       txtNombreGrupo.setText("");
       txtApellidoGrupo.setText("");
       comboParentesco.setSelectedIndex(0);
       comboDia.setSelectedIndex(0);
       comboMes.setSelectedIndex(0);
       comboAño.setSelectedIndex(0);
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   
    }//GEN-LAST:event_formWindowOpened

    private void tablaGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaGrupoMouseClicked
      Object [] opciones ={"Aceptar","Cancelar"};
     int eleccion = JOptionPane.showOptionDialog(null,"Desea Eliminarlo del Grupo Familiar","Confirmar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
      if (eleccion == JOptionPane.YES_OPTION){
       m.removeRow(tablaGrupo.getSelectedRow());
      }
    }//GEN-LAST:event_tablaGrupoMouseClicked

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
     int k=(int)evt.getKeyChar();
     Numeros(k,evt);
     if (txtTelefono.getText().length()== 12){
      evt.consume();
     }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtDniGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniGrupoKeyTyped
     int k=(int)evt.getKeyChar();
     Numeros(k,evt);
     if (txtDniGrupo.getText().length()== 8){
      evt.consume();
     }
    }//GEN-LAST:event_txtDniGrupoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
     int k=(int)evt.getKeyChar();
     if (k >= 0 && k <= 31 || k >= 33 && k <= 64 || k>=91 && k<=96 || k>=123 && k<=255){
      evt.setKeyChar((char)KeyEvent.VK_CLEAR);
     }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
     int k=(int)evt.getKeyChar();
     if (k >= 0 && k <= 31 || k >= 33 && k <= 64 || k>=91 && k<=96 || k>=123 && k<=255){
      evt.setKeyChar((char)KeyEvent.VK_CLEAR);
     }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCalleKeyTyped
//     int k=(int)evt.getKeyChar();
//     if (k >= 0 && k <= 31 || k >= 33 && k <= 64 || k>=91 && k<=96 || k>=123 && k<=255){
//      evt.setKeyChar((char)KeyEvent.VK_CLEAR);
//     }
    }//GEN-LAST:event_txtCalleKeyTyped

    private void txtNombreGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreGrupoKeyTyped
     int k=(int)evt.getKeyChar();
     if (k >= 0 && k <= 31 || k >= 33 && k <= 64 || k>=91 && k<=96 || k>=123 && k<=255){
      evt.setKeyChar((char)KeyEvent.VK_CLEAR);
     }
    }//GEN-LAST:event_txtNombreGrupoKeyTyped

    private void txtApellidoGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoGrupoKeyTyped
     int k=(int)evt.getKeyChar();
     if (k >= 0 && k <= 31 || k >= 33 && k <= 64 || k>=91 && k<=96 || k>=123 && k<=255){
      evt.setKeyChar((char)KeyEvent.VK_CLEAR);
     }
    }//GEN-LAST:event_txtApellidoGrupoKeyTyped

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
        nuevo();
    }//GEN-LAST:event_btnCancelar2ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        ingresarEmpleado();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

    }//GEN-LAST:event_txtUsuarioActionPerformed

private void ingresarDatosTablaGrupoFamiliar(String[] datos) {
 datos[0]= txtDniGrupo.getText();
 datos[1] = txtApellidoGrupo.getText();
 datos[2] = txtNombreGrupo.getText();
 datos[3]= comboAño.getSelectedItem().toString()+ "/" + comboMes.getSelectedIndex()+ "/" +comboDia.getSelectedItem().toString() ;
 datos[4]= comboParentesco.getSelectedItem().toString();
}

private void Numeros(int k, KeyEvent evt) {
 if (k >= 32 && k <= 47 || k>=58 && k<=255){
  evt.setKeyChar((char)KeyEvent.VK_CLEAR);
 }
}


private Boolean validarFechaNacimiento() {
 String mes = String.valueOf(mesNac.getSelectedIndex());
 String fecha = diaNac.getSelectedItem().toString() + "/" + mes + "/" + añoNac.getSelectedItem().toString();
 try {
  SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy",Locale.getDefault());
  formatoFecha.setLenient(false);
  formatoFecha.parse(fecha);
 }
 catch (ParseException e) {
  return false;
 }
 return true;
}

private boolean buscaDni(String dni) {
        txtDni.getText();
        emp.setDni(Integer.parseInt(txtDni.getText()));
        return emp.buscar();
    }

private boolean buscaDni2(String dni) {
        boolean resultado = false;
    if(!txtDniGrupo.getText().equals("")){
        gf.setDni(Integer.parseInt(txtDniGrupo.getText()));
        resultado = gf.buscar();
    }
      return resultado;
    }

public static void main(String args[]) {
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
 nuevoEmpleados dialog = new nuevoEmpleados(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox añoIngreso;
    private javax.swing.JComboBox añoNac;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox comboAño;
    public static javax.swing.JComboBox comboCategoria;
    private javax.swing.JComboBox comboDia;
    private javax.swing.JComboBox comboMes;
    private javax.swing.JComboBox comboParentesco;
    private javax.swing.JComboBox diaIngreso;
    private javax.swing.JComboBox diaNac;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JComboBox mesIngreso;
    private javax.swing.JComboBox mesNac;
    private javax.swing.JPanel panelLaboral;
    private javax.swing.JPanel panelPersonal;
    private javax.swing.JTabbedPane panelPersonales;
    private javax.swing.JRadioButton radv;
    private javax.swing.JTable tablaGrupo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoGrupo;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtCuil;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDniGrupo;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreGrupo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables


}