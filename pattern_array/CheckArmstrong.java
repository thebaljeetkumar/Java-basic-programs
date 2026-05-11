import java.util.Scanner;
public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int original = num, sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        if (original == sum) System.out.println(original + " is an Armstrong number.");
        else System.out.println(original + " is not an Armstrong number.");
    }
}