class OverloadExample
{
   public static void main(String args[])
   {
      OverloadNum set1 = new OverloadNum();
      OverloadNum set2 = new OverloadNum();

      set1.setData(12,52);
      set2.setData(89,7,76);

      System.out.println("\nData output for set 1:");
      System.out.println("-------------------------");
      set1.output();

      System.out.println("\nData output for set 2:");
      System.out.println("-------------------------");
      set2.output();
   }
}
