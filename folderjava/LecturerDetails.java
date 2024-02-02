import java.util.Scanner;

class Lecturer
{
   private String firstName, lastName;
   private int yearsOfExperince;

   public Lecturer(String fName, String lName,int years)
   {
      firstName = fName;
      lastName = lName;
      yearsOfExperince = years;
   }

   public Lecturer(String fName, String lName)
   {
      firstName = fName;
      lastName = lName;
   }

   public Lecturer()//Default Constructor
   {
      firstName = "";
      lastName = "";
      yearsOfExperince = 0;
   }

   public void input()
   {
      Scanner myScanner = new Scanner(System.in);

      System.out.print("Enter the lecturer's first name:> ");
      firstName = myScanner.nextLine();
      System.out.print("Enter his/her last name:> ");
      lastName = myScanner.nextLine();
      System.out.print("Enter his/her experience (number of years):> ");
      yearsOfExperince = myScanner.nextInt();
   }

   public void output()
   {
      System.out.println("First Name: " + firstName);
      System.out.println("Last Name: " + lastName);
      System.out.println("Years of Experience: " + yearsOfExperince);
   }
}

class LecturerDetails
{
   public static void main(String args[])
   {
      Lecturer lect1 = new Lecturer("John", "Maina",42);
      Lecturer lect2 = new Lecturer("Edwin", "Muruka");
      Lecturer lect3 = new Lecturer();

      System.out.println("\nData output for lecturer 1:");
      System.out.println("-----------------------------------------");
      lect1.output();

      System.out.println("\nData output for lecturer 2:");
      System.out.println("-----------------------------------------");
      lect2.output();

      System.out.println("\nData output for lecturer 3:");
      System.out.println("-----------------------------------------");
      lect3.output();

      System.out.println("\nData input for lecturer 3:");
      System.out.println("-----------------------------------------");
      lect3.input();

      System.out.println("\nData output for lecturer 3 [Second Time]:");
      System.out.println("-----------------------------------------");
      lect3.output();
   }
}