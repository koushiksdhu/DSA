/** Question 5: Given an array, we have found the number of occurrences of each element in the array. 

Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
	 5  2
        15  1
Explanation: 10 occurs 3 times in the array
	      5 occurs 2 times in the array
              15 occurs 1 time in the array

Example2: 
Input: arr[] = {2,2,3,4,4,2};
Output: 2  3
	3  1
        4  2
Explanation: 2 occurs 3 times in the array
	     3 occurs 1 time in the array
             4 occurs 2 time in the array

*/

// METHOD 1: Using Boolean Array.

// public class Q5 {
//     public static void main(String args[]){
//         int arr[] = {2,2,3,4,4,2};
//         boolean visited[] = new boolean[arr.length];
//         int count = 0;

//         for(int i = 0; i < arr.length; i++){
//             if(visited[i] == true)
//                 continue;
//             count = 1;
//             for(int j = i + 1; j < arr.length; j++){
//                 if(arr[i] == arr[j]){
//                     count++;
//                     visited[j] = true;
//                 }
//             }

//             System.out.println(arr[i]+" appears "+count+" times in the array.");
//         }
//     }
// }

// Time Complexity: O(n x n)
// Space Complexity: O(n).

// METHOD 2: Using HashMap.

import java.util.*;
public class No_of_occurences_of_each_element{
    public static void main(String args[]){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int arr[] = {2,2,3,4,4,2};
        for(int i = 0; i < arr.length; i++){
            if(hm.containsKey(arr[i]))
                hm.put(arr[i], hm.get(arr[i]) + 1);
            else
                hm.put(arr[i], 1);
        }
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            System.out.println(entry.getKey()+" appears "+entry.getValue()+" times in the array.");
        }
    }
}
