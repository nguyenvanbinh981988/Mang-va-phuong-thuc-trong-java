import java.util.Scanner;

public class Dao_nguoc_cac_phan_tu_mang {

    public static void main(String[] args) {
        int size;
        int[] arr;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size: ");
        size = input.nextInt();
        if (size > 20) {
            System.out.println("the size isn't exceed 20");
        } else {
            arr = new int[size];
            int i = 0;
            while (i < arr.length) {
                System.out.println("Enter element " + (i + 1) + ": ");
                arr[i] =input.nextInt();
                i++;
            }
            System.out.printf("Element of arr: ");
            for (int j = 0; j < size; j++) {
                System.out.printf("Element " + j +": " + arr[j]);
            }
            for (int j = 0; j < size / 2; j++) {
                int temp;
                temp = arr[j];
                arr[j] = arr[size - 1-j];
                arr[size -1- j] = temp;
            }
            System.out.printf("\n Element of xao tron arr: ");
            for (int j = 0; j < size; j++) {
                System.out.printf("Element " + j +": " + arr[j]);
            }
        }
    }
}
