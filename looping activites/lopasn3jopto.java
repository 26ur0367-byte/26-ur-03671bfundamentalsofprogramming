import javax.swing.*;

public class lopasn3jopto {
    public static void main(String[] args) {
        int initial = 20000;
        int munnieGet;

        JOptionPane.showMessageDialog(null, """
                Please enter your transaction
                Enter a Positive number if Deposit
                Enter a Negative number if Withdrawal
                Or press number "0" to end transaction
         
                """, "Instructions", JOptionPane.INFORMATION_MESSAGE);
        do {
            munnieGet = Integer.parseInt(JOptionPane.showInputDialog("""
                    Current balance: %d"
                    Amount: 
                    """.formatted(initial)));

            if (initial > 0 ){
                if (initial + munnieGet >= 0){
                    initial = initial + munnieGet;
                    JOptionPane.showMessageDialog(null, "Current bal: " + initial);

                }else {
                    JOptionPane.showMessageDialog(null, "Insufficient balance", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }while (munnieGet != 0);
        JOptionPane.showMessageDialog(null, "Transaction Ended", "End" , JOptionPane.INFORMATION_MESSAGE);
    }
}
