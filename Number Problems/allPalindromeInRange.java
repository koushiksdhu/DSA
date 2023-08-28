/* Given a range of numbers, find all the palindrome numbers in the range.

Note: A palindromic number is a number that remains the same when its digits are reversed.
OR  a palindrome is a number that reads the same forward and backward Eg: 121,1221, 2552

Example 1:
Input: min = 10 , max = 50
Output: 11 22 33 44 
Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward.

Example 2:
Input: min = 100 , max = 150
Output: 101 111 121 131 141 
Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward.

 */

import java.util.*;

public class allPalindromeInRange {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting value: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending value: ");
        int end = sc.nextInt();
        for(int i = start; i <= end; i++){
            if(checkPalindrome(i))
                System.out.print(i+" ");
        }
    }

    static boolean checkPalindrome(int n){
        int temp = n;
        int rem = 0, rev = 0;

        while(temp > 0){
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        return rev == n ? true : false;
    }
}

// Time Complexity: O(NlogN)
// Space Complexity: O(1)
