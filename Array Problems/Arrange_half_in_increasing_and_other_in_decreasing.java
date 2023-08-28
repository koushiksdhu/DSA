/**Question 6: Rearrange the array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order 
 
Example 1:
Input: 8 7 1 6 5 9
Output: 1 5 6 9 8 7
Explanation: First three elements are in the ascending order and next three elements are in the descending order.

Example 2:
Input: 4 2 8 6 15 5 9 20
Output: 2 4 5 6 20 15 9 8

*/
import java.util.*;
public class Arrange_half_in_increasing_and_other_in_decreasing {
    public static void main(String args[]){
        int arr[] = {8, 7, 1, 6, 5, 9};
        Arrays.sort(arr);
        int n = arr.length - 1;
        int i = n/2+1, j = n;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; 
            j--;
        }
        System.out.print("Output: ");
        for(int k : arr){
            System.out.print(k+" ");
        }
    }
}

// Time Complexity: O(nlogn).
// Space Complexity: O(1).
