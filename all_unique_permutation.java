import java.util.*;

public class all_unique_permutation {

    // Recursive function to print all unique permutations of a given string
    static void printPermutn(String input_str, String ans) {

        // Base Case: If the string is empty, we have a complete permutation
        if (input_str.length() == 0) 
        {
            System.out.print(ans + " "); // Print the current permutation
            System.out.println(); // Move to the next line after printing the combination
            return;
        }

        // Track used characters at the current level to skip duplicates
        boolean[] used = new boolean[256]; // ASCII size

        // Loop over the string, choosing each character one by one
        for (int i = 0; i < input_str.length(); i++) 
        {

            char ch = input_str.charAt(i);

            // Extra line - Skip duplicate characters
            if (used[ch]) continue;
            used[ch] = true;

            // Form the rest of the string excluding the ith character
            String remaning_string = input_str.substring(0, i) + input_str.substring(i + 1);

            // Recursive call to generate permutations with the reduced string
            printPermutn(remaning_string, ans + ch);
        }
    }


    public static void main(String[] args) {
        // Input string
        String s = "abb";

        // Sort the input string to handle lexicographical order
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String sortedStr = new String(charArray);

        // Call the recursive function to print all unique permutations
        printPermutn(sortedStr, "");
    }
}
