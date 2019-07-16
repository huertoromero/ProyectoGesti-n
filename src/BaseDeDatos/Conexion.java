

package BaseDeDatos;

import java.sql.*;

public class Conexion {
 static String bd = "salonbelleza";
 static String login = "root";
 static String password = "";
 static String url = "jdbc:mysql://localhost:3306/" + bd;
 public Statement sentencia;
 public ResultSet resultado;
 public ResultSetMetaData rsMeta;
 public Connection conexion;

public void conectarBaseDeDatos(){
 try{
  Class.forName("com.mysql.jdbc.Driver");
  conexion = DriverManager.getConnection(url,login,password);
  sentencia = conexion.createStatement();
 }
 catch(SQLException e){
  javax.swing.JOptionPane.showMessageDialog(null,"Error");
  System.exit(1);
 }

 catch(ClassNotFoundException e){
  javax.swing.JOptionPane.showMessageDialog(null,"Error Carga Driver");
  System.exit(1);
 }
}

public void desconectarBaseDeDatos() {
try {
 if (conexion != null ) {
  if(sentencia != null) {
  sentencia.close();
  }
  conexion.close();
  }
}
catch (SQLException ex) {
}
}

public Connection getConnection(){
 return conexion;
}

}


