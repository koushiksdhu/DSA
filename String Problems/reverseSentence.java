/* Given a string s, reverse the words of the string.

Example 1:
Input: s=”this is an amazing program”
Output: “program amazing an is this”

Example 2:
Input: s=”This is decent”
Output: “decent is This”
*/

import java.util.*;

// * METHOD 1: Brute Force

// public class reverseSentence{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the sentence: ");
//         String str[] = sc.nextLine().split(" ");

//         int i = 0, j = str.length - 1;
//         while(i < j){
//             String temp = str[i];
//             str[i] = str[j];
//             str[j] = temp;
//             i++;
//             j--;
//         }
//         for(int k = 0; k < str.length; k++){
//             System.out.print(str[k]+" ");
//         }
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(1)


// * METHOD 2: Traversing from back

public class reverseSentence{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.nextLine();

        int last = str.length();
        String ans = "";

        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == ' '){
                ans += str.substring(i+1, last)+" ";
                last = i;
            }
        }
        ans += str.substring(0, last);

        System.out.println(ans);
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)



