package DoAn;
import java.util.Arrays;
import java.util.Scanner;

public class DSKhachHang extends KhachHang implements chucnang1 {
//	public static ArrayList<KhachHang> arr = new ArrayList<>();
    private int n;
    protected static KhachHang [] arrkh;
    private filekh filekh;
    KhachHang kh = new KhachHang();
    static Scanner sc = new Scanner(System.in);
    public DSKhachHang()
    {
        filekh = new filekh();
        arrkh = filekh.readkh();
        n=0;
    }
    public void nhapmangkhachhang()
    {
        System.out.println("+----------------------------------------+");
        System.out.print("| NHAP SO LUONG KHACH HANG: ");
        n=sc.nextInt();
        arrkh = new KhachHang[n];
        for(int i=0;i<n;i++){
            arrkh[i] = new KhachHang();
            System.out.println("+----------------------------------------+");
            System.out.println("|         NHAP KHACH HANG THU "+(i+1)+"          |");
            System.out.println("+----------------------------------------+");
            arrkh[i].nhap();
            filekh.writekh(arrkh);
        }
    }
    public void xuatmangkhachhang()
    {
        
  
        System.out.println("+================================================================================================================================================+");
       System.out.println("|                                                          DANH SACH KHACH HANG                                                            ");
        //System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
       System.out.printf("|    %-20s%-20s%-20s%-20s%-20s%-20s%-15s%-25s\n","MaKH","HoTen","NgaySinh","GioiTinh","DienThoai","DiaChi","SoHD","The" );
     //   System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
        for(KhachHang objkh: arrkh)
        {    
            objkh.xuat();
            System.out.println("");
            
        }
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------+");
    }
    public void them(){
        System.out.println("+----------------------------------------+");
        System.out.print("|         MOI NHAP THEM KHACH HANG       | \n");
       /* kh.nhap();
        arrkh = Arrays.copyOf(arrkh, arrkh.length +1); 
        arrkh[n]=kh;
        n++;*/
        int m = arrkh.length;
		KhachHang kh= new KhachHang();
		kh.nhap();
        arrkh = Arrays.copyOf(arrkh, arrkh.length +1); 
        arrkh[m++]=kh;
        filekh.writekh(arrkh);
        m++;
    }
    public void sua(){
      /*  System.out.println("+----------------------------------------+");
        System.out.print("|           CHINH SUA KHACH HANG         | \n");
        System.out.println("Nhap ma khach hang can chinh sua: ");
        sc.nextLine();
        String MaKH=sc.nextLine();
        
        arrkh=Arrays.copyOf(arrkh,arrkh.length);
        int m=arrkh.length;
        for(int i = 0 ;i < m ;i++)
		{
        	if(arrkh[i].getMaKH().equalsIgnoreCase(MaKH))
        		arrkh[i].nhap();	
        	filekh.writekh(arrkh);
		}
		System.out.println("Sua thanh cong! ");
    }*/
    	 while(true){
    	        System.out.println("+----------------------------------------+");
    	        System.out.print("|           CHINH SUA KHACH HANG         | \n");
    	        System.out.println("Nhap ma khach hang can chinh sua: ");sc.nextLine();
    	        String makh1=sc.nextLine();
    	        arrkh=Arrays.copyOf(arrkh,arrkh.length);
    	       int m=arrkh.length;
    	        boolean check=false;
    	        for(int j = 0 ;j<m ;j++)
    			{
    	        	if(arrkh[j].getMaKH().equalsIgnoreCase(makh1)){
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
    	                      //  arrkh[j].setHoten();
    	                        arrkh[j].setHoten();
    	                        filekh.writekh(arrkh);
    	                        System.out.println("Sua thanh cong!!!");
    	                        break;
    	                        case 2:
    	                      // arrkh[j].setNgaySinh();
    	                        arrkh[j].setNgaySinh();
    	                        filekh.writekh(arrkh);
    	                        System.out.println("Sua thanh cong!!");
    	                        break;
    	                        case 3:
    	                      //  arrkh[j].setGioiTinh();
    	                        arrkh[j].setGioiTinh();
    	                        filekh.writekh(arrkh);
    	                        System.out.println("Sua thanh cong!!");
    	                        break;
    	                        case 4:
    	                       // arrkh[j].setDienThoai();
    	                        arrkh[j].setDienThoai();
    	                        filekh.writekh(arrkh);
    	                        System.out.println("Sua thanh cong!!!");
    	                        break;
    	                        case 5:
    	                     //   arrkh[j].setDiaChi();
    	                        	arrkh[j].setDiaChi();
    	                        filekh.writekh(arrkh);
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
    	            System.out.println("Nhap MaKH sai!!!");
    	        }
    			//System.out.println("Sua thanh cong! ");
    	}
    } 
    public void timkiem(){
        int choose;
        do{
        System.out.println("+----------------------------------------+");
        System.out.println("|    BAN MUON TIM THEO MA HAY TEN?       |");
        System.out.println("+----------------------------------------+");
        System.out.println("|  1. Tim theo ma khach hang.             |");
        System.out.println("|  2. Tim theo ten khach hang.            |");
        System.out.println("|  3. Tim theo gioi tinh khach hang.            |");
        System.out.println("|  0. Thoat!                             |");
        System.out.println("+----------------------------------------+");
        choose=sc.nextInt();
        sc.nextLine();
        switch(choose){
           case 1:
          
        	   System.out.println("Nhap vao ma khach hang can tim : ");
        	   String MaKH=sc.nextLine();
               for(int i=0; i<arrkh.length; i++)
                   if(arrkh[i].getMaKH().equalsIgnoreCase(MaKH))
                	   arrkh[i].xuat();
                       break;
                    
           case 2:
       
        	   System.out.println("Nhap vao ma khach hang can tim : ");
        	   String HoTen=sc.nextLine();
               for(int i=0; i<arrkh.length; i++)
                   if(arrkh[i].getHoTen().equalsIgnoreCase(HoTen))
                	   arrkh[i].xuat();
                       break;
           case 3:
              
        	   System.out.println("Nhap vao ma khach hang can tim : ");
        	   String gioitinh=sc.nextLine();
               for(int i=0; i<arrkh.length; i++)
                   if(arrkh[i].getGioiTinh().equalsIgnoreCase(gioitinh))
                	   arrkh[i].xuat();
                       break;
            case 0:
                System.out.println("Thoat thanh cong!");
                break;
            default:
                System.out.println("Moi nhap lai!");
                break;

        }
    }while(choose!=0); 
        
    }
    public void xoa() {
        System.out.println("+----------------------------------------+");
        System.out.print("|        NHAP MA KHACH HANG CAN XOA      | \n");
        sc.nextLine();
        String MaKH=sc.nextLine();
        boolean check=false;
        for(int i=0;i<arrkh.length;i++){
            if(arrkh[i].getMaKH().equalsIgnoreCase(MaKH)) {
                check=true;
              KhachHang kh= new KhachHang();
               arrkh[i] = kh;
               arrkh = Arrays.copyOf(arrkh,arrkh.length-1);
               kh=null;
               filekh.writekh(arrkh);
               break;
            }

        }if(!check){
            System.out.println("ID khong hop le!");
        }
}
    
    
    public static void Dskhachhang() {
        
        DSKhachHang mangkh=new DSKhachHang();
        
        
        int choose;
        do{
            System.out.println("+----------------------------------------+");
            System.out.println("|          DANH MUC KHACH HANG           |");
            System.out.println("+----------------------------------------+");
            System.out.println("|    1. Nhap khach hang                  |");
            System.out.println("|    2. Xuat khach hang                  |");
            System.out.println("|    3. Them khach hang                  |");
            System.out.println("|    4. Tim kiem khach hang              |");
            System.out.println("|    5. Chinh sua khach hang             |");
            System.out.println("|    6. Xoa khach hang                   |");
            System.out.println("|    7. Ket thuc thao tac voi khach hang |");
            System.out.println("+----------------------------------------+");
            System.out.println("|          Moi chon 1 thao tac !         |");
            System.out.println("+----------------------------------------+");
            choose=sc.nextInt();
            switch(choose){
                case 1:
                    mangkh.nhapmangkhachhang();
                    break;
                case 2:
                    mangkh.xuatmangkhachhang();
                    break;     
                case 3:
                    mangkh.them();
                    break;
                case 4:
                    mangkh.timkiem();
                    break;
                case 5:
                    mangkh.sua();
                    break;
                case 6:
                    mangkh.xoa();
                    break;
                case 7:
                    System.out.println("====KET THUC THAO TAC VOI KHACH HANG=====");
            }
        }while(choose!= 7);
    }
}
