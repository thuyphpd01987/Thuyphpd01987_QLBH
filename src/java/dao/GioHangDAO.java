package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import connect.DBconnector;
import model.SanPham;
import model.sanPhamThem;

public class GioHangDAO extends DBconnector{

    public static ArrayList<SanPham> dsSanPham = new ArrayList<>();
    public static ArrayList<SanPham> gioHang = new ArrayList<>();

    public GioHangDAO() {
        dsSanPham.removeAll(dsSanPham);
        SanPham ip = new SanPham("IP001", "Iphong 7s plus", "img/ip7.jpg", "19000000", "1");
        SanPham ss = new SanPham("SS601", "SamSung", "img/ss8.jpg", "13000000", "1");
        SanPham sn = new SanPham("SN401", "Sony", "img/sony.png", "12000000", "1");
        SanPham oppo = new SanPham("OP301", "Oppo f3", "img/oppo.jpg", "10000000", "1");
        SanPham oppo1 = new SanPham("OP301", "Oppo f3", "img/oppo.jpg", "10000000", "1");
        dsSanPham.add(ip);
        dsSanPham.add(ss);
        dsSanPham.add(sn);
        dsSanPham.add(oppo);
        dsSanPham.add(oppo1);
       
       

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

    public boolean kiemTraSanPhamCoTrongGioHangChua(String maSanPham) {
        for (int i = 0; i < gioHang.size(); i++) {
            if (gioHang.get(i).getMaSanPham().equals(maSanPham)) {
                return true;
            }
        }
        return false;
    }

    public boolean themVaoGioHang(String maSanPham) {
        boolean kiemTra = kiemTraSanPhamCoTrongGioHangChua(maSanPham);
        for (int i = 0; i < dsSanPham.size(); i++) {
            if (dsSanPham.get(i).getMaSanPham().equals(maSanPham) && kiemTra == false) {
                gioHang.add(dsSanPham.get(i));
                return true;
            }
        }
        if (kiemTra == true) {
            int index = gioHang.size();
            for (int i = 0; i < index; i++) {
                if (gioHang.get(i).getMaSanPham().equals(maSanPham)) {
                    gioHang.get(i).setSoLuongMua(Integer.parseInt(gioHang.get(i).getSoLuongMua()) + 1 + "");
                    index = i;
                }
            }
        }
        return false;
    }

    public boolean xoaSanPhamRaKkoiGioHang(String maSanPham) {
        for (int i = 0; i < gioHang.size(); i++) {
            if (gioHang.get(i).getMaSanPham().equals(maSanPham)) {
                gioHang.remove(i);
                return true;
            }
        }
        return false;
    }

    public static ArrayList<SanPham> getDsSanPham() {
        return dsSanPham;
    }

    public static void setDsSanPham(ArrayList<SanPham> dsSanPham) {
        GioHangDAO.dsSanPham = dsSanPham;
    }

    public static ArrayList<SanPham> getGioHang() {
        return gioHang;
    }

    public static void setGioHang(ArrayList<SanPham> gioHang) {
        GioHangDAO.gioHang = gioHang;
    }

}
