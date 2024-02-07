class OverrideOne
{
   public static void main(String args[])
   {
      First obj1 = new First();
      Second obj2 = new Second();

      System.out.println("\nWorking with the first object");
      System.out.println("---------------------------------");
      obj1.greetings();
      obj1.bye();

      System.out.println("\nWorking with the second object");
      System.out.println("---------------------------------");
      obj2.greetings();
      obj2.comment();
      obj2.bye();
   }
}