/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass;

/**
 *
 * @author Nguyen Bui Minh Hieu
 */
public class HocSinh extends CaNhan {
    // thuoc tinh
    private String lop;
    private String nangkhieu;

    // khai bao doi tuong
    // khong tham so
    public HocSinh() {
      super();
      this.lop = "";
      this.nangkhieu = "";
    }
    // co tham so
    public HocSinh(String hoten, int tuoi, String diachi, String sdt, String lop, String nangkhieu) {
      super(hoten, tuoi, diachi, sdt);
      this.lop = lop;
      this.nangkhieu = nangkhieu;
    }

    // getter, setter
    public void setLop(String lop) { this.lop = lop; }
    public void setNangKhieu(String nangkhieu) { this.nangkhieu = nangkhieu; }
    public String getLop() { return this.lop; }
    public String getNangKhieu() { return this.nangkhieu; }

    
    // hien thi thong tin
    @Override
    public String hienThiTT() {
      String thongtin = "";
      thongtin = "ho ten: " + this.hoten + ", tuoi: " + this.tuoi + ", dia chi: " + this.diachi
        + ", sdt: " + this.sdt + ", lop: " + this.lop + ", nang khieu: " + this.nangkhieu;

      return thongtin;
    }
}