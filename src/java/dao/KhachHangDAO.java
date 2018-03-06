package dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import model.KhachHang;
import model.MyConnectDB;

public class KhachHangDAO implements ObjectDAO{

	@Override
	public boolean themTaiKhoan(Object obj) {
		KhachHang kh = (KhachHang) obj;
		try {
			new MyConnectDB().thucThiSQL("insert into KhachHang values('"+kh.getUserName()+"','"+kh.getPass()+"','"+kh.getName()+"')");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public KhachHang layThongTinTaiKhoan(String username){
		try {
			ResultSet  rs=new MyConnectDB().chonDuLieu("select * from KhachHang where userName='"+username+"'");
			 while(rs.next()){
				String user = rs.getString(1);
				String pass = rs.getString(2);
				String name = rs.getString(3);
				return new KhachHang(user,pass,name);
			 }
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return null;
		
	}
	
	@Override
	public boolean kiemTraDangNhap(String username,String pass) {
		
		try {
			ResultSet  rs=new MyConnectDB().chonDuLieu("select * from KhachHang where userName='"+username+"'and pass='"+pass+"'");
			 while(rs.next()){
				
					 return true;
				 
			 }
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		return false;
	}
        public String getName(String Name){
           try {
			ResultSet  rs=new MyConnectDB().chonDuLieu(" select name from KhachHang where userName=?");
			 while(rs.next()){
				
				String name = rs.getString(1);
			return name;
			 }
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return null;
        }
	public static void main(String[] args) {
		//KhachHang kh = new KhachHang("lephong", "abcd", "Phong");
                KhachHangDAO khdap= new KhachHangDAO();
//		System.out.println(new KhachHangDAO().themTaiKhoan(kh));
		//System.out.println(new KhachHangDAO().kiemTraDangNhap("Sombody", "sombody"));
                System.out.println(khdap.layThongTinTaiKhoan("Sombody").getPass() );
                khdap.kiemTraDangNhap("Sombody","sombody");
                System.out.println( khdap.kiemTraDangNhap("Sombody","sombody"));
	}
}
