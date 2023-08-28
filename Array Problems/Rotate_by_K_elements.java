/** Question 8: Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.
  
Example 1:
Input: N = 5, array[] = {1,2,3,4,5} K=2
Output: {3,4,5,1,2}
Explanation: Rotate the array to right by 2 elements.

Example 2:
Input: N = 7, array[] = {1,2,3,4,5,6,7} K=3
Output: {4,5,6,7,1,2,3}
Explanation: Rotate the array to right by 3 elements.
*/

import java.util.Arrays;

// METHOD 1: Brute Force Approach.

public class Rotate_by_K_elements {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int  k = 3;
        for(int i = 0; i < k; i++){
            int temp = arr[0];
            for(int j = 1; j < arr.length; j++){
                arr[j-1] = arr[j];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }    
}

// Time Complexity: O(k*n).
// Space Complecity: O(1).


// METHOD 2: Using Block Swap Algprithm


