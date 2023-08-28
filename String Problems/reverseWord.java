/* Given a string s, reverse the words of the string.

Example 1:
Input: s=”this is an amazing program”
Output: “siht si na gnizama margorp ”

Example 2:
Input: s=”This is decent”
Output: “sihT si tneced ”
*/

import java.util.*;

public class reverseWord {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str[] = sc.nextLine().split(" ");
        for(int i = 0; i < str.length; i++){
            str[i] = reverse(str[i]);
            System.out.print(str[i] + " ");
        }
    }
    static String reverse(String s){
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            s = s.substring(0, i) + s.charAt(j) + s.substring(i+1, j) + s.charAt(i) + s.substring(j+1, s.length());
            i++;
            j--; 
        }
        return s;
    }
}

// Time Complexity: O(N*N)
// Space Complexity: O(N)
