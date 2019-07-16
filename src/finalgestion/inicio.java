package finalgestion;

import Clases.ImagenPanel;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class inicio extends javax.swing.JFrame implements ActionListener{
    private Timer tiempo;
    ventanaPrincipal principal;
    int i=0;
    private int contador = 0;
    private String punto = ".";
 
    public inicio(){
     initComponents();
     setLocationRelativeTo(null);
     jPanel1.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/elsalon.jpg")));
     tiempo = new Timer(40,new ActionListener()
      {
       public void actionPerformed(ActionEvent o){
       i+=1;
       pBar.setValue(i);
       if(contador==45){
       punto = ".";
       contador=0;
       lbMensaje.setText("Cargando");
       }
       else{
        punto+=".";
        lbMensaje.setText("Espere un momento" + punto);
       }
       contador++;
       if(pBar.getValue()>20)
       pBar.setForeground(Color.ORANGE);
       lbMensaje.setForeground(Color.ORANGE);
       if(pBar.getValue()>30)
       pBar.setForeground(Color.PINK);
       lbMensaje.setForeground(Color.PINK);
       if(pBar.getValue()>40)
       pBar.setForeground(Color.MAGENTA);
       lbMensaje.setForeground(Color.MAGENTA);
       if(pBar.getValue()>50)
       pBar.setForeground(Color.CYAN);
       lbMensaje.setForeground(Color.CYAN);
       if(pBar.getValue()>60)
       pBar.setForeground(Color.BLUE);
       lbMensaje.setForeground(Color.BLUE);
       if(pBar.getValue()>70)
       pBar.setForeground(Color.GREEN);
       lbMensaje.setForeground(Color.GREEN);
       if(pBar.getValue()>80)
        pBar.setForeground(Color.RED);
        lbMensaje.setForeground(Color.RED);
       finalizar();
       }
       });
      tiempo.start();
    }
   
 public void finalizar(){
  if(pBar.getPercentComplete()==1.0){
   tiempo.stop();
   principal = new ventanaPrincipal();
   principal.setVisible(true);
   this.dispose();
  }        
}       
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBar = new javax.swing.JProgressBar();
        jPanel1 = new Clases.ImagenPanel();
        lbMensaje = new javax.swing.JLabel();

        setTitle("CARGANDO...");
        setForeground(java.awt.Color.white);
        setUndecorated(true);
        getContentPane().setLayout(null);

        pBar.setFont(new java.awt.Font("Courier New", 1, 12));
        pBar.setForeground(new java.awt.Color(204, 0, 255));
        pBar.setDoubleBuffered(true);
        pBar.setStringPainted(true);
        getContentPane().add(pBar);
        pBar.setBounds(0, 290, 540, 20);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        lbMensaje.setFont(new java.awt.Font("Segoe UI Light", 0, 24));
        lbMensaje.setForeground(new java.awt.Color(153, 51, 255));
        lbMensaje.setText("Espere un momento...");
        jPanel1.add(lbMensaje, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 540, 290);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-540)/2, (screenSize.height-311)/2, 540, 311);
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            inicio a;
            public void run() {
                a = new inicio();
                a.setVisible(true);
            }
        });
    }
    
    public void actionPerformed(ActionEvent e) {
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    /*
    private javax.swing.JPanel jPanel1;
    */
    private Clases.ImagenPanel jPanel1;
    private javax.swing.JLabel lbMensaje;
    private javax.swing.JProgressBar pBar;
    // End of variables declaration//GEN-END:variables
}
