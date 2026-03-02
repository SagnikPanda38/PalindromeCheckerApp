import java.util.*;
public class UC3 {
    public static void main(String[] args) {
        // Hardcoded string to be checked
        Scanner sc=new Scanner(System.in);
        String original=sc.nextLine();


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