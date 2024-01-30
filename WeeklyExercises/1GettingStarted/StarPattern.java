public class StarPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = -n + 1; i < n; i++) {
            int spaces = Math.abs(i);
            int stars = n - spaces;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * stars - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
