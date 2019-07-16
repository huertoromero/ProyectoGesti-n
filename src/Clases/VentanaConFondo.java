
package Clases;

import java.awt.Image;
import javax.swing.JFrame;


public class VentanaConFondo  extends JFrame {

 private final FondoPrincipal contenedor = new FondoPrincipal();

 public VentanaConFondo() {
   setContentPane(contenedor);
 }

 public void setImagen(String nombreImagen) {
        contenedor.setImagen(nombreImagen);
 }

 public void setImagen(Image nuevaImagen) {
        contenedor.setImagen(nuevaImagen);
}
}
