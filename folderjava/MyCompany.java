class MyCompany
{
   public static void main(String args[])
   {
      Employee emp1 = new Employee();

      System.out.println("\nData entry for the employee:");
      System.out.println("--------------------------------------------");
      emp1.input();
      emp1.compute();

      System.out.println("\nData analysis for the employee:");
      System.out.println("--------------------------------------------");
      emp1.output();
   }
}