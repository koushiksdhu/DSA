/*  Given an integer N. Print the Fibonacci series up to the Nth term.

Example 1:
Input: N = 5
Output: 0 1 1 2 3 5
Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

Example 2:
Input: 6
Output: 0 1 1 2 3 5 8
Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term.(o based indexing)
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class fibonacciSeries {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the value of N: ");
//     int n = sc.nextInt();
//     int a = 0;
//     int b = 1;
//     int temp = 1;
    
//     System.out.print("0 1 ");
//     for(int i = 1; i < n; i++){
//         temp = a + b;
//         a = b;
//         b = temp;
//         System.out.print(temp+" ");
//         }
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(1)

// * METHOD 2: Nth term using recursion

// public class fibonacciSeries {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = sc.nextInt();
//         System.out.print("Nth Term: "+fibo(n));
//     }

//     static int fibo(int n){
//         if(n <= 1)
//             return n;
//         return fibo(n-1) + fibo(n-2);
//     }
// }

// Time Complexity: O(2^N)
// Space Complexity: O(N)

// * METHOD 3: Nth term uing formula

// public class fibonacciSeries {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = sc.nextInt();

//         double a = Math.pow((1+Math.sqrt(5))/2, n);
//         double b = Math.pow((1-Math.sqrt(5))/2, n);
        
//         int nth = (int)((1/Math.sqrt(5))*(a-b));

//         System.out.print("Nth Term: "+nth);
//     }
// }

// Time Complexity: O(1)
// Space Complexity: O(1)


// * METHOD 4: Using Array

public class fibonacciSeries{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        int fibo[] = new int[n+1];
        fibo[0] = 0;
        fibo[1] = 1;

        for(int i = 2; i <= n; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        for(int i : fibo)
            System.out.print(i+" ");
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N)