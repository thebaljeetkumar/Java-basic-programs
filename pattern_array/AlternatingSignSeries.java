import java.util.Scanner;
public class AlternatingSignSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print("-" + i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}