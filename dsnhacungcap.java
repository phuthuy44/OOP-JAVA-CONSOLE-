package DoAn;

import java.util.Arrays;
import java.util.Scanner;


public class dsnhacungcap implements chucnang1{
	private nhacungcap[] dsncc;
	private filenc file;
	public static Scanner sc= new Scanner(System.in);
	public dsnhacungcap()
	{
		file = new filenc();
		dsncc = file.read();
	}
	public void nhap()
	{
		int n,i=0;
		System.out.println("so luong nha cung cap can them vao danh sach");
		n = Integer.parseInt(sc.nextLine());
		dsncc = new nhacungcap[n];
		for( i = 0;i < n ;i++)
		{
			System.out.println("nhap nha cung cap " + (i+1));
			dsncc[i] = new nhacungcap();
			dsncc[i].nhapnhacc();
			file.write(dsncc);
			System.out.println();
		}
	}
	public void xoa()
	{
		System.out.println("Nhap ma nha cung cap can xoa ");
		String mancc =sc.nextLine();
		nhacungcap s1 = new nhacungcap();
		for(int i = 0 ;i <dsncc.length ;i++)
		{
			if(dsncc[i].getMancc().equalsIgnoreCase(mancc))
			{
				dsncc[i] = s1;
				s1 = null;
				file.write(dsncc);
				System.out.println("da xoa nha cung cap ra khoi danh sach");
			}
		}
	}
	public void sua()
	{
		while(true){
 	        System.out.println("+----------------------------------------+");
 	        System.out.print("|           CHINH SUA NHA CUNG CAP        | \n");
 	        System.out.println("Nhap ma khach hang can chinh sua: ");sc.nextLine();
 	        String mancc=sc.nextLine();
 	       dsncc=Arrays.copyOf(dsncc,dsncc.length);
 	       int m=dsncc.length;
 	        boolean check=false;
 	        for(int j = 0 ;j<m ;j++)
 			{
 	        	if(dsncc[j].getMancc().equalsIgnoreCase(mancc)){
 	                check=true;
 	                int chon6;
 	                do{
 	                    System.out.println("Ban muon sua cai gi?");
 	                    System.out.println("1.Sua Ho ten.");
 	                    System.out.println("4.Sua SDT.");
 	                    System.out.println("5.Sua Diachi.");
 	                    System.out.println("0. Nhan 0 de thoat. cam on!!!");
 	                    chon6=Integer.parseInt(sc.nextLine());
 	                    switch(chon6){
 	                        case 1:
 	                        dsncc[j].tncc();
 	                        file.write(dsncc);
 	                        System.out.println("Sua thanh cong!!!");
 	                        break;
 	                        case 2:
 	                        dsncc[j].sdtncc();
 	                       file.write(dsncc);
 	                        System.out.println("Sua thanh cong!!!");
 	                        break;
 	                        case 3:
 	                        dsncc[j].dcncc();
 	                       file.write(dsncc);
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
 	            System.out.println("Nhap ma nha cung cap sai!!!");
 	        }
 			//System.out.println("Sua thanh cong! ");
 	}
	}
	public void them()
	{
		int m = dsncc.length;
		System.out.println("Nhap nha cung cap");
		System.out.println();
		nhacungcap s1=new nhacungcap();
		s1.nhapnhacc();
		dsncc=Arrays.copyOf(dsncc,dsncc.length+1);
		dsncc[m]=s1;
		m++;
		file.write(dsncc);
	}
	public void timkiem()
	{
		
		int choose;
        System.out.println("+--------------------------------------+");
        System.out.println("|    BAN MUON TIM THEO MA HAY TEN?     |");
        System.out.println("+--------------------------------------+");
        System.out.println("|  1. Tim theo ma nha cung cap.           |");
        System.out.println("|  2. Tim theo ten nha cung cap.          |");
        System.out.println("|  0. Thoat!                           |");
        System.out.println("+--------------------------------------+");
        choose=sc.nextInt();
        sc.nextLine();
        switch(choose){
           case 1:
            System.out.println("Nhap vao ma nha cung cap can tim : ");
                String mancc=sc.nextLine();
                for(int i=0; i<dsncc.length; i++)
                    if(dsncc[i].getMancc().equalsIgnoreCase(mancc))
                    	dsncc[i].xuatnhacungcap();
                        break;
           case 2:
            System.out.println("Nhap vao ten nha cung cap can tim: ");
                String HoTen=sc.nextLine();
                for(int i=0; i<dsncc.length; i++)
                    if(dsncc[i].getTncc().equalsIgnoreCase(HoTen))
                    	dsncc[i].xuatnhacungcap();
                        break;
      }
        
		
	}
	public void xuat()
	{
		/*System.out.println("----------------Danh sach cac nha cung cap --------------------");
		for(nhacungcap nc:dsncc)
		{
			nc.xuatnhacungcap();
            System.out.println();
		}*/
		System.out.println("+============================================================================================================================================================+");
        System.out.println("|                                                     DANH SACH NHA CUNG CAP                                                                   |");
        System.out.println("+----------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("|%-5s%-30s%-30s%-30s%-50s%-40s|\n","Stt","Ma nha cung cap","Ho ten","Dia Chi","So dien thoai","Loai hang");
        System.out.println("+---------------------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(nhacungcap nc:dsncc)
        {    
        	nc.xuatnhacungcap();
            System.out.println("");
            
        }
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------------------+");
	}
	
	public nhacungcap[] getDsncc() {
		return dsncc;
	}
	public void setDsncc(nhacungcap[] dsncc) {
		this.dsncc = dsncc;
	}
	public static void DSnhacungcap()
	{
		dsnhacungcap ds = new dsnhacungcap();
		//int idncc,dem = 0;
		int chon;
		do {
			System.out.println("-----------menu------------");
	        System.out.println("1.Nhap nha cung cap");
	        System.out.println("2.Xuat danh sach nha cung cap .");
	        System.out.println("3.Xoa nha cung cap.");
	        System.out.println("4.Them nha cung cap.");
	        System.out.println("5.Tim kiem nha cung cap");
	        System.out.println("6.Sua nha cung cap");
	        System.out.println("0. exit.");
	        System.out.println("---------------------------");
	        System.out.print("Nhap so : ");
	        chon =Integer.parseInt(sc.nextLine());
	        switch(chon)
	        {
		        case 1:
		        {
		        	ds.nhap();
		        	break;
		        }
		        case 2:
		        {
		        	ds.xuat();
		        	break;
		        }
		        case 3:
		        {
		        	ds.xoa();
		        	break;
		        }
		        case 4:
		        {
		        	ds.them();
		        	break;
		        }
		        case 5:
		        {
		        	ds.timkiem();
		        	break;
		        }
		        case 6:
		        {
		        	ds.sua();
		        	break;
		        }
		        
	        }
		}while(chon!=0);
	}
}
