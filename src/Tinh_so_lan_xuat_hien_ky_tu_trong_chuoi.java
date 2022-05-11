import java.util.Scanner;

public class Tinh_so_lan_xuat_hien_ky_tu_trong_chuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap chuoi");
        String str = input.nextLine();

        System.out.println("Nhap ky tu can check");
        String kyTu = input.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (kyTu.charAt(0) == str.charAt(i)){
                count++;
            }
        }

        System.out.println(kyTu + "co so lan xuat hien trong chuoi "+"'"+str+"' la: " + count);
    }
}
