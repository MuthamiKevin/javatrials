import java.util.Scanner;

class Worker
{
   private String name,department;

   public void input()
   {
      Scanner myScanner = new Scanner(System.in);

      System.out.print("Enter the employee's name:> ");
      name = myScanner.nextLine();
      System.out.print("Enter his/her department:> ");
      department = myScanner.nextLine();
   }

   public void dataout()
   {
      System.out.println("Name: " + name);
      System.out.println("Department: " + department);
   }
}

class NairobiLTD
{
   public static void main(String args[])
   {
      Worker wk1 = new Worker();
      boolean resp;

      System.out.println("\nThe object belongs to a class called " + wk1.getClass().getName());

      resp = wk1 instanceof Worker;
      System.out.println("Does the object belongs to a class called Worker? " + resp);
   }
}