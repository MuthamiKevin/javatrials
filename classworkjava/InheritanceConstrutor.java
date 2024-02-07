class Games
{
   public Games()
   {
      System.out.println("Hello from the Games constructor.");
   }
}

class FootBall extends Games
{
   public FootBall()
   {
      System.out.println("Hello from the FootBall constructor.");
   }
}

class InheritanceConstrutor
{
   public static void main(String args[])
   {
      FootBall manunited = new FootBall();
      //Other code goes here.
   }
}