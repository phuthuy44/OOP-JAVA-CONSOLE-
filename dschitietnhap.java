package DoAn;

import java.util.Arrays;
import java.util.Scanner;

public class dschitietnhap implements chucnang1{
	private chitietnhap[] dsctn;
	protected static SanPham sp;
	protected static chitietnhap ctnhap;
	private filekho filekho1;
//	private filesp filesp;
	public static Scanner sc= new Scanner(System.in);
	public dschitietnhap(){
		filekho1 = new filekho();
		dsctn = filekho1.read();
	}
	public void nhap()
	{
		int n,i=0;
		System.out.println("Nhap so luong phieu nhap vao kho can them vao danh sach");
		n = Integer.parseInt(sc.nextLine());
		dsctn = new chitietnhap[n];
		for( i = 0;i < n ;i++)
		{
			System.out.println("Phieu nhap kho thu  " + (i+1));
			dsctn[i] = new chitietnhap();
			dsctn[i].nhapchitiet();
			filekho1.write(dsctn);
			System.out.println();
		}
	}
	public void xuat()
	{
		/*System.out.println("----------------Danh sach cac phieu nhap --------------------");
		for(chitietnhap nc:dsctn)
		{
			nc.xuatchitiet();
            System.out.println();
		}*/
		System.out.println("+======================================================================================================================================================+");
        System.out.println("|                                                                DANH SACH CHI TIET NHAP                                                                   |");
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("| %-12s%-12s%-15s%-15s%-15s\"       |\n","Idnhap","Idmh","Don gia","So luong","Thanh tien");
        System.out.println("+-------------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(chitietnhap objnv: dsctn)
        {    
            objnv.xuatchitiet();
            System.out.println("");
            
        }
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------------+");
	}
	public void xoa()
	{
		System.out.println("Nhap id mat hang can xoa ");
		String idnhap =sc.nextLine();
		chitietnhap s1 = new chitietnhap();
		for(int i = 0 ;i <dsctn.length ;i++)
		{
			if(dsctn[i].getIdnhap().equalsIgnoreCase(idnhap))
			{
				dsctn[i] =s1;
				s1 =null;
				filekho1.write(dsctn);
				System.out.println("da xoa phieu nhap ra khoi danh sach");
			}
		}
	}
	public void sua()
	{
		 while(true){
	 	        System.out.println("+----------------------------------------+");
	 	        System.out.print("|           CHINH SUA CHI TIET NHAP        | \n");
	 	        System.out.println("Nhap id nhap can chinh sua: ");sc.nextLine();
	 	        String idnhap=sc.nextLine();
	 	       dsctn=Arrays.copyOf(dsctn,dsctn.length);
	 	       int m=dsctn.length;
	 	        boolean check=false;
	 	        for(int j = 0 ;j<m ;j++)
	 			{
	 	        	if(dsctn[j].getIdnhap().equalsIgnoreCase(idnhap)){
	 	                check=true;
	 	                int chon6;
	 	                do{
	 	                    System.out.println("Ban muon sua cai gi?");
	 	                    System.out.println("1.Sua Id san pham.");
	 	                    System.out.println("2.Sua Don Gia");
	 	                    System.out.println("3.Sua So luong.");
	 	                    System.out.println("4.Sua Thanh tien.");
	 	                    System.out.println("0. Nhan 0 de thoat. cam on!!!");
	 	                    chon6=Integer.parseInt(sc.nextLine());
	 	                    switch(chon6){
	 	                        case 1:
	 	                        dsctn[j].idsanpham();
	 	                        filekho1.write(dsctn);
	 	                        System.out.println("Sua thanh cong!!!");
	 	                        break;
	 	                        case 2:
	 	                        	dsctn[j].dongia();
	 	                        	filekho1.write(dsctn);
	 	                        System.out.println("Sua thanh cong!!");
	 	                        break;
	 	                        case 3:
	 	                        	dsctn[j].soluong();
	 	                        	filekho1.write(dsctn);
	 	                        System.out.println("Sua thanh cong!!");
	 	                        break;
	 	                        case 4:
	 	                        	dsctn[j].thanhtien();
	 	                        	filekho1.write(dsctn);
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
	 	            System.out.println("Nhap Idnhap sai!!!");
	 	        }
	 			//System.out.println("Sua thanh cong! ");
	 	}
	/*	System.out.println("Nhap id mat hang can sua ");
		String idnhap =sc.nextLine();
		dsctn=Arrays.copyOf(dsctn,dsctn.length);
		chitietnhap s1 = new chitietnhap();
		int m = dsctn.length;
		for(int i = 0 ;i < m ;i++)
		{
			if(dsctn[i].getIdnhap().equalsIgnoreCase(idnhap))
			{
				dsctn[i].nhapchitiet();
				filekho1.write(dsctn);
			}
		}
		System.out.println("Sua thanh cong ");*/
	}
	public void timkiem()
	{
		/*chitietnhap s3 =new chitietnhap();
		System.out.println("nhap ma nha cung cap can tim la   = ");
		String idnhap = sc.nextLine();
		chitietnhap s1 = new chitietnhap();
		dsctn=Arrays.copyOf(dsctn,dsctn.length);
		for(int i=0;i<dsctn.length;i++)
			if(dsctn[i].getIdnhap().equalsIgnoreCase(idnhap))
		{
			dsctn[i].xuatchitiet();
			
		}*/
		int choose;
        System.out.println("+--------------------------------------+");
        System.out.println("|    BAN MUON TIM THEO PHIEU HAY ID SAN PHAM?     |");
        System.out.println("+--------------------------------------+");
        System.out.println("|  1. Tim theo phieu nhap.         		|");
        System.out.println("|  2. Tim theo id san pham.         	|");
        System.out.println("|  0. Thoat!                           |");
        System.out.println("+--------------------------------------+");
        choose=sc.nextInt();
        sc.nextLine();
        switch(choose){
           case 1:
            System.out.println("Nhap vao phieu nhap can tim : ");
                String idnhap=sc.nextLine();
                for(int i=0; i<dsctn.length; i++)
                    if(dsctn[i].getIdnhap().equalsIgnoreCase(idnhap))
                    	dsctn[i].xuatchitiet();
                        break;
           case 2:
            System.out.println("Nhap vao id san pham can tim: ");
                String sp=sc.nextLine();
                for(int i=0; i<dsctn.length; i++)
                    if(dsctn[i].getIdmh().equalsIgnoreCase(sp))
                    	dsctn[i].xuatchitiet();
                        break;
                        
        }
	}
	/*public int soluongtang() {
		for(int i=0; i<dsctn.length; i++)
			 if(dsctn[i].getIdmh().equalsIgnoreCase(dsctn[i].getIdmh()))
				 dsctn[i].getSoluong();
		return soluongtang();
		
	}*/
	public void them()
	{
		//int c =0;
		int m = dsctn.length;
		System.out.println("Nhap nha cung cap");
		System.out.println();
		chitietnhap s1=new chitietnhap();
		s1.nhapchitiet();
		dsctn=Arrays.copyOf(dsctn,dsctn.length+1);
		dsctn[m]=s1;
		filekho1.write(dsctn);
		m++;
	}
	/*public void sanphamgiamdi()
	{
		int x = 0;
		System.out.println("Nhap vao id nhap can tim : ");
        String idsanpham=sc.nextLine();
        for(int i=0; i<dsctn.length; i++)
            if(dsctn[i].getIdSanpham().equalsIgnoreCase(idsanpham))
            {
            	dsctn[i].soluong1();
            	filekho1.write(dsctn);
            }
	}*/
	public void tongtienmotlannhap()
	{
		int x = 0;
    	System.out.println("Nhap phieu nhap");
    	String idnhap = sc.nextLine();
    	for(int i = 0 ;i < dsctn.length ; i++)
    	{
    		if(dsctn[i].getIdnhap().equals(idnhap))
    		{
    		x += dsctn[i].getThanhtien();
    		}
    	}
    	System.out.println("Tong gia tien la   "+idnhap+" = "+x);
	}
/*	public int congsoluong()
	{
		int x = 0;
    	for(int i = 0 ;i < dsctn.length ; i++)
    	{
    		if(dsctn[i].getIdmh().equals("SP01"))
    		{
    		x += dsctn[i].getSoluong();
    		}
    	}
    	//System.out.println("Tong so luong la  = "+x);
    	return x;
	}*/
	public void congsoluongds()
	{
		int x = 0;
		System.out.println("Nhap id san pham");
		String masanpham = sc.nextLine();
    	for(int i = 0 ;i < dsctn.length ; i++)
    	{
    		if(dsctn[i].getIdmh().equals(masanpham))
    		{
    		x += dsctn[i].getSoluong();
    		}
    	}
    	System.out.println("Tong so luong la "+masanpham+" = "+x);
    	
	}
/*	public int congsoluong1()
	{
		int x = 0;
		String masanpham ="SP02";
    	for(int i = 0 ;i < dsctn.length ; i++)
    	{	
    		if(dsctn[i].getIdmh().equals("SP02"))
    		{
    		x += dsctn[i].getSoluong();
    		}
    	}
    	//System.out.println("Tong so luong la  = "+x);
    	return x;
	}
	public int congsoluong2()
	{
		int x = 0;
    	for(int i = 0 ;i < dsctn.length ; i++)
    	{
    		if(dsctn[i].getIdmh().equals("SP03"))
    		{
    		x += dsctn[i].getSoluong();
    		}
    	}
    	//System.out.println("Tong so luong la  = "+x);
    	return x;
	}
	public int congsoluong3()
	{
		int x = 0;
    	for(int i = 0 ;i < dsctn.length ; i++)
    	{
    		if(dsctn[i].getIdmh().equals("SP04"))
    		{
    		x += dsctn[i].getSoluong();
    		}
    	}
    	//System.out.println("Tong so luong la  = "+x);
    	return x;
	}
	public int congsoluong4()
	{
		int x = 0;
    	for(int i = 0 ;i < dsctn.length ; i++)
    	{
    		if(dsctn[i].getIdmh().equals("SP05"))
    		{
    		x += dsctn[i].getSoluong();
    		}
    	}
    	//System.out.println("Tong so luong la  = "+x);
    	return x;
	}
	public int congsoluong5()
	{
		int x = 0;
    	for(int i = 0 ;i < dsctn.length ; i++)
    	{
    		if(dsctn[i].getIdmh().equals("SP06"))
    		{
    		x += dsctn[i].getSoluong();
    		}
    	}
    	//System.out.println("Tong so luong la  = "+x);
    	return x;
	}
	public void tangsoluong()
	{
		int c = 0;
		System.out.println("Nhap id san pham");
		String masanpham = sc.nextLine();
		for(int i = 0 ;i < dsctn.length ; i++)
		{
			
			
			if(dsctn[i].getIdmh().equals("SP01"))
			{
				c = congsoluong();
				if(dsctn[i].getSoluong()<c)
				{
					for(int j = 0; j < dsctn[i].getSoluong();j++)
					{	
						
							dsctn[j].soluongtang();
							filekho1.write(dsctn);
							break;
					}
				}
			}
			if(dsctn[i].getIdmh().equals("SP02"))
			{
				c = congsoluong1();
				if(dsctn[i].getSoluong()<c)
				{
					for(int j = 0; j < dsctn[i].getSoluong();j++)
					{	
						
							dsctn[j].soluongtang();
							filekho1.write(dsctn);
							break;
					}
				}
			}
			if(dsctn[i].getIdmh().equals("SP03"))
			{
				
				for(int j = 0; j < dsctn[i].getSoluong();j++)
				{
					c = congsoluong2();
					if(dsctn[j].getSoluong()<c)
					{
						dsctn[j].soluongtang();
						filekho1.write(dsctn);
						break;
					}
				}
			}
			if(dsctn[i].getIdmh().equals("SP04"))
			{
				for(int j = 0; j < dsctn[i].getSoluong();j++)
				{
					c = congsoluong3();
					if(dsctn[j].getSoluong()<c)
					{
						dsctn[j].soluongtang();
						filekho1.write(dsctn);
						break;
					}
				}
			}
			if(dsctn[i].getIdmh().equals("SP05"))
			{
				for(int j = 0; j < dsctn[i].getSoluong();j++)
				{
					c = congsoluong4();
					if(dsctn[j].getSoluong()<c)
					{
						dsctn[j].soluongtang();
						filekho1.write(dsctn);
						break;
					}
				}
			}
			if(dsctn[i].getIdmh().equals("SP06"))
			{
				c = congsoluong5();
				for(int j = 0; j < dsctn[i].getSoluong();j++)
				{
					if(dsctn[j].getSoluong()<c)
					{
						dsctn[j].soluongtang();
						filekho1.write(dsctn);
						break;
					}
				}
			}
		}
	}*/
	public chitietnhap[] getDsctn() {
		return dsctn;
	}
	public void setDsctn(chitietnhap[] dsctn) {
		this.dsctn = dsctn;
	}
	public static void chitietnhap()
	{
		dschitietnhap dskho = new dschitietnhap();
		int chon1;
		do {
			System.out.println("-----------menu------------");
	        System.out.println("1.Nhap phieu nhap chi tiet.");
	        System.out.println("2.Xuat danh sach phieu nhap chi tiet.");
	        System.out.println("3.Xoa phieu nhap chi tiet.");
	        System.out.println("4.Them phieu nhap chi tiet.");
	        System.out.println("5.Tim kiem phieu nhap chi tiet.");
	        System.out.println("6.Sua phieu nhap chi tiet.");
	        System.out.println("7.Tong tien cua mot phieu nhap.");
	        System.out.println("8.Tong so luong cua mot san pham.");
	        System.out.println("0.Exit.");
	        System.out.println("---------------------------");
	        System.out.print("Nhap so : ");
	        chon1 =Integer.parseInt(sc.nextLine());
	        switch(chon1)
	        {
		        case 1:
		        {
		        	dskho.nhap();
		        	break;
		        }
		        case 2:
		        {
		        	dskho.xuat();
		        	break;
		        }
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
		        case 7:
		        {
		        	dskho.tongtienmotlannhap();
		        	break;
		        }
		        case 8:
		        {
		        	dskho.congsoluongds();
		        	break;
		        }
		        
	        }
		}while(chon1!=0);
	}
}
