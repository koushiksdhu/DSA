/* Given a number X,  print its factorial.

To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it. More precisely X! = X*(X-1)*(X-2) … 1.

Note: X  is always a positive number. 

Example 1:
Input: X = 5
Output: 120
Explanation: 5! = 5*4*3*2*1

Example 2:
Input: X = 3
Output: 6
Explanation: 3!=3*2*1
*/

import java.util.*;

// * METHOD 1: Brute Force

public class factorialNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        int product = 1;

        for(int i = 1; i <= n; i++){
            product *= i;
        }

        System.out.println("Factorial of "+n+" is: "+product);
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)


// * METHOD 2: Using Recursion

// public class factorialNumber {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = sc.nextInt();

//         System.out.println("Factorial of "+n+" is: "+fact(n));
//     }
//     static int fact(int n){
//         if(n == 1)
//             return 1;
//         return n * fact(n - 1);
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(N), due to recursion stack space
