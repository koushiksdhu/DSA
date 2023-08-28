/* Given an array of N integers, write a program to implement the Recursive Bubble Sort algorithm.

Example 1:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: After sorting we get 9,13,20,24,46,52

Example 2:
Input: N = 5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting we get 1,2,3,4,5
*/

import java.util.*;

public class recursiveBubbleSort {
    public static void main(String args[]){
        int arr[] = {1, 4, 7, 8, 5, 2, 2, 9, 6, 3, 3, 3, 10};
        recursiveBubble(arr, arr.length);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
    static void recursiveBubble(int arr[], int n){
        if(n == 1)
            return;
        for(int j = 0; j < n - 1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        recursiveBubble(arr, n-1);
    }
}

// Time Complexity: O(N*N)
// Space Complexity: O(N), Auxiliary Space or Temporary Space will be taken to finish the work.