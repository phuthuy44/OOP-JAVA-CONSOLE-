package DoAn;
import java.util.Scanner;
public class menucon1 {
    public static void quanly1(){
        int choose=0;
        do{
            Scanner sc= new Scanner(System.in);
            System.out.println("====Chon muc can quan ly===");
            System.out.println("||1.Phieu Nhap hang. ");
            System.out.println("||2.Phieu Xuat hang.");
            System.out.println("||0.Nhan 0 de thoat.Xin cam on!!");
            choose=Integer.parseInt(sc.nextLine());
            switch(choose){
              case 1:
              DSPhieuNhap.dsnhapkho();
              break;
              case 2:
              DSphieuXuat.dsxuatkho();
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
