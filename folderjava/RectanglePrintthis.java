import java.util.Scanner;

class Rectangle
{
   private double width, length, area, perimeter;

   public Rectangle(double wid,double len)
   {
      width = wid;
      length = len;
   }

   public Rectangle()
   {
      width = 1;
      length = 1;
   }

   public void datain()
   {
      Scanner myScanner = new Scanner(System.in);

      System.out.print("Enter the width of the rectangle -> ");
      width = myScanner.nextDouble();
      System.out.print("Enter the length of the rectangle -> ");
      length = myScanner.nextDouble();
   }

   public void calculate()
   {
      area = width * length;
      perimeter = 2 * (width + length);
   }
 
   public void print()
   {
      System.out.println(this);
   }

   public String toString()
   {
      String theData;

      theData = "Width = " + width;
      theData += "\nLength = " + length;
      theData += "\nArea = " + area;
      theData += "\nPerimeter = " + perimeter;

      return theData;
   }
}

class RectanglePrintthis
{
   public static void main(String args[])
   {
      Rectangle rect1 = new Rectangle(6,10);
      Rectangle rect2 = new Rectangle();

      System.out.println("\nOutput for rectangle 1:");
      System.out.println("-----------------------------------------");
      rect1.calculate();
      rect1.print();

      System.out.println("\nOutput for rectangle 2:");
      System.out.println("-----------------------------------------");
      rect2.calculate();
      rect2.print();

      System.out.println("\nInput for rectangle 1:");
      System.out.println("-----------------------------------------");
      rect1.datain();
      rect1.calculate();

      System.out.println("\nOutput for rectangle 1 [Second Time]:");
      System.out.println("-----------------------------------------");
      rect1.print();
   }
}