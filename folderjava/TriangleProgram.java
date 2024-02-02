class TriangleProgram
{
   public static void main(String args[])
   {
      Triangle tri = new Triangle();

      System.out.println("\nData entry for triangle:");
      System.out.println("-----------------------------------------");
      tri.input();
      tri.calculate();

      System.out.println("\nOutput for the triangle:");
      System.out.println("-----------------------------------------");
      tri.output();
   }
}