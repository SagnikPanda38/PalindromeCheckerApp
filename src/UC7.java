import java.util.ArrayDeque;
import java.util.Deque;

public class UC7 {
    public static void main(String[] args) {
        // Hardcoded string literal
        String input = "mom";

        // Deque allows insertion/removal from both ends
        Deque<Character> deque = new ArrayDeque<>();

        // Step 1: Add all characters to the Deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Step 2: Compare front and rear until 0 or 1 character remains
        while (deque.size() > 1) {
            Character first = deque.removeFirst();
            Character last = deque.removeLast();

            if (!first.equals(last)) {
                isPalindrome = false;
                break;
            }
        }

        // Step 3: Print result in requested format
        System.out.println("Input: " + input);
        System.out.println("Is palindrome: " + isPalindrome);
    }
}