/* Question 15: Find all the non-repeating elements for a given array. Outputs can be in any order.

Example 1:
Input: arr = [1,2,-1,1,3,1]
Output: 2,-1,3
Explanation: 1 is the only element in the given array which occurs thrice in the array. -1,2,3 occurs only once and hence, these are non-repeating elements of the given array.

Example 2:
Input: arr = [1,2,3]
Output: 1,2,3
Explanation: All elements present in the array occur once. Hence, every element is non-repeating.

*/

import java.util.*;

// METHOD 1:  Brute Force Approach.

// public class Q15{
//     public static void main(String args[]){
//         int arr[] ={1,2,2,2,2,2,3,4,4,4,4,5,6,6,6,6,7,8,8,8,8,9,10,10,10,10,11};
//         boolean flag = false;
//         System.out.print("Non Repeating Elements are: ");
//         for(int i = 0; i < arr.length; i++){
            
//             flag = false;

//             if(arr[i] != 0){

//             for(int j = i+1; j < arr.length; j++){
//                 if(arr[i] == arr[j]){
//                     arr[j] = 0;
//                     flag = true;
//                 }
//             }

//             if(flag == false)
//                 System.out.print(arr[i]+" ");
//             }
//         }
//     }
// }

// Time Complexity: O(n*n)
// Space Complexity: O(1)


// METHOD 2:  Using Sorting: If only atmost 2 duplicates of each element is present then only it will work fine, Otherwise not. 

// public class Q15{
//     public static void main(String args[]){
//         int arr[] = {1,2,-1,4,1,3,5,4,1,4};
//         Arrays.sort(arr);
//         System.out.println("Non Repating Elements are: ");
//         for(int i = 0; i < arr.length - 1; i++){        // Handling first to (n-1) elements.
//             if(arr[i] != arr[i+1])
//                 System.out.print(arr[i]+" ");
//         }
//         if(arr[arr.length - 2] != arr[arr.length - 1])  // Handling the last element i.e., (n-1).
//             System.out.print(arr[arr.length - 1]);
//     }
// }


// METHOD 3:  Using HashMap

public class Find_non-repeating_elements {
    public static void main(String args[]){
        int arr[] = {1,2,-1,1,3,1,4,5,6,7,8,9,10,10,10,2,2,3,44,55,22,747,8855,11,22};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int x : arr){
            if(hm.containsKey(x))
                hm.put(x, hm.get(x) + 1);
            else
                hm.put(x, 1);
        }

        System.out.println("Non Repeating Elements are: ");
        for(Map.Entry<Integer, Integer> m : hm.entrySet()){
            if(m.getValue() == 1)
                System.out.print(m.getKey()+" ");
        }       
    }    
}

// Time Complexity: O(n)    Iteration to store the elements into HashMap.
// Space Complexity: O(n)   HashMap Space.
