package DoAn;
import java.util.Arrays;
import java.util.Scanner;
public class Dschitietxuat implements chucnang1 {
    private chitietxuat[] dsctx;
    protected static SanPham sp;
    protected static chitietxuat ctx;
    private filexuathang filexuat;
    public static Scanner sc= new Scanner(System.in);
    public Dschitietxuat(chitietxuat[] dsctx, filexuathang filexuat) {
        this.dsctx = dsctx;
        this.filexuat = filexuat;
    }
    public Dschitietxuat() {
    filexuat= new filexuathang();
    dsctx= filexuat.read4();
    }
    public void nhap()
	{
		int n,i=0;
		System.out.println("Nhap so luong phieu xuat can them vao danh sach");
		n = Integer.parseInt(sc.nextLine());
		dsctx = new chitietxuat[n];
		for( i = 0;i < n ;i++)
		{
			System.out.println("Phieu xuat kho thu  " + (i+1));
			dsctx[i] = new chitietxuat();
			dsctx[i].chitietxuat1();
			filexuat.writexuat(dsctx);
			System.out.println();
		}
	}
    @Override
    public void them() {
        int m= dsctx.length;
        System.out.println("Nhap phieu xuat:");
        System.out.println();
        chitietxuat s1=  new chitietxuat();
        s1.chitietxuat1();
        dsctx= Arrays.copyOf(dsctx, dsctx.length+1);
        dsctx[m++]=s1;
        filexuat.writexuat(dsctx);
        m++;
        
    }
    @Override
    public void sua() {
        while(true){
            System.out.println("+----------------------------------------+");
            System.out.print("|           CHINH SUA CHI TIET phieu xuat        | \n");
            System.out.println("Nhap id phieu xuat can chinh sua: ");sc.nextLine();
            String idnhap=sc.nextLine();
           dsctx=Arrays.copyOf(dsctx,dsctx.length);
           int m=dsctx.length;
            boolean check=false;
            for(int j = 0 ;j<m ;j++)
            {
                if(dsctx[j].getMaphieu().equalsIgnoreCase(idnhap)){
                    check=true;
                    int chon6;
                    do{
                        System.out.println("Ban muon sua cai gi?");
                        System.out.println("1.Sua Id san pham.");
                        System.out.println("2.Sua Don Gia");
                        System.out.println("3.Sua So luong.");
                        System.out.println("0. Nhan 0 de thoat. cam on!!!");
                        chon6=Integer.parseInt(sc.nextLine());
                        switch(chon6){
                            case 1:
                            dsctx[j].idsp();
                            filexuat.writexuat(dsctx);
                            System.out.println("Sua thanh cong!!!");
                            break;
                            case 2:
                                dsctx[j].setdongia();
                                filexuat.writexuat(dsctx);
                            System.out.println("Sua thanh cong!!");
                            break;
                            case 3:
                                dsctx[j].soluong();
                                filexuat.writexuat(dsctx);
                            System.out.println("Sua thanh cong!!");
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
                System.out.println("Nhap Idnhap sai!!!");
            }
            //System.out.println("Sua thanh cong! ");
    }
        
    }
    @Override
    public void xoa() {
       
        System.out.println("Nhap ma SP can xoa khoi phieu: ");
		String idnhap =sc.nextLine();
        boolean check=false;
		for(int i = 0 ;i <dsctx.length ;i++)
		{
			if(dsctx[i].getIdSanpham().equalsIgnoreCase(idnhap))
			{
                check=true;
                chitietxuat s1 = new chitietxuat();
				dsctx[i] =s1;
                dsctx=Arrays.copyOf(dsctx, dsctx.length-1);
				s1 =null;
				filexuat.writexuat(dsctx);
				System.out.println("da xoa san pham ra khoi phieu xuat");
			     break;
            }
		}if(!check){
            System.out.println("Saiii!!!");
        }
    }
    @Override
    public void timkiem() {
        int choose;
        do{
        System.out.println("+--------------------------------------+");
        System.out.println("|    BAN MUON TIM THEO PHIEU HAY ID SAN PHAM?     |");
        System.out.println("+--------------------------------------+");
        System.out.println("|  1. Tim theo phieu xuat.         		|");
        System.out.println("|  2. Tim theo id san pham .         	|");
        System.out.println("|  0. Thoat!                           |");
        System.out.println("+--------------------------------------+");
        choose=Integer.parseInt(sc.nextLine());
        switch(choose){
           case 1:
            System.out.println("Nhap vao phieu xuat can tim : ");
                String idnhap=sc.nextLine();
                for(int i=0; i<dsctx.length; i++)
                    if(dsctx[i].getMaphieu().equalsIgnoreCase(idnhap))
                    	dsctx[i].xuatchitiet();
                        break;
           case 2:
            System.out.println("Nhap vao id san pham can tim: ");
                String sp=sc.nextLine();
                for(int i=0; i<dsctx.length; i++)
                    if(dsctx[i].getIdSanpham().equalsIgnoreCase(sp))
                    	dsctx[i].xuatchitiet();
                        break;
           case 0:
           System.out.println("Thoat Thanh cong!!!");
           break;
           default:
          System.out.println("Moi nhap lai!!!");
          break;
                        
        }
        
    }while(choose!=0);
    }
    @Override
    public void xuat() {
        System.out.println("+======================================================================================================================================================+");
        System.out.println("|                                                                DANH SACH CHI TIET XUAT                                                                   |");
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("| %-12s%-12s%-15s%-15s\"       |\n","Maphieunhap","MaSP","Don gia","So luong");
        System.out.println("+-------------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(chitietxuat objnv: dsctx)
        {    
            objnv.xuatchitiet();
            System.out.println("");
            
        }
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------------+");
        
    }
    public static void chitietxuat()
	{
		Dschitietxuat dskho = new Dschitietxuat();
		int chon1;
		do {
			System.out.println("-----------menu------------");
	        System.out.println("1.Nhap phieu xuat chi tiet.");
	        System.out.println("2.Xuat danh sach phieu xuat chi tiet.");
	        System.out.println("3.Xoa phieu xuat chi tiet.");
	        System.out.println("4.Them phieu xuat chi tiet.");
	        System.out.println("5.Tim kiem phieu xuat chi tiet.");
	        System.out.println("6.Sua phieu xuat chi tiet.");
	        System.out.println("0.Exit.");
	        System.out.println("---------------------------");
	        System.out.print("Nhap so : ");
	        chon1 =Integer.parseInt(sc.nextLine());
	        switch(chon1)
	        {
		        case 1:
		        
		        	dskho.nhap();
		        	break;
		        case 2:
		        
		        	dskho.xuat();
		        	break;
		        
		        case 3:
		        {
		        	dskho.xoa();
		        	break;
		        }
		        case 4:
		        {
		        	dskho.them();
		        	break;
		        }
		        case 5:
		        {
		        	dskho.timkiem();
		        	break;
		        }
		        case 6:
		        {
		        	dskho.sua();
		        	break;
		        }
		        
	        }
		}while(chon1!=0);
	}
    
}
