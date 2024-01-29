import java.util.Scanner;
public class numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number:");
        double num2 = scanner.nextDouble();

        scanner.close();

        double result;
        if(num1 > num2){
            result = num1 - num2;
        }else if(num2 > num1){
            result = num1 / num2;
        }else{
            result = num1 + num2;
        }

        System.out.println("The result is:" + result);
    }
}
