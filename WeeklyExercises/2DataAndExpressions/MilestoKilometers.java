import java.util.Scanner;

public class MilestoKilometers {
    public static void main(String[] args) {
        double miles, kilometers;
        final double MILES_TO_KILOMETERS_CONVERSION = 1.60935;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter distance in miles: ");
        miles = scan.nextDouble();

        kilometers = miles * MILES_TO_KILOMETERS_CONVERSION;

        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    }
}