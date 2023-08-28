/* Given a number n. Print all Prime Factors of the given number n.

Example 1:
Input: N = 12
Output: 2,2,3
Explanation: These are the prime factors of 12.

Example 2:
Input: N = 36
Output: 2,2,3,3
Explanation: These are the prime factors of 36.

*  Factors are the numbers that can be multiplied to get a new number.
* The factors of a number that are prime are called Prime Factors.
* For example: If N=12, 12=2x2x3 here 2 and 3 are prime factors of the 12 and 2^2 x 3 makes up to 12.
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class primeFactors {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         for(int i = 2; n > 1; i++){         // run until n > 1 
//             if(n % i == 0){
//                 while(n % i == 0){
//                     System.out.print(i+" ");
//                     n /= i;
//                 }
//             }
//         }
//     }    
// }

// Time Complexity: O(n*n)
// Space Complexity: O(1)


// * METHOD 2: Optimized code using Square root

public class primeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for(int i = 2; i * i <= n || n > 1; i++){             //  i * i <= n OR n > 1
            if(n % i == 0){ 
                while(n % i == 0){
                    System.out.print(i+" ");
                    n /= i;
                }
            }
        }
    }    
}

// Time Complexity: O(sqrt(n))
// Space Complexity: O(1)
