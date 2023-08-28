/* Given a String, write a program to remove vowels from a given String.

Example 1:
Input: Str = “take u forward”
Output: tk  frwrd
Explanation: All vowels are removed from the given String.

Example 2:
Input: Str = “I am very happy today”
Output:  m vry happy tdy
Explanation: All vowels are removed from the given String.
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class removeAllVowels {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string: ");
//         String str = sc.nextLine();
//         String ans = "";
//         for(int i = 0; i < str.length(); i++){
//             if(Character.toLowerCase(str.charAt(i)) != 'a' && Character.toLowerCase(str.charAt(i)) != 'e' &&
//                 Character.toLowerCase(str.charAt(i)) != 'i' && Character.toLowerCase(str.charAt(i)) != 'o' &&
//                 Character.toLowerCase(str.charAt(i)) != 'u'){
//                     ans += str.charAt(i);    
//             }
//         }
//         System.out.println("String without vowels: "+ans);
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(N)


// * METHOD 2: Optimized

public class removeAllVowels {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++){
            if(Character.toLowerCase(str.charAt(i)) == 'a' || Character.toLowerCase(str.charAt(i)) == 'e' ||
                Character.toLowerCase(str.charAt(i)) == 'i' || Character.toLowerCase(str.charAt(i)) == 'o' ||
                Character.toLowerCase(str.charAt(i)) == 'u'){
                    str = str.substring(0, i) + str.substring(i+1, str.length());   // Using Substring  
            }
        }
        System.out.println("String without vowels: "+str);
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)

