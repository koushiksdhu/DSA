/* Given a binary array arr of size N and an integer M.
Find the maximum number of consecutive 1's produced by flipping at most M 0's.

Example 1:

Input: N = 3    arr[] = {1, 0, 1}   M = 1
Output: 3
Explanation:
Maximum subarray is of size 3
which can be made subarray of all 1 after
flipping one zero to 1.

Example 2:

Input: N = 11   arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1}   M = 2
Output: 8
Explanation:
Maximum subarray is of size 8
which can be made subarray of all 1 after
flipping two zeros to 1.
*/

public class maxConsecutiveOnesByFlippingZero {
    public static void main(String args[]){
        int arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
        int k = 2;

        int i = 0, j = 0;

        while(i < arr.length){
            if(arr[i] == 0)
                k--;
            
            if(k < 0){
                if(arr[j] == 0)
                    k++;
                j++;
            }
            i++;
        }
        System.out.println("Maximum Consecutive One's: "+(i-j));
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)
