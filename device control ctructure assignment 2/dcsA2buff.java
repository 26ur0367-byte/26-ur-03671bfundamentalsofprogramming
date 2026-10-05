import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dcsA2buff {

    public static void main(String[] args) {

        BufferedReader salary = new BufferedReader(new InputStreamReader(System.in));

        double payRate;
        double workHours;

        try {
            System.out.print("Enter Pay Rate: ");
            payRate = Double.parseDouble(salary.readLine());

            System.out.print("Enter Work Hours: ");
            workHours = Double.parseDouble(salary.readLine());

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

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error");
        }
    }



        }


