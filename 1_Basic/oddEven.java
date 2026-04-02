import java.util.Scanner;
public class oddEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check:");
        int var1 = sc.nextInt();
        if(var1%2==0){
            System.out.println("Given number is Even.");
        }
        else
            System.out.println("Given number is Odd.");
    }
}
