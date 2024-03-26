package code;
import java.util.Scanner;

public class numm {
    
    /**
     * @param args
     */
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter ther a");
        a=scanner.nextInt();
        System.out.println("Enter ther b");
        b=scanner.nextInt();
        System.out.println("Enter ther c");
        c=scanner.nextInt();
        
        System.out.println(Math.min(a,b));
}
}