/* Write a  program to change the case (lower to upper and upper to lower cases) of each character of a given string.

Example 1:
Input: String str = “javA”
Output: JAVa
Explanation: Changed the lower case characters to uppercase and vice versa.

Example 2:
Input: String str = “take u forward IS Awesome”
Output: TAKE U FORWARD is aWESOME
Explanation: Changed the lower case characters to uppercase and vice versa.
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class changeCaseOfEachCharacterInString {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string: ");
//         char ch[] = sc.nextLine().toCharArray();

//         for(int i = 0; i < ch.length; i++){
//             if(ch[i] >= 'a' && ch[i] <= 'z')
//                 ch[i] = (char)(ch[i] - 32);
//             else if(ch[i] >= 'A' && ch[i] <= 'Z')
//                 ch[i] = (char)(ch[i] + 32);
//         }

//         System.out.println(String.valueOf(ch));
//     }    
// }

// Time Complexity: O(N)
// Space Complexity: O(1)


// * METHOD 2: Using string substring mechanism

public class changeCaseOfEachCharacterInString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                str = str.substring(0, i) + (char)(str.charAt(i) - 32) + str.substring((i + 1), str.length());
            else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                str = str.substring(0, i) + (char)(str.charAt(i) + 32) + str.substring((i + 1), str.length());
        }

        System.out.println(str);
    }    
}

// Time Complexity: O(N)
// Space Complexity: O(1)