import java.sql.PseudoColumnUsage;

/* Given a number, check if it is Armstrong Number or Not.

Example 1:
Input:153 
Output: Yes, it is an Armstrong Number
Explanation: 1^3 + 5^3 + 3^3 = 153

Example 2:
Input: 170 
Output: No, it is not an Armstrong Number
Explanation: 1^3 + 7^3 + 0^3 != 170
*/

import java.util.*;
public class armstrongOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0, rem = 0;

        while(temp > 0){
            rem = temp % 10;
            sum += Math.pow(rem, (int)Math.log10(n) + 1);
            temp /= 10;
        }
        if(n == sum)
            System.out.println(n+" is an Armstrong Number.");
        else
            System.out.println(n+" is not an Armstrong Number.");
    }
}

// Time Complexity: O(N), where N is the number of digits.
// Space Complexity: O(1)
