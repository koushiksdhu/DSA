/* Given a string, calculate the frequency of characters in a string.

Example 1:
Input: takeuforward
Output: a2 d1 e1 f1 k1 o1 r2 t1 u1 w1 
Explanation: Count of every character of string is printed.

Example 2:
Input: articles
Output: a1 c1 e1 i1 l1 r1 s1 t1 
Explanation: Count of every character of string is printed.
*/

import java.util.*;

// METHOD 1: Brute Force

public class characterFrequency{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        char ch[] = sc.nextLine().toCharArray();
        Arrays.sort(ch);
        char ptr = ch[0];
        int count = 1;

        for(int i = 1; i < ch.length; i++){
            if(ch[i] == ptr)
                count++;
            else{
                System.out.print(ptr+""+count+" ");
                count = 1;
                ptr = ch[i];
            }
        }
        System.out.print(ptr+""+count);
    }
}

// Time Complexity: O(nlogn) since sorting function requires nlogn iterations.
// Space Complexity: O(1)


// * METHOD 2: Another approach

// public class characterFrequency{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string: ");
//         String str = sc.nextLine();

//         int freq[] = new int[26];

//         for(int i = 0; i < str.length(); i++)
//             freq[str.charAt(i) - 'a']++;

//         for(int i = 0; i < freq.length; i++){
//             if(freq[i] > 0)
//                 System.out.print((char)(i+'a')+""+freq[i]+" ");
//         }
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(26)
