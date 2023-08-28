/* Given two sorted arrays, arr1, and arr2 of size n and m. Find the Intersection of two sorted arrays.
The Intersection of two arrays can be defined as the common elements in the two arrays.
NOTE: Elements in the union should be in ascending order.

Example 1:
Input:
n = 5,m = 5.
arr1[] = {1,2,3,4,5}  
arr2[] = {1,4,5,7,8}
Output: {1,4,5}

Explanation: Common Elements in arr1 and arr2  are:  1, 4, 5
*/

import java.util.*;

// * METHOD 1: Using two pointer
// Array must be sorted.

// public class IntersectionOfTwoArray {
//     public static void main(String args[]){
//         int arr1[] = {1,2,3,4,5} ; 
//         int arr2[] = {1,4,5,7,8};

//         ArrayList<Integer> intr = new ArrayList<>();

//         int i = 0, j = 0;

//         while(i < arr1.length && j < arr2.length){
//             if(arr1[i] == arr2[j]){
//                 intr.add(arr1[i]);
//                 i++;
//                 j++;
//             }
//             else if(arr1[i] < arr2[j])
//                 i++;
//             else
//                 j++;
//         }
//         System.out.println(Arrays.toString(intr.toArray()));
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(N)


// * METHOD 2: Using ArrayList

public class IntersectionOfTwoArray {
    public static void main(String args[]){
        int arr1[] = {1,2,3,4,5} ; 
        int arr2[] = {1,4,5,7,8};

        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i : arr1)
            temp.add(i);
        
        for(int i : arr2){
            if(temp.contains(i))
                ans.add(i);
        }

        System.out.println(Arrays.toString(ans.toArray()));
    }
}

// Time Complexity: O(N+N)
// Space Complexity: O(N+N)
