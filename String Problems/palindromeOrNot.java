/* Given a string, check if the string is palindrome or not.
A string is said to be palindrome if the reverse of the string is the same as the string.

Example 1:
Input: Str =  “ABCDCBA”
Output: Palindrome
Explanation: String when reversed is the same as string.

Example 2:
Input: Str = “TAKE U FORWARD”
Output: Not Palindrome
Explanation: String when reversed is not the same as string.
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class palindromeOrNot{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string: ");
//         String s = sc.nextLine();
//         String rev = "";

//         for(int i = 0; i < s.length(); i++)
//             rev = s.charAt(i) + rev;

//         if(s.equals(rev))
//             System.out.println(s+" is a Palindrome.");
//         else
//             System.out.println(s+" is not a Palindrome.");
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(N)

// * METHOD 2: Using two pointers

// public class palindromeOrNot{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string: ");
//         String s = sc.nextLine();
//         int i = 0;
//         int j = s.length() - 1;
//         boolean palindrome = true;

//         while(i <= j){
//             if(s.charAt(i) == s.charAt(j)){
//                 i++;
//                 j--;
//             }
//             else{
//                 palindrome = false;
//                 break;
//             }
//         }
        
//         if(palindrome)
//             System.out.println(s+" is a Palindrome.");
//         else
//             System.out.println(s+" is not a Palindrome.");
//     }
// }

// Time Complexity: O(N/2)
// Space Complexity: O(1)


// * METHOD 3: Using StringBuilder

// public class palindromeOrNot{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string: ");
//         String s = sc.nextLine();
        
//         StringBuilder sb = new StringBuilder(s);
//         sb.reverse();

//         if(sb.toString().equals(s))
//             System.out.println(s+" is a Palindrome.");
//         else
//             System.out.println(s+" is not a Palindrome.");
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(N)


// * METHOD 4: Using Recursion

public class palindromeOrNot{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        if(palindrome(s, 0))
            System.out.println(s+" is a Palindrome.");
        else
            System.out.println(s+" is not a Palindrome.");
    }

    static boolean palindrome(String str, int i){

        if(i < str.length() / 2){

            if(str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
            else
                palindrome(str, i+1);   
        }
        return true;
    }
}

// Time Complexity: O(N/2)
// Space Complexity: O(1)