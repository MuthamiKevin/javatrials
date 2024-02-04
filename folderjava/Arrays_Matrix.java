import java.util.Scanner;

class Matrix
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);
      int[][] mtx = new int[3][4];
      int i,j;

      for(i = 0;i < 3;i++)
      {
         for(j = 0;j < 4;j++)
         {
            System.out.print("Enter element (" + (i + 1) + "," + (j + 1) + ") :> ");
            mtx[i][j] = myScanner.nextInt();
         }
      }

      System.out.println("\nThe matrix is:\n");

      for(i = 0;i < 3;i++)
      {
         for(j = 0;j < 4;j++)
         {
            System.out.print(mtx[i][j] + " ");
         }
         System.out.println();
      }
   }
}