import java.io.BufferedReader;
import java.io.InputStreamReader;

public class dcsA4bufr {
    public static void main(String[] args) {
        BufferedReader Jedi = new BufferedReader(new InputStreamReader(System.in));

        String obiwan;
        String citizen;
        int age;
        int height;

        try{
            System.out.print("Are you a citizen of Endor? (C/N): ");
            citizen = Jedi.readLine();

            System.out.print("Did Obi-Wan recommend you? (R/N): ");
            obiwan = Jedi.readLine();

            if(obiwan.equals("R")){
                System.out.print("Accepted! Welcome to the Jedi Knight Academy! ");
                Jedi.close();
                return;

            }

            System.out.print("Enter your height: ");
            height = Integer.parseInt(Jedi.readLine());

            System.out.print("Enter your age: ");
            age = Integer.parseInt(Jedi.readLine());

            if (height < 200 || age < 20 && age > 26) {
                System.out.println("Rejected! ");

            } else if (height >= 200 || age >= 21 && age <= 25) {
                System.out.println("Accepted! Welcome to the Jedi Knight Academy! ");

            }


        } catch (Exception e) {
            System.out.println("Error! Please try again.");
            throw new RuntimeException(e);
        }
    }
}
