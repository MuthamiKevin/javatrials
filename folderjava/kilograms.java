import java.util.Scanner;
public class kilograms {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the weight of the package in gramms: ");
    double gramms = scanner.nextDouble();

    scanner.close();   
    double kilogramms = gramms / 1000; 
    
    System.out.println("The weight of the package in kilogramms is: " + kilogramms + " Kg");
    }
}
