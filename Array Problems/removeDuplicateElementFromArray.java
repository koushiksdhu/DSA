/* Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element
appears only once. The relative order of the elements should be kept the same.
If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. 
It does not matter what you leave beyond the first k elements.

Note: Return k after placing the final result in the first k slots of the array.

Example 1: 
Input: arr[1,1,2,2,2,3,3]
Output: arr[1,2,3,_,_,_,_]
Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

Example 2: 
Input: arr[1,1,1,2,2,3,3,3,3,4,4]
Output: arr[1,2,3,4,_,_,_,_,_,_,_]
Explanation: Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class removeDuplicateElementFromArray{
//     public static void main(String args[]){
//         int arr[] = {1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 6, 7, 7, 7, 7, 7 , 8, 8};
//         for(int i = 0; i < arr.length - 1; i++){
//             for(int j = i+1; j < arr.length;  j++){
//                 if(arr[i] == arr[j]){
//                     arr[j] = 0;
//                 }
//             }
//         }
//         // System.out.println(Arrays.toString(arr));

//         for(int i = 0; i < arr.length; i++){
//             for(int j = 0; j < arr.length - 1; j++){
//                 if(arr[j] == 0){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         // System.out.println(Arrays.toString(arr));

//         int i = -1;
//         while(arr[++i] != 0);

//         for(int j = 0; j < i; j++)
//             System.out.print(arr[j]+" ");
//     }
// }

// Time Complexity: O(N*N)
// Space Complexity: O(1)


// * METHOD 2: Using ArrayList

// public class removeDuplicateElementFromArray{
//     public static void main(String args[]){
//         int arr[] = {1, 2, 2, 3, 3, 5, 7, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9};
        
//         ArrayList<Integer> al = new ArrayList<>();
//         for(int i : arr){
//             if(!(al.contains(i)))
//                 al.add(i);
//         }
//         System.out.print("Array with distinct elements: ");
//         for(int i : al)
//             System.out.print(i+" ");
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(N)


// * METHOD 3: Using two pointer
// Array must be sorted or sort the array if not already sorted.

public class removeDuplicateElementFromArray{
    public static void main(String args[]){
        int arr[] = {1, 2, 2, 3, 3, 5, 7, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9};
        
        // Important Algorithm
        int i = 0;
        for(int j = 1; j < arr.length; j++){            
            if(arr[i] != arr[j]){       // means we got one unique element. so, Increment i by 1.
                i++;
                arr[i] = arr[j];
            }
        }

        System.out.print("Array with distinct elements: ");
        for(int j = 0; j <= i; j++)
            System.out.print(arr[j]+" ");
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)
