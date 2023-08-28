/* Given a decimal number, convert it into Octal Number.

Example 1:
Input:  17
Output: 21
Explanation: Octal Equivalent of 17 is 21

Example 2:
Input:  45
Output: 55
Explanation: Octal Equivalent of 45 is 55
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class decimalToOctal {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the decimal: ");
//         int n = sc.nextInt();
//         int octal = 0, temp = 1;
//         while(n > 0){
//             octal = (n % 8) * temp + octal;
//             temp *= 10;
//             n /= 8;
//         }
//         System.out.println("Octal: "+octal);
//     }
// }

// Time Complexity: O(logN)
// Space Complexity: O(1)


// * METHOD 2: Using inbuilt method

public class decimalToOctal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal: ");
        int n = sc.nextInt();
        String octal = Integer.toOctalString(n);
        System.out.println("Octal: "+octal);
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)
