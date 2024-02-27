import java.util.Scanner;

public class SquareCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of a square's side: ");
        int sideLength = input.nextInt();

        int perimeter = 4 * sideLength;
        int area = sideLength * sideLength;

        System.out.printf("The perimeter of the square is: %d%n", perimeter);
        System.out.printf("The area of the square is: %d%n", area);
    }
}