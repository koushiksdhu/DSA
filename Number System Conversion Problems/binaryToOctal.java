/* Convert a binary number to an octal number

Example 1:.
Input: N = 1100110
Output: 146
Explanation: 1100110 when converted to octal number is “146”.

Example 2:
Input: 11111
Output: 37
Explanation: 11111 when converted to octal number is “37”.

Since we have to convert it into an octal number, every bit should be between 0 to 7. We know that every number can be represented by the power of 2.
So we will use the 4 2 1 rule, since using 4 2 1 we can make any number between 0 to 7.
4 2 1 are 3 digits, so we will divide the string into parts of 3.
In the diagram since the length of the string is 7,”00” is added to the left to make the length of the string multiple of 3.

> Let n be length of string.Add appropriate number of “0” at the beginning of string to make the length of string divisible by 3.
> Now transverse from 0 to n.If the ith bit is set add 4,if (i+1)th bit is set add 2 and if (i+2)th bit is set add 1.
  This will be one bit of the octal number.
> Then increment i by 3,and repeat the 2nd step.
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class binaryToOctal {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number in binary form: ");
//         String n = sc.next();
//         int len = n.length();

//         if(len % 3 == 1)
//             n = "00" + n;
//         else if(len % 3 == 2)
//             n = "0" + n;

//         String octal = "";
//         int temp = 0;

//         for(int i = 0; i < len; i += 3){
//             temp = (n.charAt(i) - '0') * 4 + (n.charAt(i+1) - '0') * 2 + (n.charAt(i+2) - '0') * 1; 
//             octal += Integer.toString(temp);
//         }

//         System.out.println("Octal: "+octal);
//     }    
// }

// Time Complexity: O(N)
// Space Complexity: O(1)


// * METHOD 2: Using in built method

public class binaryToOctal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in binary form: ");
        String n = sc.next();
        int decimal = Integer.parseInt(n, 2);
        String octal = Integer.toOctalString(decimal);      // * Integer.toOctalString(decimal);
        System.out.println("Octal: "+octal);
    }    
}

// Time Complexity: O(N)
// Space Complexity: O(1)