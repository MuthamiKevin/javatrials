class OverloadNum
{
   int first, second, third;

   public void setData(int x, int y)
   {
      first = x;
      second = y;
   }

   public void setData(int x,int y,int z)
   {
      first = x;
      second = y;
      third = z;
   }

   public void output()
   {
      System.out.println("First Number = " + first);
      System.out.println("Second Number = " + second);
      System.out.println("Third Number = " + third);
   }
}