/* Given an array of integers, rotating array of elements by k elements either left or right.

Example 1:
Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
Output: 6 7 1 2 3 4 5
Explanation: array is rotated to right by 2 position .

Example 2:
Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
Output: 9 10 11 3 7 8
Explanation: Array is rotated to right by 3 position.
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class Q20 {
//     public static void main(String args[]){
//         int arr[] = {1, 7, 2, 14, 3, 21, 4, 28, 5, 35, 10};
//         int k = 11;
//         int temp[] = new int[arr.length];

//         for(int i = 0; i < arr.length; i++){
//             if(i < k)
//                 temp[i] = arr[arr.length - k + i];
//             else
//                 temp[i] = arr[i - k]; 
//         }

//     //     for(int i = arr.length - k; i < arr.length; i++){
//     //         temp[idx++] = arr[i];
//     //    }
//     //    for(int i = 0; i < arr.length - k; i++){
//     //         temp[idx++] = arr[i];
//     // }

//     System.out.println(Arrays.toString(temp));
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(N)

// * METHOD 2: Brute Force: LEFT ROTATION

// public class Q20{
//     public static void main(String args[]){
//         int arr[] = {1, 2, 3, 4, 5, 6, 7};
//         int k = 2;
//         int temp[] = new int[k];

//         for(int i = arr.length - k , pt = 0; i < arr.length; i++)
//             temp[pt++] = arr[i];
        
//         for(int i = arr.length - k - 1; i >= 0; i--)
//             arr[i+k] = arr[i];

//         for(int i = 0; i < k; i++){
//             arr[i] = temp[i];
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(K)       // where, k is the size of the temp array which is equal to the number of rotation to be performed.


// * METHOD 3: Brute Force: RIGHT ROTATION

// public class Q20{
//     public static void main(String args[]){
//         int arr[] = {1, 2, 3, 4, 5, 6, 7};
//         int k = 4;

//         int temp[] = new int[k];
//         for(int i = 0; i < k; i++)
//             temp[i] = arr[i];


//         for(int i = 0; i < arr.length - k; i++)
//             arr[i] = arr[k+i];


//         for(int i = arr.length - k, a = 0; i < arr.length; i++)
//             arr[i] = temp[a++];
      
//         System.out.println(Arrays.toString(arr));
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(N)


// * METHOD 4: Left Rotation using REVERSAL ALGORITHM
// Just Reverse 0 to N -K - 1, N - K to N - 1 and 0 to N - 1.

// public class Q20{
//     public static void main(String args[]){
//         int arr[] = {1, 2, 3, 4, 5, 6, 7};
//         int k = 2;
//         reverse(arr, 0, arr.length - k - 1);
//         reverse(arr, arr.length - k, arr.length - 1);
//         reverse(arr, 0, arr.length - 1);
//         System.out.println(Arrays.toString(arr));
//     }
//     static void reverse(int arr[], int start, int end){
//         while(start <= end){
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(1)


// * METHOD 4: Right Rotation using REVERSAL ALGORITHM
// Just Reverse 0 to K - 1, K to N - 1 and 0 to N - 1.

public class Rotate_by_K_elements_left_or_right{
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int arr[], int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)
