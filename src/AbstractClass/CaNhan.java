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
public abstract class CaNhan {
    // thuoc tinh
    // protected dung cho abstract class
    // cac lop con co the truy xuat duoc
    // protect # private, neu su dung private se khong truy xuat duoc tu lop 
    protected String hoten;
    protected int tuoi;
    protected String diachi;
    protected String sdt;

    // khai báo đối tượng
    // luôn được gọi với toán tử new
    // khởi tạo đối tượng cho class tương ứng  
    // không tham số
    public CaNhan() {
      this.hoten = "";
      this.tuoi = 0;
      this.diachi = "";
      this.sdt = "";
    }
    // có tham số
    public CaNhan(String hoten, int tuoi, String diachi, String sdt) {
      this.hoten = hoten;
      this.tuoi = tuoi;
      this.diachi = diachi;
      this.sdt = sdt;
    }

    // getter, setter
    public void setHoTen(String hoten) { this.hoten = hoten; }
    public void setTuoi(int tuoi) { this.tuoi = tuoi; }
    public void setDiaChi(String diachi) { this.diachi = diachi; }
    public void setSdt(String sdt) { this.sdt = sdt; }
    public String getHoTen() { return this.hoten; }
    public int getTuoi() { return this.tuoi; }
    public String getDiaChi() { return this.diachi; }
    public String getSdt() { return this.sdt; }

    // abtract methods
    // hien thi thong tin
    public abstract String hienThiTT();
}