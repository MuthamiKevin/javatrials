import java.util.Scanner;

class TheRectangle
{
   protected double width,length,area;

   public void dataIn()
   {
      Scanner myScanner = new Scanner(System.in);

      System.out.print("Enter the width: ");
      width = myScanner.nextDouble();
      System.out.print("Enter the length: ");
      length = myScanner.nextDouble();
   }

   public void calculate()
   {
      area = width * length;
   }

   public void dataOut()
   {
      System.out.println("The area of the rectangle is " + area);
   }
}