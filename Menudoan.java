package DoAn;

import java.util.Scanner;

public class Menudoan {
		

	public static void main(String[] main)
	{
		
		int choose = 0;
        do
	{
		Scanner sc = new Scanner(System.in);
                String dangnhap;
		String password12;
                System.out.println("+---------------------------------------------+");
                System.out.println("|     CHUONG TRINH QUAN LY SIEU THI MINI      |");
                System.out.println("+---------------------------------------------+");
                System.out.println("|             THONG TIN DANG NHAP             |");
                System.out.print("|  Username: ");
                dangnhap=sc.nextLine();
                System.out.print("|  Password: ");
		password12 = sc.nextLine();
                System.out.println("+---------------------------------------------+");
		boolean check= false;
		if(dangnhap.equals("dangnhap") && password12.equals("123456"))
		{ 
                    check=true;
                    System.out.println("|        MENU QUAN LY SIEU THI MINI           |");
                    int chon; 
                    do {
			System.out.println("+=========================================================+");
			System.out.println("|   1. Quan ly danh sach nhan vien                        |");
			System.out.println("|   2. Quan ly danh sach danh muc                         |");
			System.out.println("|   3. Quan ly danh sach khach hang                       |");
			System.out.println("|   4. Quan ly danh sach nha cung cap                     |");
			System.out.println("|   5. Quan ly danh sach ban hang                         |");
			System.out.println("|   6. Quan ly danh sach hoa don                          |");
			System.out.println("|   7. Quan ly danh sach nha cung cap                     |");
			System.out.println("|   8. Quan ly danh sach chi tiet nhap và xuat            |");
			System.out.println("|   9. Quan ly danh sach phieu nhap va phieu xuat         |");
                        System.out.println("+=============================================+");
			chon = Integer.parseInt(sc.nextLine());
			switch(chon)
			{
			
				case 1:
				{
					DanhSachNhanVien2.Dsnv();
					break;
				}
				case 2:
				{
					DSdanhmuc.Dsdanhmuc();
					break;
				}
				case 3:
				{
					DSKhachHang.Dskhachhang();
					break;
				}
				case 4:
				{
					dsnhacungcap.DSnhacungcap();
					break;
				}
				case 5:
				{
					mainSP.quanly();
					break;
				}
				case 6:
				{
					chitiethoadon.chitiethoa();
					break;
				}
				case 7:
				{
					dsnhacungcap.DSnhacungcap();
					break;
				}
				case 8:
				{
					menucon2.quanly2();
					break;
				}
				case 9:
				{
					menucon1.quanly1();
					break;
				}
				
			}
		}while(chon!=0);
		
		}
		if(!check){
			System.out.println("|           SAI USERNAME OR PASSWORD          |");
                        System.out.println("|    Vui long nhap lai Username & Password!   |");
		}
		
	sc.close();
        }while(choose!=1);
}
}
		
	


