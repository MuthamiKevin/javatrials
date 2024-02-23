package code;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first:");
        String firstName = scanner();
        System.out.println("First name:" + firstName);
        scanner.close();

    }
}
