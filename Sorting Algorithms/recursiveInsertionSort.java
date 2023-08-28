/* Given an array of N integers, write a program to implement the Recursive Insertion Sort algorithm.

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

public class recursiveInsertionSort {
    public static void main(String args[]){
        
        int arr[] = {1, 4, 7, 8, 8, 8, 5, 5, 2, 3, 6, 9, 10};
        InsertionSort(arr, 0);
        System.out.println("Sorted String: "+Arrays.toString(arr));
    }
    static void InsertionSort(int arr[], int i){
        if(arr.length == i) return;     // base case

        int j = i;
        while(j > 0 && arr[j-1] > arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        InsertionSort(arr, i+1);
    } 
}

// Time Complexity: O(N*N)
// Space Complexity: O(N), Due to Auxiliary Stack Space.
