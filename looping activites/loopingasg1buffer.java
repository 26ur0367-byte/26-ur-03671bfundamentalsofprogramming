import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class loopingasg1buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader numbrss = new BufferedReader(new InputStreamReader(System.in));

        int maxiMum = Integer.MIN_VALUE;
        int notMax = Integer.MAX_VALUE;
        int inputNumber;

        for (int a = 1; a <= 10; a++) {
            System.out.print("Enter a number " + a + ":");
            inputNumber = Integer.parseInt(numbrss.readLine());

            if (inputNumber > maxiMum) {
                maxiMum = inputNumber;
            }
            if (inputNumber < notMax) {
                notMax = inputNumber;
            }
        }
        System.out.println("");
        System.out.println("The highest number is " + maxiMum);
        System.out.println("The lowest number " + notMax);

    }
}
