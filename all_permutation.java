public class all_permutation {//not unique print when repeatation in string


    //  Recursive function to print all permutations of a given string.
      
    //  input_str The remaining string to process
    //  ans The current permutation being formed

    static void printPermutn(String input_str, String ans) 
    {

        // Base Case: If the string is empty, we have a complete permutation
        if (input_str.length() == 0) 
        {
            System.out.print(ans + " "); // Print the current permutation
            System.out.println(); // Move to the next line after printing the combination
            return;
        }

        // Loop over the string, choosing each character one by one
        for (int i = 0; i < input_str.length(); i++) 
        {

            // Extract the ith character from the string
            char ch = input_str.charAt(i);

            // Form the rest of the string excluding the ith character 
            //(Exclude the selected character (ch) by concatenating the substrings before and after i.)
            // second argument is the lenght needed !! and if kept empty the full length will be taken
            String remaining_string = input_str.substring(0, i) + input_str.substring(i + 1);

            // Recursive call to generate permutations with the reduced string
            printPermutn(remaining_string, ans + ch);
        }
    }

    public static void main(String[] args) 
    {
        // Input string
        String s = "abb";

        // Call the recursive function to print all permutations
        printPermutn(s, "");
    }
}
