import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operator:");
        char operator = scanner.next().charAt(0);

        scanner.close();

        double result;
        if (operator == '+'){
            result = (num1 + num2);
        }else if (operator == '-'){
            result = (num1 - num2);
        }else if (operator == '*'){
            result = (num1 * num2);
        }else if (operator == '/'){
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
        }else if (operator == '%'){
            if (num2 != 0) {
                result = num1 % num2;
            } else {
                System.out.println("Error: Modulus by zero is not allowed.");
                return;
            }
        }else{
            System.out.println("Error: Invalid operator. Please enter +, -, *, /, or %.");
            return;
        }
        System.out.println("Result: " + result);
    }
}