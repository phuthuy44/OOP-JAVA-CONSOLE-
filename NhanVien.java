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
public class NhanVien extends ConNguoi implements ChucVu,Serializable{
    protected String MaNV;
    protected String ChucVu;
    protected String Luong;
  public static  Scanner sc = new Scanner(System.in);
    public NhanVien(){
        super();
        MaNV = null;
    }

    public NhanVien(String MaNV, String HoTen, String NgaySinh, String GioiTinh, String DiaChi, String DienThoai, String ChucVu, String Luong) {
        super(HoTen, NgaySinh, GioiTinh, DiaChi, DienThoai);
        this.MaNV = MaNV;
    }
    
   
    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
    public void Luong(){
        Luong=null;
    }
    public void ChucVu(){
        ChucVu=null;
    }
    public void nhap(){
        System.out.print("Nhap ma nhan vien: ");
        MaNV=CheckError1.CheckMaNv();
        super.nhap();
    }
	/*public void setHoten(){
        System.out.println("Nhap ho ten");
        HoTen=CheckError1.CheckTen();
    }
    public void setNgaySinh(){
        System.out.println("Nhap Ngay Sinh:");
       NgaySinh=sc.nextLine();
    }
    public void setGioiTinh(){
		System.out.println("Nhap gioi tinh");
        GioiTinh=CheckError1.CheckGender();
    }
    public void setDiaChi(){
        System.out.println("Nhap Dia Chi:");
        DiaChi=sc.nextLine();
    }
    public void setSoDienThoai(){
        System.out.println("Nhap SDT:");
        DienThoai=CheckError1.CheckPhone();
    }*/
    public String toString(){
        return MaNV + "\t" + getHoTen() +"\t"+ getNgaySinh() +"\t"+ getGioiTinh()+ "\t"+getDienThoai() +"\t"+ getDiaChi(); 
    }
    public void xuat(){
        System.out.printf("|  %-20s%-20s%-20s%-20s%-30s%-30s%-30s%-30s       |",MaNV,getHoTen(),getNgaySinh(),getGioiTinh(),getDienThoai(),getDiaChi(),ChucVu,Luong);
    }
    public void xuat1(){
        System.out.println("+-------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
      //  System.out.printf("|    %-20s%-20s%-20s%-20s%-20s%-20s%-20s%-15s    |\n","Ma nhan vien","Ho ten","Ngay sinh","Gioi tinh","Dien Thoai","Dia Chi","Chuc vu","Luong");
        System.out.printf("|    %-20s%-20s%-20s%-20s%-30s%-30s%-30s%-30s    |\n",MaNV,getHoTen(),getNgaySinh(),getGioiTinh(),getDienThoai(),getDiaChi(),ChucVu,Luong );
        System.out.println("+-------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
    }
   /* public static void main(String[] args) {
        
        NhanVien b = new NVBanHang();
        b.nhap();
        b.xuat1();
    }*/


}
    

    