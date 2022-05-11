import java.util.Scanner;

public class Them_phan_tu_vao_mang {
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 8, 9, 6, 7, 5, 4, 3, 2, 1};
        int a;
        int index;
        int[] arr2;

        Scanner input = new Scanner(System.in);

        System.out.println("Nhap phan tu can them");
        a = input.nextInt();

        System.out.println("Nhap vi tri can them");
        index = input.nextInt();

        arr2 = new int[arr1.length+1];

        for (int i = 0; i < arr1.length+1; i++) {
            if (i<index) {
                arr2[i] = arr1[i];
            } else if (i==index){
                arr2[i] = a;
            }else {
                arr2[i] = arr1[i-1];
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

