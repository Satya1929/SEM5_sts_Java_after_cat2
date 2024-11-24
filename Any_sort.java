import java.util.*;

public class Sorting {

    // Function to sort an array and return the sorted array
    public static int[] sortArray(int[] arr) {
        // Sort the array in ascending order (lexicographical)
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        // Example input array
        int[] inputArray = {5, 3, 8, 1, 2};

        // Call the function to sort the array
        int[] sortedArray = sortArray(inputArray);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }
}



import java.util.*;

public class Any_sort { // n size array input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);

        // Output the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
