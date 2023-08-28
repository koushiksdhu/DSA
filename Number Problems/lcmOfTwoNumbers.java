/* Find lcm of two numbers.

Example 1:
Input: num1 = 4,num2 = 8
Output: 8

Example 2:
Input: num1 = 3,num2 = 6
Output: 6
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class lcmOfTwoNumbers {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int n1 = sc.nextInt();
//         System.out.print("Enter the second number: ");
//         int n2 = sc.nextInt();

//         int gcd = 0;

//         for(int i = Math.min(n1, n2); i > 0; i--){
//             if(n1 % i == 0 && n2 % i == 0){
//                 gcd = i;
//                 break;
//             }
//         }

//         System.out.println("LCM of "+n1+" and "+n2+" is: "+(n1*n2)/gcd);
//     }    
// }

// Time Complexity: O(n)
// Space Complexity: O(1)


// * METHOD 2: Using Recursion

public class lcmOfTwoNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();

        System.out.println("LCM of "+n1+" and "+n2+" is: "+(n1*n2)/gcd(n1, n2));
    }
    static int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
}

// Time Complexity: O(logɸmin(a,b)),where ɸ is 1.61.
// Space Complexity: O(1)



