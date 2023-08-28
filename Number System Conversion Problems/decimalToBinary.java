/* Convert a Decimal number to a Binary number.

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

// public class decimalToBinary{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         int temp = n;
//         String binary = "";
//         int rem = 0;
            // int temp = 1, bin = 0;
//         while(temp > 0){
//             rem = temp % 2;
//             binary = "" + rem + binary;
//             temp /= 2;

//             // OR
//             // bin = (n % 2) * temp + bin;
//             //  temp *= 10;
//             // n /= 2;
//         }
//         System.out.println("Binary of "+n+" is: "+binary);
//     }
// }

// Time Complexity: O(logN)
// Space Complexity: O(N) - Using String / O(1) - Using the alternate method.


// * METHOD 2: Using Inbuilt Function

// public class decimalToBinary{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         String binary = Integer.toBinaryString(n);       // * Integer.toBinaryString(decimal);

//         System.out.println("Binary of "+n+" is: "+binary);
//     }
// }

// Time Complexity: O(1)
// Space Complexity: O(1)


// * METHOD 3: Using Bit Operator

public class decimalToBinary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
       
        boolean flag = false;
        for(int i = 32; i >= 0; i--){
            int k = n >> i;
            if((k & 1) > 0){
                flag = true;
                System.out.print(1);
            }
            else{
                if(flag)
                    System.out.print(0);
            }
        }
    }
}

// Time Complexity: O(32)
// Space Complexity: O(1)