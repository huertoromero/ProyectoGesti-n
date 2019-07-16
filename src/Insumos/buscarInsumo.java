

package Insumos;

import Servicios.*;
import javax.swing.table.DefaultTableModel;

public class buscarInsumo extends javax.swing.JDialog {

 public static DefaultTableModel tabla;
 public Servicios s = new Servicios();
 public Insumos ins = new Insumos();

    public buscarInsumo(java.awt.Frame parent, boolean modal) {
     super(parent, modal);
     initComponents();
     String[] titulos ={"Nombre"};
     tabla = new DefaultTableModel(null,titulos);
     tablaInsumos.setModel(tabla);
     tabla.setRowCount(0);
     ins.cargarInsumos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInsumos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        tablaInsumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "NOMBRE"
            }
        ));
        tablaInsumos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaInsumosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaInsumos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
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

    private void tablaInsumosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaInsumosMouseClicked
     int fila = tablaInsumos.getSelectedRow();
     nuevoServicio.txtInsumo.setText(tablaInsumos.getValueAt(fila,0).toString());
     dispose();
    }//GEN-LAST:event_tablaInsumosMouseClicked

//private void comprobarStock(String descripcion,int stock) {
// int encontrado=0;
// if(nuevaVenta.lineaVenta.getRowCount()==0){
// encontrado =1;
// }
// else{
// for(int i =0; i < nuevaVenta.m.getRowCount(); i++){
// String producto = String.valueOf(nuevaVenta.m.getValueAt(i,0).toString());
// if(producto.equals(descripcion.toString())){
// String Cantidad = String.valueOf(stock - Integer.parseInt(nuevaVenta.m.getValueAt(i,2).toString()));
// encontrado=1;
// }
// }
// }
// if(encontrado ==0){
// }
//}
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                buscarInsumo dialog = new buscarInsumo(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaInsumos;
    // End of variables declaration//GEN-END:variables

    

}
