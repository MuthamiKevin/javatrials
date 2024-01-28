import java.util.Scanner;
public class kmtometres {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the measurements in kilometres:");
        double km = scanner.nextDouble();

        scanner.close();

        double metres = km * 1000;

        System.out.println("Measurement in metres is: " + metres + " metres ");
    }
    
}
