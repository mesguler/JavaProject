/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBS;

/**
 *
 * @author MG
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaConnect{

    static final String jdbUrl = "jdbc:oracle:thin:@localhost:1521:XE";
    static final String driver = "oracle.jdbc.driver.OracleDriver";
    static final String user = "SYSTEM";
    static final String pass = "1234";

 /* public static Connection konnectorDb(){
     try {
       Class.forName(driver);
       Connection con = DriverManager.getConnection(jdbUrl, user, pass);
        java.sql.Statement stmt = con.createStatement();
       ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            if(rs.next()) {
                System.out.println(rs.getString("username"));
                System.out.println(rs.getString("password"));
            
            }
            con.close();
       return con;
      } catch(ClassNotFoundException | SQLException e){
         JOptionPane.showInputDialog(null, e);
         return null;
     
       }
       

}
  public static void main(String[] args){
   konnectorDb();
  }
*/
}