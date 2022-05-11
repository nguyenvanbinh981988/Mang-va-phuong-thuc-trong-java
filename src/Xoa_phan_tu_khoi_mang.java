import java.util.Scanner;

public class Xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 8, 9, 6, 7, 5, 4, 3, 2, 1};
        int a;
        int[] arr2;

        int count = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap phan tu can xoa");
        a = input.nextInt();
        for (int i = 0; i < arr1.length; i++) {
            if (a == arr1[i]) {
                count++;
            }
        }
        arr2 = new int[arr1.length - count];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            if ((a != arr1[i])) {
                arr2[j] = arr1[i];
                j++;
            }
        }
        for (int b: arr1) {
            System.out.println("Element of arr1: " + b);
        }
        System.out.println("\n \n");
        for (int c: arr2) {
            System.out.println("Element of arr2: " + c);
        }
    }
}
