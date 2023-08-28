/* Check if the number is an abundant number or not.

Example 1:
Input: 18
Output: Abundant Number
Explanation: Divisors of 18 are 1,2,3,6,9. 1+2+3+6+9=21, Since 21 is greater than 18, 18 is an abundant number.

Example 2:
Input: 21
Output: Not Abundant Number
Explanation:Divisors of 21 are 1,3,7. 1+3+7=11, Since 11 is smaller than 21, 11 is not an abundant 
 
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class abundantNumber {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         int sum = 0;

//         for(int i = 1; i < n; i++)
//             sum += n % i == 0 ? i : 0;

//         if(sum > n)
//             System.out.println(n+" is an Abundant Number.");
//         else
//             System.out.println(n+" is not an Abundant Number.");
//     }    
// }

// Time Complexity: O(N)
// Space Complexity: O(1)


// * METHOD 2: Optimized Version

public class abundantNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(n/i == i)
                    sum += i;
                else
                    sum += i + n/i;
            }
        }
        sum -= n;

        if(sum > n)
            System.out.println(n+" is an Abundant Number.");
        else
            System.out.println(n+" is not an Abundant Number.");
    }    
}

// Time Complexity: O(sqrt(n))
// Space Complexity: O(1)
