import java.util.Scanner;
public class PrimesBetweenNAndK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n and k: ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = n; i <= k; i++) {
            if (i < 2) continue;
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(i + " ");
        }
    }
}