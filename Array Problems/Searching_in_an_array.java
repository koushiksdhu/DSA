/* Search an element in an array and return its position.

Example 1:
Input: array[] = {1,2,3,4,5} k=3                                                                              
Output: 2
Explanation: The answer is 2 because 3 is present at 2nd index.

Example 2:
Input: array[]={6,7,9,5,3,10} k=10
Output: 5
Explanation: The answer is 5 because 10 is present at 5th index. */

// * METHOD 1:Linear Seach

// public class Q22 {
//     public static void main(String args[]){
//         int arr[] = {6, 7, 9, 5, 3, 10};
//         int key = 11;
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] == key){
//                 System.out.println("Key found at index "+i);
//                 break;
//             }
//             if(i == arr.length - 1)
//                 System.out.println("Key does not found");
//         }
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(1)

// * METHOD 2: Binary Search (Array must be sorted in order to perform Binary Search)

public class Searching_in_an_array{
    public static void main(String args[]){
        int arr[] = {6, 8, 10, 11, 12, 14, 16, 19, 20};
        int key = 6;
        int start = 0;
        int end = arr.length - 1;
        boolean found = false;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(key == arr[mid]){
                System.out.println("Key found at index "+mid);
                found = true;
                break;
            }
            else if(key > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        if(!found)
            System.out.println("Key does not found");
    }
}

// Time Complexity: O(logN)
// Space Complexity: O(1)


