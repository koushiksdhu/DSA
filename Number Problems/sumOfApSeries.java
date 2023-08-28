/* Given an A.P. Series, we need to find the sum of the Series.

* a = first term of A.P.
* d= common Difference of A.P.
* n= Number of Terms in  A.P.

Examples:

Example 1:
Input: n=4      a=2     d=2
Output: 20
Explanation: 2+4+6+8 = 20

Input: n=8      a=2     d=5
Output: 124
Explanation: -2 +3 + 8 + 13 + 18 + 23 + 28 + 33 = 124

A.P. is the series of terms having the first term as a and d, common difference.
Every next term in the A.P. is greater than the previous term by d units.

Example – 

-2, 3 , 8 , 13 , 18 , 23 , 28 , 33

First term , a = – 2
Common Difference , d=5
Last term , an=33

Formula: sum = n/2*(2*a + (n - 1)*d)

*/

import java.util.*;

// * METHOD 1: Brute Force

// public class sumOfApSeries {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first term (a): ");
//         int a = sc.nextInt();
//         System.out.print("Enter the common difference(d): ");
//         int d = sc.nextInt();
//         System.out.print("Enter the last term(an): ");
//         int n = sc.nextInt();

//         int sum = 0;
//         for(int i = 0; i < n; i++){
//             sum += a;
//             a += d;
//         }
//         System.out.println("Sum: "+sum);
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(1)


// * METHOD 2: Using Sum of AP Series Formula: sum = n/2*(2*a + (n - 1)*d)

public class sumOfApSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first term (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the common difference(d): ");
        int d = sc.nextInt();
        System.out.print("Enter the last term(an): ");
        int n = sc.nextInt();

        int sum = n / 2 * (2 * a + (n - 1) * d);
        System.out.println("Sum: "+sum);
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)