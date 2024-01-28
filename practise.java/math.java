import java.util.Scanner;
public class math {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number:");
        double number = scanner.nextDouble();

        scanner.close();

        double square = Math.pow(number, 2);
        double cube = Math.pow(number,3);
        double cuberoot = Math.cbrt(number);
        double squareroot = Math.sqrt(number);

        System.out.println("The square is :" + square);
        System.out.println("The cube is :" + cube);
        System.out.println("The cuberoot is :" + cuberoot);
        System.out.println("The square root is :" + squareroot);
    }
    
}
