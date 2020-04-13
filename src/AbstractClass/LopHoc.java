/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass;

import interfaces.IQLDS;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Bui Minh Hieu
 */
public class LopHoc {
    // thuoc tinh
    // giao vien chu nhiem
    private GiaoVien giaoVienCN = null;
    // danh sach hoc sinh trong lop
    private ArrayList<CaNhan> dsHocSinh = null;
    // danh sach giao vien giang day cua lop
    private ArrayList<CaNhan> dsGVGD = null;
    
    // quan ly hoc sinh
    private IQLDS qlDsGVGD = null;
    // quan ly danh sach giao vien
    private IQLDS qlDsHS = null;

    // khai bao doi tuong
    // khong tham so
    public  LopHoc() {
        this.giaoVienCN = new GiaoVien();
        this.dsHocSinh = new ArrayList<>();
        this.dsGVGD = new ArrayList<>();
        this.qlDsHS = new QLDS(dsHocSinh);
        this.qlDsGVGD = new QLDS(dsGVGD);
    }
    // khai bao lop hoc voi du lieu giao vien chu nhiem truyen vao
    public LopHoc(GiaoVien gvChuNhiem) {
        this.giaoVienCN = gvChuNhiem;
        this.dsHocSinh = new ArrayList<>();
        this.dsGVGD = new ArrayList<>();
        this.qlDsHS = new QLDS(dsHocSinh);
        this.qlDsGVGD = new QLDS(dsGVGD);
    }

    // getter, setter
    public void setGiaoVienCN(GiaoVien giaoVienCN) { this.giaoVienCN = giaoVienCN; } 
    public GiaoVien getGiaoVienCN() { return giaoVienCN; }
    
    // them hoc sinh
    public int themHocSinh(HocSinh hs) {
      if (qlDsHS.them(hs) == 1) {
        return 1;
      }
      return 0;
    }
    // them giao vien giang day
    public int themGVGD(GiaoVien gv) {
      if (qlDsGVGD.them(gv) == 1) {
        return 1;
      }
      return 0;
    }
    // in danh sach hoc sinh
    public int inDSHS() {
        System.out.println("Danh sach hoc sinh:");
        qlDsHS.inDS();
        return 1;
    }
    // in danh sach giao vien giang day
    public int inDSGVGD() {
        System.out.println("Danh sach giao vien giang day:");
        qlDsGVGD.inDS();
        return 1;
    }
}