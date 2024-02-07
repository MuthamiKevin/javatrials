class TheShapes
{
   public static void main(String args[])
   {
      TheRectangle rect1 = new TheRectangle();
      TheCube cub1 = new TheCube();

      System.out.println("\nInput for the rectangle:");
      System.out.println("-----------------------------------------");
      rect1.dataIn();
      rect1.calculate();

      System.out.println("\n\nInput for the Cube:");
      System.out.println("-----------------------------------------");
      cub1.dataIn();
      cub1.calculate();

      System.out.println("\n\nAnalysis for the rectangle:");
      System.out.println("-----------------------------------------");
      rect1.dataOut();

      System.out.println("\n\nAnalysis for the Cube:");
      System.out.println("-----------------------------------------");
      cub1.dataOut();
   }
}