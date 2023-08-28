/*  Given a number N, print the smallest and largest digits present in the number.

Example 1:
Input: N = 2746
Output: Largest digit: 7
        Smallest digit: 2
Explanation: By simply going through the digits of 
the number, we figure out the largest and smallest 
digit in the number.

Example 2:
Input: N = 23004
Output: Largest digit : 4
        Smallest digit : 0
Explanation: By simply going through the digits of 
the number, we figure out the largest and smallest 
digit in the number.
*/

import java.util.*;

public class maximumAndMinimumDigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int digit = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(n > 0){
            digit = n % 10;
            min = Math.min(min, digit);
            max = Math.max(max, digit);
            n /= 10;
        }
        System.out.println("\nMinimum Digit: "+min+"\nMaximum Digit: "+max);
    }
}

// Time Complexity: O(logN)
// Space Complexity: O(1)


