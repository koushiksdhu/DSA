/*  Given an integer, find the sum of digits of that integer.

Example 1:
Input: N = 472
Output: 13
Explanation: The digits in the number are 4,7 and 2. Summing them up gives us a value of 13

Example 2:
Input: N = 102
Output: 3
Explanation: The digits in the number are 0, 1, and 2. Summing them up gives us a value of 3
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class sumOfDigits {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         int sum = 0, digit = 0;
//         while(n > 0){
//             digit = n % 10;
//             sum += digit;
//             n /= 10;
//         }
        
//         System.out.println("Sum: "+sum);
//     }    
// }

// Time Complexity: O(N)
// Space Complexity: O(1)


// * METHOD 2: Using Recursion

public class sumOfDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        System.out.println("Sum: "+sum(n));
    }    
    static int sum(int n){
        if(n == 0)
            return 0;
        return (n % 10) + sum(n / 10);
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)

