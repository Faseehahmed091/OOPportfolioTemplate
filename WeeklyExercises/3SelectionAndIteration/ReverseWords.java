import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        Scanner wordScanner = new Scanner(inputSentence);
        wordScanner.useDelimiter(" "); // Set space as the delimiter

        StringBuilder reversedSentence = new StringBuilder();

        while (wordScanner.hasNext()) {
            String word = wordScanner.next();
            String reversedWord = reverseString(word);
            reversedSentence.append(reversedWord).append(" ");
        }

        System.out.println("Reversed Sentence: " + reversedSentence.toString().trim());
    }

    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}