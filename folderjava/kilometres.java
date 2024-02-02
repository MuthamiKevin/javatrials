import java.util.Scanner;
public class kilometres {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance traveled in metres:");
        double metres = scanner.nextDouble();

        System.out.print("Enter the time taken in minutes:");
        double time = scanner.nextDouble();

        scanner.close();

        double speedInMetres = metres / time;
        double speedInKM = speedInMetres * 0.06;

        System.out.println("Speed in metres per minute is: " + speedInMetres + " metres per minute ");
        System.out.println("Speed in kilometres per hour is: " + speedInKM + " kilometres per hour ");
    }
}
