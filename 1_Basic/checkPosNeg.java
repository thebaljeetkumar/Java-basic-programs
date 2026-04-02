import java.util.Scanner;
public class checkPosNeg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check:");
        int var1= sc.nextInt();
        if(var1>0){
            System.out.println("Given number is positive");

        }
        else
            System.out.println("Given number is Negetive");


    }
}
