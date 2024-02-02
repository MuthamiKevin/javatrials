import java.util.Scanner;

class Matatu extends Vehicle
{
   private String route;
   private int speed_limit,passengers;

   public void m_input()
   {
      Scanner myScanner = new Scanner(System.in);

      v_input();

      System.out.print("Enter the matatu's route: ");
      route = myScanner.nextLine();
      System.out.print("Enter its speed limit: ");
      speed_limit = myScanner.nextInt();
      System.out.print("Enter the maximum number of passengers: ");
      passengers = myScanner.nextInt();
   }
  
   void m_output()
   {
	v_output();
	System.out.println("Route: " + route);
	System.out.println("Speed Limit: " + speed_limit + " km/h");
	System.out.println("No of passengers: " + passengers);
   }
}