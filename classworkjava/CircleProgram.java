class CircleProgram
{
   public static void main(String args[])
   {
      Circle circ1 = new Circle();
      Circle circ2 = new Circle();

      System.out.println("\nData entry for circle 1:");
      System.out.println("-----------------------------------------");
      circ1.getData();
      circ1.compute();

      System.out.println("\nData entry for circle 2:");
      System.out.println("-----------------------------------------");
      circ2.getData();
      circ2.compute();

      System.out.println("\nOutput for circle 1:");
      System.out.println("-----------------------------------------");
      circ1.giveOutput();

      System.out.println("\nOutput for circle 2:");
      System.out.println("-----------------------------------------");
      circ2.giveOutput();
   }
}
