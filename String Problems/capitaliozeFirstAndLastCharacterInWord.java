/* Given a string, write a program to Capitalize the first and last character of each word of that string.

Example 1:
Input: String str = "take u forward is awesome"
Output: “TakE U ForwarD IS AwesomE”
Explanation: We get the result after capitalizing the first and last character of each word of a string

Example 2:
Input: String str = "Take u Forward is Awesome"
Output: “TakE U ForwarD IS AwesomE”
Explanation: Characters T, F, A are initially in uppercase , so they remain as they are in the result.
*/

import java.util.*;

public class capitaliozeFirstAndLastCharacterInWord {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            if(i == 0)
                str = Character.toUpperCase(str.charAt(i)) + str.substring(i+1, str.length());
            else if(i == str.length() - 1)
                str = str.substring(0, i) + Character.toUpperCase(str.charAt(i));
            else if(str.charAt(i+1) == ' ' || str.charAt(i-1) == ' ')
                str = str.substring(0, i) + Character.toUpperCase(str.charAt(i)) + str.substring(i+1, str.length()); 
        }

        System.out.println(str);
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)
