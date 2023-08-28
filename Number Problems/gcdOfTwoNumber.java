/* Find gcd of two numbers.

Example 1:
Input: num1 = 4, num2 = 8
Output: 4
Explanation: Since 4 is the greatest number which divides both num1 and num2.

Example 2:
Input: num1 = 3, num2 = 6
Output: 3
Explanation: Since 3 is the greatest number which divides both num1 and num2.
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class gcdOfTwoNumber {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int n1 = sc.nextInt();
//         System.out.print("Enter the second number: ");
//         int n2 = sc.nextInt();

//         for(int i = Math.min(n1, n2); i > 0; i--){
//             if(n1 % i == 0 && n2 % i == 0){
//                 System.out.println("GCD of "+n1+" and "+n2+" is: "+i);
//                 break;
//             }
//         }
//     }    
// }

// Time Complexity: O(N)
// Space Complexity: O(1)


// * METHOD 2: Using Recursion

// public class gcdOfTwoNumber {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int n1 = sc.nextInt();
//         System.out.print("Enter the second number: ");
//         int n2 = sc.nextInt();

//         System.out.println("GCD of "+n1+" and "+n2+" is: "+gcd(n1, n2));
//     }  
//     static int gcd(int a, int b){
//         if(b == 0)
//             return a;
//         return gcd(b, a % b);
//     }
// }

// Time Complexity: O(logɸmin(a,b)), where ɸ is 1.61.
// Space Complexity: O(1).


// * METHOD 3: Using Subtraction

// public class gcdOfTwoNumber {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int n1 = sc.nextInt();
//         System.out.print("Enter the second number: ");
//         int n2 = sc.nextInt();

//         while(n1 != n2){
//             if(n1 > n2)
//                 n1 -= n2;
//             else if(n1 < n2)
//                 n2 -= n1;
//         }
//         System.out.println("GCD : "+n1);
//     }  
// }

// Time Complexity: O(N)
// Space Complexity: O(1).

// * METHOD 4: Using Modulus

public class gcdOfTwoNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();

        while(n1 > 0 && n2 > 0){
            if(n1 > n2)
                n1 %= n2;
            else if(n1 < n2)
                n2 %= n1;
        }

        int gcd = n1 == 0 ? n2 : n1;

        System.out.println("GCD : "+gcd);
    }  
}

// Time Complexity: O(log Φ(min(a, b)))
// Space Complexity: O(1).