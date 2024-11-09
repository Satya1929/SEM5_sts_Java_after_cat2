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
