import java.util.InputMismatchException;
import java.util.Scanner;

public class dcsA4scan {
    public static void main(String[] args) {
        Scanner Jedi = new Scanner(System.in);

        String citiZen;
        String obiWan = "";
        int heiGht;
        int aGe;

        try {
            System.out.print("Are you a citizen of Endor? C/N: ");
            citiZen = Jedi.nextLine();

            System.out.print("Did Obi-Wan recommend you? R/N: ");
            obiWan = Jedi.nextLine();

            if (obiWan.equalsIgnoreCase("R")) {
                System.out.println("Your application is ACCEPTED");
                Jedi.close();
                return;
            }


            System.out.print("Enter your height: ");
            heiGht = Jedi.nextInt();

            System.out.print("Enter your age: ");
            aGe = Jedi.nextInt();


             if (heiGht < 200 || aGe < 20 && aGe > 26) {
                System.out.println("Your application is REJECTED");

            } else if (heiGht >= 200 || aGe >= 21 && aGe <= 25) {
                System.out.println("Your application is ACCEPTED");

            }

            }catch (InputMismatchException e ) {
            System.out.println("Error");
        }

        }
    }
