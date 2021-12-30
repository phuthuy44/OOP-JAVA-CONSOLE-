package DoAn;
import java.util.Scanner;
public class menucon2 {
    public static void quanly2(){
        int choose=0;
        do{
            Scanner sc= new Scanner(System.in);
            System.out.println("====Chon muc can quan ly===");
            System.out.println("||1.Danh sach chi tiet nhap. ");
            System.out.println("||2.Danh sach chi tiet xuat.");
            System.out.println("||0.Nhan 0 de thoat.Xin cam on!!");
            choose=Integer.parseInt(sc.nextLine());
            switch(choose){
              case 1:
              dschitietnhap.chitietnhap();
              break;
              case 2:
              Dschitietxuat.chitietxuat();
              break;
              case 0:
              System.out.println("Thoat thanh cong!!");
              break;
              default:
              System.out.println("Nhap lai cho dung ne!!");
              break;
        }
    }while(choose!=0);
    }
}
