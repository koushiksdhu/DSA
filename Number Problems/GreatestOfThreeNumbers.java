/* Given three numbers. Find the greatest of three numbers.

Example 1:
Input: 1 3 5
Output: 5
Explanation: Answer is 5.Since 5 is greater than 1 and 3.

Example 2:
Input: 1.123  1.124 1.125
Output: 1.125
Explanation: Answer is 1.125. Since 1.125 is greater than 1.123 and 1.124
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class GreatestOfThreeNumbers {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter the second number: ");
//         int b = sc.nextInt();
//         System.out.print("Enter the third number: ");
//         int c = sc.nextInt();

//         if(a > b && a > c)
//             System.out.println("Greatest among "+a+", "+b+" and "+c+" is: "+a);
        
//         else{
//             if(b > c)
//                 System.out.println("Greatest among "+a+", "+b+" and "+c+" is: "+b);
//             else
//                 System.out.println("Greatest among "+a+", "+b+" and "+c+" is: "+c);
//         }
//     }    
// }

// Time Complexity: O(1)
// Space Complexity: O(1)


// * METHOD 2: Using In-built method

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        int greatest = Math.max(a, Math.max(b, c));
        
        System.out.println("Greatest among "+a+", "+b+" and "+c+" is: "+greatest);
    }    
}

// Time Complexity: O(1)
// Space Complexity: O(1)
