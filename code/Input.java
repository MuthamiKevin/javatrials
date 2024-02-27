package code;
import java.util.Scanner;
class Input{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
 

        System.out.print("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns:");
        int columns = scanner.nextInt();
        System.out.print("Enter the symbol to use:");
        String symbol = scanner.next();

        scanner.close();

        for(int i=1; i<=rows; i++){
            System.out.println();
            for(int j=1; j<=columns; j++){
                System.out.print(symbol);

            }
        }
    }
}