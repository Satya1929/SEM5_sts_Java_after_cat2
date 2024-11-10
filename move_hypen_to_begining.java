public class move_hypen_to_begining {
    

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

