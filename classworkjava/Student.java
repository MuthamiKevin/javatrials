import java.util.Scanner;

class Student
{
   private String adm_no, name;
   private int no_of_units;
   private double fee_paid;

   public void input()
   {
      Scanner myScanner = new Scanner(System.in);

      System.out.print("Enter the student's admission number: ");
      adm_no = myScanner.nextLine();
      System.out.print("Enter his/her name: ");
      name = myScanner.nextLine();
      System.out.print("Enter the number of units he/she is doing: ");
      no_of_units = myScanner.nextInt();
      System.out.print("Enter the fee he/she has paid: ");
      fee_paid = myScanner.nextDouble();
   }

   public void output()
   {
      System.out.println("Admission Number: " + adm_no);
      System.out.println("Name: " + name);
      System.out.println("No of Units: " + no_of_units);
      System.out.println("Fee Paid: " + fee_paid);
   }

   public static void main(String args[])
   {
      Student stud1 = new Student();

      System.out.println("\nData entry for the student:");
      System.out.println("--------------------------------------------");
      stud1.input();

      System.out.println("\nData analysis for the student:");
      System.out.println("--------------------------------------------");
      stud1.output();
   }
}