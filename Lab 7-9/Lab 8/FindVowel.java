import java.util.Scanner;

public class FindVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String input = scanner.nextLine();

        String lowerCaseInput = input.toLowerCase();

        for (int i = 0; i < lowerCaseInput.length(); i++) {
            char ch = lowerCaseInput.charAt(i);
            if (isVowel(ch)) {
                System.out.println("Vowel: " + ch + " at position: " + i);
            }
        }

        scanner.close();
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
