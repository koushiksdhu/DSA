/* Given a string, write a program to remove all the whitespaces from the string.

Example 1:
Input: str = “Take you forward” 
Output: Takeyouforward
Explanation: After removing all the whitespaces Takeyouforward is the result

Example 2:
Input: str = “How are you doing”
Output: Howareyoudoing
Explanation: After removing all the whitespaces Howareyoudoing is the result
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class removeSpacesFromString {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string: ");
//         String str = sc.nextLine();

//         for(int i = 0; i < str.length(); i++){
//             if(str.charAt(i) == ' '){
//                 str = str.substring(0, i) + str.substring(i+1, str.length());
//                 i--;
//             }
//         }
//         System.out.println("String without whitespaces: "+str);
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(1)


// * METHOD 2: Using Char Array

public class removeSpacesFromString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        char ch[] = sc.nextLine().toCharArray();

        int c = 0;

        for(int i = 0; i < ch.length; i++){

            if(ch[i] != ' '){
               ch[c++] = ch[i];
            }
            
        }
        System.out.println("String without whitespaces: "+String.valueOf(ch).subSequence(0, c));
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)