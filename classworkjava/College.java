class College
{
   public static void main(String args[])
   {
      PartTimeStudent stud1 = new PartTimeStudent();
      FullTimeStudent stud2 = new FullTimeStudent();

      System.out.println("\nData entry for Student 1 [Part Time Student]: ");
      System.out.println("---------------------------------------------");
      stud1.ptsInput();

      System.out.println("\nData entry for Student 2 [Full Time Student]: ");
      System.out.println("---------------------------------------------");
      stud2.ftsInput();

      System.out.println("\nAnalysis for Student 1 [Part Time Student]: ");
      System.out.println("---------------------------------------------");
      stud1.ptsOutput();

      System.out.println("\nAnalysis for Student 2 [Full Time Student]: ");
      System.out.println("---------------------------------------------");
      stud2.ftsOutput();
   }
}

