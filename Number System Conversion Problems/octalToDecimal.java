/* Given an Octal Number, convert it into a Decimal Number.

Example 1:
Input: 345
Output: 229
Explanation: Decimal equivalent of given Octal expressionis 229

Example 2:
Input: 170
Output: 121
Explanation: Decimal equivalent of given Octal expression is 121
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class octalToDecimal {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number in octal form: ");
//         int n = sc.nextInt();
//         int decimal = 0, rem = 0, i = 0;
//         while(n > 0){
//             rem = n % 10;
//             decimal += Math.pow(8, i++) * (n % 10);
//             n /= 10;
//         }
//         System.out.println("Decimal: "+decimal);
//     }
// }

// Time Complexity: O(logN)
// Space Complexity: O(1)


// * METHOD 2: Using inbuilt method

public class octalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in octal form: ");
        int n = sc.nextInt();
        int decimal = Integer.parseInt(String.valueOf(n), 8);
        System.out.println("Decimal: "+decimal);
    }
}
