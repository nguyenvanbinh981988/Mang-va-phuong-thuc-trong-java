import java.util.Scanner;

public class Chuong_trinh_chuyen_doi_nhiet_do {
    public static void main(String[] args) {
        double F = 1.0;
        double C = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1 : From C to F");
        System.out.println("2 : From F to C");
        System.out.println("Enter choice");
        int  choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter C");
                C = input.nextDouble();
                F = (C+32) * 9 / 5;
                System.out.println("fahrenheit: "+F);
                break;
            case 2:
                System.out.println("Enter F");
                F = input.nextDouble();
                C = F * 5 / 9 - 32;
                System.out.println("celsius: "+C);
                break;
        }
    }
}
