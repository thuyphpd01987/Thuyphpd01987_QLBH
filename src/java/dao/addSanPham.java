/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import connect.DBconnector;
import controller.themSanPham;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.KhachHang;
import model.MyConnectDB;
import model.SanPham;
import model.sanPhamThem;


/**
 *
 * @author Mai Ly
 */
public class addSanPham extends DBconnector{
    final String insert_sp="insert into sanPham1 values (?,?,?,?,?)";
    
    
    public boolean add(SanPham sp){
        try {
            boolean check=false;
            
            getconnec();
            PreparedStatement ps=con.prepareStatement(insert_sp);
            ps.setString(1,sp.getMaSanPham());
            ps.setString(2,sp.getTenSanPham());
            ps.setString(3,sp.getHinhAnh());
            ps.setString(4,sp.getGiaSanPham());
            ps.setString(5,sp.getSoLuongMua());
            
            
            int p=ps.executeUpdate();
            if (p>0) {
                check=true;
            }
            getclose();
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(addSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return false;
    }
  
       public boolean de(String id){
        try {
            boolean check=false;
            String sql="delete from sanPham1 where maSanPham=? ";
            getconnec();
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, id);
                  ps.execute();
                  return true;
        } catch (SQLException ex) {
            Logger.getLogger(addSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return false;
    }
    
    public ArrayList<SanPham> get_ALL(){
        ArrayList<SanPham> list=new ArrayList<>();
        try {
            getconnec();
            PreparedStatement rs=con.prepareStatement("select *from sanPham1 ");
            ResultSet s=rs.executeQuery();
            while (s.next()) {                
                SanPham item=new SanPham();
                item.setMaSanPham(s.getString(1));
                item.setTenSanPham(s.getString(2));
                item.setHinhAnh(s.getString(3));
                item.setGiaSanPham(s.getString(4));
                item.setSoLuongMua(s.getString(5));
               
                list.add(item);
                        }
            getclose();
        } catch (SQLException ex) {
            Logger.getLogger(sanPhamThem.class.getName()).log(Level.SEVERE, null, ex);
             ex.printStackTrace();
        }
        
        
        return list;
        
    }
    public static void main(String[] args) {
        addSanPham x=new addSanPham();
        for (int i = 0; i < x.get_ALL().size(); i++) {
            System.out.println(x.get_ALL().get(i));
        }
    }
//    public ArrayList<SINHVIEN> get_ALL(){
//        ArrayList<SINHVIEN> list=new ArrayList<>();
//        try {
//            getconnec();
//            PreparedStatement rs=con.prepareStatement(GET_ALL);
//            ResultSet s=rs.executeQuery();
//            while (s.next()) {                
//                SINHVIEN item=new SINHVIEN();
//                item.setMssv(s.getString("MSSV"));
//                item.setName(s.getString("TEN"));
//                item.setSex(s.getString("SEX"));
//                item.setDiachi(s.getString("SDT"));
//                item.setEmail(s.getString("EMAIL"));
//                item.setCity(s.getString("THANHPHO"));
//                list.add(item);
//                        }
//            getclose();
//        } catch (SQLException ex) {
//            Logger.getLogger(SINHVIEN_QUERY.class.getName()).log(Level.SEVERE, null, ex);
//             ex.printStackTrace();
//        }
//        
//        
//        return list;
    
}
