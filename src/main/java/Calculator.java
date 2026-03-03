import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Scientific Calculator ---");
            System.out.println("1. Square root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural logarithm (ln(x))");
            System.out.println("4. Power function (x^b)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Result: " + squareRoot(num1));
                    break;
                case 2:
                    System.out.print("Enter a non-negative integer: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Result: " + factorial(num2));
                    break;
                case 3:
                    System.out.print("Enter a positive number: ");
                    double num3 = scanner.nextDouble();
                    System.out.println("Result: " + naturalLog(num3));
                    break;
                case 4:
                    System.out.print("Enter base (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent (b): ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + power(base, exponent));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
        scanner.close();
    }

    public static double squareRoot(double x) {
        if (x < 0) throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        return Math.sqrt(x);
    }

    public static long factorial(int x) {
        if (x < 0) throw new IllegalArgumentException("Cannot calculate factorial of a negative number.");
        long fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double naturalLog(double x) {
        if (x <= 0) throw new IllegalArgumentException("Logarithm only defined for positive numbers.");
        return Math.log(x);
    }

    public static double power(double x, double b) {
        return Math.pow(x, b);
    }
}
