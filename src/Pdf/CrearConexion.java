
package Pdf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearConexion {
 public static String strUsuario = "root";
 public static String strPassword = "root";
 public static String strBaseDatos ="salonbelleza";
 public static String strHost = "localhost";

    public static void cerrar(ResultSet rs) {
     try{
      rs.close();
     }
     catch(Exception ex){}
    }

   public static void cerrar(Statement st) {
     try{
      st.close();
     }
     catch(Exception ex){}
    }

    public static void cerrar(Connection conn) {
     try{
      conn.close();
     }
     catch(Exception ex){}
    }

    public CrearConexion(String usr,String pw, String bd) {
     strUsuario = usr;
     strPassword = pw;
     strBaseDatos =bd;
     try{
      Class.forName("com.mysql.jdbc.Driver");
     }
     catch ( ClassNotFoundException e ){
      System.out.println("ERROR: Error al cargar la clase del Driver");
     }
    }

    public Connection getConnection() throws SQLException {
     String url = "jdbc:mysql://"+strHost+"/"+strBaseDatos;
     return DriverManager.getConnection(url,strUsuario,strPassword);
    }

}

