package DoAn;

import java.io.Serializable;
import java.util.Scanner;
public class Danhmucsp implements Serializable{
    protected String idDMuc;
    protected  String nameDMuc;
    public static Scanner sc= new Scanner(System.in);
    public Danhmucsp() {
    }
    public Danhmucsp(String idDMuc,final String nameDMuc) {
        this.idDMuc = idDMuc;
        this.nameDMuc = nameDMuc;
    }
	public String getIdDMuc() {
		return idDMuc;
	}
	public void setIdDMuc(String idDMuc) {
		this.idDMuc = idDMuc;
	}
	public String getNameDMuc() {
		return nameDMuc;
	}
	public void setNameDMuc(String nameDMuc) {
		this.nameDMuc = nameDMuc;
	}
    public void nhapdm() {
    	System.out.println("Nhap id danh muc");
    	idDMuc = CheckError1.Checkiddm();
    	System.out.println("Nhap ten danh muc");
    	nameDMuc = sc.nextLine();
    }
    public void hienthidm() {
    	System.out.printf("%-20s%-20s",idDMuc,nameDMuc);
    }
}