package DoAn;

import java.util.Arrays;
import java.util.Scanner;


public class DSdanhmuc implements chucnang1{
    protected static Danhmucsp[] DANHMUC;
    private FILE f;
   public static Scanner sc= new Scanner(System.in);
    public DSdanhmuc() {
        f=new FILE();
        DANHMUC=f.readDM();
    }
    
    public Danhmucsp[] getDANHMUC() {
        return DANHMUC;
    }
    public void setDANHMUC(Danhmucsp[] DANHMUC) {
        DANHMUC = DANHMUC;
    }
    public void nhap(){
        System.out.println("So luong danh muc can nhap:");
        int n =Integer.parseInt(sc.nextLine());
       DANHMUC= new Danhmucsp[n];
       for(int i=0;i<n;i++){
           System.out.println("Danh muc thu:"+(i+1));
           DANHMUC[i]=new Danhmucsp();
           DANHMUC[i].nhapdm();
           f.writeDM(DANHMUC);
           System.out.println();
       }
    }
    @Override
    public void them() {
    	int m = DANHMUC.length;
		System.out.println("Nhap danh muc");
		System.out.println();
		Danhmucsp s1=new Danhmucsp();
		s1.nhapdm();
		DANHMUC=Arrays.copyOf(DANHMUC,DANHMUC.length+1);
		DANHMUC[m++]=s1;
		f.writeDM(DANHMUC);
		m++;
        
    }
    @Override
    public void sua() {
        System.out.println("Nhap ID danh muc can sua:");
        String idDM=sc.nextLine();
       // Danhmucsp s1 = new Danhmucsp();
        DANHMUC=Arrays.copyOf(DANHMUC,DANHMUC.length);
        int m=DANHMUC.length;
        for(int i = 0 ;i < m ;i++)
		{
        	if(DANHMUC[i].getIdDMuc().equalsIgnoreCase(idDM))
			{
        		DANHMUC[i].nhapdm();
				f.writeDM(DANHMUC);
			}
		}
		System.out.println("Sua thanh cong ");
        
        }
        
        
    @Override
    public void xoa() {
        System.out.println("Nhap ma ID can xoa:");
        String idDM=sc.nextLine();
        boolean check=false;
        for(int i=0;i<DANHMUC.length;i++){
        	if(DANHMUC[i].getIdDMuc().equalsIgnoreCase(idDM)) {
                check=true;
               Danhmucsp dm2= new Danhmucsp();
               DANHMUC[i] = dm2;
               DANHMUC = Arrays.copyOf(DANHMUC,DANHMUC.length-1);
               dm2=null;
               f.writeDM(DANHMUC);
               break;
            }
        }
        if(!check){
            System.out.println("ID khong hop le!");
        }
    

    }
    @Override
    public void timkiem() {
        int choose;
      do{
        System.out.println("BAN MUON TIM THEO ID HAY TEN?");
        System.out.println("1.Tim theo ID.");
        System.out.println("2.Tim theo ten.");
        System.out.println("0. Thoat!");
         choose=Integer.parseInt(sc.nextLine());
        switch(choose){
           case 1:
           /* System.out.println("Nhap ID danh muc can tim:");
           String idDM= sc.nextLine();
            DANHMUC=Arrays.copyOf(DANHMUC,DANHMUC.length);
            boolean check=false;
            for(int i=0;i<DANHMUC.length;i++){
            	if(DANHMUC[i].getIdDMuc().equalsIgnoreCase(idDM)) {
                    check=true;
                    DANHMUC[i].hienthidm();
                    System.out.println();
                    break;
                }
            }
            if(!check){
                System.out.println("ID khong hop le!");
            }
            break;*/
        	   System.out.println("Nhap vao ma danh muc can tim : ");
        	   String idDM= sc.nextLine();
               for(int i=0; i<DANHMUC.length; i++)
                   if(DANHMUC[i].getIdDMuc().equalsIgnoreCase(idDM))
                	   DANHMUC[i].hienthidm();
                       break;
        case 2:
       /* System.out.println("Nhap Ten Danh muc can tim:");
    //    sc.nextLine();
        String name=sc.nextLine();
        DANHMUC=Arrays.copyOf(DANHMUC, DANHMUC.length);
        boolean check1=false;
        for(int i=0;i<DANHMUC.length;i++){
            if(DANHMUC[i].getNameDMuc().equals(name)){
                check1=true;
                DANHMUC[i].hienthidm();
                System.out.println();
                break;
            }
        }
        if(!check1){
            System.out.println(name+"khong ton tai!");
        }
        break;*/
        	 System.out.println("Nhap vao ten danh muc can tim : ");
        	 String name=sc.nextLine();
             for(int i=0; i<DANHMUC.length; i++)
                 if(DANHMUC[i].getNameDMuc().equalsIgnoreCase(name))
              	   DANHMUC[i].hienthidm();
                     break;
        case 0:
        System.out.println("Thoat thanh cong!");
        break;
      }
    }while(choose!=0);
}
public void xuat(){
  /*  System.out.println("======DANH MUC=====");
    for(Danhmucsp dm:DANHMUC){
        dm.hienthidm();
        System.out.println();
    }*/
	System.out.println("+================================================================================================================================================+");
    System.out.println("|                                                                DANH SACH DANH MUC                                                            |");
    System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------------+");
    System.out.printf("|%-20s%-20s|\n","Ma Danh Muc","Ten Danh Muc");
    System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------------+");
    for(Danhmucsp dm:DANHMUC)
    {    
        dm.hienthidm();
        System.out.println("");
        
    }
    System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------------+");
}
public static void Dsdanhmuc(){
	DSdanhmuc dm= new DSdanhmuc();
    int choose;
    do{
        System.out.println("==================DANHMUC===============");
        System.out.println("1. Nhap Danh muc.");
        System.out.println("2. Xuat Danh muc.");
        System.out.println("3. Them Danh muc.");
        System.out.println("4. Sua Danh muc.");
        System.out.println("5. Xoa Danh muc.");
        System.out.println("6. Tim Danh muc.");
        System.out.println("0. Thoat!");
        System.out.println("=========================================");
        choose=Integer.parseInt(sc.nextLine());
        switch(choose){
            case 1:
              dm.nhap();
              break;
            case 2:
            dm.xuat();
            break;
            case 3:
            dm.them();
            break;
            case 4:
            dm.sua();
            break;
            case 5:
            dm.xoa();
            break;
            case 6:
            dm.timkiem();
            break;
            case 0:
            System.out.println("Thoat thanh cong!");
            break;
            default:
            System.out.println("Nhap lai di");
            break;
        }
    }while(choose !=0);
    
}
}
