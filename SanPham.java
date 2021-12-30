package DoAn;
import java.io.Serializable;
import java.util.Scanner;
public class SanPham extends Danhmucsp implements Serializable{
	protected  String idSanpham;
	protected String Name_sanpham;
	protected String ngayban;
	protected String hansudung;
	protected String mota;
	protected String gia;
	protected int soluong;
	public static Scanner sc= new Scanner(System.in);
	public SanPham() {
	       super();
	    }
	    public SanPham( String idDMuc, String nameDMuc,  String idSanpham,  String name_sanpham,  String ngayban,  String hansudung,
	         String mota,  String gia,int soluong) {
	        super(idDMuc, nameDMuc);
	        this.idSanpham = idSanpham;
	        this.Name_sanpham = name_sanpham;
	        this.ngayban = ngayban;
	        this.hansudung = hansudung;
	        this.mota = mota;
	        this.gia = gia;
	        this.soluong = soluong;
	    }
	    
	    public int getSoluong() {
			return soluong;
		}
		public void setSoluong(int soluong) {
			this.soluong = soluong;
		}
		public String getIdSanpham() {
			return idSanpham;
		}
		public void setIdSanpham(String idSanpham) {
			this.idSanpham = idSanpham;
		}
		public String getName_sanpham() {
			return Name_sanpham;
		}
		public void setName_sanpham(String name_sanpham) {
			Name_sanpham = name_sanpham;
		}
		public String getNgayban() {
			return ngayban;
		}
		public void setNgayban(String ngayban) {
			this.ngayban = ngayban;
		}
		public String getHansudung() {
			return hansudung;
		}
		public void setHansudung(String hansudung) {
			this.hansudung = hansudung;
		}
		public String getMota() {
			return mota;
		}
		public void setMota(String mota) {
			this.mota = mota;
		}
		public String getGia() {
			return gia;
		}
		public void setGia(String gia) {
			this.gia = gia;
		}
		public static Scanner getSc() {
			return sc;
		}
		public static void setSc(Scanner sc) {
			SanPham.sc = sc;
		}
		public void inputSP(){
			//Scanner sc =new Scanner(System.in);
			super.nhapdm();
	        System.out.println("Nhap id san pham");
	        idSanpham = CheckError1.CheckMaSP();
	        System.out.println("Nhap ten san pham");sc.nextLine();
	        Name_sanpham = sc.nextLine();
	        System.out.println("Nhap ngay ban san pham");
	        ngayban = sc.nextLine();
	        System.out.println("Nhap han su dung");
	        hansudung = sc.nextLine();
	        System.out.println("Mo ta");
	        mota = sc.nextLine();
	        System.out.println("Gia");
	        gia = sc.nextLine();     
	        System.out.println("So luong");
	        soluong = sc.nextInt();
	    }
	    public void idsp() {
	    		System.out.println("Nhap id san pham");
		        this.idSanpham = CheckError1.CheckMaSP();
	    }
	    public void namesp() {
	    	System.out.println("Nhap ten san pham");
	        Name_sanpham = sc.nextLine();
	    }
	    public void ngayban() {
	    	System.out.println("Nhap ngay ban san pham");
	        ngayban = sc.nextLine();
	    }
	    public void hansudung() {
	    	 	System.out.println("Nhap han su dung");
		        hansudung = sc.nextLine();
	    }
	    public void mota() {
	    	System.out.println("Mo ta");
	        mota = sc.nextLine();
	    }
	    public void gia() {
	    	System.out.println("Gia");
	        gia = sc.nextLine();  
	    }
	    public void soluong()
	    {
	    	System.out.println("So luong");
	    	soluong = sc.nextInt();
	    }
	    public void xuatsol()
	    {
	    	System.out.println(soluong);
	    }
	    public void hienthiSP(){
	    
	        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s%-20d",idDMuc,idSanpham,Name_sanpham,ngayban,hansudung,mota,gia,soluong);
	    }
	    void getLine(String line) {
	        line = line.trim();
	        String[] data = line.split(",");
	        if (data.length < 7) {
	            System.out.println("Data error");
	            return;
	        }
	        this.idDMuc = data[0];
	       this.idSanpham=data[1];
	       this.Name_sanpham=data[2];
	       this.ngayban=data[3];
	       this.hansudung=data[4];
	       this.mota=data[5];
	    }
}
