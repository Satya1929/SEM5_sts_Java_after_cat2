import java.util.*;

public class weighted_string {//actual algo
    // Function to calculate the number of distinct substrings with weight <= K
    static int distinctSubString(String P, String Q, int K, int N) {
        // HashSet to store all distinct substrings
        HashSet<String> S = new HashSet<>();

        // Outer loop iterates over all starting points of substrings
        for (int i = 0; i < N; ++i) {
            // Variable to maintain the sum of weights for the current substring
            int sum = 0;

            // String to build the current substring
            String s = "";

            // Inner loop extends the substring from the starting point `i`
            for (int j = i; j < N; ++j) {
                // Calculate the position of the current character in `Q`
                int pos = P.charAt(j) - 'a';

                // Add the weight of the character to the sum
                sum += Q.charAt(pos) - '0';

                // Add the current character to the substring
                s += P.charAt(j);

                // If the total weight is within the limit, add the substring to the set
                if (sum <= K) {
                    S.add(s);
                } else {
                    // If weight exceeds the limit, break out of the inner loop
                    break;
                }
            }
        }

        // Return the number of distinct substrings stored in the set
        return S.size();
    }

    // Driver function
    public static void main(String[] args) {
        // Input for the problem
        Scanner sc = new Scanner(System.in);
        
        // Read string P
        System.out.print("Enter string P: ");
        String P = sc.nextLine();
        
        // Read string Q
        System.out.print("Enter string Q: ");
        String Q = sc.nextLine();
        
        // Read the weight limit K
        System.out.print("Enter the weight limit K: ");
        int K = sc.nextInt();

        // Length of string P
        int N = P.length();

        // Call the function and print the result
        System.out.println("Number of distinct substrings: " + distinctSubString(P, Q, K, N));
    }
}




///////////////////////////////////////////////////////////////////////////////////////////////


public class weighted_string {// O(n cube) approach

    // Function to calculate the weight of a substring
    static int calculateWeight(String substring, String Q) {
        int weight = 0;

        // Calculate the weight of the substring based on `Q`
        for (int i = 0; i < substring.length(); i++) {
            int pos = substring.charAt(i) - 'a'; 
            weight += Q.charAt(pos) - '0'; 
        }
        return weight;
    }

    // Function to calculate the number of distinct substrings with weight <= K
    static int distinctSubString(String P, String Q, int K, int N) {
        // HashSet to store distinct substrings
        HashSet<String> substrings = new HashSet<>();

        // Generate all substrings of `P`
        for (int i = 0; i < N; i++) { // Start index
            for (int j = i; j < N; j++) { // End index
                // Extract substring from `i` to `j`
                String substring = P.substring(i, j + 1);

                // Calculate the weight of the substring
                int weight = calculateWeight(substring, Q);

                // If weight is within the limit, add to the set
                if (weight <= K)substrings.add(substring);
            }
        }

        // Return the number of distinct substrings
        return substrings.size();
    }

    // Driver function
    public static void main(String[] args) {
        // Input for the problem
        Scanner sc = new Scanner(System.in);
        
        // Read string P
        System.out.print("Enter string P: ");
        String P = sc.nextLine();
        
        // Read string Q
        System.out.print("Enter string Q: ");
        String Q = sc.nextLine();
        
        // Read the weight limit K
        System.out.print("Enter the weight limit K: ");
        int K = sc.nextInt();

        // Length of string P
        int N = P.length();

        // Call the function and print the result
        System.out.println("Number of distinct substrings: " + distinctSubString(P, Q, K, N));
    }
}
