import java.util.Scanner;

public class Tim_gia_tri_nho_nhat_sdpt_mang {
    public static void main(String[] args) {
        int size;
        int[] arr;

        Scanner input =new Scanner(System.in);

        System.out.println("Enter size:");
        size = input.nextInt();

        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + i + " : ");
            arr[i] = input.nextInt();
        }

        System.out.println("minValue is " + minValue(arr));

    }

    public static int minValue(int[] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i] ) {
                min =  a[i];
            }
        }
        return min;
    }
}
