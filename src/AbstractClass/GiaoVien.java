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
public class GiaoVien extends CaNhan {
    // thuoc tinh
    private String mon;
    private String bomon;
  
    // khai báo đối tượng
    // không tham số
    public GiaoVien() {
      super();
      this.mon = "";
      this.bomon = "";
    }
    // có tham số
    public GiaoVien(String hoten, int tuoi, String diachi, String sdt, String mon, String bomon) {
      super(hoten, tuoi, diachi, sdt);
      this.mon = mon;
      this.bomon = bomon;
    }
  
    // get set thong tin
    public void setMonDay(String mon) { this.mon = mon; }
    public void setToBoMon(String bomon) { this.bomon = bomon; }
    public String getMonDay() { return this.mon; }
    public String getToBoMon() { return this.bomon; }

    // hien thi thong tin
    @Override
    public String hienThiTT() {
      String thongtin = "";
      thongtin = "ho ten: " + this.hoten + ", tuoi: " + this.tuoi + ", dia chi: " + this.diachi
        + ", sdt: " + this.sdt + ", mon day: " + this.mon + ", to bo mon: " + this.bomon;
      return thongtin;
    }
}