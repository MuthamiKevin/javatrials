import java.util.Scanner;

class ArrayMarks
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      double[] marks = new double[10];
      double sum = 0, avg;
      int i;

      for(i = 0;i < 10;i++)
      {
         System.out.print("Enter the marks for student " + (i + 1) + ":> ");
         marks[i] = myScanner.nextDouble();
         sum = sum + marks[i];
      }

      avg =  sum / 10;

      System.out.println("\nAnalysis of the performance:-\n");
      for(i = 0;i < 10;i++)
         System.out.println("Student " + (i + 1) + ": " +marks[i] + " ");

      System.out.println("\n\nThe total mark is " + sum);
      System.out.println("The average mark is " + avg);
   }
}
