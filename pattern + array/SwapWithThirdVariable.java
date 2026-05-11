import java.util.Scanner;
public class SwapWithThirdVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a=" + a + ", b=" + b);
    }
}