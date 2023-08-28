/*Given an array of N integers, the task is to replace each element of the array by its rank in the array.

Examples:

Example 1:
Input: 20 15 26 2 98 6
Output: 4 3 5 1 6 2
Explanation: When sorted,the array is 2,6,15,20,26,98. So the rank of 2 is 1,rank of 6 is 2,rank of 15 is 3 and so…

Example 2:
Input: 1 5 8 15 8 25 9
Output: 1, 2, 3, 6, 4, 7, 5
Explanation: When sorted,the array is 1,5,8,8,9,15,25. So the rank of 1 is 1,rank of 5 is 2,rank of 8 is 3 and so… */

import java.util.*;

// * METHOD 1: Brute Force

// public class Q18 {
//     public static void main(String args[]){
//         int arr[] = {1, 5, 8, 15, 8, 25, 9};
//         int temp[] = arr.clone();
//         Arrays.sort(temp);

//         for(int i = 0; i < arr.length; i++){
//             for(int j = 0; j < temp.length; j++){
//                 if(arr[i] == temp[j]){
//                     temp[j] = -1;
//                     arr[i] = j + 1;
//                     break;
//                 }
//             }
//         }
//         for(int i : arr)    
//             System.out.print(i+" ");
//     }    
// }

// Time Complexity: O(N*N)
// Space Complexity: O(N)



// * METHOD 2:
import java.util.*;
public class Replace_elements_by_its_rank{
    public static void main(String[] args) {
        int arr[] = {20, 15, 26, 2, 98, 6};
        int temp[] = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < temp.length; i++)
            hm.put(temp[i], i+1);

        for(int i = 0; i < arr.length; i++)
            arr[i] = hm.get(arr[i]);

        for(int i : arr)
            System.out.print(i+" ");
    }
}

// Time Complexity: O(NlogN)
// Space Complexity: O(N)
