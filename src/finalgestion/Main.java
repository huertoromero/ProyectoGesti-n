package finalgestion;

import UpperEssential.UpperEssentialLookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
 UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("C:\\Users\\Administrador\\Documents\\Netbeans projects\\Proyecto Final- Salon Belleza 4\\elSalonSystem\\Librerias\\nuevoTema.theme"));
// UIManager.setLookAndFeel(new UpperEssentialLookAndFeel());
   
     inicio in = new inicio();
     in.setVisible(true);
    }

}
