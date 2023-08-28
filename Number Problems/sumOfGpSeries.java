/* Given a geometric Progression (G.P) sequence with some inputs as:-

a, first term
r, common ratio
n, number of terms

Write a program to find the sum of the geometric Progression Series.

Example 1:
Input: a=1 , r=0.5 , n=3
Output: 1.75
Explanation: The sum of given GP Series is 1.75

Example 2:
Input: a=3 , r=5 , n=2
Output: 18
Explanation: The sum of the given GP Series is 18
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class sumOfGpSeries{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first term(a): ");
//         int a = sc.nextInt();
//         System.out.print("Enter the common ratio(r): ");
//         int r = sc.nextInt();
//         System.out.print("Enter the number of terms(n): ");
//         int n = sc.nextInt();

//         int sum = 0;

//         for(int i = 1; i <= n; i++){
//             // sum += a * (int)Math.pow(r, i);
//             // OR
//             sum += a;
//             a *= r;
//         }
//         System.out.println("Sum: "+sum);
//     }
// }

//  Time Complexity: O(N)
// Space Complexity: O(1)


// * METHOD 2: Using G.P. Series Formula: Sn = [a(r^n-1)]/(r-1) 

public class sumOfGpSeries{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first term(a): ");
        int a = sc.nextInt();
        System.out.print("Enter the common ratio(r): ");
        int r = sc.nextInt();
        System.out.print("Enter the number of terms(n): ");
        int n = sc.nextInt();

        int sum = a * ((int)(Math.pow(r, n) - 1)/(r - 1));
        System.out.println("Sum: "+sum);
    }
}

// Time Complexity: O(1), since, direct formula is applied.
// Space Complexity: O(1)