package model;

public class SanPham {

    String maSanPham;
    String tenSanPham;
    String hinhAnh;
    String giaSanPham;
    String soLuongMua;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, String hinhAnh, String giaSanPham, String soLuongMua) {
        super();
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hinhAnh = hinhAnh;
        this.giaSanPham = giaSanPham;
        this.soLuongMua = soLuongMua;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(String giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public String getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(String soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

    @Override
    public String toString() {
        return "SanPham [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", hinhAnh=" + hinhAnh
                + ", giaSanPham=" + giaSanPham + ", soLuongMua=" + soLuongMua + "]";
    }

}
