/* Given a number check if it is a palindrome.
An integer is considered a palindrome when it reads the same backward as forward.

Example 1:
Input: N = 123
Output: Not Palindrome Number
Explanation: 123 read backwards is 321.Since these are two different numbers 123 is not a palindrome.

Example 2:
Input: N =  121 
Output: Palindrome Number
Explanation: 121 read backwards as 121.Since these are two same numbers 121 is a palindrome.
*/

// * METHOD 1: Brute Force

public class palindromeOrNot{
    public static void main(String args[]){
        int n = 1234321;
        int temp = n;
        int lastDigit = 0, reverse = 0;

        while(temp > 0){
            lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }

        if(n == reverse)
            System.out.println(n+" is a Palindrome Number.");
        else
            System.out.println(n+" is not a Palindrome Number.");
    }
}

// Time Complexity: O(logN)
// Space Complexity: O(1)

// * METHOD 2: Using String:

// public class palindromeOrNot{
//     public static void main(String args[]){
//         int n = 1234321;
//         String value = String.valueOf(n);
//         String reverse = "";
//         for(int i = 0; i < value.length(); i++)
//             reverse = value.charAt(i) + reverse;

//         if(value.equals(reverse))
//             System.out.println(n+" is a Palindrome Number");
//         else
//             System.out.println(n+" is not a Palindrome Number");
        
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(1)


// * METHOD 3: Using StringBuilder:

// public class palindromeOrNot{
//     public static void main(String args[]){
//         int n = 12357321;
//         String value = String.valueOf(n);
//         StringBuilder sb = new StringBuilder(String.valueOf(value));
//         if(value.equals(sb.reverse().toString()))
//             System.out.println(n+" is a Palindrome Number");
//         else
//             System.out.println(n+" is not a Palindrome Number");
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(1)

