import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a (must not be 0): ");
        double a = scanner.nextDouble();
        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be zero.");
            return;
        }

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        int roots = (delta > 0) ? 2 : (delta == 0) ? 1 : 0;

        switch (roots) {
            case 2:
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Two real roots: x1 = %.2f, x2 = %.2f\n", x1, x2);
                break;
            case 1:
                double x = -b / (2 * a);
                System.out.printf("One real root: x = %.2f\n", x);
                break;
            case 0:
                System.out.println("No real roots.");
                break;
            default:
                System.out.println("Unexpected error.");
                break;
        }

        scanner.close();
    }
}
