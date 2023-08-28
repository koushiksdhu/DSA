/* Convert a binary number to a decimal number.

Example 1:
Input: N = 1011
Output: 11
Explanation: 1011 when converted to decimal number is “11”.

Example 2:
Input: 100
Output: 4
Explanation: 100 when converted to decimal number is “4”.
*/

import java.util.*;

// * METHOD 1: Brute Force

public class binaryToDecimal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int decimal = 0;
        for(int i = 0; n > 0; i++){
            decimal += Math.pow(2, i) * (n % 10);
            n /= 10;
        }
        System.out.println("Decimal: "+decimal);
    }
}

// Time Complexity: O(logN)
// Space Complexity: O(1)


// * METHOD 2: Using Inbuilt Function

// public class binaryToDecimal {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         int decimal = Integer.parseInt(String.valueOf(n), 2);       // * Integer.parseInt(String, radix);
//         System.out.println("Decimal: "+decimal);
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(1)

