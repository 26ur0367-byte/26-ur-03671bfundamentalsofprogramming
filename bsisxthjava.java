import javax.swing.*;

public class bsisxthjava {
    public static void main (String[] args){
        String name = "miguel";
        name = JOptionPane.showInputDialog(" Please enter your name");

        String msg = "Welcome " + name + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
}
