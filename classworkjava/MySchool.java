import java.util.Scanner;

class Mangu
{
   private String adm_no, name;
   private double marks;

   public void check()
   {
     if(marks >= 50)
         System.out.println("This Student has passed.");
      else
         System.out.println("This student has failed.");
   }

   public void dataout()
   {
      System.out.println("Adm No :> " + adm_no);
      System.out.println("Name   :> " + name);
      System.out.println("Marks  :> " + marks);
   }

   public void set(String adm,String the_name,double mks)
   {
      adm_no = adm;
      name = the_name;
      marks = mks;
   }

   public void datain()
   {
      Scanner myScanner = new Scanner(System.in);

      System.out.print("Enter the student's admission number: ");
      adm_no = myScanner.nextLine();
      System.out.print("Enter his/her name: ");
      name = myScanner.nextLine();
      System.out.print("Enter the marks he/she scored: ");
      marks = myScanner.nextDouble();
   } 
}

class MySchool
{
   public static void main(String args[])
   {
      Mangu stud1 = new Mangu();
      Mangu stud2 = new Mangu();
      Mangu stud3 = new Mangu();
 
      stud1.set("DIT-001-3456/2000","Antony Kirui",89);
      stud2.set("CIT-001-4256/2000","Jacinta Wairimu",36);
      
      System.out.println("Analysis for the first student.");
      System.out.println("-------------------------------------------------");
      stud1.dataout();
      stud1.check();

      System.out.println("\nAnalysis for the second student.");
      System.out.println("-------------------------------------------------");
      stud2.dataout();
      stud2.check();

      System.out.println("\nData input for the third student.");
      System.out.println("-------------------------------------------------");
      stud3.datain();

      System.out.println("\nAnalysis for the third student.");
      System.out.println("-------------------------------------------------");
      stud3.dataout();
      stud3.check();
   }
}
