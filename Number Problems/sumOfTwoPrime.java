/* Given a number n, express the number as a sum of 2 prime numbers.

Example 1:
Input : N = 74
Output : True . 
Explanation: 74 can be expressed as 71 + 3 and both are prime numbers. 

Example 2:
Input : N = 11
Output : False. 
Explanation: 11 cannot be expressed as sum of two prime numbers.
*/

import java.util.*;
public class sumOfTwoPrime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(isPrime(n) && isPrime(n - 2))
            System.out.println(n+" can be expressed as sum of two prime numbers.");
        else
            System.out.println(n+" cannot be expressed as sum of two prime numbers.");
    }
    static boolean isPrime(int n){
        if((int)Math.pow(2, n - 1) % n == 1 || n == 2)
            return true;
        return false;
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)