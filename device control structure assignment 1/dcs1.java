import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dcs1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Year: ");
        String input = br.readLine();
        int year = Integer.parseInt(input);

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " is a leap year");


        } else  {
            System.out.println(year + " is not a leap year");
        }
    }
}
