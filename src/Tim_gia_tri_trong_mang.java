import java.util.Scanner;

public class Tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = input.nextLine();

        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println(name + " nam o vi tri: " + i);
                check = true;
            }
        }
        if (!check) {
            System.out.println(name + " khong nam trong mang nay");
        }
    }
}
