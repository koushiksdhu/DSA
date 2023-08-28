/* Given a number, check whether it is prime or not. A prime number is a natural number that is only divisible by 1 and by itself.

Prime Numbers: 2 3 5 7 11 13 17 19 …

Example 1:
Input: N = 3
Output: Prime
Explanation: 3 is a prime number

Example 2:
Input: N = 26
Output: Non-Prime
Explanation: 26 is not prime
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class primeOrNot {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         boolean isPrime = true;
//         for(int i = 2; i < n; i++){
//             if(n % i == 0){
//                 isPrime = false;
//                 break;
//             }
//         }
//         if(n != 1 && isPrime)
//             System.out.println(n+" is a Prime Number.");
//         else
//             System.out.println(n+" is not a Prime Number.");
//     }    
// }

// Time Complexity: O(N)
// Space Complexity: O(1)

// * METHOD 2: Using N/2 Approach:

// public class primeOrNot {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         boolean isPrime = true;
//         for(int i = 2; i <= n / 2; i++){
//             if(n % i == 0){
//                 isPrime = false;
//                 break;
//             }
//         }
//         if(n != 1 && isPrime)
//             System.out.println(n+" is a Prime Number.");
//         else
//             System.out.println(n+" is not a Prime Number.");
//     }    
// }

// Time Complexity: O(N)
// Space Complexity: O(1)

// * METHOD 3: Using SquareRoot(N) Approach:

// public class primeOrNot {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         boolean isPrime = true;
//         for(int i = 2; i <= Math.sqrt(n); i++){
//             if(n % i == 0){
//                 isPrime = false;
//                 break;
//             }
//         }
//         if(n != 1 && isPrime)
//             System.out.println(n+" is a Prime Number.");
//         else
//             System.out.println(n+" is not a Prime Number.");
//     }    
// }

// Time Complexity: O(sqrt(N))
// Space Complexity: O(1)

// * METHOD 4: Using Fermat's little theorem:

public class primeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(Math.pow(2, n-1) % n == 1 && n != 1 || n == 2)
            System.out.println(n+" is a Prime Number.");
        else
            System.out.println(n+" is not a Prime Number.");
    }    
}

// Time Complexity: O(1)
// Space Complexity: O(1)


