package DoAn;

import java.io.Serializable;
import java.util.Scanner;

public class phieunhap implements Serializable {
	public static Scanner sc = new Scanner(System.in);
	protected int stt;
	protected String idnhap;
	protected String ngaynhap;
	protected String idnv;
	protected String mancc;
	public phieunhap() {
		
	}
	public phieunhap(int stt,String idnhap,String ngaynhap,String idnv,String mancc) {
		this.stt =stt;
		this.idnhap = idnhap;
		this.ngaynhap = ngaynhap;
		this.idnv = idnv;
		this.mancc = mancc;
	}
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public String getIdnhap() {
		return idnhap;
	}
	public void setIdnhap(String idnhap) {
		this.idnhap = idnhap;
	}
	public String getNgaynhap() {
		return ngaynhap;
	}
	public void setNgaynhap(String ngaynhap) {
		this.ngaynhap = ngaynhap;
	}
	public String getIdnv() {
		return idnv;
	}
	public void setIdnv(String idnv) {
		this.idnv = idnv;
	}
	public String getMancc() {
		return mancc;
	}
	public void setMancc(String mancc) {
		this.mancc = mancc;
	}
	public void idnhap()
	{
		System.out.println("Nhap ngay nhap (String)");
		idnhap = CheckError1.Checkidnhap();
	}
	public void ngaynhap()
	{
		System.out.println("Nhap ngay nhap (String)");
		ngaynhap = sc.nextLine();
	}
	public void mannc()
	{
		System.out.println("Nhap mancc (String)");
		mancc = CheckError1.CheckIDncc();
	}
	public void ngay()
	{
		System.out.println("Nhap ngay nhap (String)");
		ngaynhap = sc.nextLine();
	}
	public void nhapkho() {
		System.out.println("Nhap so stt (String)");
		stt = sc.nextInt();
		System.out.println("Nhap id nhap (String)");sc.nextLine();
		idnhap = CheckError1.Checkidnhap();
		System.out.println("Nhap ngay nhap (String)");
		ngaynhap = sc.nextLine();
		System.out.println("Nhap mancc (String)");
		mancc = CheckError1.CheckIDncc();
		}
	public void xuatkho() {
		System.out.printf("%-6d%-20s%-20s%-20s",stt,idnhap,ngaynhap,mancc);
		System.out.println();
	}
}
