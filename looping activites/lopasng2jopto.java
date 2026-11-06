import javax.swing.*;

public class lopasng2jopto {
    public static void main(String[] args) {
        String start = JOptionPane.showInputDialog("Enter \"boom time\": ");
        if (start != null && start.equalsIgnoreCase("boom time")) {
            String beans = "";

            for (int a = 2;  a <= 100; a += 2){
                beans += a + " ";

                if (a % 20 == 0){
                    beans += "\n";
                }
            }
            JOptionPane.showMessageDialog(null, beans,"Even number till 100",JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
