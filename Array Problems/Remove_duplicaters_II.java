/*Question 12: Given an unsorted array, remove duplicates from the array.

Example 1:
Input: arr[]={2,3,1,9,3,1,3,9}
Output:  {2,3,1,9}

Explanation: Removed all the duplicate elements

Example 2:
Input: arr[]={4,3,9,2,4,1,10,89,34}
Output: {3,4,9,2,1,10,34,89}
Explanation: Removed all the duplicate elements

 */


import java.util.*;

// METHOD 1: Using Brute Force Approach: Two Arrays.

// public class Q12 {
//     public static void main(String args[]){
//         int arr[] = {1, 1, 2, 2, 3, 4, 3, 4, 5, 6, 4, 2, 1, 7, 7, 8, 7, 9, 10, 10, 8, 10};
//         System.out.println(Arrays.toString(arr));
//         int arr1[] = new int[arr.length];
//         for(int i = 0, k = 0; i < arr.length; i++){
//             if(arr[i] != 0){
//             for(int j = i+1; j < arr.length; j++){
//                 if(arr[i] == arr[j])
//                     arr[j] = 0;
//             }
//         }
//     }
//     for(int i = 0, k = 0; i < arr.length; i++){
//         if(arr[i] != 0)
//             arr1[k++] = arr[i];
//     }
//     System.out.println(Arrays.toString(arr1));
//     }
// }

// Time Complexity: O(n*n) + O(n)
// Space Complexity: O(n)

// METHOD 2: Using HashSet

public class Remove_duplicaters_II{
    public static void main(String args[]){
        int arr[] = {1, 1, 2, 2, 3, 4, 3, 4, 5, 6, 4, 2, 1, 7, 7, 8, 7, 9, 10, 10, 8, 10};
        HashSet<Integer> hs = new HashSet<>();
        for(int x : arr)                    // Storing the array elements into the HashSet.
            hs.add(x);
    int i = 0;    
    for(int x : hs)                         // Storing the HashSet value into an Array.
        arr[i++] = x;
        
    for(int j = i; j < arr.length; j++)     // Putting Zero in the remaining pockets.
        arr[j] = 0; 

    System.out.println(Arrays.toString(arr));

    }
}

// Time Complexity: O(n).
// Space Complexity: O(n).