/* Given a number n, check whether a given number is even or odd.

Example 1:
Input: n=5
Output: odd
Explanation: 5 is not divisible by 2.
 
Example 2:  
Input: n=6
Output: even
Explanation: 6 is divisible by 2.
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class evenOrOdd {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         if(n % 2 == 0)
//             System.out.println(n+" is an Even Number.");
//         else
//             System.out.println(n+" is an Odd Number.");
//     }
// }

// Time Complexity: O(1)
// Space Complexity: O(1)


// * METHOD 2: Using & Operator

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if((n & 1) == 0)
            System.out.println(n+" is an Even Number.");
        else
            System.out.println(n+" is an Odd Number.");
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)