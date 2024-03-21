import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number (firstNumberMatthew): ");
        float firstNumberMatthew = scanner.nextFloat();
        System.out.println("Enter the second number (secondNumberMatthew): ");
        float secondNumberMatthew = scanner.nextFloat();

        float sum = firstNumberMatthew + secondNumberMatthew;
        float difference = firstNumberMatthew - secondNumberMatthew;
        float product = firstNumberMatthew * secondNumberMatthew;
        float quotient = 0;
        boolean canDivide = secondNumberMatthew != 0;

        if (canDivide) {
            quotient = firstNumberMatthew / secondNumberMatthew;
        }

        System.out.println("Results:");
        System.out.printf("Sum: %.2f\n", sum);
        System.out.printf("Difference: %.2f\n", difference);
        System.out.printf("Product: %.2f\n", product);

        if (canDivide) {
            System.out.printf("Quotient: %.2f\n", quotient);
        } else {
            System.out.println("Quotient: Undefined (division by zero)");
        }

        scanner.close();
    }
}