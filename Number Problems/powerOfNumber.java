/* Find the Power of a number.

Example 1:
Input: N = 5, k=3
Output: 125
Explanation: Since 5*5*5 is 125.

Example 2:
Input: n=2 k=4
Output: 16
Explanation: Since 2*2*2*2 is 16
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class powerOfNumber {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = sc.nextInt();
//         System.out.print("Enter the value of K: ");
//         int k = sc.nextInt();

//         int power = 1;

//         for(int i = 0; i < k; i++){
//             power *= n;
//         }

//         System.out.println(n+"^"+k+" = "+power);
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(1)


// * METHOD 2: Using Recursion

// public class powerOfNumber {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = sc.nextInt();
//         System.out.print("Enter the value of K: ");
//         int k = sc.nextInt();

//         System.out.println(n+"^"+k+" = "+power(n, k));
//     }
//     static int power(int n, int k){
//         if(k == 1)
//             return n;
//         return n * power(n, k - 1);
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(N), due to recursion stack space


// * METHOD 3: Using In-built method

// public class powerOfNumber {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = sc.nextInt();
//         System.out.print("Enter the value of K: ");
//         int k = sc.nextInt();

//         int power = (int)Math.pow(n, k);        // Math.pow() method returns double type, By default.

//         System.out.println(n+"^"+k+" = "+power);
//     }
// }

// Time Complexity: O(1)
// Space Complexity: O(1)


// * METHOD 3: Using Binary Exponentiation

/*
While calculating (n^k), binary exponentiation relies on whether n is even or odd.
If k is even (nk) can be written as  (n2)k/2. As we can see that computation steps were reduced from k to k/2 in just one step.
If k is odd (nk) can be written as n.(n)k-1, so now  (k-1) is even.

> Maintain a variable ans to store the final answer.
> If k is even,square n and divide k by 2.as nk can be written as (n2)k/2  i.e (n*n)k/2.
> If k is odd,multiply ans with n and reduce k by 1,as nk can be written as n*(n)k-1.
> Print the ans.
*/

public class powerOfNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();

        int ans = 1;

        while(k != 0){
            if(k % 2 == 0){     // if, k is even then perform this.
                n *= n;
                k /= 2;
            }
            else{               // if, k is odd then perform this.
                ans *= n;
                k--;
            }
        }
        System.out.println("Power: "+ans);
    }
}

// Time Complexity: O(logN)
// Space Complexity: O(1)