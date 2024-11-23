import java.util.Scanner;

public class TextDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String input = scanner.nextLine();

        int firstIndex = input.indexOf("the");
        int lastIndex = input.lastIndexOf("the");
 

        if (firstIndex == -1 || lastIndex == -1 || firstIndex == lastIndex) {
            System.out.println("The string 'the' does not occur multiple times in the input.");
        } else {
            String enclosedSubstring = input.substring(firstIndex + 3, lastIndex);

            System.out.println("The enclosed characters between the first and last 'the' are:");
            System.out.println(enclosedSubstring);
        }

        scanner.close();
    }
}
