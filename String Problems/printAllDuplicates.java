/* Given a string of characters from a to z.
Print the duplicate characters(which are occurring more than once) in the given string with their occurrences count.

Example 1:
Input: str= "sinstriiintng"
Output:
i - 4
n - 3
s - 2
t - 2
Explanation: In the above example, 's' occurs twice, 'i' occurs four times, 't' occurs twice and 'n' occurs thrice.
'r' and 'g' occur only one time and hence are not considered.

Example 2:
Input: str= "abcdefg"
Output: < -- No Output -- >
Explanation: In the above example, every character occurs only once(no duplicates), therefore nothing to print.
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class printAllDuplicates {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string: ");
//         String str = sc.nextLine();

//         int freq[] = new int[26];

//         for(int i = 0; i < str.length(); i++)
//             freq[Character.toLowerCase(str.charAt(i)) - 'a']++;

//         for(int i = 0; i < str.length(); i++){
//             if(freq[Character.toLowerCase(str.charAt(i)) - 'a'] > 1){
//                 System.out.println(str.charAt(i)+" -> "+freq[Character.toLowerCase(str.charAt(i) - 'a')]);
//                 freq[Character.toLowerCase(str.charAt(i) - 'a')] = 0;
//             }
//         }
//     }    
// }

// Time Complexity: O(N)
// Space Complexity: O(26), since the string has only characters from ‘a’ to ‘z’, the maximum size of the array is 26.


// * METHOD 2: Using Map

public class printAllDuplicates {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
        }

        for(Map.Entry<Character, Integer> itr : hm.entrySet()){
        if(itr.getValue() > 1)
            System.out.println(itr.getKey()+" -> "+itr.getValue());
        }
    }    
}

// Time Complexity: O(N)
// Space Complexity: O(N)