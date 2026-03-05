import java.util.Scanner;

class Average {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            sum = sum + num;
        }

        double average = (double) sum / n;

        System.out.println("Average = " + average);
    }
}