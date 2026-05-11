import java.util.Scanner;
public class StringPalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) rev += str.charAt(i);
        if (str.equals(rev)) System.out.println("It is a palindrome.");
        else System.out.println("It is not a palindrome.");
    }
}