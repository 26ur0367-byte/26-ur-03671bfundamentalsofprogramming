import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class loopasng3buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader munnie = new BufferedReader(new InputStreamReader(System.in));

        int initial = 20000;
        int getMunnie;

        System.out.printf("""
                Please enter your transaction
                Enter a Positive number if Deposit
                Enter a Negative number if Withdrawal
                Or press number 0 to end transacttion
                Current balance: %d \n
                 """, initial);

        do {
            System.out.print("How much?: ");
            getMunnie = Integer.parseInt(munnie.readLine());

            if (getMunnie > 0){
                initial = initial + getMunnie;
                System.out.println("Current Bal: " + initial);

            }
            if(getMunnie < 0){
                if (initial + getMunnie >= 0){
                    initial = initial + getMunnie;
                    System.out.println("Current Bal: " + initial);
                }else {
                    System.out.println("Insufficient Balance");
                }
            }
        } while (getMunnie != 0);

    }
}
