/* Given a String remove all the duplicate characters from the given String.

Example 1:
Input: s = "bcabc"
Output: “bca"

Explanation: Duplicate Characters are removed
Example 2:
Input: s = "cbacdcbc"
Output: "cbad" 
Explanation: Duplicate Characters are removed
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class removeDuplicateCharacter {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         String str = sc.nextLine();

//         int freq[] = new int[26];
//         String ans = "";

//         for(int i = 0; i < str.length(); i++)
//             freq[Character.toLowerCase(str.charAt(i)) - 'a']++;

//         for(int i = 0; i < str.length(); i++){
//             if(freq[Character.toLowerCase(str.charAt(i)) - 'a'] >= 1){
//                 ans += str.charAt(i);
//                 freq[Character.toLowerCase(str.charAt(i)) - 'a'] = 0;
//             }
//         }
//         System.out.println("String with duplicate characters: "+str);
//         System.out.println("String without duplicate characters: "+ans);
//     }    
// }

// Time Complexity: O(N)
// Space Complexity: O(26)


// * METHOD 2: Using two loops

public class removeDuplicateCharacter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String ans = "";

        for(int i = 0; i < str.length(); i++){
            int count = 0;
            for(int j = 0; j <= i; j++){
                if(str.charAt(i) == str.charAt(j))
                    count++;
            }

            if(count == 1)
                ans += str.charAt(i);
        }

        System.out.println("String without duplicates: "+ans);
    }
}

// Time Complexity: O(N*N)
// Space Complexity: O(1)


