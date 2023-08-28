/* Given a String, find the largest word in the string.

Example 1:
Input: string s=”Google Doc”
Output: “Google”
Explanation: Google is the largest word in the given string.

Example 2:
Input: string s=”Microsoft Teams”
Output: “Microsoft”
Explanation: Microsoft is the largest word in the given string
*/

import java.util.*;

// * METHOD 1: Using String Array

// public class largestWordInAString {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String strArray[] = sc.nextLine().split(" ");

//         int max = Integer.MIN_VALUE, maxIdx = 0;
//         for(int i = 0; i < strArray.length; i++){
//             if(strArray[i].length() > max){
//                 max = strArray[i].length();
//                 maxIdx = i;
//             }
//         }

//         System.out.println("Largest Word: "+strArray[maxIdx]);
//     }
// }

// Time Complexity: O(N)
// Space Complexity: O(1)

// * METHOD 2: Using Comparison

public class largestWordInAString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int max = Integer.MIN_VALUE;
        int start = 0, end = 0, s = 0, l = 0;
     
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ')
                end = i - 1;
            
            else if(i >= str.length() - 1)
                end = i;
            
            if((end - start) > max){
                max = end - start;
                s = start;
                l = end;
            }
            if(str.charAt(i) == ' ')
                start = i + 1;
        }

        System.out.println("Largest Word: "+str.substring(s, l+1));
    }
}
