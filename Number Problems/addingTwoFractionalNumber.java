/* Adding two fractional numbers.

Example 1:
Input: 3/4 + 1/7 
Output: 25/28
Explanation: Since 3/4 + 1/7 = 25/28

Example 2:
Input: 5/2 +1/2
Output: 3/1
Explanation: Since 5/2 + 1/2 = 3/1
*/

import java.util.*;

public class addingTwoFractionalNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st numerator: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the 1st denominator: ");
        int d1 = sc.nextInt();
        System.out.print("Enter the 2nd numerator: ");
        int n2 = sc.nextInt();
        System.out.print("Enter the 2nd denominator: ");
        int d2 = sc.nextInt();

        int lcm = (d1*d2)/gcd(d1, d2);
        int sum = (lcm/d1)*n1 + (lcm/d2)*n2;

        if(lcm % sum == 0){
            sum = lcm / sum;
            lcm = 1;
        }
        else if(sum % lcm == 0){
            sum = sum / lcm;;
            lcm = 1;
        }
        
        System.out.println(n1+"/"+d1+" + "+n2+"/"+d2+" = "+sum+"/"+lcm);
    }
    static int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }   
}

// Time Complexity: O(logN)
// Space Complexity: O(1)