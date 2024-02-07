import java.util.Scanner;

class ArrayNumbers
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      int[] numbers = new int[10];
      int i;

      for(i = 0;i < 10;i++)
      {
         System.out.print("Enter element " + (i + 1) + ":> ");
         numbers[i] = myScanner.nextInt();
      }

      System.out.println("\nThe values you entered were:-\n");
      for(i = 0;i < 10;i++)
         System.out.print(numbers[i] + " ");
   }
}
