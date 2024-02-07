import java.util.Scanner;

class MatrixInitialize
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      int[][] data = {{8,7,4,5},{6,3,8,9},{8,2,6,9}};
      int i,j,sum = 0;
      double avg;

      for(i = 0;i < 3;i++)
      {
         for(j = 0;j < 4;j++)
         {
            sum = sum + data[i][j];
         }
      }

      avg = sum / 12.0;

      System.out.println("\nThe matrix is:\n");

      for(i = 0;i < 3;i++)
      {
         for(j = 0;j < 4;j++)
         {
            System.out.print(data[i][j] + " ");
         }
         System.out.println();
      }

      System.out.println("\nThe sum of the elements is " + sum);
      System.out.println("Their average is " + avg);
   }
}