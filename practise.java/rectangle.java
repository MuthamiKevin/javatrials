import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length:");
        double length = scanner.nextDouble();

        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        
        scanner.close();

        double areaResult = length * width;
        double perimeterResult = (length + width) * 2;

        System.out.println("Area:"  + areaResult);
        System.out.println("Perimeter:" + perimeterResult); 
    }
}
