import java.util.Scanner;
public class vote {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your age:");
            int age = scanner.nextInt();

        scanner.close();
        if (age >= 18) {
            System.out.println("You can vote.");   
        }
        else{
            System.out.println("You are to young to vote.");
        }
            
    }
    
}
