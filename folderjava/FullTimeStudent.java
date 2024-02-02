import java.util.Scanner;

class FullTimeStudent extends TheStudent
{
   private String guardiansName, guardiansTelNo;

   public void ftsInput()
   {
      Scanner myScanner = new Scanner(System.in);

      sInput();

      System.out.print("Enter the name of the student's guardian: ");
      guardiansName = myScanner.nextLine();
      System.out.print("Enter guardian's telephone number: ");
      guardiansTelNo = myScanner.nextLine();
   }

   public void ftsOutput()
   {
      sOutput();

      System.out.println("Guardian's Name: " + guardiansName);
      System.out.println("Guardians Telephone Number: " + guardiansTelNo);
   }
}