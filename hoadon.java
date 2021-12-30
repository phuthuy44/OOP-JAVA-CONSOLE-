package DoAn;

import java.io.Serializable;
import java.util.Scanner;

public class hoadon implements Serializable{
	protected String mahd;
	protected String makh;
	protected String masp;
	protected int soluong;
	protected int giahd;
	protected int tonggia;
	public static Scanner sc = new Scanner(System.in);
	public hoadon()
	{
		
	}
	public hoadon(String mahd,String makh,String masp,int soluong,int giahd,int tonggia)
	{
		this.mahd = mahd;
		this.makh = makh;
		this.masp = masp;
		this.giahd = giahd;
		this.soluong = soluong;
		this.tonggia = tonggia;
	}
	public String getMahd() {
		return mahd;
	}
	public void setMahd(String mahd) {
		this.mahd = mahd;
	}
	public String getMakh() {
		return makh;
	}
	public void setMakh(String makh) {
		this.makh = makh;
	}
	public String getMasp() {
		return masp;
	}
	public void setMasp(String masp) {
		this.masp = masp;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	
	public int getTonggia() {
		return tonggia;
	}
	public void setTonggia(int tonggia) {
		this.tonggia = tonggia;
	}
	
	public int getGiahd() {
		return giahd;
	}
	public void setGiahd(int giahd) {
		this.giahd = giahd;
	}
	public static Scanner getSc() {
		return sc;
	}
	public static void setSc(Scanner sc) {
		hoadon.sc = sc;
	}
	public void setMakh(){
		System.out.println("Nhap MaKH:");
		this.makh=CheckError1.CheckMaKH();
	}
	/*public void setHD(){
		System.out.println("Nhap MaHD:");
		this.makh=CheckError1.CheckMaHD();
	}*/
	public void setSP()
	{
		System.out.println("Nhap MaSP");
		this.masp = CheckError1.CheckMaSP();
	}
	public void setMasp()
	{
		System.out.println("Nhap ma san pham");
		masp = sc.nextLine();
	}
	public void setGhd()
	{
		System.out.println("Nhap gia = " );
		giahd = sc.nextInt();
	}
	public void setSoluong()
	{
		System.out.println("Nhap ma so luong");
		soluong = sc.nextInt();
	}
	public void settonggia()
	{
		System.out.println("Tong gia hoa don  = "+soluong*giahd+giahd*(5/100));
		tonggia =+soluong*giahd+giahd*(5/100);
	}
	public void nhaphd()
	{
		System.out.println("Nhap ma hoa don");mahd = sc.nextLine();
		mahd = sc.nextLine();
		//System.out.println("Nhap ma khach hang");
		setMakh();
	//	System.out.println("Nhap ma san pham");
		setSP();
		System.out.println("Nhap ma so luong");
		soluong = sc.nextInt();
		System.out.println("Nhap gia = " );//giahd = sc.nextInt();
		giahd = sc.nextInt();
		System.out.println("Nhap tong gia = "+soluong*giahd+giahd*(5/100));
		tonggia =+soluong*giahd+giahd*(5/100);
	}
	public void soluongcuahd()
	{
		System.out.println("Nhap ma so luong");
		soluong = sc.nextInt();
	}
	public void xuatsoluongcuahd()
	{
		System.out.println(soluong);
	}
	public void xuathd()
	{
		System.out.printf("%-20s%-20s%-20s%-20d%-20d%-20d",mahd,makh,masp,soluong,giahd,tonggia);
	}
}
