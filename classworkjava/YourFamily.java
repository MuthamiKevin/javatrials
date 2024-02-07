//program to accept names of family members
//illustrates the use of static to come up with class variables

import java.util.Scanner;

class Family
{
   private static String surname;
   private String firstName;
   private int yearOfBirth;

   public static void getSurname()
   {
      Scanner myScanner = new Scanner(System.in);

      System.out.print("Enter the family's surname:> ");
      surname = myScanner.nextLine();
   }

   public void datain()
   {
      Scanner myScanner = new Scanner(System.in);

      System.out.print("Enter the name:> ");
      firstName = myScanner.nextLine();
      System.out.print("Enter the year of birth:> ");
      yearOfBirth = myScanner.nextInt();
   }

   public void dataout()
   {
      System.out.println("Name: " + firstName + " " + surname);
      System.out.println("Year of Birth: " + yearOfBirth);
   }
}
  
class YourFamily
{ 
   public static void main(String args[])
   {
      Family father = new Family();
      Family mother = new Family();
      Family you = new Family();

      /*System.out.println("\nFamily Name Input:");
      System.out.println("--------------------------------------");
      Family.getSurname();*/

      System.out.println("\nData input for your father:");
      System.out.println("--------------------------------------");
      father.datain();

      System.out.println("\nData input for your mother:");
      System.out.println("--------------------------------------");
      mother.datain();

      System.out.println("\nData input for you:");
      System.out.println("--------------------------------------");
      you.datain();

      System.out.println("\nFather's Data:");
      System.out.println("--------------------------------------");
      father.dataout();

      System.out.println("\nMother's Data:");
      System.out.println("--------------------------------------");
      mother.dataout();

      System.out.println("\nYour Data:");
      System.out.println("--------------------------------------");
      you.dataout();
   }
} 
