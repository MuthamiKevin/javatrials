import java.util.Scanner;

class TheStudent
{
   protected String admNo, sName, course;

   public void sInput()
   {
      Scanner myScanner = new Scanner(System.in);

      System.out.print("Enter the admission number of the student: ");
      admNo = myScanner.nextLine();
      System.out.print("Enter his/her name: ");
      sName = myScanner.nextLine();
      System.out.print("Enter the course he/she is doing: ");
      course = myScanner.nextLine();
   }

   public void sOutput()
   {
      System.out.println("Admission Number: " + admNo);
      System.out.println("Student's name: " + sName);
      System.out.println("Course: " + course);
   }
}