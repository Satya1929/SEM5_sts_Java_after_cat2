import java.io.*;

class josephus {

    int josephus_0(int n, int k) {
        if (n == 1) return 0;  // Base case: if there's only one person, return 0 (0-based index)
        return (josephus_0(n - 1, k) + k) % n;  // Adjusted for 0-based result
    }

    int josephus_1(int n, int k) {
        if (n == 1) return 1;  // Base case: only one person left, return 1 (1-based index)
        return (josephus_1(n - 1, k) + k - 1) % n + 1;  // Adjusted for 1-based result
    }
    

    public static void main(String[] args) {
        int n = 14;
        int k = 2;
        System.out.println(josephus_0(n, k));
    }
}




// public class Solution {

//     int findTheWinner(int n, int k) {
//         if (n == 1) return 1;  // Return 1 for the 1-based index when only one person is left
//         return (findTheWinner(n - 1, k) + k - 1) % n + 1;  // Adjusted for 1-based indexing
//     }
    
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         // System.out.print("Enter the number of people (n): ");
//         int n = scanner.nextInt();
        
//         // System.out.print("Enter the step count (k): ");
//         int k = scanner.nextInt();
        
//         Solution solution = new Solution();
//         int winner = solution.findTheWinner(n, k);
        
//         System.out.println(winner);
        
//         scanner.close();
//     }
// }