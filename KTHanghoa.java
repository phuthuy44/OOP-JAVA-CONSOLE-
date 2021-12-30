package DoAn;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class KTHanghoa extends SanPham {
	private double Dongia;
    private Date ngaySX, HSD;
    public KTHanghoa(String idDMuc, String nameDMuc, String idSanpham, String name_sanpham, String ngayban,
            String hansudung, String mota, String gia, int soluong, double dongia, Date ngaySX, Date hSD) {
        super(idDMuc, nameDMuc, idSanpham, name_sanpham, ngayban, hansudung, mota, gia, soluong);
        Dongia = dongia;
        this.ngaySX = ngaySX;
        HSD = hSD;
    }
    public KTHanghoa() {
    }
    public double getDongia() {
        return Dongia;
    }
    public void setDongia(double dongia) {
        Dongia = dongia;
    }
    public Date getNgaySX() {
        return ngaySX;
    }
    public void setNgaySX(int year, int month, int day){
        Calendar c= Calendar.getInstance();
        c.set(year, month - 1, day);
        this.ngaySX = c.getTime();
    }
    public Date getHSD() {
        return HSD;
    }
    public void setHSD(Date hSD) {
        HSD = hSD;
    }
    public void setHSD(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.HSD = calendar.getTime();
    }
    public boolean kiemTraTenHang(boolean k) {
        if (this.Name_sanpham == "" || this.Name_sanpham.isEmpty()) {
            System.out.println("Ten hang khong duoc de trong : ");
        } else {
            k = false;
        }
        return k;
    }
    public boolean kiemTraNgay(boolean t) {
        if (this.getNgaySX().compareTo(this.getHSD()) < 0) {
            t = false;
        } else {
            System.out.println("Ngay het han khong duoc nho hon ngay san xuat: ");
        }
        return t;
    }
    public void kiemTraHSD() {
        Date today = new Date();
        today.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String st = simpleDateFormat.format(today);
        if (this.getHSD().compareTo(today) < 0) {
            System.out.println("Hom nay la ngay " + st + ",hang hoa da het han .");
        } else {
            System.out.println("Hom nay la ngay " + st + ", hang hoa van con han. ");
        }
    }
    @Override
    public void idsp() {
        super.idsp();
    }
    @Override
    public void namesp() {
        super.namesp();
    }
    @Override
    public String toString() {
       //Locale localVN= new Locale("vi","VN");//bien doi theo tien te VN
      // NumberFormat n= NumberFormat.getCurrencyInstance(localVN);
       //String str=n.format(Dongia);
       SimpleDateFormat s= new SimpleDateFormat("dd/MM/yyyy");
       String s1=s.format(ngaySX);
       String s2=s.format(HSD);
       return "Thong tin ve thuc pham:\n"+"ID SanPham:"+idSanpham+" "+"TenSP"+Name_sanpham+" "+"Don gia:"+ Dongia+" "+"NgaySX:"+s1+" "+"NgayHetHan:"+s2+"\n";


    }
}
