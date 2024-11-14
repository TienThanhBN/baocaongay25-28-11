import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number < 2) {
                System.out.println(number + " is not a prime");
            } else if (number == 2) {
                System.out.println(number + " is a prime number");
            } else {
                int count = 0;
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println("là snt");
                } else {
                    System.out.println(number + " is not a prime number");
                }


            }
        } while(2 > 1);
    }
}
