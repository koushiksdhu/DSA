/* Given a number ‘N’, find out the sum of the first N natural numbers.

Example 1:
Input: N=5
Output: 15
Explanation: 1+2+3+4+5=15

Example 2:
Input: N=6
Output: 21
Explanation: 1+2+3+4+5+6=15
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class sumOfFirstNnaturalNumbers {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i = 1; i <= n; i++)
//             sum += i;
//         System.out.println("Sum of all natural number from 1 to "+n+" is: "+sum);
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(1)


// * METOHD 2: Using sum of N natural number formula

public class sumOfFirstNnaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Sum of all natural number from 1 to "+n+" is: "+(n*(n+1)) / 2);
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)