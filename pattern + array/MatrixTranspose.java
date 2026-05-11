import java.util.Scanner;
public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows and cols: ");
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter matrix: ");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) matrix[i][j] = scanner.nextInt();
        System.out.println("Transposed Matrix: ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) System.out.print(matrix[j][i] + " ");
            System.out.println();
        }
    }
}