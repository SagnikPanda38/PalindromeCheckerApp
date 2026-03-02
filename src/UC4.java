public class UC4 {
    public static void main(String[] args) {
        // Hardcoded string literal
        String input = "racecar";

        // Convert string to character array
        char[] charArray = input.toCharArray();

        boolean isPalindrome = true;
        int start = 0;
        int end = charArray.length - 1;

        // Two-pointer approach
        while (start < end) {
            // Compare characters at both ends
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break; // Exit loop early if a mismatch is found
            }
            start++; // Move forward
            end--;   // Move backward
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}