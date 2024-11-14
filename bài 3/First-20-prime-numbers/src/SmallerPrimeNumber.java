
public class SmallerPrimeNumber {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else if (number == 2) {
            return true;
        } else {
            int count = 0;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
    public static void showList() {
        for (int i = 1; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        showList();
    }
}
