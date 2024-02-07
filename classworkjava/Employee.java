import java.util.Scanner;

class Employee
{
   private String emp_id, emp_name;
   private int year_of_birth;
   private double basic_salary, allowances, gross, tax_amount, net_salary;

   public void input()
   {
      Scanner myScanner = new Scanner(System.in);

      System.out.print("Enter the employee's employee ID: ");
      emp_id = myScanner.nextLine();
      System.out.print("Enter his/her name: ");
      emp_name = myScanner.nextLine();
      System.out.print("Enter his/her year of birth: ");
      year_of_birth = myScanner.nextInt();
      System.out.print("Enter his/her basic salary: ");
      basic_salary = myScanner.nextDouble();
      System.out.print("Enter his/her allowances: ");
      allowances = myScanner.nextDouble();
   }

   public void compute()
   {
      gross = basic_salary + allowances;

      if(gross >= 20000)
         tax_amount = 10.0 / 100 * gross;
      else
         tax_amount = 0;

      net_salary = gross - tax_amount;
   }

   public void output()
   {
      System.out.println("Employee ID: " + emp_id);
      System.out.println("Name: " + emp_name);
      System.out.println("Year of Birth: " + year_of_birth);
      System.out.println("Basic Salary: " + basic_salary);
      System.out.println("Allowances: " + allowances); 
      System.out.println("Gross Salary: " + gross);
      System.out.println("Tax Amount: " + tax_amount);
      System.out.println("Net Salary: " + net_salary);
   }
}
