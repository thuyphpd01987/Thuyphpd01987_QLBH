/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBconnector {
    protected Connection con;
    String hostname="localhost";
    String post="1433";
    String name="demoGioHang";
    String use="sa";
    String pass="123456";
    String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
    String url="jdbc:sqlserver://localhost:1433;" +  
         "databaseName=demoGioHang;user=sa;password=123456";
    public void getconnec(){
        try {
            Class.forName(driver);
            con=DriverManager.getConnection(url, use, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBconnector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBconnector.class.getName()).log(Level.SEVERE, null, ex);
        }
  
}
    public void getclose(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
