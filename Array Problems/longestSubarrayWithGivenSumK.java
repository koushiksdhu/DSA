/* Given an array and a sum k, we need to print the length of the longest subarray that sums to k.

Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

Example 2:
Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
Result: 3
Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.
*/

/* Approach:

* First, we will run a loop(say i) that will select every possible starting index of the subarray.
* The possible starting indices can vary from index 0 to index n-1(n = size of the array).
* Inside the loop, we will run another loop(say j) that will signify the ending index of the subarray.
* For every subarray starting from the index i, the possible ending index can vary from index i to n-1(n = size of the array).
* After that for each subarray starting from index i and ending at index j (i.e. arr[i….j]),
* we will run another loop to calculate the sum of all the elements(of that particular subarray).
* If the sum is equal to k, we will consider its length i.e. (j-i+1). Among all such subarrays,
* we will consider the maximum length by comparing all the lengths.
*/

import java.util.*;

// * METHOD 1: Naive Approach - O(N^3)

// public class longestSubarrayWithGivenSumK {
//     public static void main(String args[]){
//         int arr[] = {2,3,5,1}
//         int s = 5;
//         int sum = 0;
//         int len = 0;

//         for(int i = 0; i < arr.length; i++){
//             for(int j = i; j < arr.length ; j++){
//                 sum = 0;
//                 for(int k = i; k <= j; k++){
//                     System.out.print(arr[k]+" ");
//                     sum += arr[k];
//                 }
//                 System.out.print(" ----> "+sum);
//                 if(sum == s && j-i+1 > len){
//                     len = j-i+1;
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("Maximum length with sum "+s+" is: "+len+" "+max);
//     }
// }

// Time Complexity: O(N^3)
// Space Complexity: O(1)


// * METHOD 2: Optimizing Naive Approach - O(N^2)

// public class longestSubarrayWithGivenSumK{
//     public static void main(String args[]){
//         int arr[] = {2, 3, 5, 1};
//         int s = 5;
//         int sum = 0;
//         int len = 0;

//         for(int i = 0; i < arr.length; i++){
//             sum = 0;
//             for(int j = i; j < arr.length; j++){
//                 sum += arr[j];
//                 if(sum == s)
//                     len = Math.max(len, j-i+1);
//             }
//         }
//         System.out.println("Length: "+len);
//     }
// }

// Time Complexity: O(N^2)
// Space Complexity: O(1)


// * METHOD 3: Using HashMap - Best for positive and negative elements.

public class longestSubarrayWithGivenSumK{
    public static void main(String args[]){
        int arr[] = {-13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6};
        int k = 15;
        
        HashMap<Integer, Integer> preSum = new HashMap<>();     // HashMap

        int sum = 0, maxL = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

            if(sum == k)
                maxL = Math.max(maxL, i+1);

            int rem = sum - k;
            if(preSum.containsKey(rem)){
                int len = i - preSum.get(rem);
                maxL = Math.max(maxL, len);
            }

            if(!preSum.containsKey(sum))
                preSum.put(sum, i);
            
        }
        System.out.println("Length: "+maxL);
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N)


// * METHOD 4: Most Optimized Code - Using two pointer & greedy approach (will work only if an array contains only positive elements)

// public class longestSubarrayWithGivenSumK{
//     public static void main(String args[]){
//         int arr[] = {2, 3, 5, 4};
//         int k = 5;

//         int i = 0, j = 0;
//         int maxL = 0;
//         int sum = arr[0];

//         while(j < arr.length){
//             while(i <= j && sum > k)
//                 sum -= arr[i++];

//             if(sum == k)
//                 maxL = Math.max(maxL, j-i+1);
            
//             j++;
//             if(j < arr.length)
//                 sum += arr[j];
//         }
//         System.out.println("Length: "+maxL);
//     }
// }

// * Time Complexity: O(N+N), where N = size of the given array.
// Reason: The outer while loop i.e. the right pointer can move up to index n-1(the last index). Now, the inner while loop i.e.
// the left pointer can move up to the right pointer at most. So, every time the inner loop does not run for n times rather
// it can run for n times in total. So, the time complexity will be O(2*N) instead of O(N2).

// * Space Complexity: O(1) as we are not using any extra space.
