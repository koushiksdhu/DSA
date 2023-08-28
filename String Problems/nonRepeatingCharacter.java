/*Given a string, print non-repeating characters of the string.

Example 1:
Input: string = “google”
Output: l,e
Explanation: Non repeating characters are l,e.

Example 2:
Input: string = “yahoo”
Output: y,a,h
Explanation: Non repeating characters are y,a,h
*/

import java.util.*;


public class nonRepeatingCharacter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        int freq[] = new int[26];

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' ')
                freq[str.charAt(i) - 'a']++;
        }

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' ' && freq[str.charAt(i) - 'a'] == 1)
                System.out.print((str.charAt(i)));
        }
    }
}

// Time Complexity: O(N)
// Space Complexity: O(26)
