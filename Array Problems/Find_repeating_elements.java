/* Question 14: Find all the repeating elements present in an array.

Example 1:
Input: arr[] = [1,1,2,3,4,4,5,2]
Output: 1,2,4
Explanation: 1,2 and 4 are the elements which are occurring more than once.

Example 2:
Input: arr[] = [1,1,0]
Output: 1
Explanation: Only 1 is occurring more than once in the given array.
 
*/
import java.util.*;
import java.util.Map.Entry;

// METHOD 1: Brute Force: Using additional array.

// public class Q14 {
//     public static void main(String args[]){
//         int arr[] = {1,1,2,3,4,4,5,2};
//         int arr1[] = new int[arr.length];

//         boolean flag = false;

//         for(int i = 0, k = 0; i < arr.length; i++){
//             flag = false;
//             if(arr[i] != 0){
//             for(int j = i + 1; j < arr.length; j++){
//                 if(arr[i] == arr[j]){
//                     arr[j] = 0;
//                     flag = true;
//                 }
//             }
//             if(flag == true)
//                 arr1[k++] = arr[i];
//             }
//         }
//         System.out.println("Repeating ELements are: "+Arrays.toString(arr1));
//     }    
// }

// Time Complexity: O(n*n)
// Space Complexity: O(n)   // If would have been directly printed the value then there is no need of this space.


// METHOD 2: By Sorting -> If only two duplicates of each element is present then only this approach will work.

// public class Q14{
//     public static void main(String args[]){
//         int arr[] = {1,1,2,3,4,4,5,2,5};
//         Arrays.sort(arr);
//         for(int i = 0; i < arr.length - 1; i++){
//             if(arr[i] == arr[i+1])
//                 System.out.print(arr[i] + " ");
//         }
//     }
// }

// Time Complexity: O(nlogn)
// Space COmplexity: O(1)

// METHOD 3: Using HashMap

public class Find_repeating_elements{
    public static void main(String args[]){
        int arr[] = {1,1,2,3,4,4,5,2,5,1,2,3,4,5,6,7,8,9,1,1,1,1,2,5,4,2,3,6,9,8,7,4,1,2,5,8,9,6,3,2,5,7,4,5};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int x : arr){
            if(hm.containsKey(x))
                hm.put(x, hm.get(x) + 1);
            else
                hm.put(x, 1);
        }
        System.out.print("Repeating Elements are: ");
        for(Map.Entry<Integer, Integer> m : hm.entrySet()){
            if(m.getValue() > 1)
                System.out.print(m.getKey()+" ");
        }
    }
}

// Time Complexity: O(n)    Traversed the entire array.
// Space Complexity: O(n)   Map is used to store and count the frequency of each elements.
