package DoAn;
import java.util.Arrays;
import java.util.Scanner;
public class DSsanphamdaban implements chucnang1 {
	protected static SanPham[] banhang;
    private filesp g;
   public static Scanner sc= new Scanner(System.in);
    
   /* public QLbanhang(SanPham[] banhang, FILE f) {
        this.banhang = banhang;
        this.f = f;
    }*/
    
    public DSsanphamdaban() {
        g= new filesp();
       //banhang= new SanPham[50000];
       banhang= g.readSP();
    }
    public void DSsanpham(){
        int n,i=0;
        System.out.println("So luong san pham ban can nhap:");
        n= Integer.parseInt(sc.nextLine());
        banhang=new SanPham[n];
        for(i=0;i<n;i++){
            System.out.println("San pham thu"+(i+1));
            banhang[i]=new SanPham();
            banhang[i].inputSP();
           g.writesanpham(banhang);
            System.out.println();
        }
    }

    @Override
    public void them() {
    		int n = banhang.length;
    		System.out.println("Nhap san pham");
		//	System.out.println();
			SanPham s1=new SanPham();
			s1.inputSP();
            banhang= Arrays.copyOf(banhang,banhang.length+1);
            banhang[n]=s1;
            g.writesanpham(banhang);
            System.out.println();
           n++;
        }
        
    @Override
    public void sua() {
        while(true){
            System.out.println("Nhap ID san pham can sua:");
            String IDSP=sc.nextLine();
            banhang=Arrays.copyOf(banhang,banhang.length);
            int n=banhang.length;
            boolean check=false;
            for(int i=0;i<n;i++){
                if(banhang[i].getIdSanpham().equalsIgnoreCase(IDSP)){
                    check=true;
                    int choose3;
                    do{
                    System.out.println("Ban can sua thong tin gi?");
                    System.out.println("1.Sua ten san pham.");
                    System.out.println("2.Sua ngay ban san pham.");
                    System.out.println("3.Sua ngay het han su dung.");
                    System.out.println("4.Sua mo ta san pham.");
                    System.out.println("5.Sua gia ban san pham.");
                    System.out.println("6.Sua so luong san pham.");
                    System.out.println("7.Sua danh muc san pham.");
                    System.out.println("0.Thoat!");
                    choose3= Integer.parseInt(sc.nextLine());
                    switch(choose3){
                        case 1:
                         System.out.println("Sua lai ten san pham.");
                         banhang[i].namesp();
                         g.writesanpham(banhang);
                         System.out.println("Sua thanh cong!");
                         break;
                         case 2:
                         System.out.println("Sua lai ngay ban san pham.");
                         banhang[i].ngayban();
                         g.writesanpham(banhang);
                         System.out.println("Sua thanh cong!");
                         break;
                         case 3:
                         System.out.println("Sua ngay het han su dung.");
                         banhang[i].hansudung();
                         g.writesanpham(banhang);
                         System.out.println("Sua thanh cong!");
                         break;
                         case 4:
                         System.out.println("Sua mo ta san pham.");
                         banhang[i].mota();
                         g.writesanpham(banhang);
                         System.out.println("Sua thanh cong!");
                         break;
                         case 5:
                         System.out.println("Sua gia ban san pham");
                         banhang[i].gia();
                         g.writesanpham(banhang);
                         System.out.println("Sua thanh cong!");
                         break;
                         case 6:
                             System.out.println("Sua so luong san pham");
                             banhang[i].soluong();
                             g.writesanpham(banhang);
                             System.out.println("Sua thanh cong!");
                             break;
                         case 7:
                             System.out.println("Sua DM san pham");
                             banhang[i].setIdDMuc(CheckError1.Checkiddm());
                             g.writesanpham(banhang);
                             System.out.println("Sua thanh cong!");
                             break;
                         case 0:
                         System.out.println("Thoat thanh cong !");
                         break;
                         default:
                         System.out.println("Moi nhap lai....");

                    }
                    }while(choose3 !=0);
                }
            }
            if(check){
                break;
            }else{
                System.out.println("ID SAN PHAM khong hop le!");
            }
        }
        
    }
    @Override
    public void xoa() {
       while(true){
           System.out.println("Nhap ID san pham can xoa khoi danh sach.");
           String IDSP= sc.nextLine();
           banhang=Arrays.copyOf(banhang,banhang.length);
           boolean check=false;
           for(int i=0;i<banhang.length;i++){
              if(banhang[i].getIdSanpham().equalsIgnoreCase(IDSP)){
                  check=true;
                  SanPham sp=new SanPham();
                  banhang[i]=sp;
                  sp=null;
                  g.writesanpham(banhang);
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
    @Override
    public void timkiem() {
       int choose4;
       do{
        System.out.println("=================================");
        System.out.println("||Ban muon tim theo tu khoa nao?");
        System.out.println("||1. Tim theo ID san pham.");
        System.out.println("||2. Tim theo ten san pham.");
        System.out.println("||3. Tim theo ngay ban san pham.");
        System.out.println("||4. Tim theo gia san pham.");
        System.out.println("||0.Thoat!");
        choose4= Integer.parseInt(sc.nextLine());
        switch(choose4){
            case 1:
          /*  System.out.println("Nhap ID san pham can tim.");
            String IDSP=sc.nextLine();
            boolean check=false;
            for(int i=0;i<banhang.length;i++){
                if(banhang[i].getIdSanpham().equalsIgnoreCase(IDSP)){
                    check=true;
                     banhang[i].hienthiSP();
                     break;
                }
             }if(!check){
                System.out.println("ID KHONG HOP LE!");
         }
            break;*/
            	 System.out.println("Nhap ID san pham can tim : ");
            	 String IDSP=sc.nextLine();
                 for(int i=0; i<banhang.length; i++)
                     if(banhang[i].getIdSanpham().equalsIgnoreCase(IDSP))
                    	 banhang[i].hienthiSP();
                         break;
            case 2:
          /*  System.out.println("Nhap ten san pham can tim!");
            String name=sc.nextLine();
            boolean check1=false;
            for(int i=0;i<banhang.length;i++){
                if(banhang[i].getName_sanpham().equalsIgnoreCase(name)){
                    check1=true;
                    banhang[i].hienthiSP();
                    break;
                }
                if(check1){
                 System.out.println("Sai ten roi!");
                 break;
                }
             }
            break;*/
            	System.out.println("Nhap ten san pham can tim!: ");
            	 String name=sc.nextLine();
                for(int i=0; i<banhang.length; i++)
                    if(banhang[i].getName_sanpham().equalsIgnoreCase(name))
                   	 banhang[i].hienthiSP();
                        break;
            case 3:
           /* System.out.println("Nhap ngay ban san pham.");
            String NGBAN=sc.nextLine();
            boolean check2=false;
            for(int i=0;i<banhang.length;i++){
                if(banhang[i].getNgayban().equals(NGBAN)){
                    check2=true;
                    banhang[i].hienthiSP();
                    break;
                }
                if(check2){
                    System.out.println("Error!");
                    break;
                }
            }
            break;*/
            	System.out.println("Nhap ngay ban san pham!: ");
            	String NGBAN=sc.nextLine();
               for(int i=0; i<banhang.length; i++)
                   if(banhang[i].getNgayban().equalsIgnoreCase(NGBAN))
                  	 banhang[i].hienthiSP();
                       break;
            case 4:
          /*  System.out.println("Tim theo gia san pham.");
            String gb=sc.nextLine();
            boolean check3=false;
            for(int i=0;i<banhang.length;i++){
                if(banhang[i].getGia().equals(gb)){
                    check3=true;
                    banhang[i].hienthiSP();
                    break;
                }
                if(check3){
                    System.out.println("ERROR!");
                }
            }
            break;*/
            	System.out.println("Tim theo gia san pham!: ");
            	 String gb=sc.nextLine();
               for(int i=0; i<banhang.length; i++)
                   if(banhang[i].getGia().equalsIgnoreCase(gb))
                  	 banhang[i].hienthiSP();
                       break;
            case 0:
            System.out.println("Thoat thanh cong!");
            break;
            default:
            System.out.println("Moi nhap lai...");
            break;


       }
    }while(choose4!=0);
    }

    @Override
    public void xuat() {
    /*  System.out.println("======HOADON=====");
      System.out.printf("|%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-30s%-30s\n","Madm","Masp","Tensp","Ngaymua","Han su dung","    Mo ta","      Gia","So luong" ,"  ");
      for(SanPham sp: banhang){
          sp.hienthiSP();
          System.out.println();
      }*/
    	System.out.println("+==================================================================================================================================================================+");
        System.out.println("|                                                                DANH SACH SAN PHAM DA BAN                                                            |");
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("| %-20s%-20s%-20s%-20s%-20s%-20s%-20s%-30s%-30s\n       |\n","Madm","Masp","Tensp","Ngaymua","Han su dung","    Mo ta","      Gia","So luong" ,"  ");
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(SanPham sp: banhang)
        {    
            sp.hienthiSP();;
            System.out.println("");
            
        }
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------------------+");
    }
    public static void quanlibanhang(){
        DSsanphamdaban sp= new DSsanphamdaban();
        int choose;
        do{
            System.out.println("============Danh sach san pham da ban==========");
            System.out.println("|1.Nhap san pham. |");
            System.out.println("|2.Xuat san pham. |");
            System.out.println("|3.Tim san pham . |");
            System.out.println("|4.Sua san pham . |");
            System.out.println("|5.Xoa san pham . |");
            System.out.println("|6.Them san pham. |");
            System.out.println("|0.Thoat!         |");
            choose=Integer.parseInt(sc.nextLine());
            switch(choose){
                case 1:
                sp.DSsanpham();
                break;
                case 2:
                sp.xuat();
                break;
                case 3:
                sp.timkiem();
                break;
                case 4:
                sp.sua();
                break;
                case 5:
                sp.xoa();
                break;
                case 6:
                sp.them();
                break;
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
