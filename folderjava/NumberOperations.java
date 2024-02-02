import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        scanner.close();

        double sumResult = num1 + num2 + num3;
        double productResult = num1 * num2 * num3;
        double averageResult = sumResult / 3;

        System.out.println("Sum: " + sumResult);
        System.out.println("Product: " + productResult);
        System.out.println("Average: " + averageResult);
    }
}
