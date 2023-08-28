/* Given an integer. Write a program to reverse digits of a number.

Example 1:
Input: N = 472
Output: 274
Explanation: Reading the number from back to front, we see that the output should be 274

Example 2:
Input: N = 470
Output: 74
Explanation: Reading the number from back to front, we get 074.
For an integer with no decimals, we know that leading zeros have no significance and therefore our answer should be 74
*/

import java.util.*;

// * METHOD 1: Using Loop

public class reverseDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int rem = 0, reverse = 0;
        
        while(n > 0){
            rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }

        System.out.println("Reverse of a number is: "+reverse);
    }
}

// Time Complexity: O(logN)
// Space Complexity: O(1)


// * METHOD 2: Using Recursion

// public class reverseDigitOfNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
        
//         System.out.println("Reverse of "+n+" is: "+reverse(n, 0));
//     }
//     static int reverse(int n, int rev){
//         if(n == 0)
//             return rev;
//         else{
//             rev = rev * 10 + n % 10;
//             return reverse(n/10, rev);
//         }

//         // if(n != 0){         // void return type
//         //     System.out.print(n%10);
//         //     reverse(n / 10);
//         // }
//     }
// }

// Time Complexity: O(logN)
// Space Complexity: O(1)


// * METHOD 3: Using StringBuilderClass

// public class reverseDigitOfNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
        
//         StringBuilder sb = new StringBuilder(String.valueOf(n));

//         System.out.println("Reverse of "+n+" is: "+sb.reverse().toString());
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(N)

