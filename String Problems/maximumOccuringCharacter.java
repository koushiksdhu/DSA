/* Given a string, return the character that occurs the maximum number of times in the string. If the maximum occurrence of two or more characters is the same, return any one of them. 

Example 1:
Input: str = “takeuforward”
Output: a
Explanation: The character 'a' and 'r’ have the same  maximum occurrence i.e 2. Hence we can print any one of them

Example 2:
Input: str = “apple”
Output: p
Explanation: The character 'p' have the maximum occurrence i.e 2.
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class maximumOccuringCharacter {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string: ");
//         String str = sc.nextLine();

//         int freq[] = new int [26];

//         for(int i = 0; i < str.length(); i++){
//             freq[Character.toLowerCase(str.charAt(i)) - 'a']++;
//         }

//         int max = Integer.MIN_VALUE;
//         char ch = ' ';

//         for(int i = 0; i < str.length(); i++){
//             if(freq[Character.toLowerCase(str.charAt(i)) - 'a'] > max){
//                 max = freq[Character.toLowerCase(str.charAt(i)) - 'a'];
//                 ch = str.charAt(i);
//             }
//         }
//         System.out.println("Maximum occured character: "+ch);
//     }    
// }

// Time Complexity: O(N)
// Space Complexity: O(26)


// *METHOD 2: Using Sorting

public class maximumOccuringCharacter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        char ch[] = sc.nextLine().toCharArray();

        Arrays.sort(ch);

        char ptr = ch[0], maxChar = ' ';
        int currCount = 1, max = Integer.MIN_VALUE;

        for(int i = 1; i < ch.length; i++){
            if(ch[i] == ptr)
                currCount++;
            else{
                if(currCount >= max){
                    max = currCount;
                    maxChar = ptr;
                    currCount = 1;
                    ptr = ch[i];
                }
            }
        }
        if(currCount > max)
            maxChar = ptr;
        System.out.println("Maximum occured character: "+maxChar);
    }    
}

// Time Complexity: O(NlogN)
// Space Complexity: O(1)

