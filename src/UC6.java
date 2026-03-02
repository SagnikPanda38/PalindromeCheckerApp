import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UC6 {
    public static void main(String[] args) {
        // Updated hardcoded string
        String input = "mom";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Fill both structures
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c);
            queue.add(c);
        }

        boolean isPalindrome = true;

        // Compare Dequeue vs Pop
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                isPalindrome = false;
                break;
            }
        }

        // Modified Output Format
        System.out.println("Input :" + input);
        System.out.print("Is palindrome : ");
        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}