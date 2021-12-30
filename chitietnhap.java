package DoAn;

import java.io.Serializable;
import java.util.Scanner;

public class chitietnhap extends SanPham implements Serializable{
	public static Scanner sc = new Scanner(System.in);
	protected static SanPham sp;
	private chitietnhap[] dsctn;
	private String idnhap;
	private String idmh;
	private int dongia;
	private int soluong;
	private int thanhtien;
	
	public chitietnhap() {
		
	}
	public chitietnhap(String idnhap,String idmh,int dongia,int soluong,int thanhtien) {
		this.idnhap = idnhap;
		this.idmh = idmh;
		this.dongia = dongia;
		this.soluong =soluong;
		this.thanhtien = thanhtien;
	}
	public String getIdmh() {
		return idmh;
	}
	public void setIdmh(String idmh) {
		this.idmh = idmh;
	}
	public int getDongia() {
		return dongia;
	}
	public void setDongia(int dongia) {
		this.dongia = dongia;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public double getThanhtien() {
		return thanhtien;
	}
	public void setThanhtien(int thanhtien) {
		this.thanhtien = thanhtien;
	}
	public String getIdnhap() {
		return idnhap;
	}
	public void setIdnhap(String idnhap) {
		this.idnhap = idnhap;
	}
	public void idnhapct()
	{
		System.out.println("Nhap id nhap (String)");
		idnhap = CheckError1.Checkidnhap();
	}
	public void idsanpham()
	{
		System.out.println("Nhap id mat hang (String)");
		idmh = CheckError1.CheckMaSP();
	}
	public void dongia()
	{
		System.out.println("Nhap don gia (Int)");
		dongia = sc.nextInt();
	}
	public void soluong()
	{
		System.out.println("Nhap so luong (Int)");
		soluong =sc.nextInt();
	}
	public int soluong1()
	{
		
		return soluong;
	}
	public void thanhtien()
	{
		System.out.println("Thanh tien la (Int)");
		thanhtien = soluong*dongia;
	}
	public void soluongdcmua() {
		int x = sp.getSoluong()-soluong;
		
	}
	public int soluonggiam()
	{
		return soluong--;
	}
	public int soluongtang()
	{
		return soluong+10;
	}
	public int themsoluong()
	{
		//boolean check = false;
        for (chitietnhap i : dsctn) {
            if (i.getIdmh() == sp.getIdSanpham()) {
                i.soluong += sp.soluong;
              //  check = true;
                break;
            }
        }
		return themsoluong();
	}
	public void nhapchitiet() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap id nhap (String)");
		idnhap = CheckError1.Checkidnhap();
		System.out.println("Nhap id mat hang (String)");
		idmh = CheckError1.CheckMaSP();
		System.out.println("Nhap don gia (Int)");
		dongia = sc.nextInt();
		System.out.println("Nhap so luong (Int)");
		soluong =sc.nextInt();
		System.out.println("Thanh tien la (Int)\n"+soluong*dongia);
		thanhtien = soluong*dongia;
		sc.close();
	}
	public void xuatchitiet() {
		System.out.printf("%-12s%-15s%-16d%-18d%-16d",idnhap,idmh,dongia,soluong,thanhtien);
		System.out.println();
	}
}
