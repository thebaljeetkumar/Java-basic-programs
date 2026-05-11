import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows and cols: ");
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] sum = new int[r][c];
        System.out.println("Enter first matrix: ");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) a[i][j] = scanner.nextInt();
        System.out.println("Enter second matrix: ");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) b[i][j] = scanner.nextInt();
        System.out.println("Sum Matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}