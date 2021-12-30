package DoAn;

import java.util.Arrays;
import java.util.Scanner;

public class chitiethoadon implements chucnang1{
	
	protected static hoadon[] dshd;
	private filehd filehd;
	public static Scanner sc= new Scanner(System.in);
	public chitiethoadon()
	{
		filehd = new filehd();
		dshd = filehd.readhd();
	}
	public void nhapdshd()
	{
		  System.out.println("Nhap so luong hoa don ma khach hang mua:");
	        int n=Integer.parseInt(sc.nextLine());
	        dshd=new hoadon[n];
	         for(int i=0;i<n;i++){
	            System.out.println("Hoadon:"+(i+1));
	            dshd[i]=new hoadon();
	            dshd[i].nhaphd();
	            filehd.writehd(dshd);
	            System.out.println();
	        }
	}
	
	public void timkiem()
	{
		int choose;
		dshd=Arrays.copyOf(dshd,dshd.length);
	       do{
	           System.out.println("Tim hoa don theo MaHD hay Makh?");
	           System.out.println("1.Tim theo MaHD.");
	           System.out.println("2.Tim theo Makh.");
	           System.out.println("0.Thoat!!!");
	           choose=Integer.parseInt(sc.nextLine());
	           switch(choose){
	               case 1:
	              /* System.out.println("Nhap Ma hd:");
	               String mahd=sc.nextLine();
	               dshd=Arrays.copyOf(dshd,dshd.length);
	               boolean check=false;
	               for(int i=0;i<dshd.length;i++){
	                   if(dshd[i].getMahd().equalsIgnoreCase(mahd)){
	                       check=true;
	                       dshd[i].xuathd();
	                       break;
	                   }
	                   if(!check){
	                       System.out.println("Ma hoa don sai!!!");
	                       break;
	                   }
	               }
	               break;*/
	            	   System.out.println("Nhap Ma hd!: ");
	            	   String mahd=sc.nextLine();
	                  for(int i=0; i<dshd.length; i++)
	                      if(dshd[i].getMahd().equalsIgnoreCase(mahd))
	                    	  dshd[i].xuathd();
	                          break;
	               case 2:
	               /*System.out.println("Nhap Ma kh:");
	               String makh=sc.nextLine();
	               dshd=Arrays.copyOf(dshd,dshd.length);
	               boolean check5=false;
	               for(int i=0;i<dshd.length;i++){
	                   if(dshd[i].getMakh().equalsIgnoreCase(makh)){
	                          check5=true;
	                          dshd[i].xuathd();
	                          break;
	                   }
	                   if(!check5){
	                       System.out.println("SAIIII!!!");
	                       break;
	                   }

	               }
	               break;*/
	            	   System.out.println("Nhap Ma hd!: ");
	            	   String makh=sc.nextLine();
	                  for(int i=0; i<dshd.length; i++)
	                      if(dshd[i].getMakh().equalsIgnoreCase(makh))
	                    	  dshd[i].xuathd();
	                          break;
	               case 0:
	               System.out.println("Thoat!!!");
	               break;
	           }
	       }while(choose!=0);
	        
	    }
	public void timkiem1()
	{
		/*int choose;
		dshd=Arrays.copyOf(dshd,dshd.length);
	               System.out.println("Nhap Ma hd:");
	               String masp=sc.nextLine();
	               dshd=Arrays.copyOf(dshd,dshd.length);
	              
	               for(int i=0;i<dshd.length;i++){
	                   if(dshd[i].getMasp().equalsIgnoreCase(masp))
	                       dshd[i].xuatsoluongcuahd();
	                       break;
	                   }*/
	               }
	       
	    public void xuat(){
	    /*	System.out.printf("%-20s%-20s%-20s%-20s%-20s\n","makh","masp","soluong","giahd","tonggia");
	        for(hoadon hd:dshd){
	        	//dshd=Arrays.copyOf(dshd,dshd.length);
	            hd.xuathd();
	            System.out.println();
	        }*/
	    	System.out.println("+================================================================================================================================================+");
	        System.out.println("|                                                                DANH SACH HOA DON                                                            |");
	        System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------------+");
	        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n","Mahd","Makh","Masp","Soluong","Giahd","Tonggia");
	        System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------------+");
	        for(hoadon hd:dshd)
	        {    
	            hd.xuathd();
	            System.out.println("");
	            
	        }
	        System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------------+");
	    }

	    public void them(){
	      int hd2=dshd.length;
	      System.out.println("Nhap hoa don");
	      System.out.println();
	      hoadon hd3=new hoadon();
	      hd3.nhaphd();
	      dshd=Arrays.copyOf(dshd,dshd.length+1);
	      dshd[hd2]=hd3;
	      hd2++;
	      filehd.writehd(dshd);
	}
	    public void xoa() {
	    	 while(true){
	             System.out.println("Nhap ID hoa don ra xoa khoi danh sach.");
	             String mahd= sc.nextLine();
	             boolean check=false;
	             for(int i=0;i<dshd.length;i++){
	                if(dshd[i].getMahd().equalsIgnoreCase(mahd)){
	                    check=true;;
	                    hoadon sp=new hoadon();
	                    dshd[i]=sp;
	                    sp= null;
	                    filehd.writehd(dshd);
	                    System.out.println("Xoa thanh cong!");
	                    break;
	                }
	             }if(check){
	                 break;
	             }else{
	                 System.out.println("ID khong hop le!");
	             }
	         }
	    }
	    public void sua() {
	    	while(true){
	             System.out.println("Nhap ID hoa don can sua trong danh sach.");
	             String mahd= sc.nextLine();
	             dshd=Arrays.copyOf(dshd,dshd.length);
	             boolean check=false;
	             for(int i=0;i<dshd.length;i++){
	                if(dshd[i].getMahd().equalsIgnoreCase(mahd)){
	                    check=true;;
	                    hoadon sp=new hoadon();
	                    dshd[i]=sp;
	                    sp.nhaphd();
	                    filehd.writehd(dshd);
	                    System.out.println("Sua thanh cong!");
	                    break;
	                }
	             }if(check){
	                 break;
	             }else{
	                 System.out.println("ID khong hop le!");
	             }
	         }
	    }
	    public void timkiem2()
		{
			int choose;
			dshd=Arrays.copyOf(dshd,dshd.length);
		       do{
		           System.out.println("\nTim hoa don theo MaHD hay Makh?");
		           System.out.println("1.Tim theo MaHD.");
		           System.out.println("2.Tim theo Makh.");
		           System.out.println("3.Tim theo MaSp.");
		           System.out.println("0.Thoat!!!");
		           choose=Integer.parseInt(sc.nextLine());
		           switch(choose){
		               case 1:
		              /* System.out.println("Nhap Ma hd:");
		               String mahd = sc.nextLine();
		              dshd=Arrays.copyOf(dshd,dshd.length);
		               boolean check=false;
		               for(int i=0;i<dshd.length;i++){
		                   if(dshd[i].getMahd().equalsIgnoreCase(mahd)){
		                       check=true;
		                       dshd[i].xuathd();
		                       System.out.println();
		                       break;
		                   }
		               }
					   if(!check){
						System.out.println("Ma hoa don sai!!!");
					}
		               break;*/
		            	   System.out.println("Nhap Ma hd : ");
		            	   String mahd = sc.nextLine();
		                   for(int i=0; i<dshd.length; i++)
		                       if(dshd[i].getMahd().equalsIgnoreCase(mahd))
		                    	   dshd[i].xuathd();
		                           break;
		               case 2:
		               /*System.out.println("Nhap Ma kh:");
		               String makh=sc.nextLine();
		               dshd=Arrays.copyOf(dshd,dshd.length);
		               boolean check5=false;
		               for(int i=0;i<dshd.length;i++){
		                   if(dshd[i].getMakh().equalsIgnoreCase(makh)){
		                          check5=true;
		                          dshd[i].xuathd();
		                          System.out.println();
		                          break;
		                   }

		               }
					   if(!check5){
						System.out.println("SAIIII!!!");
					}
					   break;*/
		            	   System.out.println("Nhap Ma kh : ");
		            	   String makh=sc.nextLine();
		                   for(int i=0; i<dshd.length; i++)
		                       if(dshd[i].getMakh().equalsIgnoreCase(makh))
		                    	   dshd[i].xuathd();
		                           break;
		               case 3:
			               /*System.out.println("Nhap Ma san pham:");
			               String masp=sc.nextLine();
			               dshd=Arrays.copyOf(dshd,dshd.length);
			               boolean check4=false;
			               for(int i=0;i<dshd.length;i++){
			                   if(dshd[i].getMasp().equalsIgnoreCase(masp)){
			                          check4=true;
			                          dshd[i].xuathd();
			                          System.out.println();
			                          break;
			                   }

			               }
						   if(!check4){
							System.out.println("SAIIII!!!");
						}
						   break;*/
		            	   System.out.println("Nhap Ma san pham : ");
		            	   String masp=sc.nextLine();
		                   for(int i=0; i<dshd.length; i++)
		                       if(dshd[i].getMasp().equalsIgnoreCase(masp))
		                    	   dshd[i].xuathd();
		                           break;
		               case 0:
		               System.out.println("Thoat!!!");
		               break;
		           }
		       }while(choose!=0);
		        
		    }
	    public void tonghoadon()
	    {
	    	int x = 0;
	    	System.out.println("Nhap ma Kh");
	    	String makh = sc.nextLine();
	    	for(int i = 0 ;i < dshd.length ; i++)
	    	{
	    		if(dshd[i].getMakh().equals(makh))
	    		{
	    		x += dshd[i].getTonggia();
	    		}
	    	}
	    	System.out.println("Tong gia tien la  = "+x);
	    }
	    public void sua2() {
	    	while(true){
	             System.out.println("Nhap Ma hoa don can sua trong danh sach.");
	             int  mahd= Integer.parseInt(sc.nextLine());
	             dshd=Arrays.copyOf(dshd,dshd.length);
	             boolean check=false;
	             for(int i=0;i<dshd.length;i++){
	                if(dshd[i].getMahd().equals(mahd)){
	                    check=true;
	                   // hoadon sp=new hoadon();
	                   // dshd[i]=sp;
						int chon5;
						do{
						System.out.println("Ban muon sua cai gi?");
						System.out.println("1.Sua MaKH.");
						System.out.println("2.Sua MaSP.");
						System.out.println("3.Sua Gia SP:");
						System.out.println("4.Sua so luong mua.");
						System.out.println("0.Thoat!!!!");
						chon5=Integer.parseInt(sc.nextLine());
						switch(chon5){
							case 1:
							dshd[i].setMakh();
							filehd.writehd(dshd);
							System.out.println("Sua thanh cong!!!");
							break;
							case 2:
							dshd[i].setMasp();
							filehd.writehd(dshd);
							System.out.println("Sua thanh cong!!!");
							break;
							case 3:
							dshd[i].setGhd();
							filehd.writehd(dshd);
							System.out.println("Sua thanh cong!!!");
							break;
							case 4:
							dshd[i].setSoluong();
							System.out.println("Sua thanh cong!!!");
							break;
							case 5:
								dshd[i].settonggia();
								System.out.println("Sua thanh cong!!!");
								break;
							case 0:
							System.out.println("Nhan 0 de thoat.Cam on!!");
							break;
							default:
							System.out.println("Nhap sai thi nhap lai di!!!");
							break;
						}
	                }while(chon5!=0);
				}
			}
				 if(check){
	                 break;
	             }
				 else{
	                 System.out.println("ID khong hop le!");
	             }
				
			}
	}
	    public static void chitiethoa(){
	        chitiethoadon hd12= new chitiethoadon();
	        int choose;
	        do{
	            System.out.println("============HOA DON==========");
	            System.out.println("|1.Nhap hoa don.           |");
	            System.out.println("|2.Xuat hoa don.           |");
	            System.out.println("|3.Tim hoa don .           |");
	          //  System.out.println("|7.Tim hoa don2 .           |");
	            System.out.println("|4.Sua hoa don .           |");
	            System.out.println("|5.Xoa hoa don .           |");
	            System.out.println("|6.Them hoa don.           |");
	          //  System.out.println("|7.Thanh toan hoa don.           |");
	            System.out.println(" 8 Tong tien trong hoa don");
	            System.out.println("|0.Thoat!                   |");
	            choose=Integer.parseInt(sc.nextLine());
	            switch(choose){
	                case 1:
	                hd12.nhapdshd();
	                break;
	                case 2:
	                hd12.xuat();
	                break;
	               /* case :
	                hd12.timkiem();
	                break;*/
	                case 4:
	                	hd12.sua2();
	                break;
	                case 5:
	                	hd12.xoa();
	                break;
	                case 6:
	                hd12.them();
	                break;
	                case 3:
	                {
	                	hd12.timkiem2();
	                	break;
	                }
	                case 8:
	                {
	                	hd12.tonghoadon();
	                	break;
	                }
	                case 0:
	                System.out.println("Thoat thanh cong!!!");
	                break;
	                default:
	                System.out.println("Nhap lai...");
	                break;
	                
	            }
	        }while(choose!=0);
	    }
}
