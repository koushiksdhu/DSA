/*  You are given an integer. Your task is to replace all the zeros in the integer with ones.

Example 1:
Input: N = 102003
Output: 112113
Explanation: The 2nd,4th and 5th position from left contain 0.The resultant integer has replaced the 0’s in those  positions with 1.

Example 2:
Input:  204
Output: 214
Explanation: The 2nd position from left contain 0. The resultant integer has replaced the 0 in that position with 1.
*/

import java.util.*;

// * METHOD 1: Brute Force

public class replaceAll0sWith1sInInteger {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        int digit = 0, num = 0, temp = 1;
        while(n > 0){
            digit = n % 10;
                if(digit == 0)
                    digit = 1;
            
            // Formula for getting number from start to end.         
            num = temp * digit + num;
            temp *= 10;

            n /= 10;
        }

        System.out.println(num);
    }    
}

// Time Complexity: O(logn)
// Space Complexity: O(1)


// * METHOD 2: Using String

// public class replaceAll0sWith1sInInteger {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         String s = "";
//         int digit = 0, num = 0;
//         while(n > 0){
//             digit = n % 10;
//             if(digit == 0)
//                 s = "1"+s;
//             else
//                 s = ""+digit+s;
//             n /= 10;
//         }

//         System.out.println(s);
//     }    
// }

// Time Complexity: O(logn)
// Space Complexity: O(N)


