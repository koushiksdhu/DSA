/* Given a number, check if it is automorphic or not.
* A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.

Example 1:
Input Format: N = 76
Result: Automorphic Number
Explanation: Calculating 76 * 76 gives 5776, it ends with the given number.

Example 2:
Input Format: 25
Result: Automorphic Number
Explanation: Calculating 25 * 25 gives 625, it ends with the given number. 
*/

import java.util.*;

public class automorphicNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int temp = n;
        int sqr = n * n;
        boolean automorphic = true;

        while(temp > 0){
            if(sqr % 10 != temp % 10){
                automorphic = false;
                break;
            }
            temp /= 10;
            sqr /= 10;
        }

        if(automorphic)
            System.out.println(n+" is an Automorphic Number.");
        else
            System.out.println(n+" is not an Automorphic Number.");
    }  
}

// Time Complexity: O(N)
// Space Complexity: O(1)