import javax.swing.*;
import java.util.Scanner;

public class dcsA3JOPTON {
    public static void main(String[] args) {
        int salaryParent, nsAt, examScore;

        try {
            salaryParent = Integer.parseInt(JOptionPane.showInputDialog("Enter your parent's salary: "));
            nsAt = Integer.parseInt(JOptionPane.showInputDialog("Enter your NSAT score: "));
            examScore = Integer.parseInt(JOptionPane.showInputDialog("Enter your exam score: "));

        } finally {

        }
        if (salaryParent <= 3500 || nsAt >= 91 || examScore >= 91) {
            JOptionPane.showMessageDialog(null, "Your application is ACCEPTED");

        } else if (salaryParent >= 10000 || nsAt <= 90 || examScore <= 85) {
            JOptionPane.showMessageDialog(null, "Your application is REJECTED");

        } else JOptionPane.showMessageDialog(null, "Your application is sent for further review");
    }
}



