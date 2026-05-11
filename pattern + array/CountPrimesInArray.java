import java.util.Scanner;
public class CountPrimesInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        int primeCount = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            boolean isPrime = arr[i] > 1;
            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) primeCount++;
        }
        System.out.println("Number of primes: " + primeCount);
    }
}