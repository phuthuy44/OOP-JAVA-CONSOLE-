package DoAn;
import java.util.Scanner;
public class chitietxuat extends SanPham{
    public static Scanner sc = new Scanner(System.in);
	protected static SanPham sp;
	private chitietxuat[] dsctx;
	protected String Maphieu;
   // private int soluong;
	private int dongia;
    public chitietxuat(chitietxuat[] dsctx, String maphieu, int dongia) {
        this.dsctx = dsctx;
        Maphieu = maphieu;
        this.dongia = dongia;
        //this.soluong=soluong;
    }
    public chitietxuat(String idDMuc, String nameDMuc, String idSanpham, String name_sanpham, String ngayban,
            String hansudung, String mota, String gia, int soluong, chitietxuat[] dsctx, String maphieu,
            int dongia) {
        super(idDMuc, nameDMuc, idSanpham, name_sanpham, ngayban, hansudung, mota, gia, soluong);
        this.dsctx = dsctx;
        Maphieu = maphieu;
        this.dongia = dongia;
    }
    public chitietxuat() {
    }
    
    @Override
    public void soluong() {
        super.soluong();
    }
    public static SanPham getSp() {
        return sp;
    }
    public static void setSp(SanPham sp) {
        chitietxuat.sp = sp;
    }
    public chitietxuat[] getDsctx() {
        return dsctx;
    }
    public void setDsctx(chitietxuat[] dsctx) {
        this.dsctx = dsctx;
    }
    public String getMaphieu() {
        return Maphieu;
    }
    public void setMaphieu(String maphieu) {
        Maphieu = maphieu;
    }
    public void setMaphieu(){
       System.out.println("Nhap ma phieu xuat:");
       Maphieu=CheckError1.CheckMaphieuXuat();
    }
    public int getDongia() {
        return dongia;
    }
    public void setDongia(int dongia) {
        this.dongia = dongia;
    }
    public void setdongia(){
        System.out.println("Nhap don gia:");
        dongia=sc.nextInt();
    }
  public void chitietxuat1(){
      setMaphieu();
      System.out.println("Nhap Ma san pham:");
      idSanpham=CheckError1.CheckMaSP();
      setdongia();
      soluong();

  }
  public void xuatchitiet(){
      System.out.printf("%-20s%-20s%-20s%-20s",Maphieu, idSanpham,dongia,soluong);
      System.out.println();
  }
    
}
