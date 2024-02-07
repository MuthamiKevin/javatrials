class MyBike
{
   public static void main (String args[]) 
   {
       Motorcycle m = new Motorcycle();

       m.setValues("Yamaha RZ350","yellow");
      
       System.out.println("\nCalling showAtts...");
       System.out.println("---------------------------------------------------");
       m.showAtts();

       System.out.println("\nStarting engine...");
       System.out.println("---------------------------------------------------");
       m.startEngine();

       System.out.println("\nCalling showAtts...");
       System.out.println("---------------------------------------------------");
       m.showAtts();

       System.out.println("\nStarting engine...");
       System.out.println("---------------------------------------------------");
       m.startEngine();
   }
}
