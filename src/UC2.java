public class UC2 {
    public static void main(String[] args) {
        // Hardcoded string to be checked
        String original = "madam";

        // Use StringBuilder to reverse the string
        String reversed = new StringBuilder(original).reverse().toString();

        // Conditional statement to compare the original and reversed strings
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}