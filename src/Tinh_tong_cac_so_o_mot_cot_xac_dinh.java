import java.util.Scanner;

public class Tinh_tong_cac_so_o_mot_cot_xac_dinh {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = {
                {10, 50, 8, 6, 7, 9},
                {53, 10, 15, 20, 61},
                {46, 44, 12, 24, 85},
                {86, 45, 10, 25, 60},
        };
        int collum;
        System.out.println("Nhap so cot can tinh tong");
        collum = input.nextInt();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (collum == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tong cot " + collum + " la: " + sum);
    }
}
