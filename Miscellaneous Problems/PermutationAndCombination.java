/* Given the value of n and r find permutation and combination.
Formula:
    * Permutation: nPr = n! / (n-r)!
    * Combination: nCr = n! / r! * (n-r)!
*/

import java.util.*;

//* METHOD 1: Using Factorial Method:

// public class PermutationAndCombination {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of n: ");
//         int n = sc.nextInt();
//         System.out.print("Enter the value of r: ");
//         int r = sc.nextInt();

//         int permutation = factorial(n) / factorial(n-r);
//         int combination = factorial(n) / (factorial(r) * factorial(n-r));

//         System.out.println("Permutation: "+permutation);
//         System.out.println("Combination: "+combination);
//     }
//     static int factorial(int n){
//         int fact = 1;
//         for(int i = 1; i <= n; i++)
//             fact *= i;
//         return fact;
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(1)


//* METHOD 2: Optimized

public class PermutationAndCombination {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();

        int permutation = NpR(n, r);        // Permuatation
        int combination = NcR(n, r);        // Combination

        System.out.println("Permutation: "+permutation);
        System.out.println("Combination: "+combination);
    }
    static int NcR(int n, int r){      // Combination
        int fact = 1;
        for(int i = 0; i < r; i++)
            fact *= n-i;
            fact /= n+1;
        return fact;
    }

    static int NpR(int n, int r){      // Combination
        int fact = 1;
        for(int i = 0; i < r; i++)
            fact *= n-i;
        return fact;
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)