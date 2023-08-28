/* Given two strings, check if two strings are anagrams of each other or not.

Example 1:
Input: CAT, ACT
Output: true
Explanation: Since the count of every letter of both strings are equal.

Example 2:
Input: RULES, LESRT 
Output: false
Explanation: Since the count of U and T  is not equal in both strings.
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class anagramOrNot {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the 1st word: ");
//         char first[] = sc.nextLine().toCharArray();
//         System.out.print("Enter the 2nd word: ");
//         char second[] = sc.nextLine().toCharArray();
        
//         Arrays.sort(first);
//         Arrays.sort(second);

//         boolean anagram = true;
//         if(first.length == second.length){
//             for(int i = 0; i < first.length; i++){
//                 if(first[i] != second[i])
//                     anagram = false;
//             }
//         }
//         else
//             anagram = false;
//         if(anagram)
//             System.out.println("It is anAnagram.");
//         else
//             System.out.println("It is not an Anagram.");
//     }
// }

// Time Complexity: O(NlogN)
// Space Complexity: O(1)


// * METHOD 2: Optimized

public class anagramOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st word: ");
        String s1 = sc.nextLine().toUpperCase();
        System.out.print("Enter the 2nd word: ");
        String s2 = sc.nextLine().toUpperCase();

        int freq[] = new int[26];
        boolean anagram = true;

        if(s1.length() == s2.length()){
            for(int i = 0; i < s1.length(); i++)
                freq[s1.charAt(i) - 'A']++;

            for(int i = 0; i < s2.length(); i++)
                freq[s2.charAt(i) - 'A']--;

            for(int i = 0; i < freq.length; i++){
                if(freq[i] != 0)
                    anagram = false;
            }
        }
        else
            anagram = false;
        
        if(anagram)
            System.out.println(s1+" and "+s2+" are Anagram.");
        else
            System.out.println(s1+" and "+s2+" are not Anagram.");
    }
}

// Time Complexity: O(N)
// Space Complexity: O(26), because for any input string only a fixed-size array is being allocated.

