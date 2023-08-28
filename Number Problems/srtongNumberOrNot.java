/* Given an integer Print “YES” if it is a strong number else print “NO”.

When the sum of factorial of individual digits of a number is equal to the original number the number is called a strong number. 
Strong number is also known as Krishnamurthi number/Peterson Number.
Examples:

Examples 1:
Input: N = 145
Output: Yes
Explanation: 1! + 4! + 5! = 145. Hence 145 is a strong number. 

Example 2:
Input:  26
Output: No
Explanation: 2! + 6! = 722. Hence 26 is not a strong number.
*/

import java.util.*;

public class srtongNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int digit = 0, sum = 0, temp = n;

        while(temp > 0){
            digit = temp % 10;
            sum += fact(digit);
            temp /= 10;
        }

        if(n == sum && n != 0)
            System.out.println(n+" is a Strong / Krishnamurthi / Peterson Number.");
        else
            System.out.println(n+" is not a Strong / Krishnamurthi / Peterson Number.");
    }   
    static int fact(int n){
        int prod = 1;
        for(int i = 1; i <= n; i++)
            prod *= i;
        return prod;
    } 
}

// Time Complexity: O(N*M)
// Space Complexity: O(1)
