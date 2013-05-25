package BBAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionAccess {

  public static Connection conexion;
  
  public static void main(String[] args) {
    conectar();
    
    
    
    
    
    try {
      conexion.close();
    } catch (SQLException ex) {
      Logger.getLogger(ConexionAccess.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  private static void conectar() {
    try {
      //cargar en memoria el driver de mysql.
      //Class.forName("com.mysql.jdbc.Driver");
      //cargar en memoria el driver para access.
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      conexion = DriverManager.getConnection("jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=temp.mdb");

      String sql = "select * from t_empleados";
      Statement consulta = conexion.createStatement();
      consulta.executeQuery(sql);//muestra resultados equivalentes en SQL  a utilizar SELECT
      ResultSet rs = consulta.getResultSet(); //obtiene el resultado de la consulta y lo guarda en rs
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
}
