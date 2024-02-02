import java.util.Scanner;

class Mtu
{
   private int age;

   public int getAge()
   {
      return age;
   }

   public void setAge(int ag)
   {
      age = ag;
   }
}

public class AgeProgram
{
   public static void main(String args[])
   {
      Scanner myScanner = new Scanner(System.in);

      Mtu m1 = new Mtu();
      Mtu m2 = new Mtu();
      int theAge1, theAge2;

      m1.setAge(23);

      System.out.print("\nEnter the age for the second person:> ");
      theAge2 = myScanner.nextInt();
      m2.setAge(theAge2);

      theAge1 = m1.getAge();

      System.out.println("\nThe first person is " + theAge1 + " years old.");
      System.out.println("The second person is " + m2.getAge() + " years old.");
   }
}