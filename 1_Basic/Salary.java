import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Basic pay: ");
        double basic = in.nextDouble();
        
        System.out.print("HRA: ");
        double hra = in.nextDouble();
        
        System.out.print("DA: ");
        double da = in.nextDouble();
        
        System.out.print("PF: ");
        double pf = in.nextDouble();
        
        System.out.print("Tax: ");
        double tax = in.nextDouble();
        
        // calculate net: basic + allowances - deductions
        double net = basic + (hra + da) - (pf + tax);
        
        System.out.println("\nSalary breakdown:");
        System.out.println("Basic: " + basic);
        System.out.println("Total Allowances: " + (hra + da));
        System.out.println("Total Deductions: " + (pf + tax));
        System.out.println("Net pay: " + net);
        
        in.close();
    }
}
