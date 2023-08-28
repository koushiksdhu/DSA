/* Given two numbers. Find the greatest of two numbers.

Example 1:
Input: 1 3
Output: 3
Explanation: Answer is 3,since 3 is greater than 1.

Input: 1.123  1.124
Output: 1.124
Explanation: Answer is 1.124,since 1.124 is greater than 1.123.
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class GreatestOfTwoNumbers {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         float a = sc.nextFloat();
//         System.out.print("Enter the second number: ");
//         float b = sc.nextFloat();

//         float greatest = a > b ? a : b;

//         System.out.println("Greatest among "+a+" and "+b+" is: "+greatest);
//     }
// }

// Time Complexity: O(1)
// Space Complexity: O(1)


// * METHOD 2: Using In-built method:

public class GreatestOfTwoNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter the second number: ");
        float b = sc.nextFloat();
    
        System.out.println("Greatest among "+a+" and "+b+" is: "+Math.max(a, b));
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)
