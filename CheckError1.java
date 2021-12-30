package DoAn;

import java.io.Serializable;
import java.util.Scanner;

public class CheckError1 implements Serializable{
	public static Scanner sc = new Scanner(System.in);
    public static String CheckMaKH() {
        String Input;
        while (true) {
            Input = sc.nextLine();
            Input = Input.toUpperCase();
            if (Input.matches("KH" + "[0-9]{1,2}")) {
                return Input;
            } else {
                System.out.println("Dinh dang ma khach hang: KH__. Vi du: KH01");
            }
            System.out.print("Vui nhap lai dung dinh dang: ");

        }
    }
    public static String Checkiddm() {
        String Input;
        while (true) {
            Input = sc.nextLine();
            Input = Input.toUpperCase();
            if (Input.matches("DM" + "[0-9]{1,2}")) {
                return Input;
            } else {
                System.out.println("Dinh dang ma khach hang: DM__. Vi du: DM01");
            }
            System.out.print("Vui nhap lai dung dinh dang: ");

        }
    }
        public static String CheckMaNv() {
            String Input;
            while (true) {
                Input = sc.nextLine();
                Input = Input.toUpperCase();
                if (Input.matches("BH" + "[0-9]{1,2}")) {
                    return Input;
                }
                else if((Input.matches("QL" + "[0-9]{1,2}")))
                {
                	 return Input;
                }
                else if((Input.matches("BV" + "[0-9]{1,2}")))
                {
                	 return Input;
                }
                else {
                    System.out.println("Dinh dang ma nhan vien: BV__. Vi du: BV01");
                    System.out.println("Dinh dang ma nhan vien: QL__. Vi du: QL01");
                    System.out.println("Dinh dang ma nhan vien: BH__. Vi du: BH01");
                }
                System.out.print("Vui nhap lai dung dinh dang: ");

            }
        }
    public static String CheckIDncc() {
        String Input;
        while (true) {
            Input = sc.nextLine();
            Input = Input.toUpperCase();
            if (Input.matches("NC" + "[0-9]{1,2}")) {
                return Input;
            } else {
                System.out.println("Dinh dang id nha cung cap: NC__. Vi du: NC01");
            }
            System.out.print("Vui nhap lai dung dinh dang: ");

        }
    }
    public static String Danhmuc() {
        String DauVao;
        while (true) {
            DauVao = sc.nextLine();
            DauVao = DauVao.trim();
            if (DauVao != null) {
                return DauVao;
            } else {
                System.out.print("Khong duoc bo trong chuoi: ");
            }
        }
    }
    public static String CheckMaSP() {
        String Input;
        while (true) {
            Input = sc.nextLine();
            Input = Input.toUpperCase();
            if (Input.matches("SP" + "[0-9]{1,2}")) {
                return Input;
            } else {
                System.out.println("Dinh danh san pham: SP__. Vi du: SP01");
            }
            System.out.print("Vui long nhap lai dung dinh dang: ");

        }
    }
    public static String Checkidnhap() {
        String Input;
        while (true) {
            Input = sc.nextLine();
            Input = Input.toUpperCase();
            if (Input.matches("NH" + "[0-9]{1,2}")) {
                return Input;
            } else {
                System.out.println("Dinh danh nhap hang: NH__. Vi du: NH01");
            }
            System.out.print("Vui long nhap lai dung dinh dang: ");

        }
    }
    public static String CheckMaphieuXuat() {
        String Input;
        while (true) {
            Input = sc.nextLine();
            Input = Input.toUpperCase();
            if (Input.matches("PX" + "[0-9]{1,2}")) {
                return Input;
            } else {
                System.out.println("Dinh danh nhap hang: PX__. Vi du: PX01");
            }
            System.out.print("Vui long nhap lai dung dinh dang: ");

        }
    }
 /*   public static String CheckMaHD() {
        String Input;
        while (true) {
            Input = sc.nextLine();
            Input = Input.toUpperCase();
            if (Input.matches("HD" + "[0-9]{1,2}")) {
                return Input;
            } else {
                System.out.println("Dinh danh san pham: SP__. Vi du: HD01");
            }
            System.out.print("Vui long nhap lai dung dinh dang: ");

        }
    }*/
    public static String CheckTen() {
        String DauVao;
        while (true) {
            DauVao = sc.nextLine();
            if (DauVao.matches("[\\pL\\pMn*\\s*]+")) {
                DauVao = DauVao.trim();
                DauVao = DauVao.replaceAll("\\s+", " ");
                DauVao = DauVao.toLowerCase();
                String[] Chuoi = DauVao.split(" ");
                DauVao = "";
                for (int i = 0; i < Chuoi.length; i++) {
                    DauVao += String.valueOf(Chuoi[i].charAt(0)).toUpperCase() + Chuoi[i].substring(1);
                    if (i < Chuoi.length - 1) {
                        DauVao += " ";
                    }
                }
                return DauVao;
            } else {
                System.out.print("Ten khong hop len moi nhap lai: ");
            }

        }
    }
    public static int CheckInteger() {
        int DauVao;
        while (true) {
            try {
                DauVao = Integer.parseInt(sc.nextLine());
                return DauVao;
            } catch (NumberFormatException exception) {
                System.out.print("Sai sai kieu du lieu vui long vao so 1 nhap lai: ");
            }
        }
    }
    public static String CheckString() {
        String DauVao;
        while (true) {
            DauVao = sc.nextLine();
            DauVao = DauVao.trim();
            if (DauVao != null) {
                return DauVao;
            } else {
                System.out.print("Khong duoc bo trong chuoi: ");
            }
        }
    }
     public static String CheckGender() {
        String DauVao;
        while (true) {
            DauVao = sc.nextLine();
            DauVao = DauVao.trim();
            if ("Nam".equals(DauVao) || "Nu".equals(DauVao)) {
                return DauVao;
            } else {
                System.out.print("Vui long nhap gioi tinh: ");
            }
        }
    }
    public static String CheckPhone() {
        String DauVao;
        while (true) {
            DauVao = sc.nextLine();
            DauVao = DauVao.trim();
            if (DauVao.matches("^(?=(?:[0]){1})(?=[0-9]{10}).*")) {
                 return DauVao;
            }
            else {
                System.out.print("Sai cu phap nhap lai!: ");
            }
        }
     }
   
}
