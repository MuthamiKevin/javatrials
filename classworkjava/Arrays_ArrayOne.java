class ArrayOne
{
   public static void main(String args[])
   {
      String[] jina = new String[4];
      int i;

      jina[0] = "John";
      jina[1] = "Alex";
      jina[2] = "Alice";
      jina[3] = "Atieno";

      System.out.println("\nThe names in the array are:-");
      for(i = 0;i < 4;i++)
         System.out.println(jina[i]);
   }
}
