/* Print Pascals Triangle:

          1   
        1   1   
      1   2   1   
    1   3   3   1   
  1   4   6   4   1   

Approach: Combination of loop i -> 1 to N and inner loop j -> 1 to i (Both inclusive).
 
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class PascalsTriangle {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size: ");
//         int n = sc.nextInt();
        
//         for(int i = 1; i <= n; i++){

//             for(int space = n-i+1; space > 0; space--)  // Printing Space
//                 System.out.print("  ");

//             for(int j = 1; j <= i; j++){
//                 System.out.print(factorial(i-1) / (factorial(j-1) * factorial(i-j))+"   ") 
//                 // Combination formula: nCr = n! / (r! * (n-r)!).
//             }
//             System.out.println();
//         }
//     }
//     static int factorial(int n){
//         int fact = 1;
//         for(int i = 2; i <= n; i++)
//             fact *= i;
//         return fact;
//     } 
// }

// Time Complexity: O(N)*O(N)*O(N)*[O(i-1)+O(j-1)+O(i-j)]
// Space Complexity: O(1)


// * METHOD 2: Optimized Approach

public class PascalsTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){

            for(int space = n-i+1; space > 0; space--)  // Printing Space
                System.out.print("  ");

            for(int j = 1; j <= i; j++){
                System.out.print(nCr(i-1, j-1)+"   ");      // Optimized Formula.
                // Combination formula: nCr = n! / (r! * (n-r)!).
            }
            System.out.println();
        }
    }
    static int nCr(int n, int r){
        int res = 1;
        for(int i = 0; i < r; i++){
            res *= n-i;
            res /= i+1;
        }
        return res;
    } 
}

// Time Complexity: O(N)*O(N)*O(N)*O(R)
// Space Complexity: O(1)
