import java.util.Scanner;
import java.util.Random;

public class Rock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.print("Enter your play (R, P, or S): ");
        String personPlay = scan.next().toUpperCase();

        int computerInt = generator.nextInt(3);
        String computerPlay = switch (computerInt) {
            case 0 -> "R";
            case 1 -> "P";
            case 2 -> "S";
            default -> "";
        };

        System.out.println("Computer plays: " + computerPlay);

        if (personPlay.equals(computerPlay))
            System.out.println("It's a tie!");
        else if (
                (personPlay.equals("R") && computerPlay.equals("S")) ||
                        (personPlay.equals("P") && computerPlay.equals("R")) ||
                        (personPlay.equals("S") && computerPlay.equals("P"))
        )
            System.out.println("You win!");
        else
            System.out.println("You lose!");
    }
}
