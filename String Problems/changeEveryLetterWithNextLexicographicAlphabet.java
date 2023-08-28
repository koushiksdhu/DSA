/* Given a string, write a program to change every letter in the given string with the letter following it
in the alphabet (ie. a becomes b, p becomes q, z becomes a)

Example 1:
Input: string str = “abcdxyz”
Output: bcdeyza

Example 2:
Input: string str = “Java”
Output: Kbwb
*/

import java.util.*;

// * METHOD 1: Using character incrementing technique

// public class changeEveryLetterWithNextLexicographicAlphabet {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the word: ");
//         char ch[] = sc.nextLine().toCharArray();

//         for(int i = 0; i < ch.length; i++){
//             if(ch[i] == 'z')
//                 ch[i] = 'a';
//             else
//                 ch[i] = (char)(ch[i]+1);
//         }

//         System.out.println(String.valueOf(ch));
//     }    
// }

// Time Complexity: O(N)
// Space Complexity: O(1)

// * METHOD 2: Using ASCII value

public class changeEveryLetterWithNextLexicographicAlphabet {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        char ch[] = sc.nextLine().toCharArray();

        for(int i = 0; i < ch.length; i++){
           int ascii = (int)ch[i];
           if((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)){
                if(ascii == 90)
                    ascii = 64;
                else if(ascii == 122)
                    ascii = 96;
                ch[i] = (char)(ascii + 1);
           }
        }

        System.out.println(String.valueOf(ch));
    }    
}

// Time Complexity: O(N)
// Space Complexity: O(1)