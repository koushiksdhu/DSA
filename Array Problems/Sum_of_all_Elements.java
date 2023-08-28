
/**
 Question 7: Given an array, we have to find the sum of all the elements in the array.
 
 Example 1:
 Input: N = 5, array[] = {1,2,3,4,5}
 Output: 15
 Explanation: Sum of all the elements is 1+2+3+4+5 = 15
 
 Example 2:
 Input:  N=6, array[] = {1,2,1,1,5,1}
 Output: 11
 Explanation: Sum of all the elements is 1+2+1+1+5+1 = 11
 */

import java.util.stream.IntStream;
public class Sum_of_all_Elements {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        // int sum = 0;
        // for(int i : arr)
        //     sum += i;
        
        // OR
        
        int sum = IntStream.of(arr).sum();      // Sum using IntStream.of()
        System.out.println("Sum: "+sum);
    }
}

// Time Complexity: O(n)
// Time Complexity: O(1)
