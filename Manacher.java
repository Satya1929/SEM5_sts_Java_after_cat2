import java.util.*;

public class Manacher {//not manacher but O(n2) algo
  
    // Function to check if a substring s[low..high] is a palindrome
    static boolean checkPal(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }

    // This function prints the longest palindrome substring
    // It also returns the length of the longest palindrome
    static String longestPalSubstr(String s) {
        int n = s.length();
        
        // All substrings of length 1 are palindromes
        int maxLen = 1, start = 0;

        // Nested loop to mark start and end index
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Check if the current substring is a palindrome 
                //and length greater than maxlen
                if (checkPal(s, i, j) && (j - i + 1) > maxLen) {
                    start = i;
                    maxLen = j - i + 1;
                }
            }
        }

        return s.substring(start, start + maxLen);
    }

    // Driver Code
    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        System.out.println(longestPalSubstr(s));
    }
}













///hackerrank solution



public class Manacher_hackerank_sol {//not manacher but O(n2) algo
  
    // Function to check if a substring s[low..high] is a palindrome
    static boolean checkPal(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }

    // This function prints the longest palindrome substring
    // It also returns the length of the longest palindrome
    static String longestPalSubstr(String s) {
        int n = s.length();
        
        // All substrings of length 1 are palindromes
        int maxLen = 1, start = 0;

        // Nested loop to mark start and end index
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Check if the current substring is a palindrome 
                //and length greater than maxlen
                if (checkPal(s, i, j) && (j - i + 1) > maxLen) {
                    start = i;
                    maxLen = j - i + 1;
                }
            }
        }

        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the string: ");
        String s = sc.nextLine();

        // Call the function and print the result
        // System.out.println("Longest Palindromic Substring: " + longestPalSubstr(s));
        System.out.println(longestPalSubstr(s));
    }
}