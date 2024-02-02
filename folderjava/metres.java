import java.util.Scanner;
public class metres {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter measurements in centimetres:");
        double centimetres = scanner.nextDouble();

        scanner.close();

        double metres = centimetres / 100;

        System.out.println(centimetres + " cm = " + metres + " metres ");
        System.out.println("Measurement in metres is:" + metres + " metres " );
    }
    
}
