/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoAn;

import java.io.Serializable;
/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public abstract class ConNguoi implements Serializable{
    protected String HoTen;
    protected String NgaySinh;
    protected String GioiTinh;
    protected String DiaChi;
    protected String DienThoai;

    public static Scanner sc = new Scanner(System.in);
    public ConNguoi(){
        HoTen = null;
        NgaySinh = null;
        GioiTinh = null;
        DiaChi = null;
        DienThoai = null;

    }

    public ConNguoi(String HoTen, String NgaySinh, String GioiTinh, String DiaChi, String DienThoai) {

    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getDienThoai() {
        return DienThoai;
    }
    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }
    public void setHoten(){
        System.out.println("Nhap ho ten");
        HoTen=CheckError1.CheckTen();
    }
    public void setNgaySinh(){
        System.out.println("Nhap Ngay Sinh:");
        NgaySinh=sc.nextLine();
    }
    public void setGioiTinh(){
        GioiTinh=CheckError1.CheckGender();
    }
    public void setDiaChi(){
        System.out.println("Nhap Dia Chi:");
        DiaChi=sc.nextLine();
    }
    public void setDienThoai(){
        System.out.println("Nhap SDT:");
        DienThoai=CheckError1.CheckPhone();
    }
    public void nhap(){
        System.out.print("Nhap ho ten: ");
      //  HoTen = sc.nextLine();
        HoTen = CheckError1.CheckTen();
        System.out.print("Nhap ngay sinh: ");
        NgaySinh = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
      //  GioiTinh = sc.nextLine();
        GioiTinh = CheckError1.CheckGender();
        System.out.print("Nhap so dien thoai: ");
      //  DienThoai = sc.nextLine();
        DienThoai = CheckError1.CheckPhone();
        System.out.print("Nhap dia chi: ");
        DiaChi = sc.nextLine();
    }
}