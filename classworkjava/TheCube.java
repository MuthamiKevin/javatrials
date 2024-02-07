import java.util.Scanner;

class TheCube extends TheRectangle
{
   private double height, volume;

   public void dataIn()//override.
   {
      Scanner myScanner = new Scanner(System.in);

      super.dataIn();

      System.out.print("Enter the height: ");
      height = myScanner.nextDouble();
   }

   public void calculate()//override.
   {
      super.calculate();
      volume = area * height;
   }

   public void dataOut()//override.
   {
      System.out.println("The volume of the cube is " + volume);
   }
}