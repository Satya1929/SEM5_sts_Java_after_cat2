class Maneuvering_recursion {//recursion only

    static int numberOfPaths(int m, int n) 
    {
        if (m == 1 || n == 1) return 1;
        return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);
    }

    public static void main(String args[]) {
        int m = 3;
        int n = 3;
        int res = numberOfPaths(m, n);
        System.out.println(res);
    }
}


class Maneuvering_tabu {

    static int numberOfPaths(int m, int n) {

        int dp[][] = new int[m][n];

        // Count of paths to reach any cell in first column is 1
        for (int i = 0; i < m; i++)
            dp[i][0] = 1;

        // Count of paths to reach any cell in first row is 1
        for (int j = 0; j < n; j++)
            dp[0][j] = 1;

        //fill table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++)
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String args[]) 
    {
        int res = numberOfPaths(3, 3);
        System.out.println(res);
    }
}