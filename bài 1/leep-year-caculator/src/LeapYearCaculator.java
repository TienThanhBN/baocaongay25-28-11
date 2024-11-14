import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYearCaculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter year: ");
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%f is a leap year", year);
                } else {
                    System.out.printf("%f is not a leap year", year);
                }
            } else {
                System.out.printf("%f is it a leap year", year);
            }
        } else {
            System.out.printf("%f is NOT a leap year", year);
        }
    }
}
