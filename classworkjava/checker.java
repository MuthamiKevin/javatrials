import java.util.Scanner;

public class checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number % 9 == 0 && number % 2 == 0) {
            System.out.println(number + " is evenly divisible by 9 and even.");
        } else {
            System.out.println(number + " is not evenly divisible by 9 or not even.");
        }
    }
}

