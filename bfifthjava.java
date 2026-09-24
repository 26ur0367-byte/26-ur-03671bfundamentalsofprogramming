import java.util.InputMismatchException;
import java.util.Scanner;

public class bfifthjava {
    public static void main (String[] args){
        String name;
        int age;
        Scanner inputDevice = new Scanner(System.in);

        try {
            System.out.print("Please enter your name");
            name = inputDevice.nextLine();
            //input name thingy

            System.out.print("Please enter your age");
            age = inputDevice.nextInt();
            //age thingy

            System.out.println("Your name is:" + name + " And you are:" + age + " years old");
            //prints this when inputted properly

        }catch (InputMismatchException e) {
            System.out.println("Error: must be a whole number");
            //catches and displays when wrong

        }finally {
            // runs always for no data leak?
            inputDevice.close();
        }
    }
}
