import java.util.Scanner;

public class CompoundInterestCalculator {
    // A= P[1+r/n]^nt : formula for calculating compound interest
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal; // P
        double rate; // r
        int timesCompounded; // n
        int years; // t
        double amount; // A

        System.out.print("Enter the principal amount:");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %) :");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the no. of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the no. of  years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.println("The amount after " + years + "is: $ " + amount);

        scanner.close();
    }

}
