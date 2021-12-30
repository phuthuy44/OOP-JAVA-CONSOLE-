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
public class KhachHang extends ConNguoi implements Serializable  {
    protected String MaKH;
    protected int SoHD;
    protected String The;
    public static Scanner sc = new Scanner(System.in);
    public KhachHang(){
        super();
        MaKH = null;
    }
    public KhachHang(String MaKH, String HoTen,int SoHD, String The, String NgaySinh, String GioiTinh, String DiaChi, String DienThoai) {
        super(HoTen, NgaySinh, GioiTinh, DiaChi, DienThoai);
        this.MaKH = MaKH;
        this.SoHD = SoHD;
        this.The = The;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }
    @Override
    public void nhap(){
        System.out.print("Nhap ma khach hang: ");
		MaKH=CheckError1.CheckMaKH();
        super.nhap();
        System.out.print("So luong cac hoa don da mua: ");
        SoHD=CheckError1.CheckInteger();
        System.out.print("Nhap the thanh vien: " +LoyalCustomer());
        System.out.println("\n");
    }
    public void makh()
    {
    	System.out.println("Nhap khach hang");
    	//MaKH = sc.nextLine();
    	MaKH=CheckError1.CheckMaKH();
    }
    
    public int getSoHD() {
		return SoHD;
	}
	public void setSoHD(int soHD) {
		SoHD = soHD;
	}
	public String getThe() {
		return The;
	}
	public void setThe(String the) {
		The = the;
	}
/*	public void setHoten(){
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
		//getGioiTinh();
    }
    public void setDiaChi(){
        System.out.println("Nhap Dia Chi:");
        DiaChi=sc.nextLine();
    }
    public void setDienThoai(){
        System.out.println("Nhap SDT:");
        DienThoai=CheckError1.CheckPhone();
    }*/
	public String LoyalCustomer() {
        if (getSoHD()<=5) {
            this.The ="KH Thanh Vien";
        } else if (getSoHD()<=15) {
            this.The ="KH Than Thiet";
        } else 
            this.The = "KH VIP";
        return null;
	}
	
   // @Override
  /*  public String toString(){
        return MaKH + "\t" + getHoTen() +"\t"+ getNgaySinh() +"\t"+ getGioiTinh()+ "\t"+getDienThoai() +"\t"+ getDiaChi(); 
    }*/
    public void xuat(){
     //   System.out.println("+----------------------------------------------------------------------------------------------------------------------------------+");
      //  System.out.printf("|    %-20s%-20s%-20s%-20s%-20s%-20s      |\n","Ma khach hang","Ho Ten","Ngay sinh","Gioi","So dien thoai","Dia chi");
        System.out.printf("|    %-20s%-20s%-20s%-20s%-20s%-20s%-15s%-25s\n",MaKH,HoTen,NgaySinh,GioiTinh,DienThoai,DiaChi,SoHD,The );
    //    System.out.println("+----------------------------------------------------------------------------------------------------------------------------------+");
    }
    public static void main(String[] args) {
        KhachHang a = new KhachHang();
        a.nhap();
        a.xuat();
    }
}
