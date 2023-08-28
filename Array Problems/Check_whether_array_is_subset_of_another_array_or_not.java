/* Write a program to find whether an array is a subset of another array or not.

Given arr1[] and arr2[], we need to find whether arr1[] is a subset of arr2[]. An array is called a subset of another if all of its elements are present in the other array.
Note: Array elements are assumed to be unique.

Example 1:
Input: arr1[]= [1,3,4,5,2],              arr2[]= [2,4,3,1,7,5,15]
Output: arr1[] is a subset of arr2[]

Example 2:
Input: arr1[]= [1,3,4,5,2].             arr2[]= [4,5,2]
Output: arr1[] is not a subset of arr2[]

Example 3:
Input: arr1[]= [1,3,4,5,2],             arr2[]= [11,12,13,15,16]
Output: arr1[] is not a subset of arr2[] */

// * METHOD 1: Brute Force

// public class Q23 {
//     public static void main(String args[]){
//         int arr1[] = {1,3,4,5,2};
//         int arr2[] = {2,4,3,1,7,5,15};

//         if(arr1.length > arr2.length){
//             System.out.println("arr1[] is not a subset of arr2[]");
//             System.exit(0);
//         }

//         boolean present = false;
//         for(int i = 0; i < arr1.length; i++){
  
//             for(int j = 0; j < arr2.length; j++){
//                 if(arr2[i] == arr1[j]){
//                     present = true;
//                     break;
//                 }
//             }
//             if(present){
//                 System.out.println("arr1[] is a subset of arr2[]");
//                 break;
//             }
//         }
//         if(!present)
//             System.out.println("arr1[] is not a subset of arr2[]");
//     }
// }

// Time Complexity: O(N*N)
// Space Complexity: O(1)

// * METHOD 2: Using ArrayList:

// import java.util.*;
// public class Q23{
//     public static void main(String args[]){
//         int arr1[] = {1,3,4,5,2};
//         int arr2[] = {2,4,3,1,7,5,15};

//         if(arr1.length > arr2.length){
//             System.out.println("arr1[] is not a subset of arr2[]");
//             System.exit(0);
//         }

//         ArrayList<Integer> list = new ArrayList<>();

//         for(int i : arr2)
//             list.add(i);

//         boolean present = false;
//         for(int i = 0; i < arr1.length; i++){
//             if(list.contains(arr1[i])){
//                 present = true;
//                 break;
//             }
//         }
//         if(present)
//             System.out.println("arr1[] is a subset of arr2[]");
//         else
//             System.out.println("arr1[] is not a subset of arr2[]");
//     }
// }

// Time Complexity: O(N)
// Space Comoplexity: O(N)


// * METHOD 3: Using Binary Search:

import java.util.*;
public class Check_whether_array_is_subset_of_another_array_or_not{
    public static void main(String args[]){
        int arr1[] = {1,3,4,5,2};
        int arr2[] = {2,4,3,1,7,5,15};

        if(arr1.length > arr2.length){
            System.out.println("arr1[] is not a subset of arr2[]");
                System.exit(0);
        }
        boolean present = false;
        Arrays.sort(arr1);

        for(int i = 0; i < arr2.length; i++){
            if(binarySearch(arr1, arr2[i])){
                present = true;
                break;
            }
        }
        if(present)
            System.out.println("arr1[] is a subset of arr2[]");
        else
            System.out.println("arr1[] is not subset of arr2[]");
    }

    // Binary Search:

    static boolean binarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == key)
                return true;
            else if(arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }
}

// Time Complexity: O(NlogN) + O(MlogM)
// Space Complexity: O(1)