import java.util.Stack;

public class UC5 {
    public static void main(String[] args) {
        String input = "radar";
        Stack<Character> stack = new Stack<>();

        // Step 1: Push all characters of the string into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Step 2: Pop characters and build the reversed string
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        // Step 3: Compare and print results
        if (input.equals(reversedString.toString())) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}