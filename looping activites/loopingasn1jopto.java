import javax.swing.*;

public class loopingasn1jopto {
    public static void main(String[] args) {

        int higHest = Integer.MIN_VALUE;
        int loWest = Integer.MAX_VALUE;
        int chanGer;

        for (int a = 1; a <= 10; a++) {
            chanGer = Integer.parseInt(JOptionPane.showInputDialog("Enter the " + a + "th number"));

            if (chanGer > higHest) {
                higHest = chanGer;
            }

            if (chanGer < loWest) {
                loWest = chanGer;

            }
        }

        String output = String.format("""
                HIGHEST: %d
                LOWEST: %d
                """, higHest, loWest);

        JOptionPane.showMessageDialog(null, output,"Niceone", JOptionPane.INFORMATION_MESSAGE);
    }
}
