import java.util.*;


public class rat_in_maze {
    // Direction strings
    static String direction = "DLRU";

    // Arrays to represent changes in rows and columns for each direction
    static int[] dr = {1, 0, 0, -1};
    static int[] dc = {0, -1, 1, 0};

    // Function to check if a cell (row, col) is inside the maze and unblocked
    static boolean isValid(int row, int col, int n, int[][] maze) {
        return row >= 0 && col >= 0 && row < n && col < n && maze[row][col] == 1;
    }

    // Recursive function to find all valid paths
    static void findPath(int row, int col, int[][] maze, int n, List<String> ans, StringBuilder currentPath) {
        // If we reach the bottom-right cell, add the current path to ans and return
        if (row == n - 1 && col == n - 1) {
            ans.add(currentPath.toString());
            return;
        }

        // Mark the current cell as blocked
        maze[row][col] = 0;

        // Loop to try all four directions
        for (int i = 0; i < 4; i++) {
            int nextRow = row + dr[i];
            int nextCol = col + dc[i];

            // Check if the next cell is valid
            if (isValid(nextRow, nextCol, n, maze)) {
                currentPath.append(direction.charAt(i));
                findPath(nextRow, nextCol, maze, n, ans, currentPath);
                // Backtrack by removing the last direction
                currentPath.deleteCharAt(currentPath.length() - 1);
            }
        }

        // Mark the current cell as unblocked for other paths
        maze[row][col] = 1;
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        int n = maze.length;
        List<String> result = new ArrayList<>();
        StringBuilder currentPath = new StringBuilder();

        // Start finding paths only if the start and end cells are not blocked
        if (maze[0][0] != 0 && maze[n - 1][n - 1] != 0) {
            findPath(0, 0, maze, n, result, currentPath);
        }

        // Print the result
        if (result.isEmpty()) {
            System.out.println("-1");
        } else {
            for (String path : result) {
                System.out.print(path + " ");
            }
            System.out.println();
        }
    }
}
