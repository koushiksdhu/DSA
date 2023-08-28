/* Write a program to find a word in a given string that has the highest number of repeated letters. If not found, return -1.

Example 1:
Input: string=”abcdefghij google microsoft”
Output: google
Explanation: In “google” g appears 2 times, o appears 2 times which is highest among all words

Example 2:
Input: string = “cameron blue”
Output: -1
Explanation: No word has more than 1 letter.
*/

import java.util.*;

public class wordsWithHighestNumberOfRepeatedLetters {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str[] = sc.nextLine().split(" ");

        int max = -1, idx = -1;

        for(int i = 0; i < str.length; i++){

            if(repeatedCharacter(str[i]) > max){
                max = repeatedCharacter(str[i]);
                idx = i;
            }

        }

        if(idx != -1)
            System.out.println("Word with highest number of repeated letters: "+str[idx]);
        else
            System.out.println("There is no word with repeated letters.");
    }

    static int repeatedCharacter(String s){
        int freq[] = new int[26];

        for(int i = 0; i < s.length(); i++)
            freq[Character.toLowerCase(s.charAt(i) - 'a')]++;
        
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < s.length(); i++)
            max = Math.max(max, freq[Character.toLowerCase(s.charAt(i) - 'a')]);
        
        return max > 1 ? max : -1;
    } 
}

// Time Complexity: O(N*N)
// Space Complexity: O(26)