// Java program to print all combinations of size r in an array of size n
import java.io.*;
import java.util.*;

class all_combination 
{


    //  Recursive utility function to generate and print combinations.

    //   input_arr   The input array of elements
    //   n     The size of the input array
    //   r     The size of each combination to generate
    //   ans_i The current position in the temporary array `answer_arr` where the next element will be added
    //   answer_arr  A temporary array to store the current combination being formed
    //   input_i     The current ans_i in the input array `input_arr`
    

    static void combination_func(int input_arr[], int n, int r, int ans_i, int answer_arr[], int input_i) 
    {
        // Base Case 1: A complete combination of size r is ready to be printed
        if (ans_i == r) 
        {
            for (int j = 0; j < r; j++) System.out.print(answer_arr[j] + " ");
            System.out.println(); // Move to the next line after printing the combination
            return; // Return to explore other possibilities
        }

        // Base Case 2: If there are no more elements to include from the array
        if (input_i >= n) return; // Terminate the recursion 


        // Include the current element (input_arr[input_i]) in the combination
        answer_arr[ans_i] = input_arr[input_i];

        // Case = take (striver)
        combination_func(input_arr, n, r, ans_i + 1, answer_arr, input_i + 1); // Move to the next position in `answer_arr` and to the next element in `input_arr`
        // Case = Not take (striver)
        combination_func(input_arr, n, r, ans_i, answer_arr, input_i + 1); // Exclude the current element and explore the next element in `input_arr`, Note: `ans_i` remains unchanged as we are replacing the current element
    }

    static void print_combination(int input_arr[], int n, int r) 
    {
        // Temporary array to store combinations one by one
        int answer_arr[] = new int[r];
        
        // Start generating combinations using the recursive utility function
        combination_func(input_arr, n, r, 0, answer_arr, 0);
    }


    public static void main(String[] args) 
    {
        // Define the input array and the size of combinations to generate
        int input_arr[] = {1, 2, 3, 4, 5, 6}; // Input array
        int r = 3; // Size of combinations
        int n = input_arr.length; // Total number of elements in the array
    
        // Sort the input array to ensure combinations are generated in lexicographical order
        Arrays.sort(input_arr);
    
        // Print all combinations of size r
        print_combination(input_arr, n, r);
    }
}

