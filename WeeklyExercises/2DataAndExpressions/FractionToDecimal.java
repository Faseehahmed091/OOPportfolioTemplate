import java.util.Scanner;

public class FractionToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numerator of a fraction: ");
        int numerator = input.nextInt();

        System.out.print("Enter the denominator of a fraction: ");
        int denominator = input.nextInt();

        double decimalEquivalent = (double) numerator / denominator;

        System.out.printf("The decimal equivalent of the fraction %d/%d is: %.2f%n", numerator, denominator, decimalEquivalent);
    }
}