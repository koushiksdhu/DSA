/* METHOD 1: Find the Element at Rth row and Cth Column of a Pascal Trinagle

            1
          1   1
        1   2   1
      1   3   3   1
    1   4   6   4   1

    Formula: n-1          
                C     = (n-1)! / (r-1)! * (n-r)!
                 r-1
*/

import java.util.*;
public class PascalsTriangleElementFind {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row: ");
        int r = sc.nextInt();
        System.out.print("Enter the Column: ");
        int c = sc.nextInt();
        System.out.println("Element: "+factorial(r-1)/(factorial(c-1) * factorial(r-c)));  // Brute Force     
        // r-c at the last and not r-c-2 because: (r-1)-(c-1) = r-1-c+1 = r-c+0 = r-c.
        
        System.out.println("Element: "+NcR(r-1, c-1));   // Optimized
    }
    static int factorial(int n){        // Brute Force
        int fact = 1;
        for(int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    static int NcR(int r, int c){     // Optimized
        int res = 1;
        for(int i = 0; i < c; i++){
            res *= r-i;
            res /= i+1;
        }
        return res;
    }
}

// Time Complexity: O(C) = O(N)
// Space Compleixty: O(1)


