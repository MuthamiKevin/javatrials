package code;
import java.util.Scanner;

class Input{
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the starting number:");
    int s = scanner.nextInt();
    System.out.print("Enter the ending number");
    int e = scanner.nextInt();
    scanner.close();
    for(int i=s; i<=e; i+=2){
        System.out.println(i);
      

    }

}

}


