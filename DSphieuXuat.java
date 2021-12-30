package DoAn;
import java.util.Arrays;
import java.util.Scanner;
public class DSphieuXuat implements chucnang1 {
    private PhieuXuat[] dsxuatkho;
    private filexuathang filexuat;
    public static Scanner sc= new Scanner(System.in);
    public DSphieuXuat(PhieuXuat[] dsxuatkho, filexuathang filexuat) {
        this.dsxuatkho = dsxuatkho;
        this.filexuat = filexuat;
    }
    public DSphieuXuat() {
        filexuat=new filexuathang();
        dsxuatkho= filexuat.read2();
    }
    public void nhapphieu(){
        int n,i=0;
        System.out.println("Nhap so luong xuat:");
        n=Integer.parseInt(sc.nextLine());
        dsxuatkho= new PhieuXuat[n];
        for( i=0;i<n;i++){
             System.out.println("Phieu xuat kho thu"+(i+1));
             dsxuatkho[i]= new PhieuXuat();
             dsxuatkho[i].phieuxuat();
             filexuat.writexuat1(dsxuatkho);
             System.out.println();
        }
    }
    @Override
    public void them() {
        int m = dsxuatkho.length;
		System.out.println("Nhap phieu xuat:");
		System.out.println();
		PhieuXuat s1=new PhieuXuat();
		s1.phieuxuat();
		dsxuatkho=Arrays.copyOf(dsxuatkho,dsxuatkho.length+1);
		dsxuatkho[m]=s1;
		filexuat.writexuat1(dsxuatkho);
		m++;
        
    }
    @Override
    public void sua() {
        System.out.println("Nhap id phieu xuat can sua ");
		String idnhap =sc.nextLine();
		dsxuatkho=Arrays.copyOf(dsxuatkho,dsxuatkho.length);
		//PhieuXuat s1 = new PhieuXuat();
		int m = dsxuatkho.length;
		for(int i = 0 ;i < m ;i++)
		{
			if(dsxuatkho[i].getMaPhieuXuat().equalsIgnoreCase(idnhap))
			{
				dsxuatkho[i].phieuxuat();
				filexuat.writexuat1(dsxuatkho);
			}
		}
		System.out.println("Sua thanh cong ");
        
    }
    @Override
    public void xoa() {
        System.out.println("Nhap id phieu xuat can xoa ");
		String idnhap =sc.nextLine();
        boolean check=false;
		for(int i = 0 ;i <dsxuatkho.length ;i++)
		{
			if(dsxuatkho[i].getMaPhieuXuat().equalsIgnoreCase(idnhap))
			{
                check=true;
                PhieuXuat px= new PhieuXuat();
                dsxuatkho[i]=px;
                dsxuatkho=Arrays.copyOf(dsxuatkho,dsxuatkho.length-1);
			    px=null;
				filexuat.writexuat1(dsxuatkho);
				System.out.println("da xoa phieu nhap ra khoi danh sach");
			      break;
            }

		}
        if(!check){
            System.out.println("Sai!!");

        }
        
    }
    @Override
    public void timkiem() {
        int choose;
        do{
        System.out.println("+--------------------------------------+");
        System.out.println("|    BAN MUON TIM THEO PHIEU NHAP HAY MA NCC?|");
        System.out.println("+--------------------------------------+");
        System.out.println("|  1. Tim theo phieu nhap.           |");
        System.out.println("|  2. Tim theo ngay nhap.            |");
        System.out.println("|  0. Thoat!                         |");
        System.out.println("+--------------------------------------+");
        choose=Integer.parseInt(sc.nextLine());
        switch(choose){
           case 1:
            System.out.println("Nhap vao phieu xuat can tim : ");
                String idnhap=sc.nextLine();
                for(int i=0; i<dsxuatkho.length; i++)
                    if(dsxuatkho[i].getMaPhieuXuat().equalsIgnoreCase(idnhap))
                        dsxuatkho[i].xuat1();
                        break;
           
           case 2:
                System.out.println("Nhap vao ngay xuat can tim: ");
                    String ngayxuat=sc.nextLine();
                    for(int i=0; i<dsxuatkho.length; i++)
                        if(dsxuatkho[i].getNgayxuat().equalsIgnoreCase(ngayxuat))
                            dsxuatkho[i].xuat1();
                            break;
            case 0:
            System.out.println("Thoat thanh cong!!!");
            break;
            default:
            System.out.println("....Nhap lai dum di...");
            break;
      }
    }while(choose!=0);
        
    }
    @Override
    public void xuat() {
        System.out.println("+======================================================================================================================================================+");
        System.out.println("|                                                                DANH SACH PHIEU XUAT                                                                   |");
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("|%-20s%-20s%-20s\n      |\n","Stt","Maphieuxuat","Ngayxuat");
        System.out.println("+-------------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(PhieuXuat pc: dsxuatkho)
        {    
            pc.xuat1();
            System.out.println("");
            
        }
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------------+");
        
    }
    public static void dsxuatkho(){
        DSphieuXuat dsxuat = new DSphieuXuat();
		int chon1;
		do {
			System.out.println("-----------menu------------");
	        System.out.println("1.Nhap phieu xuat .");
	        System.out.println("2.Xuat danh sach phieu xuat.");
	        System.out.println("3.Xoa phieu xuat .");
	        System.out.println("4.Them phieu xuat .");
	        System.out.println("5.Tim kiem phieu xuat kho.");
	        System.out.println("6.Sua phieu xuat kho.");
	        System.out.println("0.Exit.");
	        System.out.println("---------------------------");
	        System.out.print("Nhap so : ");
	        chon1 =Integer.parseInt(sc.nextLine());
	        switch(chon1)
	        {
		        case 1:
		        {
		        	dsxuat.nhapphieu();
		        	break;
		        }
		        case 2:
		        {
		        	dsxuat.xuat();
		        	break;
		        }
		        case 3:
		        {
		        	dsxuat.xoa();
		        	break;
		        }
		        case 4:
		        {
		        	dsxuat.them();
		        	break;
		        }
		        case 5:
		        {
		        	dsxuat.timkiem();
		        	break;
		        }
		        case 6:
		        {
		        	dsxuat.sua();
		        	break;
		        }
                case 0:
                System.out.println("Thoat thanh cong!!!");
                break;
                default:
                System.out.println("...Moi nhap lai!!!");
                break;
		        
	        }
		}while(chon1!=0);
	}
    }
