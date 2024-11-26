
public class move_hypen_to_begining_1 { //easiest code 1 using string functions

    // Function to move all hyphens to the beginning of a string
    public static String moveHyphensToBeginning(String str) 
    {
        return str.replaceAll("[^-]", "") + str.replaceAll("-", "") ;
    }
    public static void main(String[] args) {
        String str = "a-b-c-d";
        String result = moveHyphensToBeginning(str);
        System.out.println(result); // ----abcd
    }
}




public class move_hypen_to_begining_1 { //easiest code 2

    public static String moveHyphensToBeginning(String str) {
        // Empty StringBuilder to construct the resulting string
        StringBuilder sb = new StringBuilder();
        
        // Iterate over each character in the input string
        for (char ch : str.toCharArray()) {
            if (ch == '-') sb.insert(0, ch); // If the character is a hyphen, insert it at the beginning
            else sb.append(ch); // Otherwise, append the character to the end
        }

        // Convert the StringBuilder to a string 
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "a-b-c-d";
        String result = moveHyphensToBeginning(str);
        System.out.println(result); // ----abcd
    }
}










public class move_hypen_to_begining_2 {//cpp way
    

    static void movehypenInFront(char[] str) {
        int i = str.length - 1; //pointer at end

        // Traverse the string backwards and swap spaces to the front
        for (int j = i; j >= 0; j--) {
            if (str[j] != '-') { //if space found , then donot decrease i
                // Swap non-space character with the character at position i
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i--; // Move the pointer towards the beginning
            }
        }
    }


    public static void main(String[] args) {
        char[] str = "Hey there, it's GeeksforGeeks".toCharArray();
        movehypenInFront(str);
        System.out.println(String.valueOf(str));
    }
}




// public class Solution {//hackerrank solution
    
//     // Function to move hyphens to the front of the string
//     static void moveHyphenInFront(char[] str) {
//         int i = str.length - 1; // Pointer at the end of the string

//         // Traverse the string backwards and swap non-hyphen characters with hyphen
//         for (int j = i; j >= 0; j--) {
//             if (str[j] != '-') { // If non-hyphen character found, then move the pointer
//                 // Swap non-hyphen character with the character at position i
//                 char temp = str[i];
//                 str[i] = str[j];
//                 str[j] = temp;
//                 i--; // Move the pointer towards the beginning
//             }
//         }
//     }

//     // Driver code
//     public static void main(String[] args) {
//         // Taking input from the user
//         Scanner scanner = new Scanner(System.in);
        
//         // System.out.print("Enter a string: ");
//         String input = scanner.nextLine(); // Read user input
        
//         // Convert the input string to a character array
//         char[] str = input.toCharArray();
        
//         // Call the function to move hyphens to the front
//         moveHyphenInFront(str);
        
//         // Print the result after transformation
//         // System.out.println("Resulting string with hyphens moved to the front: ");
//         System.out.println(String.valueOf(str));
        
//         scanner.close(); // Close the scanner
//     }
// }

