

package Servicios;

import Ventas.nuevaVenta;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class buscarServicio extends javax.swing.JDialog {

 public static DefaultTableModel tabla;
 public Servicios s = new Servicios();

    public buscarServicio(java.awt.Frame parent, boolean modal){
     super(parent, modal);
     initComponents();
     String[] titulos ={"ID","Nombre","Precio"};
     tabla = new DefaultTableModel(null,titulos);
     tablaServicios.setModel(tabla);
     tabla.setRowCount(0);
     s.cargarServicios();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBuscarServicio = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaServicios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtServicio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanelBuscarServicio.setBackground(new java.awt.Color(0, 102, 102));

        tablaServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "PRECIO"
            }
        ));
        tablaServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaServiciosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaServicios);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18));
        jLabel1.setForeground(new java.awt.Color(-1,true));
        jLabel1.setText("SERVICIO:");

        txtServicio.setFont(new java.awt.Font("Tahoma", 1, 18));
        txtServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServicioActionPerformed(evt);
            }
        });
        txtServicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtServicioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtServicioKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelBuscarServicioLayout = new javax.swing.GroupLayout(jPanelBuscarServicio);
        jPanelBuscarServicio.setLayout(jPanelBuscarServicioLayout);
        jPanelBuscarServicioLayout.setHorizontalGroup(
            jPanelBuscarServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBuscarServicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBuscarServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                    .addGroup(jPanelBuscarServicioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtServicio, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelBuscarServicioLayout.setVerticalGroup(
            jPanelBuscarServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarServicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBuscarServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBuscarServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBuscarServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-605)/2, (screenSize.height-524)/2, 605, 524);
    }// </editor-fold>//GEN-END:initComponents

    private void txtServicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtServicioKeyPressed
     if(!txtServicio.getText().equals("")){
      s.cargarServicios();
     }
     else{
     }
    }//GEN-LAST:event_txtServicioKeyPressed

    private void tablaServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaServiciosMouseClicked
     int fila = tablaServicios.getSelectedRow();
     nuevaVenta.txtServicio.setText(tablaServicios.getValueAt(fila,1).toString());
     nuevaVenta.txtPrecio.setText(tablaServicios.getValueAt(fila,2).toString());
     nuevaVenta.lblIdServicio.setText(tablaServicios.getValueAt(fila,0).toString());
  //   comprobarStock(tablaServicios.getValueAt(fila,0).toString(),Integer.parseInt(tablaServicios.getValueAt(fila,1).toString()));
     nuevaVenta.btnAceptar.setEnabled(true);
     nuevaVenta.btnCambiar.setEnabled(true);
     int idServicio = (int) tablaServicios.getValueAt(fila, 0);
     s.cargarInsumosDelServicio(idServicio);
     nuevaVenta.idServ = idServicio;
     dispose();
    }//GEN-LAST:event_tablaServiciosMouseClicked

    private void txtServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServicioActionPerformed
       
    }//GEN-LAST:event_txtServicioActionPerformed

    private void txtServicioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtServicioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServicioKeyReleased

private void comprobarStock(String descripcion,int stock) {
 int encontrado=0;
 if(nuevaVenta.lineaVenta.getRowCount()==0){
 encontrado =1;
 }
 else{
 for(int i =0; i < nuevaVenta.m.getRowCount(); i++){
 String producto = String.valueOf(nuevaVenta.m.getValueAt(i,0).toString());
 if(producto.equals(descripcion.toString())){
 String Cantidad = String.valueOf(stock - Integer.parseInt(nuevaVenta.m.getValueAt(i,2).toString()));
 encontrado=1;
 }
 }
 }
 if(encontrado ==0){
 }
}
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                buscarServicio dialog = new buscarServicio(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelBuscarServicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaServicios;
    private javax.swing.JTextField txtServicio;
    // End of variables declaration//GEN-END:variables

    private buscarServicio() {
        
        throw new UnsupportedOperationException("Not yet implemented");
    }

    

}
