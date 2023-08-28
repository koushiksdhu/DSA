/* Write a program to find whether a number is a perfect number or not.

A perfect number is defined as a number that is the sum of its proper divisors ( all its positive divisors excluding itself). 

Example 1:
Input: n=6
Output: 6 is a perfect number

Example 2:
Input: n=15
Output: 15 is not a perfect number

Example 3:
Input: n=28
Output: 28 is a perfect number
Reason: For 6 and 28 , the sum of their proper divisors (1+2+3) and (1+4+7+14) is equal to the respective numbers and for 15 it is not.
 
*/


import java.util.Scanner;

// * METHOD 1: Brute Force

// public class perfectNumberOrNot {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i = 1; i <= n/2; i++)
//             sum += n % i == 0 ? i : 0;

//         if(sum == n)
//             System.out.println(n+" is a Perfect Number.");
//         else
//             System.out.println(n+" is not a Perfect Number.");
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(1)


// * METHOD 2: Optimized

public class perfectNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i*i <= n; i++){
            if(n % i == 0){
                if(i*i == n || i == 1)
                    sum += i;
                else
                    sum += i + n/i;
            }
        }
        
        if(sum == n)
            System.out.println(n+" is a Perfect Number.");
        else
            System.out.println(n+" is not a Perfect Number.");
    }
}

// Time Complexity: O(sqrt(N))
// Space Complexity: O(1)
