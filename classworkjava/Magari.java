class Magari
{
   public static void main(String args[])
   {
      Vehicle personal = new Vehicle();
      Matatu mat = new Matatu();

      System.out.println("\nData entry for personal car: ");
      System.out.println("---------------------------------------------");
      personal.v_input();

      System.out.println("\nData entry for the matatu: ");
      System.out.println("---------------------------------------------");
      mat.m_input();

      System.out.println("\nAnalysis for the personal car: ");
      System.out.println("---------------------------------------------");
      personal.v_output();

      System.out.println("\nAnalysis for the matatu: ");
      System.out.println("---------------------------------------------");
      mat.m_output();
   }
}

