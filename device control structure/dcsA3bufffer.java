import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class dcsA3bufffer {
    public static void main(String[] args) {
        BufferedReader scholar = new BufferedReader(new InputStreamReader(System.in));

        int salaryParent;
        int nsAt;
        int examScore;

        try {
            System.out.print("Enter your parent's salary: ");
            salaryParent = Integer.parseInt(scholar.readLine());

            System.out.print("Enter your NSAT score: ");
            nsAt = Integer.parseInt(scholar.readLine());

            System.out.print("Enter your exam score: ");
            examScore = Integer.parseInt(scholar.readLine());

            if (salaryParent >= 10000 || nsAt <= 90 || examScore <= 85) {
                System.out.println("Your application is REJECTED");

            } else if (salaryParent <= 3500 || nsAt >= 91 || examScore >= 91) {
                System.out.println("Your application is ACCEPTED");

            } else System.out.println("Your application is sent for further review");
            {

            }
            {
                System.out.println("error please try again");
            }
        }
        catch (InputMismatchException | NumberFormatException | IOException e) {
            System.out.println("Error, please try again");
        }
        }
    }


