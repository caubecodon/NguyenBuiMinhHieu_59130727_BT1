/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenbuiminhhieu_59130727_bt1;

import java.util.Scanner;
import AbstractClass.GiaoVien;
import AbstractClass.HocSinh;
import AbstractClass.LopHoc;

/**
 *
 * @author Nguyen Bui Minh Hieu
 */
public class NguyenBuiMinhHieu_59130727_BT1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tao giao vien chu nhiem bang setvalue
        GiaoVien gvcn = new GiaoVien();
        gvcn.setHoTen("Chu Nhiem Mot");
        gvcn.setTuoi(30);
        gvcn.setDiaChi("Nha Trang - Khanh Hoa");
        gvcn.setSdt("0123456789");
        gvcn.setMonDay("Toan roi rac");
        gvcn.setToBoMon("Co so toan cho tin hoc");

        // tao lop hoc voi giao vien chu nhiem
        LopHoc lopHoc = new LopHoc(gvcn);

        // them danh sach hoc hinh vao lop
        // tao hoc sinh bang set values
        HocSinh hs1 = new HocSinh();
        hs1.setHoTen("Hoc Sinh Mot");
        hs1.setTuoi(12);
        hs1.setDiaChi("Nha Trang - Khanh Hoa");
        hs1.setSdt("0123456987");
        hs1.setLop("CNTT");
        hs1.setNangKhieu("Danh dan");
        // them hs vao lop
        lopHoc.themHocSinh(hs1);

        // tao them hoc sinh bang khoi tao
        HocSinh hs2 = new HocSinh("Hoc Sinh Hai", 12, "Tuy Hoa - Phu Yen", "0231546794", "CNTT", "Hat");
        // them hs vao lop
        lopHoc.themHocSinh(hs2);

        Scanner input = new Scanner(System.in);
        // tao them hoc sinh tu ban phim
        HocSinh hs3 = new HocSinh();
        System.out.println("nhap thong tin hoc sinh: ");
        System.out.print("ten hoc sinh: ");
        hs3.setHoTen(input.nextLine());
        System.out.print("tuoi: ");
        hs3.setTuoi(input.nextInt());
        input.nextLine();
        System.out.print("dia chi: ");
        hs3.setDiaChi(input.nextLine());
        System.out.print("so dien thoai: ");
        hs3.setSdt(input.nextLine());
        System.out.print("lop: ");
        hs3.setLop(input.nextLine());
        System.out.print("nang khieu: ");
        hs3.setNangKhieu(input.nextLine());
        // them hs vao lop
        lopHoc.themHocSinh(hs3);
        

        // them giao vien giang day vao lop hoc
        // tao giao vien bang set value
        GiaoVien gv1 = new GiaoVien();
        gv1.setHoTen("Giao Vien Mot");
        gv1.setTuoi(30);
        gv1.setSdt("0123789456");
        gv1.setDiaChi("Song Cau - Phu Yen");
        gv1.setMonDay("Mau thiet ke");
        gv1.setToBoMon("Lap trinh android");
        // them giao vien giang day vao lop hoc
        lopHoc.themGVGD(gv1);

        // tao them giao vien giang day bang cach khoi tao
        GiaoVien gv2 = new GiaoVien("Giao Vien Hai", 31, "Cam Ranh - Khanh Hoa", "0456789123", "Thiet ke web", "XML");
        // them giao vien giang day vao lop hoc
        lopHoc.themGVGD(gv2);

        // tao them giao vien giang day nhap tu ban phim
        GiaoVien gv3 = new GiaoVien();
        System.out.println("\nnhap thong tin giao vien giang day: ");
        System.out.print("ten giao vien giang day: ");
        gv3.setHoTen(input.nextLine());
        System.out.print("tuoi: ");
        gv3.setTuoi(input.nextInt());
        input.nextLine();
        System.out.print("dia chi: ");
        gv3.setDiaChi(input.nextLine());
        System.out.print("so dien thoai: ");
        gv3.setSdt(input.nextLine());
        System.out.print("mon day: ");
        gv3.setMonDay(input.nextLine());
        System.out.print("to bo mon: ");
        gv3.setToBoMon(input.nextLine());
        // them hs vao lop
        lopHoc.themGVGD(gv3);

        // in danh sach hos sinh trong lop
        lopHoc.inDSHS();

        // in danh sach giao vien giang day
        lopHoc.inDSGVGD();

    }
}