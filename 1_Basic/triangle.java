import java.util.Scanner;
public class triangle {
    public static void main(String [] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the Hight:");
    int H= sc.nextInt();
    System.out.println("Enter the Base:");
    int B= sc.nextInt();
    System.out.println("Area of Triange is "+ area(H,B));

    }
    static double area(int B, int H){
        return 0.5*B*H;
    }
}
