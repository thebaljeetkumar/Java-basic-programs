import java.util.Scanner;
public class CalculateSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter basic salary: ");
        double basic = scanner.nextDouble();
        double hra = 0.2 * basic;
        double da = 0.5 * basic;
        double ta = 0.1 * basic;
        double pf = 0.12 * basic;
        double grossSalary = basic + hra + da + ta - pf;
        System.out.println("Net Salary: " + grossSalary);
    }
}