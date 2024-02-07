import java.util.Scanner;

class PartTimeStudent extends TheStudent
{
   private String employerName, dateOfEmployment, employmentMode;

   public void ptsInput()
   {
      Scanner myScanner = new Scanner(System.in);

      sInput();

      System.out.print("Enter his/her employer: ");
      employerName = myScanner.nextLine();
      System.out.print("Enter his/her date of employment: ");
      dateOfEmployment = myScanner.nextLine();
      System.out.print("Enter his/her employment mode [permanent/contract/casual]: ");
      employmentMode = myScanner.nextLine();
   }

   public void ptsOutput()
   {
      sOutput();

      System.out.println("Name of Employer: " + employerName);
      System.out.println("Date of Employment: " + dateOfEmployment);
      System.out.println("Employment Mode: " + employmentMode);
   }
}