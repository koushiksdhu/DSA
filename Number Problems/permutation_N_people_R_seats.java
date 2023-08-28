/* Find permutations in which n people can occupy r seats in a classroom.

Example 1:
Input: N = 5, r = 3
Output: 60
Explanation: To permute n people in r seats we have to find the value of n!/(n-r)!.The value of 5!/(5-3)! Is 60.

Example 2:
Input: N=6,r = 4.
Output: 360
* Formula: n!/(n-r)!
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class permutation_N_people_R_seats {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = sc.nextInt();
//         System.out.print("Enter the value of R: ");
//         int r = sc.nextInt();

//         int permutation = fact(n)/fact(n-r);        // n!/(n-r)!

//         System.out.println("Permutation: "+permutation);

//     } 
//     static int fact(int n){
//         int fact = 1;
//         for(int i = 1; i <= n; i++)
//             fact *= i;
//         return fact;
//     }  
// }

// Time Complexity: O(N*N)
// Space Complexity: O(1)


// * METHOD 2: Optimized Version

public class permutation_N_people_R_seats {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of R: ");
        int r = sc.nextInt();

        int permutation = 1;

        for(int i = n; i > n - r; i--)
            permutation *= i;

        System.out.println("Permutation: "+permutation);
    }  
}

// Time Complexity: O(N)
// Space Complexity: O(1)
