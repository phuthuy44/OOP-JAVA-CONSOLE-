package DoAn;

import java.io.Serializable;
import java.util.Scanner;

public class nhacungcap implements Serializable {
	
	public static Scanner sc = new Scanner(System.in);
	private String mancc;
	private String tncc;
	private String dcncc;
	private String sdtncc;
	private String loai;
	private int stt;
	public nhacungcap() {
		
	}
	public nhacungcap(int stt,String mancc,String tncc,String dcncc,String sdtncc,String loai)
	{
		this.stt = stt;
		this.mancc = mancc;
		this.tncc =tncc;
		this.dcncc =dcncc;
		this.sdtncc = sdtncc;
		this.loai = loai;
	}
	public String getMancc() {
		return mancc;
	}
	public void setMancc(String mancc) {
		this.mancc = mancc;
	}
	public String getTncc() {
		return tncc;
	}
	public void setTncc(String tncc) {
		this.tncc = tncc;
	}
	public String getDcncc() {
		return dcncc;
	}
	public void setDcncc(String dcncc) {
		this.dcncc = dcncc;
	}
	public String getSdtncc() {
		return sdtncc;
	}
	public void setSdtncc(String sdtncc) {
		this.sdtncc = sdtncc;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public void mancc()
	{
		System.out.println("nhap ma so nha cung cap ");
		mancc = CheckError1.CheckIDncc();
	}
	public void tncc()
	{
		System.out.println("nhap ten nha cung cap");
		tncc = sc.nextLine();
	}
	public void dcncc()
	{
		System.out.println("nhap dia chi nha cung cap");
		dcncc = sc.nextLine();
	}
	public void sdtncc()
	{
		System.out.println("nhap so dien thoai nha cung cap");
		sdtncc = CheckError1.CheckPhone();
	}
	public void loaihang()
	{
		System.out.println("nhap loai hang");
		loai = sc.nextLine();
	}
	public void xuatnhacungcap()
	{
		System.out.printf("%-5d%-30s%-30s%-30s%-50s%-40s",stt,mancc,tncc,dcncc,sdtncc,loai);
		System.out.println();
	}
	public void nhapnhacc()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap stt cua nha cung cap");
		stt = sc.nextInt();
		System.out.println("nhap ma so nha cung cap ");sc.nextLine();
		mancc = CheckError1.CheckIDncc();
		System.out.println("nhap ten nha cung cap");
		tncc = sc.nextLine();
		System.out.println("nhap dia chi nha cung cap");
		dcncc = sc.nextLine();
		System.out.println("nhap so dien thoai nha cung cap");
		sdtncc = CheckError1.CheckPhone();
		System.out.println("nhap loai hang");
		loai = sc.nextLine();
	}
}
