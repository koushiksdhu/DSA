/* Given a and b, find prime numbers in a given range [a,b], (a and b are included here).

Examples:
Input: 2 10
Output: 2 3 5 7 
Explanation: Prime Numbers b/w 2 and 10 are 2,3,5 and 7.

Example 2:
Input: 10 16
Output: 11 13 
Explanation: Prime Numbers b/w 10 and 16 are 11 and 13.
*/

import java.util.*;
public class primeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting value: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending value: ");
        int end = sc.nextInt();
        if(start == 1)
            start++;

        for(int i = start; i <= end; i++){
            if(checkPrime4(i))
                System.out.print(i+" ");
        }

    }   
    static boolean checkPrime1(int n){          // Iterating n elements.
        for(int i = 2; i < n; i++){
            if(n % i == 0)
              return false;
        }
        return true;
    }

    static boolean checkPrime2(int n){          // Iterating n/2 elements.
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    static boolean checkPrime3(int n){          // Iterating sqrt(n) elements.
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    static boolean checkPrime4(int n){          // Fermat's little theorem. (2^n-1) % n == 1
        return Math.pow(2, n-1) % n == 1 || n == 2;
    }
}
