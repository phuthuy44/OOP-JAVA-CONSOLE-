
package DoAn;
import java.util.Scanner;
import java.io.Serializable;
import java.util.Arrays;
public class DanhSachNhanVien2 implements Serializable,chucnang1 {
    private	NhanVien[] arrnv;
    private filenv filenv;
    public static Scanner sc = new Scanner(System.in);
    public DanhSachNhanVien2()
    {
       filenv = new filenv();
       arrnv = filenv.readnv();
    }
   
    public void nhapdsnhanvien() 
    {
    	int n;
        System.out.println("+--------------------------------------+");
        System.out.print("| NHAP SO LUONG NHAN VIEN: ");
        n=sc.nextInt();
        int choose;
        arrnv=new NhanVien[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("+--------------------------------------+");
            System.out.println("|         NHAP NHAN VIEN THU "+(i+1)+"         |");
            System.out.println("+--------------------------------------+");
            System.out.println("|    1. Nhap nhan vien quan ly         |");
            System.out.println("|    2. Nhap nhan vien ban hang        |");
            System.out.println("|    3. Nhap nhan vien bao ve		   |");
            System.out.println("+--------------------------------------+");
            System.out.println("|      Moi chon nhap 1 nhan vien!      |");
            System.out.println("+--------------------------------------+");
            
            choose=sc.nextInt();
            switch(choose){
                case 1:
                    arrnv[i] = new NVQuanLy();
                    arrnv[i].nhap();
                    arrnv[i].ChucVu();
                    arrnv[i].Luong();
                    filenv.writenv(arrnv);
                    break;
                case 2:
                    arrnv[i] = new NVBanHang();
                    arrnv[i].nhap();
                    arrnv[i].ChucVu();
                    arrnv[i].Luong();
                    filenv.writenv(arrnv);
                    break;
                case 3:
                    arrnv[i] = new NVBaoVe();
                    arrnv[i].nhap();
                    arrnv[i].ChucVu();
                    arrnv[i].Luong();
                    filenv.writenv(arrnv);
                    break;
            }
            }
    }
  /*  public void nhapdsnhanvienql() 
    {
    	int n;
        System.out.println("+--------------------------------------+");
        System.out.print("| NHAP SO LUONG NHAN VIEN: ");
        n=sc.nextInt();
        int choose;
        arrnv=new NhanVien[n];
        for(int i=0;i<n;i++)
        {
        	System.out.println("Nhap nhan vien quan li thu "+(i+1));
        	arrnv[i] = new NVQuanLy();
            arrnv[i].nhap();
            arrnv[i].ChucVu();
            arrnv[i].Luong();
            filenv.writenv(arrnv);
        }
    }*/
        
    public void them()
    {
    	int m = arrnv.length;
        NhanVien nv=new NhanVien();
        System.out.println("+--------------------------------------+");
        System.out.println("|    CHUC VU CUA NHAN VIEN CAN THEM    |");
        System.out.println("+--------------------------------------+");
        System.out.println("|    1. Nhap nhan vien quan ly         |");
        System.out.println("|    2. Nhap nhan vien ban hang        |");
        System.out.println("|    3. Nhap nhan vien bao ve          |");
        System.out.println("+--------------------------------------+");
        System.out.println("|      Moi chon nhap 1 nhan vien!      |");
        System.out.println("+--------------------------------------+");
            int choose=sc.nextInt();
            switch(choose){
                case 1:
                // co luc Nhan vien dong vai tro la nhan vien quan ly 
                    nv = new NVQuanLy();
                    nv.nhap();
                    nv.ChucVu();//xuat ra chuc vu cua nhan vien quan ly 
                    nv.Luong();//xuat ra luong cua nhan vien quan ly 
                    filenv.writenv(arrnv);
                    break;
                case 2:
                //co luc Nhan vien dong vai tro la nhan vien ban hang 
                    nv = new NVBanHang();
                    nv.nhap();
                    nv.ChucVu();//xuat ra chuc vu cua nhan vien ban hang 
                    nv.Luong();// xuat ra luong cua nhan vien ban hang 
                    filenv.writenv(arrnv);
                    break;
                case 3:
                    nv = new NVBaoVe();
                    nv.nhap();
                    nv.ChucVu();
                    nv.Luong();
                    filenv.writenv(arrnv);
                    break;
               
            }
        arrnv = Arrays.copyOf(arrnv, arrnv.length +1); 
        arrnv[m]=nv;
        filenv.writenv(arrnv);
        m++;
        
    }
    
    public void xuat()
    {
        System.out.println("Danh sach nhan vien vua nhap: ");
  
        System.out.println("+======================================================================================================================================================+");
        System.out.println("|                                                                DANH SACH NHAN VIEN                                                                    |");
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("|  %-20s%-20s%-20s%-20s%-30s%-30s%-30s%-30s       |\n","Ma nhan vien","Ho ten","Ngay sinh","Gioi tinh","Dien thoai","Dia chi","Chuc vu","Luong");
        System.out.println("+-------------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(NhanVien objnv: arrnv)
        {    
            objnv.xuat();
            System.out.println("");
            
        }
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------------+");
    }
    
    public void timkiem() {
        int choose;
        System.out.println("+--------------------------------------+");
        System.out.println("|    BAN MUON TIM THEO MA HAY TEN?     |");
        System.out.println("+--------------------------------------+");
        System.out.println("|  1. Tim theo ma nhan vien.           |");
        System.out.println("|  2. Tim theo ten nhan vien.          |");
        System.out.println("|  3. Tim theo gioi tinh nhan vien.    |");
        System.out.println("|  0. Thoat!                           |");
        System.out.println("+--------------------------------------+");
        choose=sc.nextInt();
        sc.nextLine();
        switch(choose){
           case 1:
            System.out.println("Nhap vao ma nhan vien can tim : ");
                String MaNV=sc.nextLine();
                for(int i=0; i<arrnv.length; i++)
                    if(arrnv[i].getMaNV().equalsIgnoreCase(MaNV))
                        arrnv[i].xuat1();
                        break;
           case 2:
            System.out.println("Nhap vao ten nhan vien can tim: ");
                String HoTen=sc.nextLine();
                for(int i=0; i<arrnv.length; i++)
                    if(arrnv[i].getHoTen().equalsIgnoreCase(HoTen))
                        arrnv[i].xuat1();
                        break;
                        
           case 3:
               System.out.println("Nhap vao gioi tinh nhan vien can tim: ");
                   String gioitinh=sc.nextLine();
                   for(int i=0; i<arrnv.length; i++)
                       if(arrnv[i].getGioiTinh().equalsIgnoreCase(gioitinh))
                           arrnv[i].xuat1();
                           break;
      }
        
    
}
    public void xoa() {
        System.out.println("Nhap ma nhan vien can xoa: ");
        sc.nextLine();
        String MaNV=sc.nextLine();
        for(int i=0;i<arrnv.length;i++){
            if(arrnv[i].getMaNV().equalsIgnoreCase(MaNV)) {
               NhanVien nv2= new NhanVien();
               arrnv[i]=nv2;
               nv2=null;
               filenv.writenv(arrnv);
               break;
            }

        }
    }
    public void sua() {
    	 while(true){
 	        System.out.println("+----------------------------------------+");
 	        System.out.print("|           CHINH SUA NHAN VIEN         | \n");
 	        System.out.println("Nhap ma nhan vien can chinh sua: ");sc.nextLine();
 	        String manv=sc.nextLine();
 	       arrnv=Arrays.copyOf(arrnv,arrnv.length);
 	       int m=arrnv.length;
 	        boolean check=false;
 	        for(int j = 0 ;j<m ;j++)
 			{
 	        	if(arrnv[j].getMaNV().equalsIgnoreCase(manv)){
 	                check=true;
 	                int chon6;
 	                do{
 	                    System.out.println("Ban muon sua cai gi?");
 	                    System.out.println("1.Sua Ho ten.");
 	                    System.out.println("2.Sua NgaySinh");
 	                    System.out.println("3.Sua GioiTinh.");
 	                    System.out.println("4.Sua SDT.");
 	                    System.out.println("5.Sua Diachi.");
 	                    System.out.println("0. Nhan 0 de thoat. cam on!!!");
 	                    chon6=Integer.parseInt(sc.nextLine());
 	                    switch(chon6){
 	                        case 1:
 	                        arrnv[j].setHoten();
 	                        filenv.writenv(arrnv);
 	                        System.out.println("Sua thanh cong!!!");
 	                        break;
 	                        case 2:
 	                        	arrnv[j].setNgaySinh();
 	                        	filenv.writenv(arrnv);
 	                        System.out.println("Sua thanh cong!!");
 	                        break;
 	                        case 3:
 	                        arrnv[j].setGioiTinh();
 	                       filenv.writenv(arrnv);
 	                        System.out.println("Sua thanh cong!!");
 	                        break;
 	                        case 4:
 	                        arrnv[j].setDienThoai();;
 	                       filenv.writenv(arrnv);
 	                        System.out.println("Sua thanh cong!!!");
 	                        break;
 	                        case 5:
 	                        arrnv[j].setDiaChi();
 	                        filenv.writenv(arrnv);
 	                        System.out.println("Sua thanh cong!!!");
 	                        break;
 	                        case 0:
 	                        System.out.println("Thoat Thanh cong!!");
 	                        break;
 	                        default:
 	                        System.out.println("Nhap lai dum di...");
 	                        break;

 	                    }
 	                }while(chon6!=0);
 	        }
 	        } 
 	        if(check){
 	        break;
 	        }else{
 	            System.out.println("Nhap Manv sai!!!");
 	        }
 			//System.out.println("Sua thanh cong! ");
 	}
        }
    public void thongke(){
        int QuanLy=0,BanHang=0,BaoVe=0;
        for(int i=0;i<arrnv.length;i++){
            if(arrnv[i] instanceof NVQuanLy)
               QuanLy++;
            if(arrnv[i] instanceof NVBanHang)
               BanHang++;
            if(arrnv[i] instanceof NVBaoVe)
            	BaoVe++;
        }
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("+------------------------------------+");
        System.out.println("|   SO LUONG NHAN VIEN MOI VI TRI    |");
        System.out.println("+------------------------------------+");
        System.out.println("| Nhan vien quan ly: "+QuanLy+"               |");
        System.out.println("| Nhan vien ban hang: "+BanHang+"              |");
        System.out.println("| Nhan vien bao ve: "+BaoVe+"          |");
        System.out.println("+------------------------------------+");
    }
    public static void Dsnv() {
        DanhSachNhanVien2 mangnv=new DanhSachNhanVien2();
        /*NhanVien nv = new NhanVien();
        NhanVien a = new NVQuanLy();
        NhanVien b = new NVBanHang();
        NhanVien c = new NVBaoVe();*/
        int choose1;
        do{
            System.out.println("+--------------------------------------+");
            System.out.println("|           DANH MUC NHAN VIEN         |");
            System.out.println("+--------------------------------------+");
            System.out.println("|    1. Nhap nhan vien                 |");
            System.out.println("|    2. Xuat nhan vien                 |");
            System.out.println("|    3. Them nhan vien                 |");
            System.out.println("|    4. Tim kiem nhan vien             |");
            System.out.println("|    5. Chinh sua nhan vien            |");
            System.out.println("|    6. Xoa nhan vien                  |");
            System.out.println("|    8. Thong ke nhan vien             |");
            System.out.println("|    7. Ket thuc thao tac voi nhan vien|");
            System.out.println("+--------------------------------------+");
            System.out.println("|      Moi chon nhap 1 thao tac !      |");
            System.out.println("+--------------------------------------+");
            choose1=sc.nextInt();
            switch(choose1){
                case 1:
                {
                    mangnv.nhapdsnhanvien();
                    break;
                }
                case 2:
                {
                    mangnv.xuat();
                    break;  
                }
                case 3:
                {
                    mangnv.them();
                    break;
                }
                case 4:
                {
                    mangnv.timkiem();
                    break;
                }
                case 5:
                {
                    mangnv.sua();
                    break;
                }
                case 6:
                {
                    mangnv.xoa();
                    break;
                }
                case 8:
                {
                	mangnv.thongke();
                	break;
                }
                case 7:
                    System.out.println("====KET THUC THAO TAC VOI NHAN VIEN=====");
            }
        }while(choose1 != 7);
       
    }

	public NhanVien[] getArrnv() {
		return arrnv;
	}

	public void setArrnv(NhanVien[] arrnv) {
		this.arrnv = arrnv;
	}
    
}
