import java.util.Scanner;

public class Ung_dung_dem_so_luong_sinh_vien_thi_do {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size;
        double[] point;
        int count = 0;

        do {
            System.out.println("nhap so luong sinh vien");
            size = input.nextInt();
            if (size>30){
                System.out.println("this side in not exceed to 30");
            }
        } while (size>30);
         point = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Nhap diem sinh vien");
            point[i] = input.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (point[i] >= 5 && point[i]<=10){
                count++;
            }
        }
        System.out.println("So sinh vien do la: " + count);
    }
}
