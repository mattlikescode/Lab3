import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight in kilograms: ");
        float weightMatthew = scanner.nextFloat();

        System.out.println("Enter your height in meters: ");
        float heightMatthew = scanner.nextFloat();

        float bmi = weightMatthew / (float) Math.pow(heightMatthew, 2);

        String category;
        if (bmi < 16) category = "starvation";
        else if (bmi >= 16 && bmi <= 16.99) category = "emaciation";
        else if (bmi >= 17 && bmi <= 18.49) category = "underweight";
        else if (bmi >= 18.50 && bmi <= 22.99) category = "normal, low range";
        else if (bmi >= 23 && bmi <= 24.99) category = "normal, high range";
        else if (bmi >= 25 && bmi <= 27.49) category = "overweight, low range";
        else if (bmi >= 27.50 && bmi <= 29.99) category = "overweight, high range";
        else if (bmi >= 30 && bmi <= 34.9) category = "1st degree obesity";
        else if (bmi >= 35 && bmi <= 39.9) category = "2nd degree obesity";
        else category = "3rd degree obesity";

        System.out.println("Your BMI is: " + String.format("%.2f", bmi));
        System.out.println("You are: " + category);

        scanner.close();
    }
}
