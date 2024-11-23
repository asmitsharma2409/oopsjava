import java.util.Scanner;

public class Capital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1))
                      .append(" ");
            }
        }

        System.out.println(result.toString().trim());

        scanner.close();
    }
}
