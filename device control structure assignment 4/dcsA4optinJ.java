import javax.swing.*;
import java.util.InputMismatchException;

public class dcsA4optinJ {

    public static void main(String[] args) {

        String citizen;
        String obiwan;
        int age;
        int height;

        try{
            citizen = JOptionPane.showInputDialog("Are you a citizen of Endor? (C/N) ");
            obiwan = JOptionPane.showInputDialog("Are you a recommendee of Obi-Wan Kenobi? (R/N)");

            if (obiwan.equals("R")){
                JOptionPane.showMessageDialog(null, "Accepted! Welcome to the Jedi Knight Academy! ");
            return;
            }

            age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
            height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height "));

            if (height < 200 || age < 20 && age > 26)
                JOptionPane.showMessageDialog(null, "Rejected! ");

            else if  (height >= 200 || age >= 21 && age <= 25)
                JOptionPane.showMessageDialog(null, "Accepted!  Welcome to the Jedi Knight Academy! ");


        }catch(InputMismatchException e){}
    }
}
