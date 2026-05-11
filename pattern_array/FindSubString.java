import java.util.Scanner;
public class FindSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Enter substring to find: ");
        String sub = scanner.nextLine();
        if (str.contains(sub)) System.out.println("Substring found.");
        else System.out.println("Substring not found.");
    }
}