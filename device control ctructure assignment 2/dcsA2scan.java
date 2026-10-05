import java.util.InputMismatchException;
import java.util.Scanner;

public class dcsA2scan {
    public static void main(String[] args) {

        Scanner salary = new Scanner(System.in);

        double payRate;
        double workHours;

        try {

            System.out.print("Enter Pay Rate: ");
            payRate = (salary.nextDouble());

            System.out.print("Enter Work Hours: ");
            workHours = (salary.nextDouble());

            double grossPay = payRate * workHours;

            if (grossPay <= 2000) {
                System.out.println("Your gross pay is: " + grossPay + " The withholding tax is " + (grossPay * 0.10) + " Your net pay is " + (grossPay - (grossPay * 0.10)));

            } else if (grossPay <= 4000) {
                System.out.println("Your gross pay is: " + grossPay + " The withholding tax is " + (grossPay * 0.12) + " Your net pay is " + (grossPay - (grossPay * 0.12)));

            } else if (grossPay <= 10000) {
                System.out.println("Your gross pay is: " + grossPay + " The withholding tax is " + (grossPay * 0.15) + " Your net pay is " + (grossPay - (grossPay * 0.15)));

            } else {
                System.out.println("Your gross pay is " + grossPay + " The withholding tax is " + (grossPay * 0.20) + " Your net pay is " + (grossPay - (grossPay * 0.20)));

            }

        }catch (InputMismatchException e ) {
            System.out.println("Error");
        }
    }
}
