import java.util.Scanner;

public class Tim_gia_tri_lon_nhat_trong_mang {
    public static void main(String[] args) {
        int size;
        double[] billionMen;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size: ");
        size = input.nextInt();

        if (size>20 || size < 1){
            System.out.println("the size isn't exceed 20 or 1");
        } else {
            billionMen = new double[size];
            for (int i = 0; i < size; i++) {
                System.out.println("Enter element "+ i + " :");
                billionMen[i] = input.nextDouble();
            }
            double max = 0;
            int index = 0;
            for (int i = 0; i < size; i++) {
                if (max < billionMen[i]) {
                    max = billionMen[i];
                    index = i;
                }
            }
            System.out.println(" maxvalue is "+ max + " ; index is "+index);
        }

    }
}
