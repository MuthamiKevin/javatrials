package code;

import java.util.Scanner;

public class divisbility{
    public static void main(String []args){
      Scanner scanner = new Scanner(System.in);
      int[] marks = new int[10];
      int i;

      for(i=0;i<=10;i++){
        System.out.print("Enter the element" + (i) + ":");
        marks[i] = scanner.nextInt();
      }
      for(i=0;i<=10;i++){
        System.out.println(marks[i]);
      }
        
      
    }
}
