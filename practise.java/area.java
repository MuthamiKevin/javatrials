import java.util.Scanner;

public class area{
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geometry Calculator");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Right-Angled Triangle");

        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = scanner.nextInt();

        double area, perimeter;

        switch (choice) {
            case 1:
                // Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();

                area = length * width;
                perimeter = 2 * (length + width);

                System.out.println("Rectangle:");
                System.out.println("Dimensions: Length = " + length + ", Width = " + width);
                break;

            case 2:
                // Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();

                area = Math.PI * Math.pow(radius, 2);
                perimeter = 2 * Math.PI * radius;

                System.out.println("Circle:");
                System.out.println("Radius = " + radius);
                break;

            case 3:
                // Right-Angled Triangle
                System.out.print("Enter the base of the right-angled triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the right-angled triangle: ");
                double height = scanner.nextDouble();

                area = 0.5 * base * height;
                perimeter = base + height + Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));

                System.out.println("Right-Angled Triangle:");
                System.out.println("Base = " + base + ", Height = " + height);
                break;

            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
            return;
        }

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        scanner.close();
    }
}
