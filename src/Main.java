import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        String trash = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the distance in meters you would like converted: ");
        if (in.hasNextDouble())
        {
            meters = in.nextDouble();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash +". Please restart the program and enter a correct value.");
        }

        miles = meters / 1609;
        feet = meters * 3.281;
        inches = meters * 39.37;

        System.out.println("the length " + meters + "m is also " + miles + " miles, " + feet + " feet, and " + inches + " inches");

    }
}