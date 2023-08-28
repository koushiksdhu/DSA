/* Finding Equilibrium index in an array.

Given a 0-indexed integer array nums, find the leftmost equilibrium Index.
An equilibrium Index is an index at which sum of elements on its left is equal to the sum of element on its right.
That is, nums[0] + nums[1] + … + nums[equilibriumIndex-1] == nums[equilibriumIndex+1] + nums[equilibriumIndex+2] + … + nums[nums.length-1].
If equilibriumIndex == 0, the left side sum is considered to be 0.
Similarly, if equilibriumIndex == nums.length – 1, the right side sum is considered to be 0.
Return the leftmost equilibrium Index that satisfies the condition, or -1 if there is no such index.

Example 1:
Input: nums = [2,3,-1,8,4]
Output: 3
Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
The sum of the numbers after index 3 is: 4 = 4

Example 2:
Input: nums = [1,-1,4]
Output: 2
Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
The sum of the numbers after index 2 is: 0
*/


// * METHOD 1: Brute Force - Using two loops

// public class Q21 {
//     public static void main(String args[]){
//         int arr[] = {1,-1,4};
//         int sum1 = 0, sum2 = 0;
//         boolean equal = false;

//         for(int i = 0; i < arr.length; i++){
//             sum1 = 0;
//             sum2 = 0;
//            for(int j = 0; j < i; j++)
//                 sum1 += arr[j];
//            for(int j = i + 1; j < arr.length; j++)
//                 sum2 += arr[j];

//             if(sum1 == sum2){
//                 System.out.println(i);
//                 equal = true;
//                 break;
//             }
//         }
//         if(equal == false)
//             System.out.println(-1);
//     }
// }

// Time Complexity: O(N*N)
// Space Complexity: O(1)

// * METHOD 2: Optimized Code:

public class Find_equilibrium_index{
    public static void main(String args[]){
        int arr[] = {2,3,-1,8,4};

        int totalCount = 0;
        
        for(int i : arr)
            totalCount += i;
        
        int leftSum = 0, rightSum = totalCount;
        for(int i = 0; i < arr.length; i++){
            rightSum -= arr[i];
            if(leftSum == rightSum){
                System.out.println(i);
                break;
            }
            else
                leftSum += arr[i];
        }
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)
