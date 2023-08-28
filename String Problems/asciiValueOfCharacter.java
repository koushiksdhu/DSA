/*Given a character, Find the ASCII value of the character.

Example 1:
Input: c = ‘A’
Output: 65
Explanation: ASCII value of A is 65

Example 2:
Input: c = ‘e’
Output: 101
Explanation: ASCII value of e is 101
*/

import java.util.*;

public class asciiValueOfCharacter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);
        System.out.println("ASCII Value of "+ch+" is: "+(int)ch);
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)

