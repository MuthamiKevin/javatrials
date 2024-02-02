import java.util.Scanner;

class Cube extends Rectangle
{
   private double height, volume;

   public void in()
   {
      Scanner myScanner = new Scanner(System.in);

      data_in();

      System.out.print("Enter the height: ");
      height = myScanner.nextDouble();
   }

   public void compute()
   {
      data_calculate();
      volume = area * height;
   }

   public void out()
   {
      System.out.println("The volume of the cube is " + volume);
   }
}