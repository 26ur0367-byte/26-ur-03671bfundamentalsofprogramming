import java.util.InputMismatchException;
import java.util.Scanner;

public class dcsA3scann {

    public static void main(String[] args) {

        Scanner scholar = new Scanner(System.in);

        int salaryParent;
        int nsAt;
        int examScore;

        try {
            System.out.print("Enter your parent's salary: ");
            salaryParent = scholar.nextInt();

            System.out.print("Enter your NSAT score: ");
            nsAt = scholar.nextInt();

            System.out.print("Enter your exam score: ");
            examScore = scholar.nextInt();

            if (salaryParent > 10000 || nsAt < 90 || examScore < 85) {
                System.out.println("your application is REJECTED");

            } else if (salaryParent >= 3500 || nsAt >= 91 || examScore >= 91) {
                System.out.println("Your application is ACCEPTED");

            } else {
                System.out.println("Your application is sent for further study");

            }

        }catch(InputMismatchException e){
                System.out.println("Error try again");
            }
        }
    }

