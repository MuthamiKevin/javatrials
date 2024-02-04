class ArrayNumOne
{
   public static void main(String args[])
   {
      int[] numbers = new int[5];
      int i;

      numbers[0] = 10;
      numbers[1] = 25;
      numbers[2] = 32;
      numbers[3] = 15;
      numbers[4] = 95;

      System.out.println("\nThe values in the array are:-\n");
      for(i = 0;i < 5;i++)
         System.out.println(numbers[i]);
   }
}
