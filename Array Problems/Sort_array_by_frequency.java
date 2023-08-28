/* Given an array of integers, having some duplicate elements, sort the array by frequency.

Example 1:
Input: N = 8, array[] = {1,2,3,2,4,3,1,2}
Output: 2 2 2 1 1 3 3 4 
Explanation: Since  2 is present 3 times in an array , so print it 3 times ,then print ‘1’ 2 times and then ‘3’ 2 times and 4 has least frequency, it will be printed at last.

Example 2:
Input: N = 6, array[] = {-199,6,7,-199,3,5}
Output: -199 -199 3 5 6 7
Explanation: Since -199 is present 2 times so it will be printed at first , then 3 , 5 ,6 ,7 are present once in array , so print them in their sorted order.
 */

import java.util.*;

// * METHOD 1: Brute Force:

public class Sort_array_by_frequency{
    public static void main(String args[]){
        int arr[] = {-199,6,7,-199,3,5};
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        int mat[][] = new int[arr.length][2];

        for(int i = 0, k = 0; i < mat.length; i++){
         
            if(i == 0){
                mat[k][0] = arr[i];
                mat[k][1] = 1;
                k++;
            }
            else if(arr[i] == mat[k-1][0]){
                mat[k-1][1] = mat[k-1][1] + 1;
            }
            else if(arr[i] != mat[k-1][0]){
                mat[k][0] = arr[i];
                mat[k][1] = 1;
                k++;
            }
        }

        // Sorting 2d array:
        for(int i = 0; i < mat.length - 1; i++){
            for(int j = 0; j < mat.length - 1 - i; j++){
                if(mat[j][1] < mat[j+1][1])
                    swap(mat, j, j+1);
            }
        }

    for(int i = 0, k = 0; i < mat.length; i++){
        if(mat[i][0] == 0 && mat[i][1] == 0)
            break;
        for(int j = 0; j < mat[i][1]; j++)
            arr[k++] = mat[i][0];
    }

    System.out.println(Arrays.toString(arr));
}
    // Swapping the value:
    static void swap(int arr[][], int i, int j){
        int temp = arr[i][0];
        arr[i][0] = arr[j][0];
        arr[j][0] = temp;

        temp = arr[i][1];
        arr[i][1] = arr[j][1];
        arr[j][1] = temp;
    }
}

// Time Complexity: O(N*N)
// Space Complexity: O(N)


 // * METHOD 2: Using HashMap

// public class Q19 {
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,2,4,3,1,2};

//         HashMap<Integer, Integer> hm = new HashMap<>();

//         for(int i = 0; i < arr.length; i++)
//             hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);

//         ArrayList<Map.Entry<Integer, Integer>> al = new ArrayList<>(hm.entrySet());

//         Collections.sort(al, new Comparator<Map.Entry<Integer, Integer>>(){
//             public int compare(Map.Entry<Integer, Integer> n1, Map.Entry<Integer, Integer> n2){
//                 if(n1.getValue() == n2.getValue())
//                     return n1.getKey() - n2.getKey();
//                 else
//                     return n2.getValue() - n1.getValue();
//             }
//         });

//         int j = 0;

//         for(Map.Entry<Integer, Integer> a : al){

//             for(int i = 0; i < a.getValue(); i++)
//                 arr[j++] = a.getKey();

//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(N)