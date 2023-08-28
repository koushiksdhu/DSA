/** Question 4: Problem Statement: You are given an array. The task is to reverse the array and print it. 
 
Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

Example 2:
Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
 */

import java.util.Scanner;


// METHOD 1: By Taking a new Array.

// public class Q4 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the array elements: ");
//         for(int i = 0; i < arr.length; i++) {
//             System.out.print("\n Enter Element "+i+": ");
//             arr[i] = sc.nextInt();
//         }

//         int arr1[] = new int[arr.length];
//         for(int i = 0; i < arr.length; i++) {
//             arr1[i] = arr[arr.length - i - 1];
//         }

//         System.out.print("Reversed Array is: ");
//         for(int k : arr1)
//             System.out.print(k+" ");
//     }
// }

// Time Complexity: O(n).
// Time Complexity: O(n).

 // METHOD 2: By Modifying the same array using two pointers.

public class Reverse_Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print("\n Enter Element "+i+": ");
            arr[i] = sc.nextInt();
        }

        // Swapping Operations.

        int i = 0, j = arr.length - 1, temp = 0;
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.print("Reversed Array is: ");
        for(int k : arr)
            System.out.print(k+" ");
    }
}

// Time Complexity: O(n).
// Time Complexity: O(1).

// METHOD 3: Recursive Method.

// public class Q4 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the array elements: ");
//         for(int i = 0; i < arr.length; i++) {
//             System.out.print("\n Enter Element "+i+": ");
//             arr[i] = sc.nextInt();
//         }

//         reverseArray(arr, 0, arr.length - 1);               // Method Call.

//         System.out.print("Reversed Array is: ");
//         for(int k : arr)
//             System.out.print(k+" ");
//     }


//     static void reverseArray(int arr[], int start, int end){    // Reverse Array Method.
//         if(start < end){
//             swapArray(arr, start, end);
//             reverseArray(arr, start+1, end-1);
//         }
//     }

//     static void swapArray(int arr[], int i, int j){             // Swap Method.
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//     }
// }

// Time Complexity: O(n).
// Space Complexity: O(1).


// METHOD 4: Using Collection Framework.
// import java.util.Arrays;
// import java.util.Collections;
// public class Q4 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = sc.nextInt();
//         Integer arr[] = new Integer[n];
//         System.out.println("Enter the array elements: ");
//         for(int i = 0; i < arr.length; i++) {
//             System.out.print("\n Enter Element "+i+": ");
//             arr[i] = sc.nextInt();
//         }

//         reverse(arr);     // Using Collection Framework.

//         System.out.print("Reversed Array is: ");
//         for(int k : arr)
//             System.out.print(k+" ");
//     }

//     static void reverse(Integer arr[]){
//         Collections.reverse(Arrays.asList(arr));
//     }
// }

// Time Complexity: O(n).
// Space Complexity: O(1).


