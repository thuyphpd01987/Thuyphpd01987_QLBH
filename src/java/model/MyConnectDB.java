package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MyConnectDB {
		public static String sqlDB;
		
		public MyConnectDB() {
			super();
			sqlDB = "jdbc:sqlserver://localhost:1433;databaseName=demoGioHang;user=sa;password=123456;";
		}
		
		public static  Connection connect() throws Exception{
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Connection connect = DriverManager.getConnection(sqlDB);
				return connect;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			return null;
		}
		public  void thucThiSQL(String sql) throws Exception{
			Connection connect =connect();
			Statement stmt = connect.createStatement();
			stmt.executeUpdate(sql);
		}
		public ResultSet chonDuLieu(String sql) throws Exception{
			Connection connect =connect();
			Statement stmt = connect.createStatement();
			ResultSet rs=	stmt.executeQuery(sql);
			return rs;
		}
		
	
		public PreparedStatement dungStament(String sql) throws SQLException, Exception{
			return connect().prepareStatement(sql);
		}
		
	public static void main(String[] args) throws Exception {
		System.out.println(new MyConnectDB().connect());
	}
}
