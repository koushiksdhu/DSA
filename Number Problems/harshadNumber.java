/*  Check if the number is a Harshad(or Niven) number or not.

Example 1:
Input: 378
Output: Yes, It is a Harshad number.
Explanation: 3+7+8=18. 378 is divisible by 18. Therefore 378 is a harshad number.

Example 2:
Input: 379
Output: No, It is not a Harshad number.
Explanation: 3+7+9=19. 379 is not divisible by 19. Therefore 379 is a harshad number.
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class harshadNumber {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         int temp = n, digit = 0, sum = 0;
//         while(temp > 0){
//             digit = temp % 10;
//             sum += digit;
//             temp /= 10;
//         }

//         if(n % sum == 0)
//             System.out.println(n+" is a Harshad/Niven Number.");
//         else
//             System.out.println(n+" is not a Harshad/Niven Number.");
//     }    
// }

// Time Complexity: O(logN)
// Space Complexity: O(1)


// * METHOD 2: Using String

public class harshadNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        String s = String.valueOf(n);
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
            sum += s.charAt(i) - '0';

        if(n % sum == 0)
            System.out.println(n+" is a Harshad/Niven Number.");
        else
            System.out.println(n+" is not a Harshad/Niven Number.");
    }    
}

// Time Complexity: O(N)
// Space Complexity: O(1)

