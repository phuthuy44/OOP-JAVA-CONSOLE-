package DoAn;

import java.io.Serializable;
import java.util.Scanner;

public class PhieuXuat implements Serializable {
    public static Scanner sc = new Scanner(System.in);
	protected int stt=0;
	protected String MaPhieuXuat;
	protected String ngayxuat;
    public PhieuXuat(int stt, String MaPhieuXuat, String ngayxuat, String MaSP) {
        this.stt = stt;
        this.MaPhieuXuat = MaPhieuXuat;
        this.ngayxuat = ngayxuat;
    }
    public PhieuXuat() {
    }
    public int getStt() {
        return stt;
    }
    public void setStt(int stt) {
        this.stt = stt;
    }
    public void setSTT(){
        stt++;
    }
    public String getMaPhieuXuat() {
        return MaPhieuXuat;
    }
    public void setMaPhieuXuat(String maPhieuXuat) {
        MaPhieuXuat = maPhieuXuat;
    }
    public String getNgayxuat() {
        return ngayxuat;
    }
    public void setNgayxuat(String ngayxuat) {
        this.ngayxuat = ngayxuat;
    }
    public void setMaPhieuXuat(){
        System.out.println("Nhap ma phieu xuat");
        MaPhieuXuat= CheckError1.CheckMaphieuXuat();
    }
    
    public void setNgayXuat(){
        System.out.println("Nhap ngay xuat:");
        ngayxuat=sc.nextLine();
    }
    void phieuxuat(){
        stt++;
        setMaPhieuXuat();
        setNgayXuat();
    }
    void xuat1(){
        System.out.printf("%-20s%-20s%-20s,",stt,MaPhieuXuat,ngayxuat);
    }
}
