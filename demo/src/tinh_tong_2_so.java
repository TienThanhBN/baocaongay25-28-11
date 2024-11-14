import java.util.Scanner;

public class tinh_tong_2_so {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thu 1");
        int a = scanner.nextInt();
        System.out.print("Nhap so thu 2");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("Tong cua 2 so la " + sum);
    }
}
