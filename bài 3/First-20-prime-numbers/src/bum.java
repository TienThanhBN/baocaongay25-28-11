public class bum {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i < 2) {
                System.out.println("\n");
            } else if (i == 2) {
                System.out.println(i);
            } else {
                int count = 0;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
