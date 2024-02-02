class Shapes
{
   public static void main(String args[])
   {
      Rectangle rect1 = new Rectangle();
      Cube cub1 = new Cube();

      System.out.println("\nInput for the rectangle:");
      System.out.println("-----------------------------------------");
      rect1.data_in();
      rect1.data_calculate();

      System.out.println("\n\nInput for the Cube:");
      System.out.println("-----------------------------------------");
      cub1.in();
      cub1.compute();

      System.out.println("\n\nAnalysis for the rectangle:");
      System.out.println("-----------------------------------------");
      rect1.data_out();

      System.out.println("\n\nAnalysis for the Cube:");
      System.out.println("-----------------------------------------");
      cub1.out();
   }
}