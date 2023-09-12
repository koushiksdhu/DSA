// Given N integers, find the XOR of all subsets.
// Input: arr[] = {1, 3, 2}
// Output: 0
// Explanation: Subsets are: {1}, {2}, {3}, {1, 3}, {1, 2} {3, 2}, {1, 3, 2} .......  

// No. of subsets: 2^(No. of elements present in an array).
/*
 * Answer will always be 0 irrespective of the input.
 */

 // In bits (2^N-1) can be written as: (1 << N) - 1

import java.util.*;
public class printXorOfAllSubsets {
    public static void main(String args[]){
        int arr[] = {1, 3, 2};
        // Answer will always be 0. Occurences of every element is same which is in even number.
        // But there will be problem if the array contains only single element.
        System.out.println("XOR: "+0);
    }
}
