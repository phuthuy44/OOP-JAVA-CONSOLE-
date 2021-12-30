package DoAn;

import java.util.Scanner;

public class mainSP {
	public static void quanly(){
        int choose=0;
        do{
            Scanner sc= new Scanner(System.in);
            System.out.println("====Chon muc can lam===");
            System.out.println("||1.Nhap thong tin San Pham da ban-Nnhan phim 1.");
            System.out.println("||2.Kiem tra hang hoa-nhan phim 2.");
            System.out.println("||0.Nhan 0 de thoat.Xin cam on!!");
            choose=Integer.parseInt(sc.nextLine());
            switch(choose){
              case 1:
              DSsanphamdaban.quanlibanhang();
              break;
              case 2:
              CTnhanVienBH.KTra();
              break;
              case 0:
              System.out.println("Thoat thanh cong!!");
              break;
              default:
              System.out.println("Nhap lai cho dung ne!!");
              break;
            }
            sc.close();
        }while(choose!=0);
    }
}
