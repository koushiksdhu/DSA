/* Given an Octal Number, convert it into Binary Number.

Example 1:
Input: 345
Output: 011100101
Explanation: Binary equivalent of given Octal expressionis 011100101

Example 2:
Input: 170
Output: 001111000
Explanation: Binary equivalent of given Octal expression is 001111000
*/

import java.util.*;

// * METHOD 1: Brute Force

public class octalToBinary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in Octal: ");
        int n = sc.nextInt();
        
        int decimal = 0, rem = 0, i = 0;
        
        while(n > 0){               // Octal to Decimal Conversion
            rem = n % 10;
            decimal += Math.pow(8, i++) * rem;
            n /= 10;
        }

        String binary = "";
        while(decimal > 0){         // Decimal to Binary Conversion
            binary = "" + decimal % 2 + binary;
            decimal /= 2;
        }

        System.out.println("Octal to Binary: "+binary);
    }
}

// Time Complexity: O(logN)
// Space Complexity: O(1)

// * METHOD 2: Using inbuilt method

// public class octalToBinary {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number in Octal: ");
//         String n = sc.next();

//         int decimal = Integer.parseInt(n, 8);
//         String binary = Integer.toBinaryString(decimal);

//         System.out.println("Octal to Binary: "+binary);
//     }
// }

// Time Complexity: O(1)
// Space Complexity: O(1)
