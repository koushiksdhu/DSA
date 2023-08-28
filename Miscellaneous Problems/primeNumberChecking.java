//* Check whether a number is prime number or not.*/

// * METHOD 1: (Brute Force Approach) - O(N)

// public class primeNumberChecking {  
//     public static void main(String[] args) {
//         int n = 71;
//         boolean flag = true;
            
        // if(n == 1)
        //     flag = false;

//         for(int i = 2; i < n; i++){
//             if(n % i == 0){
//                 flag = false;
//                 break;
//             }
//         }
//         if(flag)
//             System.out.println("Prime Number");
//         else
//             System.out.println("Not a Prime Number");
//     }
// }

// Time Complexity: O(N)
// Space COmplexity: O(1)



// * METHOD 2: Optimized Approach O(sqrt(n))

// public class primeNumberChecking {  
//     public static void main(String[] args) {
//         int n = 1;
//         boolean flag = true;

//         if(n == 1)
//             flag = false;

//         for(int i = 2; i*i < n; i++){
//             if(n % i == 0){
//                 flag = false;
//                 break;
//             }
//        }
//        if(flag)
//             System.out.println("Prime Number");
//         else
//             System.out.println("Not a Prime Number");
//     }
// }

// Time Complexity: O(sqrt(N))
// Space Complexity: O(1)



// * METHOD 3: More Optimized: Fermat's little theroem - O(1)

import java.util.*;
public class primeNumberChecking {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting range: ");
        int s1 = sc.nextInt();
        System.out.print("Enter the ending range: ");
        int s2 = sc.nextInt();
        for(int i = s1; i <= s2; i++){
        if(i == 1)
            continue;
        
        else if(i == 2)
            System.out.print(i+" ");

        else if(Math.pow(2, i-1) % i == 1)
            System.out.print(i+" ");
    }
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)