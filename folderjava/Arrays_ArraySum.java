import java.util.Scanner;

class ArraySum
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      double[] numbers;
      double sum = 0, avg, largest, smallest;
      int i, all;

      System.out.print("How many numbers do you want to work with? ");
      all = myScanner.nextInt();

      numbers = new double[all];

      for(i = 0;i < all;i++)
      {
         System.out.print("Enter element " + (i + 1) + ":> ");
         numbers[i] = myScanner.nextDouble();
      }

      largest = smallest = numbers[0];

      for(i = 0;i < all;i++)
      {
         sum = sum + numbers[i];
         if(numbers[i] > largest)
            largest = numbers[i];
         else if(numbers[i] < smallest)
            smallest = numbers[i];
      }

      avg =  sum / all;

      System.out.println("\nThe values you entered are:-\n");
      for(i = 0;i < all;i++)
         System.out.print(numbers[i] + " ");

      System.out.println("\n\nTheir sum is " + sum);
      System.out.println("Their average is " + avg);
      System.out.println("The largest number is " + largest);
      System.out.println("The smallest number is " + smallest);
   }
}
