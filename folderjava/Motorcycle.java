class Motorcycle 
{
   private String make;
   private String colour;
   private boolean engineState;
 
   public void setValues(String theMake,String theColour,boolean theState)
   {
      make = theMake;
      colour = theColour;
      engineState = theState;
   }

   public void setValues(String theMake,String theColour)
   {
      make = theMake;
      colour = theColour;
   }

   public void startEngine() 
   {
       if (engineState == true)
            System.out.println("The engine is already on.");
       else 
       {
            engineState = true;
            System.out.println("The engine is now on.");
       }
   }
    
   public void showAtts() 
   {
       System.out.println("This motorcycle is a " + colour + " " + make);
       if (engineState == true)
           System.out.println("The engine is on.");
       else 
	   System.out.println("The engine is off.");
   }
}