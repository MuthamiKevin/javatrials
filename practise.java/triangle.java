import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the triangle:");
        double height = scanner.nextDouble();

        System.out.print("Enter the base of the triangle:");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the hypotenous of the triangle:");
        double hypotenous = scanner.nextDouble();

        scanner.close();

        double area = 0.5 * base * height;
        double perimeter = base + height + hypotenous;

        System.out.println("Area of the triangle:" + area);
        System.out.println("Perimeter of the triangle:" + perimeter);
    }
}
