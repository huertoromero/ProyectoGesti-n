

package Productos;

import Clases.Productos;
import Ventas.nuevaVenta;
import javax.swing.table.DefaultTableModel;

public class buscarProducto extends javax.swing.JDialog {

 public static DefaultTableModel tabla;
 public Productos pro = new Productos();

    public buscarProducto(java.awt.Frame parent, boolean modal) {
     super(parent, modal);
     initComponents();
     String[] titulos ={"Descripcion","Cantidad","Precio"};
     tabla = new DefaultTableModel(null,titulos);
     tablaProductos.setModel(tabla);
     tabla.setRowCount(0);
     pro.cargarProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DESCRIPCION", "PRECIO", "CANTIDAD"
            }
        ));
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18));
        jLabel1.setForeground(new java.awt.Color(-1,true));
        jLabel1.setText("INSUMO:");

        txtProducto.setFont(new java.awt.Font("Tahoma", 1, 18));
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProductoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-605)/2, (screenSize.height-524)/2, 605, 524);
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyPressed
     if(!txtProducto.getText().equals("")){
      pro.setDescripcion(txtProducto.getText().toLowerCase());
      pro.busquedaProductos();
     }
     else{
      pro.cargarProductos();
     }
    }//GEN-LAST:event_txtProductoKeyPressed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
     int fila = tablaProductos.getSelectedRow();
     nuevaVenta.txtServicio.setText(tablaProductos.getValueAt(fila,0).toString());
     nuevaVenta.txtPrecio.setText(tablaProductos.getValueAt(fila,2).toString());
     comprobarStock(tablaProductos.getValueAt(fila,0).toString(),Integer.parseInt(tablaProductos.getValueAt(fila,1).toString()));
     nuevaVenta.btnAceptar.setEnabled(true);
     nuevaVenta.btnCambiar.setEnabled(true);
     dispose();
    }//GEN-LAST:event_tablaProductosMouseClicked

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
                buscarProducto dialog = new buscarProducto(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables

    

}
