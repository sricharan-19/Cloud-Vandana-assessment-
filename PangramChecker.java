import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Check if the input is a pangram
        boolean isPangram = checkPangram(input);

        // Display the result
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }

    public static boolean checkPangram(String input) {
        // Convert the input to lowercase for case-insensitive comparison
        input = input.toLowerCase();

        // Use a set to store unique alphabet characters
        Set<Character> alphabetSet = new HashSet<>();

        // Iterate through each character in the input
        for (char ch : input.toCharArray()) {
            // Check if the character is an alphabet letter
            if (Character.isLetter(ch)) {
                alphabetSet.add(ch);
            }
        }

        // Check if the set contains all the alphabet letters (A to Z)
        return alphabetSet.size() == 26;
    }
}