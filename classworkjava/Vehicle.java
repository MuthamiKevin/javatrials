import java.util.Scanner;

class Vehicle
{
   protected String make, countryOfManuf;
   protected int yearOfManuf;

   public void v_input()
   {
      Scanner myScanner = new Scanner(System.in);

      System.out.print("Enter the make of the Vehicle: ");
      make = myScanner.nextLine();
      System.out.print("Enter the country of manufacture: ");
      countryOfManuf = myScanner.nextLine();
      System.out.print("Enter its year of manufacture: ");
      yearOfManuf = myScanner.nextInt();
   }

   public void v_output()
   {
      System.out.println("Make of the Vehicle: " + make);
      System.out.println("Country of Manufacture: " + countryOfManuf);
      System.out.println("Year of Manufacture: " + yearOfManuf);
   }
}
