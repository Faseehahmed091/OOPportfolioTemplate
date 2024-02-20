import java.util.Scanner;

public class SphereCalculations
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");

        double r = scanner.nextDouble();
        System.out.printf("Volume: %.4f%nSurface Area: %.4f%n", 4.0 / 3.0 * Math.PI * Math.pow(r, 3), 4.0 * Math.PI * Math.pow(r, 2));
    }
}
