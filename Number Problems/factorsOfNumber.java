/* Find all factors of a number or find all distinct divisors of a natural number.

Example 1:
Input: n = 6
Output: 1,2,3,6
Explanation: 6 is divisible by 1,2,3,6

Example 2:
Input: n = 9
Output: 1,3,9
Explanation: 9 is divisible by 1,3,9

*/

import java.util.*;

// * METHOD 1: Brute Force

// public class factorsOfNumber {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         for(int i = 1; i <= n; i++){
//             if(n % i == 0)
//                 System.out.print(i+" ");
//         }
//     }    
// }

// Time Complexity: O(N)
// Space Complexity: O(1)


// * METHOD 2: Using Recursion

// public class factorsOfNumber {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         factors(n, 1);
//     }
//     static void factors(int n, int i){
//         if(i > n)
//             return;
//         else if(n % i  == 0){
//             System.out.print(i+" ");
//             factors(n, i+1);
//         }
//         else
//             factors(n, i+1);
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(N), Recusrive stack space


// * METHOD 3: Optimized Approach

/*
 * Intuition: When we thoroughly see the factors of a natural number,
 *  they always lie in pairs. For if ‘n’ is divisible by any number ‘i’ then it will also be divisible by its quotient of n/i.

 * Run a for loop from 1 to SquareRoot of n.
 * If n is divisible by any number i then the quotient of n/i is also divisible by n, print both i and n/i.
 * Take care of the edge case when n/i=i, print only i one time, to remove duplicates.
*/

public class factorsOfNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(n/i == i)        // to avoid duplicates.
                    System.out.print(i+" ");
                else                // print both divisor and quotient.
                    System.out.print(i+" "+n/i+" ");
            }
        }
    }
}

// Time Complexity: O(sqrt(n))
// Space Complexity: O(1)