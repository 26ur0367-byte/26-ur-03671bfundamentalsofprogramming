import javax.swing.*;
import java.io.IOException;

public class dcsa2 {

    public static void main(String[] args) {
         double payRate;
         double workHours;

         try {
             payRate = Double.parseDouble(JOptionPane.showInputDialog("Enter Pay Rate"));

             workHours = Double.parseDouble(JOptionPane.showInputDialog("Enter Work Hours"));

             double grossPay = payRate * workHours;

             if (grossPay <= 2000) {
                 JOptionPane.showMessageDialog(null, "Your gross pay is: " + grossPay + " The withholding tax is " + (grossPay * 0.10) + " Your net pay is " + (grossPay - (grossPay * 0.10)));

             } else if (grossPay <= 4000) {
                 JOptionPane.showMessageDialog(null, "Your gross pay is: " + grossPay + " The withholding tax is " + (grossPay * 0.12) + " Your net pay is " + (grossPay - (grossPay * 0.12)));

             } else if (grossPay <= 10000) {
                 JOptionPane.showMessageDialog(null, "Your gross pay is: " + grossPay + " The withholding tax is " + (grossPay * 0.15) + " Your net pay is " + (grossPay - (grossPay * 0.15)));

             } else {
                 JOptionPane.showMessageDialog(null, "Your gross pay is: " + grossPay + " The withholding tax is " + (grossPay * 0.20) + " Your net pay is " + (grossPay - (grossPay * 0.20)));

             }

         }catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(null, "Error");




         }
        }
    }

