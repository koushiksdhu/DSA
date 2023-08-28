/* Given a number n check whether it’s positive or negative.

Example 1:
Input: n=5
Output: Positive

Example2:
Input: n=-6
Output: Negative
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class positiveOrNegative {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         if(n >= 0)
//             System.out.println(n+" is a Positive Number.");
//         else
//             System.out.println(n+" is a Negative Number.");
//     }
// }

// Time Complexity: O(1)
// Space Complecity: O(1)


// * METHOD 2: Using Right Shift Operator:

public class positiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if(n >> 31 == 0)        // Right shift 31 times and check whether the value is trailing value is 0 or 1. If 0 then POSITIVE, else NEGATIVE.
            System.out.println(n+" is a Positive Number.");
        else
            System.out.println(n+" is a Negative Number.");
    }
}

// Time Complexity: O(1)
// Space Complecity: O(1)
