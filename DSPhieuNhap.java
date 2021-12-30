package DoAn;

import java.util.Arrays;
import java.util.Scanner;
public class DSPhieuNhap implements chucnang1{
	private phieunhap[] dsnhapkho;
	private filenhap filekho;
	public static Scanner sc= new Scanner(System.in);
	public DSPhieuNhap() {
		filekho = new filenhap();
		dsnhapkho = filekho.read1();
	}
	public void nhap() {
		int n,i=0;
		System.out.println("Nhap so luong nhap vao kho can them vao danh sach");
		n = Integer.parseInt(sc.nextLine());
		dsnhapkho = new phieunhap[n];
		for( i = 0;i < n ;i++)
		{
			System.out.println("Phieu nhap kho thu  " + (i+1));
			dsnhapkho[i] = new phieunhap();
			dsnhapkho[i].nhapkho();
			filekho.write1(dsnhapkho);
			System.out.println();
		}
	}
	public void xuat() {
		/*System.out.println("----------------Danh sach cac phieu nhap --------------------");
			for(nhapkho nc:dsnhapkho)
			{
				nc.xuatkho();
	            System.out.println();
			}*/
		System.out.println("+======================================================================================================================================================+");
        System.out.println("|                                                                DANH SACH NHAP                                                                   |");
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("|%-5s%-20s%-20s%-20s\n      |\n","Stt","Idnhap","Ngaynhap","Mancc");
        System.out.println("+-------------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(phieunhap nc:dsnhapkho)
        {    
            nc.xuatkho();
            System.out.println("");
            
        }
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------------+");
		}
	public void sua() {
		System.out.println("Nhap id mat hang can sua ");
		String idnhap =sc.nextLine();
		dsnhapkho=Arrays.copyOf(dsnhapkho,dsnhapkho.length);
		//phieunhap s1 = new phieunhap();
		int m = dsnhapkho.length;
		for(int i = 0 ;i < m ;i++)
		{
			if(dsnhapkho[i].getIdnhap().equalsIgnoreCase(idnhap))
			{
				dsnhapkho[i].nhapkho();
				filekho.write1(dsnhapkho);
			}
		}
		System.out.println("Sua thanh cong ");
	}
	public void xoa() {
		System.out.println("Nhap id mat hang can xoa ");
		String idnhap =sc.nextLine();
		phieunhap s1 = new phieunhap();
		for(int i = 0 ;i <dsnhapkho.length ;i++)
		{
			if(dsnhapkho[i].getIdnhap().equalsIgnoreCase(idnhap))
			{
				dsnhapkho[i] =s1;
				s1 =null;
				filekho.write1(dsnhapkho);
				System.out.println("da xoa phieu nhap ra khoi danh sach");
			}
		}
	}
	public void them() {
			
		int m = dsnhapkho.length;
		System.out.println("Nhap nha cung cap");
		System.out.println();
		phieunhap s1=new phieunhap();
		s1.nhapkho();
		dsnhapkho=Arrays.copyOf(dsnhapkho,dsnhapkho.length+1);
		dsnhapkho[m]=s1;
		filekho.write1(dsnhapkho);
		m++;
		}
	public void timkiem() {
			/*nhapkho s3 =new nhapkho();
			System.out.println("nhap ma nha cung cap can tim la   = ");
			String idnhap = sc.nextLine();
			nhapkho s1 = new nhapkho();
			dsnhapkho=Arrays.copyOf(dsnhapkho,dsnhapkho.length);
			for(int i=0;i<dsnhapkho.length;i++)
				if(dsnhapkho[i].getIdnhap().equalsIgnoreCase(idnhap))
			{
					dsnhapkho[i].xuatkho();
				
			}*/
		   int choose;
	        System.out.println("+--------------------------------------+");
	        System.out.println("|    BAN MUON TIM THEO PHIEU NHAP HAY MA NCC?|");
	        System.out.println("+--------------------------------------+");
	        System.out.println("|  1. Tim theo phieu nhap.           |");
	        System.out.println("|  2. Tim theo ma nha cung cap.      |");
	        System.out.println("|  3. Tim theo ngay nhap.            |");
	        System.out.println("|  0. Thoat!                         |");
	        System.out.println("+--------------------------------------+");
	        choose=sc.nextInt();
	        sc.nextLine();
	        switch(choose){
	           case 1:
	            System.out.println("Nhap vao phieu nhap can tim : ");
	                String idnhap=sc.nextLine();
	                for(int i=0; i<dsnhapkho.length; i++)
	                    if(dsnhapkho[i].getIdnhap().equalsIgnoreCase(idnhap))
	                    	dsnhapkho[i].xuatkho();
	                        break;
	           case 2:
	            System.out.println("Nhap vao ma nha cung cap can tim: ");
	                String mancc=sc.nextLine();
	                for(int i=0; i<dsnhapkho.length; i++)
	                    if(dsnhapkho[i].getMancc().equalsIgnoreCase(mancc))
	                    	dsnhapkho[i].xuatkho();
	                        break;
	           case 3:
		            System.out.println("Nhap vao ngay nhap can tim: ");
		                String ngaynhap=sc.nextLine();
		                for(int i=0; i<dsnhapkho.length; i++)
		                    if(dsnhapkho[i].getNgaynhap().equalsIgnoreCase(ngaynhap))
		                    	dsnhapkho[i].xuatkho();
		                        break;
	      }
		}
	public static void dsnhapkho()
	{
		DSPhieuNhap dsnhapkho = new DSPhieuNhap();
		int chon1;
		do {
			System.out.println("-----------menu------------");
	        System.out.println("1.Nhap phieu nhap kho.");
	        System.out.println("2.Xuat danh sach phieu nhap kho.");
	        System.out.println("3.Xoa phieu nhap kho.");
	        System.out.println("4.Them phieu nhap kho.");
	        System.out.println("5.Tim kiem phieu nhap kho.");
	        System.out.println("6.Sua phieu nhap kho.");
	        System.out.println("0.Exit.");
	        System.out.println("---------------------------");
	        System.out.print("Nhap so : ");
	        chon1 =Integer.parseInt(sc.nextLine());
	        switch(chon1)
	        {
		        case 1:
		        {
		        	dsnhapkho.nhap();
		        	break;
		        }
		        case 2:
		        {
		        	dsnhapkho.xuat();
		        	break;
		        }
		        case 3:
		        {
		        	dsnhapkho.xoa();
		        	break;
		        }
		        case 4:
		        {
		        	dsnhapkho.them();
		        	break;
		        }
		        case 5:
		        {
		        	dsnhapkho.timkiem();
		        	break;
		        }
		        case 6:
		        {
		        	dsnhapkho.sua();
		        	break;
		        }
		        
	        }
		}while(chon1!=0);
	}
}
