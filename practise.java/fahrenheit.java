import java.util.Scanner;
public class fahrenheit {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in degree celcius:");
        double degrees = scanner.nextDouble();

        scanner.close();

        double fahrenheit = (degrees * 1.8) + 32;

    System.out.println(degrees + " C = " + fahrenheit + " fahrenheit ");
    System.out.println("Degrees celcius in fahrenheit is:" + fahrenheit + " fahrenheit ");

    }
}