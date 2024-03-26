package code;

import java.util.Scanner;

public class divisbility{
    public static void main(String []args){
      Scanner scanner = new Scanner(System.in);
      int [] num = new int[10];
      int i,avg, sum=0;

      for(i=0; i<=9; i++){
        System.out.println("Enter the " +  (i) + " element : " );
        num[i] = scanner.nextInt();
        sum = sum+num[i];
      }
        
        avg=sum/10;
        for(i=0;i<=9;i++)
            System.out.println(num[i]);
        System.out.println(sum);
        System.out.println(avg);
        
           

        
      
    }
}
