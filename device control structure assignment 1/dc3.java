import javax.swing.*;

public class dc3 {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(null, "Enter a year");

        try {
            int year = Integer.parseInt(input);

            boolean LeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (LeapYear) {
                JOptionPane.showMessageDialog(null, year + " is a Leap Year");

            } else {
                JOptionPane.showMessageDialog(null, year + " is not a Leap Year");

            }
        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Please enter a year");}
    }
}
