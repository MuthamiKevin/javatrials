import java.util.Scanner;
public class salary {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the gross pay:");
    double grossPay = scanner.nextDouble();

    scanner.close();
    double taxRate;
        double taxAmount;
        double netPay;

        if (grossPay >= 40000) {
            taxRate = 0.30;
        } else if (grossPay >= 30000) {
            taxRate = 0.25;
        } else if (grossPay >= 20000) {
            taxRate = 0.15;
        } else if (grossPay >= 10000) {
            taxRate = 0.10;
        } else {
            taxRate = 0.0;
        }

        taxAmount = grossPay * taxRate;
        netPay = grossPay - taxAmount;

        System.out.println("Gross Pay: " + grossPay + "ksh");
        System.out.println("Tax Amount: " + taxAmount + "ksh");
        System.out.println("Net Pay: " + netPay + "ksh");
    }
}
  