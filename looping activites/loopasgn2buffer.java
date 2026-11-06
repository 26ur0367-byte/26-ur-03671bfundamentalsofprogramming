import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class loopasgn2buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader numbrrsss = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter \"boom time?\": ");
        String start = numbrrsss.readLine();

        if (start.equalsIgnoreCase("boom time")) {
            for (int a = 2; a <= 100; a += 2) {
                System.out.print(a + " ");
                if (a % 20 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
