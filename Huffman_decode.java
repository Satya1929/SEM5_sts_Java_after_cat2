public class Huffman_decode {
    

    void decode(String s, Node root) {
        // Initialize a StringBuilder to store the decoded string
        StringBuilder decodedString = new StringBuilder();
        
        // Start from the root of the tree
        Node currentNode = root;

        // Traverse through the binary string
        for (int i = 0; i < s.length(); i++) {
            // Move left or right based on the character in the binary string
            if (s.charAt(i) == '0')currentNode = currentNode.left;
            else currentNode = currentNode.right;
            
            // Check if we reached a leaf node
            if (currentNode.left == null && currentNode.right == null) 
            {
                // Append the character at the leaf node to the result
                decodedString.append(currentNode.data);
                // Reset to root for the next character in the binary string
                currentNode = root;
            }
        }

        // Print the decoded string
        System.out.println(decodedString.toString());
    }



}
