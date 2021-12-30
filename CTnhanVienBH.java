package DoAn;

import java.util.Scanner;

public class CTnhanVienBH extends NhanVien{
	private static KTHanghoa[] KT;
	   public static void KTra(){
	       try (Scanner sc = new Scanner(System.in)) {
	        System.out.println("Nhap so luong san pham can check:");
	               int n=Integer.parseUnsignedInt(sc.nextLine());
	           for(int i=0;i<n;i++){
	               KT= new KTHanghoa[n];
	               KT[i]=new KTHanghoa();
	               boolean ktra=true;
	               KT[i].idsp();
	               do{
	                   KT[i].namesp();
	               }while(KT[i].kiemTraTenHang(ktra));
	               System.out.println("Nhap don gia:");
	               KT[i].setDongia(sc.nextDouble());
	               do{
	                System.out.println("Nhap nam,thang,ngay san xuat : ");
	                KT[i].setNgaySX(sc.nextInt(), sc.nextInt(), sc.nextInt());
	                System.out.println("Nhap nam,thang,ngay het han : ");
	                KT[i].setHSD(sc.nextInt(), sc.nextInt(), sc.nextInt());
	               }while(KT[i].kiemTraNgay(ktra));
	               System.out.println(KT[i]);
	               KT[i].kiemTraHSD();


	           }
	    } catch (NumberFormatException e) {
	        e.printStackTrace();
	    }
	   }
}
