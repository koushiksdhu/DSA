/* Question 16: Given an array of pairs, find all the symmetric pairs in the array.

Example 1:
Input: (1,2),(2,1),(3,4),(4,5),(5,4)
Output: (2,1) (5,4)
Explanation: Since (1,2) and (2,1) are symmetric pairs and (4,5) and (5,4) are symmetric pairs.

Example 2:
Input: (1,5),(2,3),(4,2),(5,1),(2,4)
Output: (2,4) (5,1)
Explanation: Since (1,5) and (2,4) are symmetric pairs and (5,1) and (4,2) are symmetric pairs.
*/

// METHOD 1: Brute Force Approach Using Nested Loop.

// public class Q16 {
//     public static void main(String args[]){
//         int arr[][] = {
//             {1, 2},
//             {2, 1},
//             {3, 4},
//             {4, 5},
//             {5, 4}
//         };

//         for(int i = 0; i < arr.length; i++){
//             for(int j = i+1; j < arr.length; j++){
//                 if(arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0])
//                     System.out.println("("+arr[i][1]+","+arr[i][0]+")");
//             }
//         }
//     }    
// }

// Time Complexity: O(n*n)
// Space Complexity: O(1)

// METHOD 2: Using HashMap
import java.util.HashMap;

public class Find_symmetric_pairs{
    public static void main(String args[]){
        int arr[][] = {
            {1, 2},
            {2, 1},
            {3, 4},
            {4, 5},
            {5, 4}
        };

        HashMap<Integer, Integer> hm = new HashMap<>();

        System.out.print("The Symmetric Pairs are: \n");

        for(int i = 0; i < arr.length; i++){
            if(hm.get(arr[i][1]) != null && hm.get(arr[i][1]) == arr[i][0])
                System.out.print("("+arr[i][0]+","+arr[i][1]+") ");
            else
                hm.put(arr[i][0], arr[i][1]);
        }
        System.out.println();
        // * To Iterate through the Map:
        // for(Map.Entry<Integer, Integer> e : hm.entrySet())
        //     System.out.println(e.getKey()+" -> "+e.getValue());
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)