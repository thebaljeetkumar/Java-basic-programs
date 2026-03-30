import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        int r = sc.nextInt();

        System.out.println("Area of the Circle: " + area(r));

        sc.close();
    }

    static double area(int r){
        return Math.PI * r * r;
    }
}