import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**** Jamal and Daughters Pub ****");
        System.out.println("Beer Brand -      Price:");
        System.out.println("1. Tusker -       100/=");
        System.out.println("2. Plisner -      120/=");
        System.out.println("3. Smirnoff ice - 140/=");
        System.out.println("4. White Cap -    190/=");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the quantity you want: ");
        int quantity = scanner.nextInt();

        scanner.close();

        double totalCost = 0.0;
        if (choice == 1) {
            totalCost = quantity * 100;
        } else if (choice == 2) {
            totalCost = quantity * 120;
        } else if (choice == 3) {
            totalCost = quantity * 140;
        } else if (choice == 4) {
            totalCost = quantity * 190;
        } else {
            System.out.println("Error: Invalid choice. Please choose 1, 2, 3, or 4.");
            return; 
        }
        System.out.println("Total Cost: $" + totalCost);
    }
}
