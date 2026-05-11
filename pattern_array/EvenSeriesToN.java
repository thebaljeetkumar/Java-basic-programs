import java.util.Scanner;
public class EvenSeriesToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}