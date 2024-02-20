import java.util.Random;
import java.util.Scanner;
public class Dice{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Giver number of sides Die 1 have ");
        int sides1 = scanner.nextInt();
        System.out.print("Give number of sides Dies 2 have ");
        int sides2 = scanner.nextInt();
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += rand.nextInt(sides1) + 1;
            sum2 += rand.nextInt(sides2) + 1;
            System.out.println("Die 1 " + (i == 0 ? "first " : i == 1 ? "second " : "third ") + "rolling = " + (rand.nextInt(sides1) + 1) + ".");
            System.out.println("Die 2 " + (i == 0 ? "first " : i == 1 ? "second " : "third ") + "rolling = " + (rand.nextInt(sides2) + 1) + ".");
        }
        double avg1 = (double) sum1 / 3;
        System.out.println("Die 1 rolled a total of " + sum1 + " and rolled Dice " + avg1 + " on average.");
        double avg2 = (double) sum2 / 3;
        System.out.println("Die 2 rolled a total of " + sum2 + " and rolled Dice " + avg2 + " on average.");
    }
}