/* Given two strings, write a program to remove characters from the first string which are present in the second string.

Example 1:
Input: String str1 = “abcdef”
       String str2 = “cefz”
Output: abd
Explanation: The common characters in both strings are c, e, f.
So after removing these characters from string 1 we get string resulting string as abd.


Example 2:
Input: String str1 = “xyzpw”
       String str2 = “lmno”
Output: xyzpw
Explanation: As there is no common character in both the strings, string 1 remains unchanged.
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class removeCharacterFromFirstStringPresentInSecondString {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the 1st string: ");
//         String str1 = sc.nextLine();
//         System.out.print("Enter the 2nd string: ");
//         String str2 = sc.nextLine();

//         for(int i = 0; i < str2.length(); i++){
//             for(int j = 0; j < str1.length(); j++){
//                 if(str1.charAt(j) == str2.charAt(i))
//                     str1 = str1.substring(0, j) + str1.substring(j+1, str1.length());
//             }
//         }
//         System.out.println(str1);
//     }
// }

// Time Complexity: O(N*N)
// Space Complexity: O(1)


// * METHOD 2: Using temp array

public class removeCharacterFromFirstStringPresentInSecondString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the 2nd string: ");
        String str2 = sc.nextLine();

        int freq[] = new int[26];
        
        for(int i = 0; i < str2.length(); i++)
            freq[Character.toLowerCase(str2.charAt(i)) - 'a']++;

        for(int i = 0; i < str1.length(); i++){
            if(freq[Character.toLowerCase(str1.charAt(i)) - 'a'] >= 1){
                str1 = str1.substring(0, i) + str1.substring(i+1, str1.length());
                i--;  // because string character at that particluar postion is shifted back by one character.
                // so, if we remove any character from middle then it will not be checked.
                // Hence, to avoid this error we are decrementing the value of i by 1.
            }
        }
        System.out.println(str1);
    }
}

// Time Complexity: O(N*N)
// Space Complexity: O(1)