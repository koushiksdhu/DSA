// * Find all the prime numbers in the following range. */

import java.util.Scanner;

// * METHOD 1: Brute Force Approach - O(N^2)

// public class primeNumberRange { 
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the starting range: ");
//         int s = sc.nextInt();
//         System.out.print("Enter the ending range: ");
//         int e = sc.nextInt();

//         for(int i = s; i <= e; i++){
//             boolean flag = true;
//             if(i == 1)
//                 i++;
//             for(int j = 2; j < i; j++){
//                 if(i % j == 0)
//                     flag = false;
//             }
//             if(flag)
//                 System.out.print(i+" ");
//         }
//    } 
// }

// Time Complexity: O(N*N)
// Space Complexity: O(1)

// * METHOD 2: Optimized Soltion - O(N*sqrt(N))

// public class primeNumberRange { 
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the starting range: ");
//         int s = sc.nextInt();
//         System.out.print("Enter the ending range: ");
//         int e = sc.nextInt();

//         for(int i = s; i <= e; i++){
//             boolean flag = true;

//             if(i == 1)
//                 i++;

//             for(int j = 2; j*j <= i; j++){
//                 if(i % j == 0)
//                     flag = false;
//             }

//             if(flag)
//                 System.out.print(i+" ");
//         }
//     } 
// }

// Time Complexity: O(N*sqrt(N))
// Space Complexity: O(1)

// * METHOD 3: More Optimized Soltion - O(N)

public class primeNumberRange { 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         System.out.print("Enter the starting range: ");
         int s = sc.nextInt();
         System.out.print("Enter the ending range: ");
         int e = sc.nextInt();
         
         for(int i = s; i <= e; i++){
             if(i == 1)
                continue;
             else if(i == 2){
                System.out.print(i+" ");
                i++;
            }
            else if(Math.pow(2, i-1) % i == 1)
                System.out.print(i+" ");
        }
     } 
 }

 // Time Complexity: O(N)
 // Space Complexity: O(1)