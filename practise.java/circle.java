import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius:");
        double radius = scanner.nextDouble();

        scanner.close();

        double areaResult = radius * radius * Math.PI;
        double circumferenceResult = radius * 2 * Math.PI;

        System.out.println("Area:" + areaResult);
        System.out.println("Circumference:" + circumferenceResult);


    }
    
}
