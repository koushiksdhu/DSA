/* Find the sum of numbers in the given range.

Example 1:
Input: l=2, r=7
Output: 27
Explanation: 2+3+4+5+6+7=27. Therefore 27 is the answer.

Example 2:
Input: l=5, r=9
Output: 35
Explanation: 5+6+7+8+9=35. Therefore 35 is the answer. 
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class sumInRange {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int s = sc.nextInt();
//         System.out.print("Enter the last number: ");
//         int e = sc.nextInt();

//         int sum = 0;
//         for(int i = s; i <= e; i++)
//             sum += i;

//         System.out.println("Sum: "+sum);
//     }    
// }

// Time Complexity: O(N)
// Space Complexity: O(1)


// * METHOD 2: Using Formula

public class sumInRange {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int l = sc.nextInt();
        System.out.print("Enter the last number: ");
        int r = sc.nextInt();

        int sum = (r * (r + 1)) / 2 - (l * (l - 1)) / 2;        // Formula

        System.out.println("Sum: "+sum);
    }    
}

// Time Complexity: O(1)
// Space Complexity: O(1)